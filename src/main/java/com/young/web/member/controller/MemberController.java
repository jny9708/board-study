package com.young.web.member.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.young.web.member.model.MemberVO;
import com.young.web.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Inject
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/signup")
	public String signUp() {

		return "member/signup";
	}
	
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	public String addMember(MemberVO memberVO) {
		
		logger.info(""+memberVO.getUserid());
		memberService.insertMember(memberVO);
		
		//logger.info(""+userid);
		return "login";
	}

}
