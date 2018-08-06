package com.gonzalez.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Item {
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String part;


	private String name;
	private String location;
	private String description;
	
	protected Item()
	{
		
	}
	
	public Item(String part, String name, String location, String description) {
		super();
		this.part = part;
		this.name = name;
		this.location = location;
		this.description = description;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Item [id=" + id + ", part=" + part + ", name=" + name + ", location=" + location + ", description="
				+ description + "]";
	}

	
	
	
	

}
