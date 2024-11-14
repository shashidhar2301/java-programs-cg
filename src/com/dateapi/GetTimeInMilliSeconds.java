package com.dateapi;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class GetTimeInMilliSeconds {
	
	public static void main(String[] args) {
		
		long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time in milliseconds: " + currentTimeMillis);
        
        
        //Java 8
        long currentTimeMillis1 = Instant.now().toEpochMilli();
        System.out.println("Current time in milliseconds: " + currentTimeMillis1);
        
        
        //before Java 8
        long currentTimeMillis2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Current time in milliseconds: " + currentTimeMillis2);
        
        
        // current in UTC time zone
        Instant now = Instant.now();
        System.out.println("Current time in UTC: " + now);
        
        ZonedDateTime utcTime = ZonedDateTime.now(java.time.ZoneOffset.UTC);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Current time in UTC: " + utcTime.format(formatter));
        
        
        OffsetDateTime offSetutcTime = OffsetDateTime.now(java.time.ZoneOffset.UTC);
        DateTimeFormatter offSetformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss O");
        System.out.println("Current time in UTC: " + offSetutcTime.format(offSetformatter));
	}

}
