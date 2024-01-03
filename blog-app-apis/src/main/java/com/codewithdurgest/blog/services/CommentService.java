package com.codewithdurgest.blog.services;

import com.codewithdurgest.blog.entities.Post;
import com.codewithdurgest.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto,Integer postId);
	
	void deleteComment(Integer commentId);

}
