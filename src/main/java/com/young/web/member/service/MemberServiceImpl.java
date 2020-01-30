package com.young.web.member.service;

import javax.inject.Inject;

import com.young.web.member.dao.MemberDao;
import com.young.web.member.model.MemberVO;

public class MemberServiceImpl implements MemberService{

	@Inject
	MemberDao memberDao;
	
	@Override
	public int insertMember(MemberVO memberVO) {
		return memberDao.insertMember(memberVO);
	}

}
