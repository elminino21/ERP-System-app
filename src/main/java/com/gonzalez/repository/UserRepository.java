package com.gonzalez.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gonzalez.entities.Item;
import com.gonzalez.entities.User;

public interface UserRepository extends PagingAndSortingRepository< User, Long>{
	
	User findByEmail(String email);

}
