package com.BlogApplication.start.Service;

import java.util.List;

import com.BlogApplication.start.Entities.Post;
import com.BlogApplication.start.payload.PostDto;

public interface Postservice {
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	public Post updatePost(PostDto postDto,Integer postId);
	
	public void deletePost(Integer postId);
	
	public List<Post> getAllPost();
	
	public Post getPostById(Integer postId);
	
	public List<Post> getPostsByCategory(Integer categoryId);
	
	public List<Post>getPostsByUser(Integer userId);
	
	public List<Post> searchPosts(String keyword);
}
