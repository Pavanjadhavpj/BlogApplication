package com.BlogApplication.start.Service;

import java.util.List;

import com.BlogApplication.start.Entities.Post;
import com.BlogApplication.start.payload.PostDto;

public interface Postservice {
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	public PostDto updatePost(PostDto postDto,Integer postId);
	
	public void deletePost(Integer postId);
	
	public List<PostDto> getAllPost();
	
	public PostDto getPostById(Integer postId);
	
	public List<PostDto> getPostsByCategory(Integer categoryId);
	
	public List<PostDto>getPostsByUser(Integer userId);
	
	public List<PostDto> searchPosts(String keyword);
}
