package com.alpha.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alpha.thymeleaf.model.User;

@Controller
public class UserController {

	// handler method to handle /variable-expression request
	// http://localhost:8080/variable-expression
	@GetMapping("/variable-expression")
	public String variableExpression(Model model) {
		User user = new User(1, "tom", "tom@gmail.com", "ADMIN", "male");
		model.addAttribute("user", user);
		return "variable-expression";
	}
	
	// handler method to handle /selection-expression request
	// http://localhost:8080/selection-expression
	@GetMapping("/selection-expression")
	public String selectionExpression(Model model) {
		User user = new User(2, "jerry", "jerry@gmail.com", "ADMIN", "male");
		model.addAttribute("user", user);
		return "selection-expression";
	}
	
	// handler method to handle /message-expression request
	// http://localhost:8080/message-expression
	@GetMapping("/message-expression")
	public String messageExpression() {
		return "message-expression";
	}
	
	// handler method to handle /link-expression request
	// http://localhost:8080/link-expression
	@GetMapping("/link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", 100);
		return "link-expression";
	}
	
	// handler method to handle /fragment-expression request
	// http://localhost:8080/fragment-expression
	@GetMapping("/fragment-expression")
	public String fragmentExpression() {
		return "fragment-expression";
	}
	
	// handler method to handle /users request
	// http://localhost:8080/users
	@GetMapping("/users")
	public String getAllUsers(Model model) {
		User admin = new User(1, "admin", "admin@gmail.com", "ADMIN", "male"); 
		User tom = new User(2, "tom", "tom@gmail.com", "NORMAL", "male"); 
		User dolly = new User(3, "dolly", "dolly@gmail.com", "NORMAL", "female"); 
		User molly = new User(4, "molly", "molly@gmail.com", "NORMAL", "female");
		
		List<User> users = new ArrayList<>();
		users.add(admin);
		users.add(tom);
		users.add(dolly);
		users.add(molly);
		
		model.addAttribute("users", users);
		return "users";
	}
	
	// handler method to handle /if-unless request
	// http://localhost:8080/if-unless
	@GetMapping("/if-unless")
	public String ifUnless(Model model) {
		User admin = new User(1, "admin", "admin@gmail.com", "ADMIN", "male"); 
		User tom = new User(2, "tom", "tom@gmail.com", "NORMAL", "male"); 
		User dolly = new User(3, "dolly", "dolly@gmail.com", "NORMAL", "female"); 
		User molly = new User(4, "molly", "molly@gmail.com", "NORMAL", "female");
		
		List<User> users = new ArrayList<>();
		users.add(admin);
		users.add(tom);
		users.add(dolly);
		users.add(molly);
		
		model.addAttribute("users", users);
		return "if-unless";
	}
}
