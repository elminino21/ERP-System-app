package com.gonzalez.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gonzalez.entities.Item;

public interface UserRepository extends PagingAndSortingRepository< Item, Long>{

}
