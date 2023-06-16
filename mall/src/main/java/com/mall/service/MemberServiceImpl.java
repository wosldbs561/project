package com.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.domain.MemberVO;
import com.mall.mapper.MemberMapper;

import lombok.Setter;

@Service
public class MemberServiceImpl implements MemberService{

	@Setter(onMethod_ = {@Autowired})
	private MemberMapper memberMapper;
	
	@Override
	public void join(MemberVO vo) {
		// TODO Auto-generated method stub
		memberMapper.join(vo);
		
	}

	@Override
	public String idCheck(String mbsp_id) {
		// TODO Auto-generated method stub
		return memberMapper.idCheck(mbsp_id);
	}

	@Override
	public MemberVO login(String mbsp_id) {
		// TODO Auto-generated method stub
		return memberMapper.login(mbsp_id);
	}

	@Override
	public void now_visit(String mbsp_id) {
		// TODO Auto-generated method stub
		memberMapper.now_visit(mbsp_id);
		
	}

	@Override
	public void modify(MemberVO vo) {
		// TODO Auto-generated method stub
		memberMapper.modify(vo);
		
	}

	@Override
	public void delete(String mbsp_id) {
		// TODO Auto-generated method stub
		memberMapper.delete(mbsp_id);
	}

	@Override
	public void pwchange(String mbsp_id, String new_mbsp_password) {
		// TODO Auto-generated method stub
		memberMapper.pwchange(mbsp_id, new_mbsp_password);
	}

}
