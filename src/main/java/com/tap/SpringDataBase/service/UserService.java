package com.tap.SpringDataBase.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.stereotype.Service;

import com.tap.SpringDataBase.model.User;
import com.tap.SpringDataBase.repository.UserRepository;


@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRespository;
	
	
	public User addUser(User user) {
		return userRespository.save(user);
	}
	public List<User> getAllUser(){
		return userRespository.findAll();
	}
//	public Optional<User> getUserById(long id) {
//		 
//		
//		return userRespository.findById(id);
//	}
	
	public User getUserById(long id) {		 
		
		return userRespository.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
	}
//	public User updateUser(long id, User user) {
//		
//	User user_data= getUserById(id);
//	user_data.getId().setName(user.getName());
//    user_data.getId().setDept(user.getDept());
//    return userRespository.save(null)
//	}
//	
	
	public User updateUser(long id, User user) {
		
		User user_data= getUserById(id);
		if(user_data!=null) {
		user_data.setName(user.getName());
	    user_data.setDept(user.getDept());
	    return userRespository.save(user_data);
		}
		return null;
		}
	
	public void deleteUser(long id) {
		User user_data= getUserById(id);
		if(user_data!=null) {
		    userRespository.delete(user_data);
		}
	}
	public void deleteAll() {
		userRespository.deleteAll();
	}


}
