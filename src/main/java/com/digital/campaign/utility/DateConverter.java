package com.digital.campaign.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	public static Date getDateFromString(String date) {
		Date dateFinal=null;
		// Parse the String to Date
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			dateFinal=formatter.parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}  
		
		return dateFinal;
		

	}
}
