package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/userlogin")
	public String loginUser()
	{
		return "login";
	}
	
	@RequestMapping("/userreg")
	public String regUser()
	{
		return "register";
	}
	
	@RequestMapping("/details")
	public String userDetails(HttpServletRequest request, Model model)
	{
		String user = request.getParameter("user");
		
		model.addAttribute("info", user);
		
		return "userdetails";
	}
}
//	
//	@RequestMapping("/udetails")
//	public String userRegDetails(@RequestParam("user") String user, Model model)
//	{
//		//String user = Request.getParameter("user");
//		
//		model.addAttribute("info", user);
//		
//		return "userdetails";
//	}
	
//	@RequestMapping("/urdetails")
//	public ModelAndView userregDetails(@RequestParam("info2" String myname))
//	{
//		//String user = request.getParameter("user");
//		ModelAndView mv=new ModelAndView("urdetails");
//		mv.addObject("info2",myname);
//		mv.setViewName("userreg");
//		//model.addAttribute("info2", user);
//		
//		return mv;
//	}
	



