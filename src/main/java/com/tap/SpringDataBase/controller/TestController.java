package com.tap.SpringDataBase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tap.SpringDataBase.model.User;
import com.tap.SpringDataBase.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private UserService userService;
	 @GetMapping("/test")
	    public String message() {
	        return "hello";
	    }
	 
      @PostMapping("/addUsers")
      public User add(@RequestBody User user){
    	  return userService.addUser(user);
      }

      @GetMapping("/findAllUsers")
      public List<User> findAll(){
    	  return userService.getAllUser();
      }
      
//      @GetMapping("/{id}")
//      public Optional<User> getUserById(@PathVariable long id){
//    	  return userService.getUserById(id);
//      }
      
      @GetMapping("/{id}")
      public User getUserById(@PathVariable long id) {
          return userService.getUserById(id);
            
      }
      
      @PostMapping("/{id}")
      public User updateUser(@PathVariable long id,@RequestBody User user) {
    	  return userService.updateUser(id,user);
      }
      
      @DeleteMapping("/{id}")
      public void deleteUser(@PathVariable long id) {
    	  userService.deleteUser(id);
      }
      
      @DeleteMapping("/DeleteAll")
      public void deleteAll() {
    	  userService.deleteAll();
      }
      		
}
