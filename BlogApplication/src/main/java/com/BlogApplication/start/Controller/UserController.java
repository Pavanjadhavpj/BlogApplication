package com.BlogApplication.start.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BlogApplication.start.Service.UserService;
import com.BlogApplication.start.payload.ApiResponse;
import com.BlogApplication.start.payload.UserDto;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/users")
public class UserController {
    
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<UserDto> createNewUser(@Valid @RequestBody UserDto userDto)
	{
	 UserDto createdUser= this.userService.createUser(userDto);	
      return new ResponseEntity<>(createdUser,HttpStatus.CREATED);		
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable Integer userId)
	{ 
		UserDto updateUser = this.userService.updateUser(userDto, userId);
  		return ResponseEntity.ok(updateUser);
 	}
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@Valid @PathVariable("userId")Integer userId)
	{   
		this.userService.deleteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User delete Successfully",true),HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers()
	{
		return  ResponseEntity.ok(this.userService.getAllUser());
	}
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto>getSingleUser(@PathVariable Integer userId)
	{
		return ResponseEntity.ok(this.userService.getUserById(userId));
	}
}

