package com.gonzalez.util;

import static java.time.temporal.ChronoUnit.DAYS;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

public class ShelfLifeCalculator {
	
	
	
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	
	
	
	/**
	 *  
	 * @return
	 * @throws Exception 
	 * 
	 */
	public double differenceBetweenTwoDays(String oldDate, String moreResentDate ) throws Exception
	{
		/*
		 * dates should be on the format of 06/24/2017"
		 */
		if(oldDate == null ||  moreResentDate == null)
		{
			
			 throw new UnsupportedTemporalTypeException("The enters dates are not comparable with the localDate class");
		}
			
		
		System.out.println(oldDate);	
		System.out.println(moreResentDate);	
		LocalDate oldDatea = LocalDate.parse(oldDate, formatter);
		LocalDate newDate =  LocalDate.parse(moreResentDate, formatter);
    	
		
		double diff = DAYS.between(oldDatea, newDate);
		
		
		return diff;
	}
	
	
	
	
	

	
	


	

}
