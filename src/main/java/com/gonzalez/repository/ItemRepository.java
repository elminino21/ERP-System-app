package com.gonzalez.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gonzalez.entities.Item;


@Repository
public interface ItemRepository extends CrudRepository< Item, Long>{
	
	
	
	List<Item>findByPartNumber(String t);

	List<Item>findByPartNumberOrderByPartNumber(String t);
	long count();
	


}
