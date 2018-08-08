package com.gonzalez.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class ShelfLifeCalculator {
	
	
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	 Date firstDate = null;
	 Date secondDate = null;
	
	
	/**
	 * 
	 * @return
	 */
	private long differenceBetweenTwoDays(String DOM, String DOE )
	{
		

		try {
			
		
	    firstDate = sdf.parse(DOM);
	    secondDate = sdf.parse(DOE);
		}
		catch(ParseException e ) {
			
			System.out.println("incorretly parce");
		}
	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		
		return diff;
	}
	


	

}
