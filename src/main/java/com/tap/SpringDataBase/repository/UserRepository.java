package com.tap.SpringDataBase.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.SpringDataBase.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

}
