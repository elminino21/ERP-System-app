package com.gonzalez.entities;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	public Item() {
	}

	
	public Item(String part, String location, String description, LocalDate dOM, LocalDate dOE,
			LocalDate transationDate) {
		super();
		this.part = part;
		this.location = location;
		this.description = description;
		DOM = dOM;
		DOE = dOE;
		this.transationDate = transationDate;
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
	
	
	
	

}
