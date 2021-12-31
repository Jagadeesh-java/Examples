package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserRepository repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/adduser")
	public String Adduser( User  user) {
		repo.save(user);
		return "home";
	}
	@RequestMapping("/getUser")
	public ModelAndView getuser(@RequestParam long id) {
		ModelAndView mv=new ModelAndView("showuser");
		User user=repo.findById(id).orElse(new User());
		mv.addObject(user);
		return mv;
		
	}
	@RequestMapping("/UserDetails")
	public String userdetails() {
		return "getuserdetails";
	}

}
