package com.quickwash.userManagement.service;

import java.util.List;

import com.quickwash.userManagement.entity.User;

public interface UserService {
public void create(User user);
	
	public User getUserById(String id);

	public void update(User user);

	public String deleteById(String id);

	public void deleteAll();

	public User find(User user);

	public User findByName(String name);

	public List<User> findAll();
}
