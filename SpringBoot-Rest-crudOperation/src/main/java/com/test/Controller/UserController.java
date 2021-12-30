package com.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;
import com.test.exception.ResourceNotFoundException;
import com.test.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserRepository userrepo;
	//get all users data
	@GetMapping
	public List<User> getAllusers(){
		return this.userrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public User GetUserById(@PathVariable(value = "id") int UserId) {
		return this.userrepo.findById(UserId).orElseThrow(()->new ResourceNotFoundException("User Not found with id:"+UserId));
	

}
	@PostMapping
	public User CreateUser(@RequestBody User user) {
		return this.userrepo.save(user);
	}
	@PutMapping("/{id}")
	public User UpdateUser(@RequestBody User user,@PathVariable("id") int UserId) {
		User exist=  this.userrepo.findById(UserId)
				.orElseThrow(()->new ResourceNotFoundException("User Not found with id:"+UserId));
		exist.setFirstname(user.getFirstname());
		exist.setLastname(user.getLastname());
		exist.setEmail(user.getEmail());
		 return this.userrepo.save(exist);
		
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<User>deleteUser(@PathVariable("id")int UserId){
		User ex=this.userrepo.findById(UserId).orElseThrow(()->new ResourceNotFoundException("User Not Found with id:"+UserId));
		this.userrepo.delete(ex);
		return ResponseEntity.ok().build();
	}
}
