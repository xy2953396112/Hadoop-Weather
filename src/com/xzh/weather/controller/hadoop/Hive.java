package com.xzh.weather.controller.hadoop;
import java.io.IOException;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
      






import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;  

import com.xzh.weather.entity.Log;
import com.xzh.weather.mybatis.util.MyBatisUtil;
import com.xzh.weather.util.DBUtil;


      
    /** 
     * Hive的JavaApi 
     *  
     * 启动hive的远程服务接口命令行执行：hive --service hiveserver >/dev/null 2>/dev/null & 
     *  
     * @author xzh 
     *  
     */  
public class Hive {  
      
        private static String driverName = "org.apache.hive.jdbc.HiveDriver";  
        private static String url = "jdbc:hive2://192.168.214.86:10000/xzh";  
        private static String user = "root";  
        private static String password = "xzhxzh";  
        private static String sql = "";  
        private static ResultSet res;  
        //private static final Logger log = Logger.getLogger(HiveJdbcCli.class);  
      
        public static void main(String[] args) throws Exception {  
            Connection conn = null;  
            Statement stmt = null;  
            try {  
                conn = getConn();  
                stmt = conn.createStatement();  
                System.out.println("连接:"+conn);
                 
      
                // 执行按年查询操作  
                //addWeather_year(stmt,"weather_year");  
                
                // 执行按平均查询操作
                //addWeather_avg(stmt,"weather_avg"); 
                
                // 执行按每天的平均查询操作
                //addWeather_day(stmt,"weather_day");
                
                //第一份原始数据
                //addWeather(stmt,"weather");
                
                //太原2014-2016三年的天气
                //addTy_Three(stmt, "ty_three");
                
                //三年的按日查询（此处修改对应的年份）
                //addTy_year(stmt, "ty_2016_day");
                
                //按月份查询所有城市的最高气温，最低气温,平均月气温
                //addCity_Month(stmt, "city_month");
                
            } catch (ClassNotFoundException e) {  
                e.printStackTrace();  
                //log.error(driverName + " not found!", e);  
                System.exit(1);  
            } catch (SQLException e) {  
                e.printStackTrace();  
                //log.error("Connection error!", e);  
                System.exit(1);  
            } finally {  
                try {  
                    if (conn != null) {  
                        conn.close();  
                        conn = null;  
                    }  
                    if (stmt != null) {  
                        stmt.close();  
                        stmt = null;  
                    }  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
      
       
      
        private static void selectData(Statement stmt, String tableName)  
                throws SQLException {  
        	    	
        	
            sql = "select * from " + tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");  
            while (res.next()) {  
                System.out.println(res.getString(1) + "\t" + res.getInt(2) +"\t" + res.getInt(3)+"\t" + res.getInt(4)+"\t" + res.getFloat(5)+"\t" + res.getInt(6)+"\t" + res.getString(7));  
            }  
        }  
       
        
//**************************************************************************       
        public static void addWeather_year(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = com.xzh.weather.util.DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into weather_year (city,htemp,ltemp,avg_temp,humidity,rain,date) values(?,?,?,?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
                System.out.println(res.getString(1) + "\t" + res.getInt(2) +"\t" + res.getInt(3)+"\t" + res.getInt(4)+"\t" + res.getFloat(5)+"\t" + res.getInt(6)+"\t" + res.getString(7));  
                pst.setString(1,res.getString(1));
       	        pst.setInt(2,res.getInt(2));
       	        pst.setInt(3,res.getInt(3));
       	        pst.setFloat(4,res.getInt(4));
       	        pst.setFloat(5,res.getFloat(5));
       	        pst.setInt(6,res.getInt(6));
       	        pst.setString(7,res.getString(7));
       	     
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	}
//*****************************************************************************     
         
          public static void addWeather_month(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = com.xzh.weather.util.DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into weather_avg (city,htemp,ltemp,avg_temp,humidity,rain,date) values(?,?,?,?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
                System.out.println(res.getString(1) + "\t" + res.getInt(2) +"\t" + res.getInt(3)+"\t" + res.getInt(4)+"\t" + res.getFloat(5)+"\t" + res.getInt(6)+"\t" + res.getString(7));  
                pst.setString(1,res.getString(1));
       	        pst.setInt(2,res.getInt(2));
       	        pst.setInt(3,res.getInt(3));
       	        pst.setFloat(4,res.getInt(4));
       	        pst.setFloat(5,res.getFloat(5));
       	        pst.setInt(6,res.getInt(6));
       	        pst.setString(7,res.getString(7));
       	     
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	}       
          
//*****************************************************************************       
         public static void addWeather_avg(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into weather_avg (city,htemp_avg,ltemp_avg,humidity,air_count) values(?,?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
                
                pst.setString(1,res.getString(1));
       	        pst.setString(2,res.getString(2));
       	        pst.setString(3,res.getString(3));
       	        pst.setString(4,res.getString(4));
       	        pst.setString(5,res.getString(5));
       	        
       	     
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	}       
//*****************************************************************************       
         public static void addWeather_day(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into weather_day (city,htemp,ltemp,avg_temp,humidity,rain,date) values(?,?,?,?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
                
                pst.setString(1,res.getString(1));
       	        pst.setInt(2,res.getInt(2));
       	        pst.setInt(3,res.getInt(3));
       	        pst.setInt(4,res.getInt(4));
       	        pst.setFloat(5,res.getFloat(5));
       	        pst.setInt(6,res.getInt(6));
       	        pst.setString(7,res.getString(7));
       	     
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	}       
 
//*****************************************************************************       
         public static void addWeather(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into weather (id,city,Htemp,LTemp,rain,wind,humidity,air,date) values(?,?,?,?,?,?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
   	        	pst.setInt(1,res.getInt(1));
                pst.setString(2,res.getString(2));
                pst.setInt(3,res.getInt(3));
                pst.setInt(4,res.getInt(4));
                pst.setInt(5,res.getInt(5));
                pst.setString(6,res.getString(6));
                pst.setFloat(7,res.getFloat(7));
                pst.setString(8,res.getString(8));
                pst.setString(9,res.getString(9));
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	} 
         
//*****************************************************************************       
         public static void addTy_Three(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into ty_three (id,hTemp,cityDate,wind,level,day,lTemp,weather) values(?,?,?,?,?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
   	        	pst.setInt(1,res.getInt(1));
                pst.setInt(2,res.getInt(2));
                pst.setString(3,res.getString(3));
                pst.setString(4,res.getString(4));
                pst.setString(5,res.getString(5));
                pst.setString(6,res.getString(6));
                pst.setInt(7,res.getInt(7));
                pst.setString(8,res.getString(8));
                
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	} 
//*****************************************************************************       
         public static void addTy_year(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into "+tableName +" (id,hTemp,lTemp,temAvg,wind,level,day,weather) values(?,?,?,?,?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
   	        	pst.setInt(1,res.getInt(1));
                pst.setInt(2,res.getInt(2));
                pst.setInt(3,res.getInt(3));
                pst.setInt(4,res.getInt(4));
                pst.setString(5,res.getString(5));
                pst.setString(6,res.getString(6));
                pst.setString(7,res.getString(7));
                pst.setString(8,res.getString(8));
                
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	} 
//*****************************************************************************       
         public static void addCity_Month(Statement stmt,String tableName) throws Exception {              //
    		// TODO Auto-generated method stub
        	
        	Connection conn = DBUtil.getConnection(); ;
        	PreparedStatement  pst = null;
        	ResultSet rs = null;
        	
        	//---------HIVE的JDBC
        	sql = "select * from "+tableName;  
            System.out.println("Running:" + sql);  
            res = stmt.executeQuery(sql);  
            System.out.println("执行 select * query 运行结果:");
            
            //----------mysql的JDBC
            boolean flag = false;
            String sql = "insert into "+tableName +" (cityDate,hTemp,lTemp,temAvg) values(?,?,?,?)"; 
   	        pst = conn.prepareStatement(sql);
            
   	        while (res.next()) {  
   	        	pst.setString(1,res.getString(1));
                pst.setInt(2,res.getInt(2));
                pst.setInt(3,res.getInt(3));
                pst.setInt(4,res.getInt(4));
                
                
       	     if(pst.executeUpdate()>0){
       	    	 flag = true;
       	     }
            
            }  
    	     pst.close();	     
    	} 
        
      
        
        
        private static Connection getConn() throws ClassNotFoundException,  
                SQLException {  
            Class.forName(driverName);  
            Connection conn = DriverManager.getConnection(url, user, password);  
            return conn;  
        }  
      
    }  