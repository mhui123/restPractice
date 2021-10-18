package com.rest.myapp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.myapp.vo.MemberVO;

@Repository
public class MemberDao {
	@Autowired private SqlSession sqlSession;
	
	public List<MemberVO> selectMemberList(){
		return sqlSession.selectList("test.selectMemberList");
	}
}
