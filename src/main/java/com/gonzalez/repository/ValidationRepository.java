package com.gonzalez.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gonzalez.entities.User;
import com.gonzalez.entities.Verification;

public interface ValidationRepository extends PagingAndSortingRepository< Verification, Long>{

}
