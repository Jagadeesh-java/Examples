package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/login")
	public String userlogin(Model model,User user) {
		model.addAttribute("user",user);
		return "login";
	}
	@RequestMapping("/details")
	public String userdetails(Model model,User user) {
		model.addAttribute("user",user);
		return "userDetails";
	}
	@RequestMapping("/register")
	public String userRegsiter() {
		return "register";
	}
	@RequestMapping("/regDetails")
	public String regUser(HttpServletRequest req,Model model) {
		User u=new User();
		String username=req.getParameter("username");
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		String email=req.getParameter("email");
		u.setUsername(username);
		u.setFirstname(firstname);
		u.setLastname(lastname);
		u.setEmail(email);
		model.addAttribute("user",u);
		return "regDetails";
		
	}

}
