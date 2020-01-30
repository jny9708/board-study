package com.young.web.member.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;

import com.young.web.member.model.MemberVO;

public class MemberDaoImpl implements MemberDao {

	@Inject 
	SqlSessionTemplate sqlSession;
	
	String namespace = "com.young.web.user";
	
	@Override
	public int insertMember(MemberVO memberVO) {
		return sqlSession.insert(namespace + ".insertMember",memberVO);
	}
	
}
