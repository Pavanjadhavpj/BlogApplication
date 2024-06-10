package com.BlogApplication.start.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlogApplication.start.Entities.Post;
import com.BlogApplication.start.Service.Postservice;
import com.BlogApplication.start.payload.ApiResponse;
import com.BlogApplication.start.payload.CategoryDto;
import com.BlogApplication.start.payload.PostDto;

@RestController
@RequestMapping("/api/posts/")
public class PostController {
    @Autowired
    private Postservice postservice;
	
	@PostMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createPost(
			@RequestBody PostDto postDto,
			@PathVariable Integer userId,
			@PathVariable Integer categoryId)
	{  
		PostDto createPost = this.postservice.createPost(postDto, userId, categoryId);
		return new ResponseEntity<PostDto>(createPost,HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{userId}/posts")
	public ResponseEntity<List<PostDto>>getPostsByUser(@PathVariable Integer userId)
	{   
		List<PostDto> postDtos=this.postservice.getPostsByUser(userId);
		return new ResponseEntity<List<PostDto>>(postDtos,HttpStatus.OK);
	}
	
	@GetMapping("/category/{categoryId}/posts")
	public ResponseEntity<List<PostDto>>getPostsByCategory(@PathVariable Integer categoryId)
	{
		List<PostDto> postDtos=this.postservice.getPostsByCategory(categoryId);
		return new ResponseEntity<List<PostDto>>(postDtos,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<PostDto>> getAllPost()
	{
		 List<PostDto>postDtos=this.postservice.getAllPost();
		return ResponseEntity.ok(postDtos);		
	}
	
	@DeleteMapping("/delete/{postId}")
	public ResponseEntity<ApiResponse> deletepost(@PathVariable Integer postId){
		this.postservice.deletePost(postId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Post delete Succesfully !!!",true),HttpStatus.OK);
	}
	
	@GetMapping("/{postId}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId)
	{   
		PostDto postDto =this.postservice.getPostById(postId);
		return ResponseEntity.ok(postDto);
	}
}
