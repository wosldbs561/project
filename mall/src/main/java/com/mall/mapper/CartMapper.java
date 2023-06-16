package com.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mall.domain.CartVO;
import com.mall.dto.CartListDTO;

public interface CartMapper {

	int cart_add(CartVO vo);
	
	List<CartListDTO> cart_list(String mbsp_id);
	
	int cart_amount_change(@Param("cart_code") Long cart_code, @Param("cart_amount") int cart_amount);
	
	int cart_delete(Long cart_code);
	
	int cart_tot_price(String mbsp_id);
	
	void cart_empty(String mbsp_id);
}
