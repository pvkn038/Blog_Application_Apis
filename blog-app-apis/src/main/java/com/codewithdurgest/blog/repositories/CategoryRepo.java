package com.codewithdurgest.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithdurgest.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
