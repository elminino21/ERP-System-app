package com.gonzalez;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gonzalez.entities.Item;
import com.gonzalez.repository.ItemRepository;

@SpringBootApplication
public class ErpProjectApplication{

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

	public static void main(String[] args) { SpringApplication.run(ErpProjectApplication.class, args);}

	

	
	@Bean
	CommandLineRunner initData(ItemRepository items){
		
		return args ->{
			items.save(new Item( "RA-15465496878", "TOP SHELF 01", "rubber", LocalDate.parse("11/11/2018", formatter), LocalDate.parse("11/11/2018", formatter),
					LocalDate.parse("11/11/2018", formatter)));
		};
		
	}
	

	
			
		

	
	
}
