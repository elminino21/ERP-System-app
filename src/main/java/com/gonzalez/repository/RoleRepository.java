package com.gonzalez.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gonzalez.entities.Role;

public interface RoleRepository extends PagingAndSortingRepository<Role, Long>{

}
