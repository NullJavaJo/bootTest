package com.myboot02.controller;

import com.myboot02.dto.UserDto;
import lombok.AllArgsConstructor;
import org.apache.catalina.manager.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.myboot02.service.UserService;
import com.myboot02.domain.User;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/*
컨트롤러 : 클라이언트에서 요청이 들어올 때, 해당 요청을 수행할 비즈니스 로직을 제어하는 객체.
스프링에서는 컨트롤러에서 세부적으로 서비스 레이어를 만들어 해당 요청사항을 객체 지향적인 방식으로 좀 더 세분화하여 관리한다.
 */

@Controller
//@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자를 만들어 줌
public class UserController {
	
	@Autowired
	//@RequiredArgsConstructor 비슷하지만 static final 사용한 service만 사용가능
	private UserService userService;

	@GetMapping("/test")//회원가입 화면으로 단순 navigation
	public String addUser(User user) throws Exception{

		return "adduser";
	}

	@PostMapping("/test")//회원가입 정보 입력 후 이동
	public String addUser01(UserDto.signUpDto user) throws Exception{
		System.out.println(user);
		userService.addUser(user);
		return "adduser";
	}

//	@GetMapping("/login")
//	public String login(User user) throws Exception{
//		return "login";
//	}
//
//	@PostMapping("/login")
//	public String login(UserDto.loginDto user) throws Exception{
//		System.out.println(user);
//		userService.login(user);
//		return "login";
//	}
//	@GetMapping
//	public String login(HttpSession session){
//		if (!SessionUtils.login(session).ispresent()){
//			return "login";
//		}
//		return "index";
//	}

	//Todo login, id찾기 구현




//		@RequestMapping("test02")
//		public String addUser02(@ModelAttribute User user)throws Exception{
//		System.out.println(user);
//		userService.addUser(user);
//
//		return "addUser";
//	}
	
	
}
