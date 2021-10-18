package com.rest.myapp.service;

import java.util.List;

import com.rest.myapp.vo.MemberVO;

public interface MemberService {
	public MemberVO testMember();
	public List<MemberVO> selectMembers();
}
