package com.myboot02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myboot02.service.UserService;
import com.myboot02.vo.User;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("test")
	public String addUser(User user) throws Exception{
		
		//System.out.println(user);
		return "index"; 
	}
	
	@RequestMapping("test02")
	public String addUser02(@ModelAttribute User user)throws Exception{
		System.out.println(user);
		userService.addUser(user);
		
		return "index";
	}
	
	
}
