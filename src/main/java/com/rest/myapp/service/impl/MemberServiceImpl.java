package com.rest.myapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.myapp.dao.MemberDao;
import com.rest.myapp.service.MemberService;
import com.rest.myapp.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired private MemberDao memberDao;
	@Override
	public MemberVO testMember() {
		MemberVO member = new MemberVO();
		member.setId(1);
		member.setName("KIM");
		member.setAge(33);
		member.setDept("human resource");
		return member;
	}

	@Override
	public List<MemberVO> selectMembers() {
		return memberDao.selectMemberList();
	}
	
	
}
