package com.young.web.member.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.young.web.member.model.MemberVO;
import com.young.web.member.service.MemberService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	MemberService memberService;
	
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public String login(MemberVO memberVO, HttpSession session,RedirectAttributes redirect) {
		if(session!=null) {
			session.removeAttribute("member");
		}
		
		MemberVO checkedMemberVO = memberService.loginCheck(memberVO);
		if(checkedMemberVO!=null) {
			session.setAttribute("member", checkedMemberVO);
			return "redirect:/board/list";
		}else {
			redirect.addFlashAttribute("msgs", "로그인에 실패하였습니다.");
			return "redirect:/";
		}
	
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // 세션 초기화
		return "redirect:/";
	}
}
