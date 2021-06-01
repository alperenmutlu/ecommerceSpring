package ecommerce.northwind.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecommerce.northwind.business.abstracts.UserService;
import ecommerce.northwind.core.entities.User;
import ecommerce.northwind.core.utilities.results.Result;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;

	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/add")
	//ne döneceğimize şimdi karar vermek istemiyorum, işlem sonucuna göre belli olacak
	public ResponseEntity<?> add(@RequestBody User user) {
		return ResponseEntity.ok(this.userService.add(user));
	}
	
}
