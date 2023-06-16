package com.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.domain.AdOrderDetailVO;
import com.mall.domain.OrderVO;
import com.mall.dto.Criteria;
import com.mall.mapper.AdOrderMapper;

import lombok.Setter;

@Service
public class AdOrderServiceImpl implements AdOrderService {

	@Setter(onMethod_ = {@Autowired})
	private AdOrderMapper adOrderMapper;

	

	@Override
	public List<AdOrderDetailVO> orderDetail(Long ord_code) {
		// TODO Auto-generated method stub
		return adOrderMapper.orderDetail(ord_code);
	}

	@Override
	public void orderDetailProductDelete(Long ord_code, Integer pro_num) {
		// TODO Auto-generated method stub
		adOrderMapper.orderDetailProductDelete(ord_code, pro_num);
	}

	@Override
	public List<OrderVO> orderList(Criteria cri, String sDate, String eDate) {
		// TODO Auto-generated method stub
		return adOrderMapper.orderList(cri, sDate, eDate);
	}

	@Override
	public int getTotalCount(Criteria cri, String sDate, String eDate) {
		// TODO Auto-generated method stub
		return adOrderMapper.getTotalCount(cri, sDate, eDate);
	}
}
