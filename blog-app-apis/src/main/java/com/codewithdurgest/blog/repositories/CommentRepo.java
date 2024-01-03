package com.codewithdurgest.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithdurgest.blog.entities.Comment;



public interface CommentRepo extends JpaRepository<Comment,Integer>{

	
}
