package com.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static String newDateToString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date date=new Date();  
		String str=sdf.format(date);
		return str;
	}
	
	public static Date stringToDate(String str) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static int dateMinusDate(Date date1,Date date2) {
		long date = date1.getTime()-date2.getTime();
		int minute = (int)date/1000/60;
		return minute;
	}

}
