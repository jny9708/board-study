package com.young.web.member.service;

import javax.inject.Inject;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.young.web.member.dao.MemberDao;
import com.young.web.member.model.MemberVO;

public class MemberServiceImpl implements MemberService{

	@Inject
	MemberDao memberDao;
	
	@Inject
	BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Override
	public int insertMember(MemberVO memberVO) {
		String encodedpassword = bcryptPasswordEncoder.encode(memberVO.getPassword());
		memberVO.setPassword(encodedpassword);
		return memberDao.insertMember(memberVO);
	}

}
