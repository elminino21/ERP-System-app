package com.gonzalez.util;

import java.time.Duration;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.Assert.assertEquals;

import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

public class TestShelfLifeCalculator {

	DateTimeFormatter formatter;
	ShelfLifeCalculator life ;
	
		@Before
	public void preTest() {
		 formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ShelfLifeCalculator life = new ShelfLifeCalculator();
	}

	
	
	@Test
	public void dateDiferenceByDate1()
	{	
				double daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays("11/11/2018", "11/12/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println(daysBetween);
				
				assertEquals(daysBetween, 1, 0);
	}
	
	
	@Test
	public void dateDiferenceByDate2() 
	{	
		double daysBetween= 0;
			
					try {
						daysBetween = life.differenceBetweenTwoDays( "11/11/2018", "11/11/2019");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
				System.out.println(daysBetween);
				assertEquals(daysBetween, 365, 0);
	}
	
	
	@Test
	public void dateDiferenceByDate3()
	{	
		double daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays( "11/11/2018", "11/11/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, 0, 0);
	}
	
	
	@Test
	public void dateDiferenceByDate4()
	{	
		double daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays( "11/11/2018", "11/10/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, -1, 0);
	}
	
	
	
	@Test
	public void dateDiferenceByDate5()
	{	
		double daysBetween= 0;
				try {
					daysBetween = life.differenceBetweenTwoDays( "11/11/2018", "11/09/2018");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				assertEquals(daysBetween, -2, 0);
	}
	
	
	
	

	
}
