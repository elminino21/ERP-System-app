package com.gonzalez.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gonzalez.entities.Item;


public interface ItemRepository extends PagingAndSortingRepository< Item, Long>{
	
	
	



}
