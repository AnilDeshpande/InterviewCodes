package com.meetingscheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormatter {
	
	public static String getDateFormate(Date date){
        String stringDate;
        SimpleDateFormat dateFormat=new SimpleDateFormat();
        dateFormat.applyPattern("dd-MMM-yyyy");
        stringDate=dateFormat.format(date);
        return stringDate;
    }

    public static String getTimeFormat(Date date){
        String stringTime;
        DateFormat dateFormat=DateFormat.getTimeInstance();
        stringTime=dateFormat.format(date);
        return stringTime;
    }
}
