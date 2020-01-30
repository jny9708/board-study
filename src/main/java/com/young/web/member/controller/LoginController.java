package com.young.web.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public String login(@RequestParam("id") String id,@RequestParam("password") String password) {
		
		logger.info("id "+id+" pss "+password);
		
		return "/board/boardList";
	}
}
