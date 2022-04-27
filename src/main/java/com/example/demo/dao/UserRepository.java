package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.*;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("SELECT s FROM User s Where s.emailid = ?1")
	Optional<User> findUserByEmail(String emailid);


}