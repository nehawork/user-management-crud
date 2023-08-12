package com.learn.usermanagement.contoller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.usermanagement.entity.UserModel;

@RestController
@RequestMapping("/users")
public class UserManagementController {
	
	@GetMapping("/list")
	public String GetAllUsers() {
		return "Get All Users";
	}
	
	@PostMapping("/add")
	public String AddUser(@RequestBody UserModel user) {
		return "Add User: " + user.userName;
	}
	
	@PutMapping("/{userId}")
	public String UpdateUser(@PathVariable("userId") Long userId, @RequestBody UserModel user) {
		return "Update User: "+ user.userName;
	}
	
	@GetMapping("/{userId}")
	public String GetUser(@PathVariable("userId") Long userId) {
		return "Get User "+ userId.toString();
	}
	
	@DeleteMapping("/{userId}")
	public String DeleteUser(@PathVariable("userId") Long userId) {
		return "Delete User "+ userId.toString();
	}

}
