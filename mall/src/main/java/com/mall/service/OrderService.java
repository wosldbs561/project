package com.mall.service;

import com.mall.domain.OrderVO;
import com.mall.domain.PaymentVO;

public interface OrderService {

	// 주문정보
	void order_save(OrderVO o_vo, PaymentVO p_vo);
}
