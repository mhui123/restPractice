package com.rest.myapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.myapp.service.MemberService;
import com.rest.myapp.vo.MemberVO;

@RestController
public class MemberController {
	@Autowired private MemberService memberService;
	
	@GetMapping(path="/test")
	public MemberVO test() {
		return memberService.testMember();
	}
	
	@PostMapping("/getMemberList.do")
	public List<MemberVO> getMemberList(){
		return memberService.selectMembers();
	}
}
