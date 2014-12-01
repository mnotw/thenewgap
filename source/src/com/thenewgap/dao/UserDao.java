package com.thenewgap.dao;

import java.util.List;

import com.thenewgap.model.User;

public interface UserDao {

	public  void insertUser(User user);

	public  void deleteById(long id);

	public  List<User> findAll();

	public  void Update(User user);
	
	public List<User> findByName(String name);
	
	public User findById(long id);

}