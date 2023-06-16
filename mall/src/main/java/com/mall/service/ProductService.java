package com.mall.service;

import java.util.List;

import com.mall.domain.CategoryVO;
import com.mall.domain.ProductVO;
import com.mall.dto.Criteria;

public interface ProductService {

	// 1차카테고리.
	List<CategoryVO> getCategoryList();
	// 2차카테고리
	List<CategoryVO> subCategoryList(Integer cat_code);
	
	// 상품목록
	List<ProductVO> pro_list(Integer cat_code, Criteria cri);
	// 상품개수
	int pro_count(Integer cat_code, Criteria cri);
	// 상품상세
	ProductVO pro_detail(Integer pro_num);
}
