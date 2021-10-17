package com.rest.myapp.service.impl;

import org.springframework.stereotype.Service;

import com.rest.myapp.service.MemberService;
import com.rest.myapp.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Override
	public MemberVO testMember() {
		MemberVO member = new MemberVO();
		member.setId(1);
		member.setName("KIM");
		member.setAge(33);
		member.setDept("human resource");
		return member;
	}
	
}
