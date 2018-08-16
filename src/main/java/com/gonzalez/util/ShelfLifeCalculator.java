package com.gonzalez.util;

import static java.time.temporal.ChronoUnit.DAYS;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

public class ShelfLifeCalculator {
	
	
	
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	
	
	
	/**
	 *  
	 * @return
	 * @throws Exception 
	 * 
	 */
	public long differenceBetweenTwoDays(String oldDate, String moreResentDate ) throws Exception
	{
		/*
		 * dates should be on the format of 06/24/2017"
		 */
		if(oldDate == null ||  moreResentDate == null)
		{
			
			 throw new Exception();
		}
			
			
			
		LocalDate oldDatea = LocalDate.parse(oldDate, formatter);
		LocalDate newDate = LocalDate.parse(moreResentDate, formatter);
    	
		
		long diff = DAYS.between(oldDatea, newDate);
		
		
		return diff;
	}
	
	
	
	
	

	
	


	

}
