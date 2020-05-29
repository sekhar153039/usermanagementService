package com.quickwash.userManagement.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickwash.userManagement.entity.User;
import com.quickwash.userManagement.service.UserService;

@RestController
@RequestMapping("/userService")
public class UserController {
    
	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public void create(@RequestBody User User) {
		userService.create(User);
	}
	
	@GetMapping("/getUserById/{id}")
	public User find(@PathVariable String id) {
		return userService.getUserById(id);
		
	}

	@PutMapping("/updateUser")
	public void update(@RequestBody User User) {
		userService.update(User);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String delete(@PathVariable("id") String id) {
		return userService.deleteById(id);
	}

	@DeleteMapping("/deleteAllUsers")
	public void deleteAll() {
		userService.deleteAll();
	}
    
	@GetMapping("/getUser")
	public User find(User User) {
		return userService.find(User);
		
	}
      
	@GetMapping("/getUsersByName/{name}")
	public User findByBrand(@PathVariable("name") String name){
		return userService.findByName(name);
		
	}
    
    
	@GetMapping("/getAllUsers")
	public List<User> findAll(){
		return userService.findAll();
		
	}
}
