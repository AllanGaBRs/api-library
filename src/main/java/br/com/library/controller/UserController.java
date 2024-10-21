package br.com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.library.model.User;
import br.com.library.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("")
	public Iterable<User> userList(){
		return userRepository.findAll();
	}
}
