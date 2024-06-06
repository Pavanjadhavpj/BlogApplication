package com.BlogApplication.start.payload;

import java.util.Date;

import com.BlogApplication.start.Entities.Category;
import com.BlogApplication.start.Entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
  
	private String title;
	
	private String content;
	
	private String imageName;
	 
    private Date addedDate;
    private Category category;
    private User user;	
}
