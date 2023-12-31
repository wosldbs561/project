package com.mall.mapper;

import com.mall.domain.OrderVO;
import com.mall.domain.PaymentVO;

public interface OrderMapper {

	// 주문정보
	void order_save(OrderVO o_vo);
	// 주문상세: 장바구니테이블이용.
	void order_detail_save(Long ord_code);
	// 결제정보
	void payment_save(PaymentVO p_vo);

}
