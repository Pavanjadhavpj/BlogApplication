package com.BlogApplication.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlogApplication.start.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
