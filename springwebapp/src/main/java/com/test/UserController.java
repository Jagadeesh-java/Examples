package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/details")
	public String userDetails(Model model,User user) {
		model.addAttribute("user",user);
		return "userDetails";
	}
	@RequestMapping("/login")
	public String userlogin(Model model,User user) {
		
		model.addAttribute("user",user);
		return "login";
	}
	@RequestMapping("/register")
	public String userRegister() {
		return "register";
	}
	@RequestMapping("/regdetails")
	public String reguserdetails(HttpServletRequest req,HttpServletResponse res,Model model) {
		User u=new User();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		u.setId(Integer.parseInt(id));
		u.setName(name);
		u.setCity(city);
		model.addAttribute("user",u);
		return "regdetails";
		
	}

}
