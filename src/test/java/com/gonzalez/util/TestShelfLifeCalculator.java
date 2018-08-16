package com.gonzalez.util;

import java.time.Duration;
import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.Assert.assertEquals;

import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class TestShelfLifeCalculator {

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	ShelfLifeCalculator life = new ShelfLifeCalculator();
	/**
	 * assets 1 day
	 */
	@Test
	public void dateDiferenceByDate1()
	{	
				long daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays("11/11/2018", "12/11/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, 1);
	}
	
	
	@Test
	public void dateDiferenceByDate2()
	{	
		long daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays("11/11/2018", "11/11/2019");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, 365);
	}
	
	
	@Test
	public void dateDiferenceByDate3()
	{	
		long daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays("11/11/2018", "11/11/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, 0);
	}
	
	
	@Test
	public void dateDiferenceByDate4()
	{	
		long daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays("11/11/2018", "10/11/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, -1);
	}
	
	
	
	@Test
	public void dateDiferenceByDate5()
	{	
		long daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays("11/11/2018", "9/11/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, -2);
	}
	
	
	
	

	
}
