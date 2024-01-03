package com.codewithdurgest.blog.services;

import java.util.List;

import com.codewithdurgest.blog.entities.Post;
import com.codewithdurgest.blog.payloads.PostDto;
import com.codewithdurgest.blog.payloads.PostResponse;

public interface PostService {

	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//getAll
	PostResponse getAllPosts(Integer pageNumber, Integer pageSize,String sortBy);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all posts by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);
}
