package com.mall.service;

import java.util.List;

import com.mall.domain.AdOrderDetailVO;
import com.mall.domain.OrderVO;
import com.mall.dto.Criteria;

public interface AdOrderService {

	List<OrderVO> orderList(Criteria cri, String sDate, String eDate);
	
	int getTotalCount(Criteria cri, String sDate, String eDate);
	
	List<AdOrderDetailVO> orderDetail(Long ord_code);
	
	void orderDetailProductDelete(Long ord_code, Integer pro_num);
}
