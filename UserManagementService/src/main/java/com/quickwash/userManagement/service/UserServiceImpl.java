package com.quickwash.userManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickwash.userManagement.entity.User;
import com.quickwash.userManagement.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void create(User user) {
		User u = userRepo.save(user);
		System.out.println("Created:- " + u);		
	}

	@Override
	public User getUserById(String id) {
		return userRepo.findById(id).get();
	}

	@Override
	public void update(User user) {
		User u = userRepo.save(user);
		System.out.println("Updated:-" + u);		
	}

	@Override
	public String deleteById(String id) {
		userRepo.deleteById(id);
		return "user deleted with id "+ id;
	}

	@Override
	public void deleteAll() {
		userRepo.deleteAll();
	}

	@Override
	public User find(User user) {
		Optional<User> findById = userRepo.findById(user.getId());
		return findById.get();
	}

	@Override
	public User findByName(String name) {
		return userRepo.findByName(name);
	}


	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}
	

}
