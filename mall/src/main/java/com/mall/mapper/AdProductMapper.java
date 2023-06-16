package com.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mall.dto.Criteria;
import com.mall.domain.CategoryVO;
import com.mall.domain.ProductVO;

public interface AdProductMapper {

	// 1차카테고리.
	List<CategoryVO> getCategoryList();
	// 2차카테고리
	List<CategoryVO> subCategoryList(Integer cat_code);
	// 상품등록
	void pro_insert(ProductVO vo);
	// 1)페이징기능
	List<ProductVO> getListWithPaging(@Param("cri") Criteria cri, @Param("cat_code") Integer cat_code);   //  처음 pageNum = 1, amount = 10, type=null, keyword=null
	// 2)페이징기능
	int getTotalCount(@Param("cri") Criteria cri, @Param("cat_code") Integer cat_code);
	
	ProductVO modify(Integer pro_num);
	// 카테고리	
	CategoryVO get(int cat_code);
		
	// 상품수정
	void update(ProductVO vo);
	
	// 상품삭제
	void delete(Integer pro_num);
	
	// 선택상품수정2
	void pro_checked_modify2(@Param("pro_num") Integer pro_num, @Param("pro_price") int pro_price, @Param("pro_buy") String pro_buy);
	
	//선택상품수정1
	void pro_checked_modify1(List<ProductVO> pro_list);
	
	// 선택상품삭제. 
	void pro_checked_delete(List<Integer> pro_num_arr);
}
