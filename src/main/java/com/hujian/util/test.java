package com.hujian.util;

import java.io.File;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class test {
	Date date;
	
	public static void main(String args[]) throws Exception {
		/*String dateString = "2017-07-30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateString);
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.setTime(date);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println(weekOfMonth);*/
		
		/*SAXParserFactory factory = SAXParserFactory.newInstance();
		
		SAXParser parser = factory.newSAXParser();
		
		MySAXHandler mySAXHandler = new MySAXHandler();
		
		parser.parse(new File("C:/Users/Administrator/Desktop/102/conf.xml"), mySAXHandler);
		
		Map<String,String> map = mySAXHandler.getConfig();
		
		System.out.println(map.get("ver"));
		System.out.println(map.get("len"));
		System.out.println(map.get("sum"));
		System.out.println(map.get("dbytes"));*/
		BigDecimal meter = (new BigDecimal(13432)).divide(new BigDecimal(1000), 2,
				BigDecimal.ROUND_HALF_UP);
		System.out.println(meter);
		
	}
}
