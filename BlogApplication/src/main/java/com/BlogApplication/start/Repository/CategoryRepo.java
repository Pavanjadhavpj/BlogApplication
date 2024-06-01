package com.BlogApplication.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BlogApplication.start.Entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
