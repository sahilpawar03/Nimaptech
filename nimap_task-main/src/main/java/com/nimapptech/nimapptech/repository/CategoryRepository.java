package com.nimapptech.nimapptech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimapptech.nimapptech.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

	
}
