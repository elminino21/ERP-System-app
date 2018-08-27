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
/**
 * Calculator use to get the the days between to given dates
 * @author elminino
 *
 */
public class ShelfLifeCalculator {
	
	
	private double daysBetweenDates;
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	
	public ShelfLifeCalculator() {}
	
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
				
		LocalDate oldDatea = LocalDate.parse(oldDate, formatter);
		LocalDate newDate =  LocalDate.parse(moreResentDate, formatter);
    	
		
		daysBetweenDates = DAYS.between(oldDatea, newDate);
		
		
		return daysBetweenDates;
	}
	
	public double  differenceBetweenTwoDays(LocalDate DOM, LocalDate DOE)
	{
		
		
		if(DOM == null ||  DOE == null)
		{
			
			 throw new UnsupportedTemporalTypeException("The enters dates are not comparable with the localDate class");
		}

		daysBetweenDates = DAYS.between(DOM, DOE);
		
		
		return daysBetweenDates;
		
	}
		
	
//(cal.differenceBetweenTwoDays(LocalDate.now().format(formatter).toString(), dOE) / cal.differenceBetweenTwoDays(dOM, dOE))*100;
	public double remainingTimeBetweenDates(String DOM,  String DOE )
	{
		
		
		try {
			return 	differenceBetweenTwoDays(
					LocalDate.now().format(formatter).toString(), DOE) / differenceBetweenTwoDays(DOM, DOE) 
					*100;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Double) null;
	}
	
	public double remainingTimeBetweenDates(LocalDate DOM,  LocalDate DOE )
	{
		
		
		try {
			return 	differenceBetweenTwoDays(
					LocalDate.now(), DOE) / differenceBetweenTwoDays(DOM, DOE) 
					*100;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Double) null;
	}
	
	
	

	
	public double getDaysBetweenDates() {
		return daysBetweenDates;
	}



	public void setDaysBetweenDates(double daysBetweenDates) {
		this.daysBetweenDates = daysBetweenDates;
	}
	


	

}
