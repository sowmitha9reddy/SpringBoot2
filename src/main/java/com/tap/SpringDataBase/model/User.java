package com.tap.SpringDataBase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	 @Id
	 @GeneratedValue
	 private long id;
	 
     private String name;
     private String dept;
     
     public User(String name, String dept) {
 		super();
 		this.name = name;
 		this.dept = dept;
 	}
      
     
	public User(long id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
