package com.gonzalez.entities;

import java.sql.Date;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


@Entity
public class Item {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(length = 20)
	private String partNumber;
	@Column(length = 100)
	private String partName;
	private String currentLocation;
	
	private String description;
	
	protected Item()
	{
		
	}

	public Item(String partNumber, String partName,  String currentLocation, String description) {
		super();
		this.partNumber = partNumber;
		this.partName = partName;
		
		this.currentLocation = currentLocation;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}


	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
		
	@Override
	public String toString() {
		return "Item [partNumber=" + partNumber + ", partName=" + partName + ", dateReceive=" 
				+ ", dateExpiration="  + ", currentLocation=" + currentLocation + ", description="
				+ description + "]";
	}
		
	

}
