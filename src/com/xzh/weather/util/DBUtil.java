package com.xzh.weather.util;
import java.sql.*;
public class DBUtil{         //��ݿ��������
   public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
   public static final String DBURL="jdbc:mysql://localhost:3306/hadoop_weather?characterEncoding=utf8&useSSL=true";
   public static final String DBUSER="root";
   public static final String DBPASS="root";
   private static Connection conn=null;
   static{  try{
       Class.forName(DBDRIVER);
       conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        
            }catch(Exception e){}
     }
  
   public static Connection getConnection(){
           return conn;
      }

   public void close(){
     if(conn!=null){
       try{  conn.close();

         }catch(Exception e){}

       }
   }
}