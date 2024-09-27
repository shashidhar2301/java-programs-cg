package com.Complex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedIPFromLog {

	public static void main(String[] args) {

		/*
		 * 5. Given a string array, each element containing a line of apache log file.
		 * Every line starts with an IP address. Write a program that returns the IP
		 * address which appeared most of the times from the log file.
		 * 
		 * "123.123.23.123 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/wpaper.gif
		 * HTTP/1.0\" 200 6248 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05
		 * (Macintosh; I; PPC)\"\n" + "123.123.123.123 - - [26/Apr/2000:00:23:47
		 * -0400] \"GET /asctortf/ HTTP/1.0\" 200 8130 \"http://
		 * search.netscape.com/Computers/Data_Formats/Document/Text/RTF\"
		 * \"Mozilla/4.05 (Macintosh; I; PPC)\"\n" + "123.123.123.124 - -
		 * [26/Apr/2000:00:23:48 -0400] \"GET /pics/5star2000.gif HTTP/1.0\" 200 4005
		 * \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I;
		 * PPC)\"\n" + "123.123.123.123 - - [26/Apr/2000:00:23:50 -0400] \"GET
		 * /pics/5star.gif HTTP/1.0\" 404 1031 \"http:// www.jafsoft.com/asctortf/\"
		 * \"Mozilla/4.05 (Macintosh; I; PPC)\"\n" + "123.123.123.124 - -
		 * [26/Apr/2000:00:23:51 -0400] \"GET /pics/a2hlogo.jpg HTTP/1.0\" 200 4282
		 * \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I;
		 * PPC)\"\n" + "123.123.123.124 - - [26/Apr/2000:00:23:51 -0400] \"GET
		 * /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36
		 * \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I;
		 * PPC)\"\n";"
		 */
		 String[] logs = {
		            "123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/wpaper.gif HTTP/1.0\" 200 6248 \"http://www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"",
		            "123.123.123.123 - - [26/Apr/2000:00:23:47 -0400] \"GET /asctortf/ HTTP/1.0\" 200 8130 \"http://search.netscape.com/Computers/Data_Formats/Document/Text/RTF\" \"Mozilla/4.05 (Macintosh; I; PPC)\"",
		            "123.123.123.124 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/5star2000.gif HTTP/1.0\" 200 4005 \"http://www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"",
		            "123.123.123.123 - - [26/Apr/2000:00:23:50 -0400] \"GET /pics/5star.gif HTTP/1.0\" 404 1031 \"http://www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"",
		            "123.123.123.124 - - [26/Apr/2000:00:23:51 -0400] \"GET /pics/a2hlogo.jpg HTTP/1.0\" 200 4282 \"http://www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"",
		            "123.123.123.124 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http://www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\""
		        };
		
		 String ip = findMaxIp(logs);
		 System.out.println("Max repeated ip is :::"+ip);
	}
	// "123.123.123.123,  "123.123.123.124

	private static String findMaxIp(String[] logs) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		for(String s  : logs) {
			String ip = s.split(" ")[0];
			map.put(ip, map.getOrDefault(ip, 0)+1);
		}
		System.out.println(map);
		
		int maxCount  = 0;
		String maxRepeatedStr  = "";
		
		for(Map.Entry<String,Integer> e : map.entrySet())
		{
			if(e.getValue() > maxCount) {
				maxCount = e.getValue();
				maxRepeatedStr = e.getKey();
			}
			
		}
		
		
		return maxRepeatedStr;
	}
}
