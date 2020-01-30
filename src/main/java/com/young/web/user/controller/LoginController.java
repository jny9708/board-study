package com.young.web.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {

	
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public String login(@RequestParam("id") String id,@RequestParam("password") String password) {
		
		
		return "board/boardList";
	}
}
