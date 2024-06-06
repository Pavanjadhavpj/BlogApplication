package com.BlogApplication.start.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlogApplication.start.Entities.Category;
import com.BlogApplication.start.Entities.Post;
import com.BlogApplication.start.Entities.User;

@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {

	List<Post>findByUser(User user);
	List<Post>findByCategory(Category category);
}
