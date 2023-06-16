package com.mall.service;

import org.apache.ibatis.annotations.Param;

import com.mall.domain.MemberVO;

public interface MemberService {

	void join(MemberVO vo);
	
	String idCheck(String mbsp_id);
	
	MemberVO login(String mbsp_id);
	
	void now_visit(String mbsp_id);
	
	void modify(MemberVO vo);

	void delete(String mbsp_id);

	void pwchange(@Param("mbsp_id") String mbsp_id, @Param("new_mbsp_password") String new_mbsp_password);
}
