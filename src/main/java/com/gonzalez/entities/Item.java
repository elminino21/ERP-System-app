package com.gonzalez.entities;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.gonzalez.util.ShelfLifeCalculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
public class Item {
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String part;
	private String description;	
	private String location;
	@Column(name="DOM")

	private LocalDate DOM;
	@Column(name="DOE")
	private LocalDate DOE;
	private LocalDate transationDate;
	private LocalTime transactionTime;
	@Column(name="life")
	private double remainShelfLife;
	
	


	public Item() {
	}

	
	public Item(String part, String location, String description, String dOM, String dOE) {
		super();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		ShelfLifeCalculator cal = new ShelfLifeCalculator();
		this.part = part;
		this.location = location;
		this.description = description;
		DOM = LocalDate.parse(dOM, formatter);
		DOE = LocalDate.parse(dOE, formatter);
		this.transationDate = LocalDate.now();
		this.transactionTime = LocalTime.now();
		
		try {
			remainShelfLife = (double)(cal.differenceBetweenTwoDays(LocalDate.now().format(formatter).toString(), dOE) / cal.differenceBetweenTwoDays(dOM, dOE))*100;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDOM() {
		return DOM;
	}

	public void setDOM(LocalDate dOM) {
		DOM = dOM;
	}

	public LocalDate getDOE() {
		return DOE;
	}

	public void setDOE(LocalDate dOE) {
		DOE = dOE;
	}

	public LocalDate getTransationDate() {
		return transationDate;
	}

	public void setTransationDate(LocalDate transationDate) {
		this.transationDate = transationDate;
	}

	public Long getId() {
		return id;
	}
	
	

	public double getRemainShelfLife() {
		return remainShelfLife;
	}
	
	
	public void setRemainShelfLife(double remainShelfLife) {
		this.remainShelfLife = remainShelfLife;
	}
	
	public LocalTime getTransactionTime() {
		return transactionTime;
	}


	public void setTransactionTime(LocalTime transactionTime) {
		this.transactionTime = transactionTime;
	}
	
	

}
