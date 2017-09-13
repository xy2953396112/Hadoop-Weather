package com.xzh.weather.controller.hadoop;

import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;






import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.xzh.weather.controller.hadoop.Weather_Hadoop_max_min.WeatherMapper.WeatherReducer;





public class Weather_Hadoop_max_min {
 
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf);
		
        job.setJarByClass(Weather_Hadoop_max_min.class);
        
        Path inputPath = new Path("hdfs://master:9000/weather_input/");
	    job.setMapperClass(WeatherMapper.class);
	    job.setMapOutputKeyClass(Text.class);
	    job.setMapOutputValueClass(Text.class);
	    
	    //job.setCombinerClass(InvertedIndexCombiner.class);
	    
	    job.setReducerClass(WeatherReducer.class);
	    
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(Text.class);
	    
	    FileInputFormat.addInputPath(job,inputPath);
	    FileOutputFormat.setOutputPath(job,new Path("hdfs://192.168.214.86:9000/weather_output/max_min/"));
	    
	    System.exit(job.waitForCompletion(true) ? 0:1);
	}
	
	public static class WeatherMapper extends Mapper<Object,Text,Text,Text>{
		
		protected void map(Object key, Text value, Context context ) throws IOException,InterruptedException{
		// 将输入的纯文本文件的数据转化成String
        String line = value.toString();
        // 将输入的数据首先按行进行分割
        StringTokenizer tokenizer = new StringTokenizer(line, "\n");
        // 分别对每一行进行处理
        while (tokenizer.hasMoreElements()) {
        //每行按空格划分
           StringTokenizer tokenizerLine = new StringTokenizer(tokenizer.nextToken(),"	");
            String id  = tokenizerLine.nextToken();// id
            String city  = tokenizerLine.nextToken();// 城市名称
            String hTemp = tokenizerLine.nextToken();// 最高温度
            String lTemp = tokenizerLine.nextToken();// 最低温度
            String rain  = tokenizerLine.nextToken();// 雨量
            String wind  = tokenizerLine.nextToken();// 风向
            String humidity  = tokenizerLine.nextToken();// 风向
            String air  = tokenizerLine.nextToken();// 空气质量
            String date = tokenizerLine.nextToken();// 日期
            Text key1 = new Text(city);
            String value1 = hTemp+","+lTemp+","+humidity;
            //输出姓名和成绩
            context.write(key1, new Text(value1)); 
         }	
	   }
	
	
    
	public static class WeatherReducer extends Reducer<Text,Text,Text,Text>{
				
		protected void reduce(Text key,Iterable<Text> values,Reducer<Text,Text,Text,Text>.Context context) throws IOException,InterruptedException {			
			
			int max=0;    float max_hum=0; float min_hum=(float) 0.33;
			int min=0;
			int hTemp=0;
			int lTemp=0;
			float hum = 0;
            Iterator<Text> iterator = values.iterator();
            
            while (iterator.hasNext()) {
                Text str1= iterator.next();    //迭代出每行的Text
                String[] str = str1.toString().split(",");//把数据分割开
                hTemp = Integer.parseInt(str[0]);                
                    if(hTemp>max){    //找出一个城市的最高气温
                        max=hTemp;    
                    }  
                lTemp =  Integer.parseInt(str[1]);   
                    if(lTemp<min){    //找出一个城市的最低气温
                    	min=lTemp;
                    }
                
                hum =  Float.parseFloat(str[2]);
                     if(hum>max_hum){    //找出一个城市的最大湿度
                        max_hum=hum;    
                     } 
                     if(hum<min_hum){    //找出一个城市的最小湿度
                     	min_hum=hum;
                     }
                    
                    
              
                }  
            String value = Integer.toString(max)+" "+Integer.toString(min)
                    +" "+Float.toString(max_hum)+" "
                   +Float.toString(min_hum);
            context.write(key, new Text(value));        //输出结果
                
                
            }
           
            
        } 		
	}
}
	
 
