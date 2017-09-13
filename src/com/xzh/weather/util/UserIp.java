package com.xzh.weather.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UserIp {
    
	public String getUserIp() throws UnknownHostException{
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		
		return ip;
	}
}
