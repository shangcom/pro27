package com.myspring.pro27.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro27.member.vo.MemberVO;

public interface MemberService {
	public List listMembers() throws DataAccessException;
	
	public void addMember(MemberVO memberVO) throws DataAccessException;

	public void removeMember(String id) throws DataAccessException;
	
	public void updateMember(MemberVO memberVO) throws DataAccessException;
}
