package com.github.backyardlab.accountsbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.backyardlab.accountsbook.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	List<User> findByName(String name);

}
