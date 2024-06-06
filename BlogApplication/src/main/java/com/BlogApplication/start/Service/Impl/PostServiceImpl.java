package com.BlogApplication.start.Service.Impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlogApplication.start.Entities.Category;
import com.BlogApplication.start.Entities.Post;
import com.BlogApplication.start.Entities.User;
import com.BlogApplication.start.Exception.ResourceNotFoundException;
import com.BlogApplication.start.Repository.CategoryRepo;
import com.BlogApplication.start.Repository.PostRepo;
import com.BlogApplication.start.Repository.UserRepository;
import com.BlogApplication.start.Service.Postservice;
import com.BlogApplication.start.payload.PostDto;
import com.BlogApplication.start.payload.UserDto;

@Service
public class PostServiceImpl implements Postservice {
    
	@Autowired 
	private PostRepo postRepo;
	@Autowired 
	private ModelMapper modelMapper;
	@Autowired
	private UserRepository userRepository;
	@Autowired 
	private CategoryRepo categoryRepo;
	
	@Override
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId) {
		
		User user=this.userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","User id",userId));
		Category category=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","category id", categoryId));		
		Post post=this.modelMapper.map(postDto,Post.class);
		post.setImageName("default.png");
		post.setAddedDate(new Date());
		post.setUser(user);
		post.setCategory(category);
		
		Post newPost=this.postRepo.save(post);
		
		return this.modelMapper.map(newPost,PostDto.class);
	}

	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PostDto> getAllPost() {
	 List<Post> posts=this.postRepo.findAll();
	 List<PostDto>postDtos= posts.stream().map((post)-> this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
		return postDtos;
	}

	@Override
	public PostDto getPostById(Integer postId) {
		Post post=this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post","post id", postId));
		return this.modelMapper.map(post,PostDto.class);
	}

	@Override
	public List<PostDto> getPostsByCategory(Integer categoryId) {
		Category category=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","Cateory id",categoryId));
		List<Post> posts=this.postRepo.findByCategory(category);
		
		List<PostDto> postDtos= posts.stream().map((post)->this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
		return postDtos;
	}

	@Override
	public List<PostDto> getPostsByUser(Integer userId) {
		User user =this.userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","User id",userId));
		List<Post> posts=this.postRepo.findByUser(user);
		List<PostDto> postDtos= posts.stream().map((post)->this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
		return postDtos;
	}

	@Override
	public List<PostDto> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
