package com.xzh.weather.controller.hadoop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;



import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.io.IOUtils;

public class HDFS {
   
	public static void main(String[] args) throws Exception
	{
	  String dest = "hdfs://master:9000/ty_info/000000_0";
	  String local = "d:/ty_info.txt";
	  Configuration conf = new Configuration();
	  FileSystem fs = FileSystem.get(URI.create(dest),conf);
	  FSDataInputStream fsdi = fs.open(new Path(dest));
	  OutputStream output = new FileOutputStream(local);
	  IOUtils.copyBytes(fsdi,output,40960,true);
	}
}
