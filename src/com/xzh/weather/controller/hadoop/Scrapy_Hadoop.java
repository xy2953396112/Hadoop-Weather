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

import com.xzh.weather.controller.hadoop.Scrapy_Hadoop.WeatherMapper.WeatherReducer;





public class Scrapy_Hadoop {
 
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf);
		
        job.setJarByClass(Scrapy_Hadoop.class);
        
        Path inputPath = new Path("hdfs://master:9000/weather_input/");
	    job.setMapperClass(WeatherMapper.class);
	    job.setMapOutputKeyClass(Text.class);
	    job.setMapOutputValueClass(Text.class);
	    
	    //job.setCombinerClass(InvertedIndexCombiner.class);
	    
	    job.setReducerClass(WeatherReducer.class);
	    
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(Text.class);
	    
	    FileInputFormat.addInputPath(job,inputPath);
	    FileOutputFormat.setOutputPath(job,new Path("hdfs://192.168.214.86:9000/weather_output/avg/"));
	    
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
            String value1 = hTemp+","+lTemp+","+humidity+","+air;
            //输出姓名和成绩
            context.write(key1, new Text(value1)); 
         }	
	   }
	
	
    
	public static class WeatherReducer extends Reducer<Text,Text,Text,Text>{
				
		protected void reduce(Text key,Iterable<Text> values,Reducer<Text,Text,Text,Text>.Context context) throws IOException,InterruptedException {			
			int sum = 0;
            int hTemp_count = 0,hTemp=0;
            int lTemp_count = 0,lTemp=0;
            int rain_count  = 0,rain=0; 
            float humidity_count = 0,humidity=0;
            int  air=0;
            Iterator<Text> iterator = values.iterator();
            
            while (iterator.hasNext()) {
                Text str1= iterator.next();    //迭代出每行的Text
                String[] str = str1.toString().split(",");//把数据分割开
                hTemp = hTemp+Integer.parseInt(str[0]);  hTemp_count++;   // 统计总的科目数
                lTemp = lTemp+Integer.parseInt(str[1]);  lTemp_count++;
                humidity = humidity+Float.parseFloat(str[2]); humidity_count++;
                //rain = str[5];
                if(str[3].equals("良好")||str[3].equals("优")){
                	air++;
                }
                
            }
           // int average_rain =  rain / rain_count++;             // 计算平均最高雨量
            float average_humidity =  humidity / humidity_count++; // 计算平均湿度
            
            int average_hTemp =  hTemp / hTemp_count;             // 计算平均雨量
            int average_lTemp =  lTemp / lTemp_count;      // 计算平均湿度
            
            String value = Integer.toString(average_hTemp)+" "+Integer.toString(average_lTemp)
                           +" "+Float.toString(average_humidity)+" "
                          +Integer.toString(air);
            context.write(key, new Text(value));        //输出结果
        } 		
	}
}}
	
 
