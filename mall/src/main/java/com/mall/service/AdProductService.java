package com.mall.service;

import java.util.List;

import com.mall.dto.Criteria;
import com.mall.domain.CategoryVO;
import com.mall.domain.ProductVO;

public interface AdProductService {

	List<CategoryVO> getCategoryList();
	
	List<CategoryVO> subCategoryList(Integer cat_code);
	
	void pro_insert(ProductVO vo);

	public List<ProductVO> getListWithPaging(Criteria cri, Integer cat_code);  

	public int getTotalCount(Criteria cri, Integer cat_code);
	
	ProductVO modify(Integer pro_num);
	
	CategoryVO get(int cat_code);
	
	void update(ProductVO vo);
	
	void delete(Integer pro_num);
	
	void pro_checked_modify2(Integer pro_num, int pro_price, String pro_buy);
	
	void pro_checked_modify1(List<ProductVO> pro_list);
	
	void pro_checked_delete(List<Integer> pro_num_arr);
}
