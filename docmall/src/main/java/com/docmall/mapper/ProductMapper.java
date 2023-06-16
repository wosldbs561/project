package com.docmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.docmall.domain.CategoryVO;
import com.docmall.domain.ProductVO;
import com.docmall.dto.Criteria;

public interface ProductMapper {

	// 1차카테고리.
	List<CategoryVO> getCategoryList();
	// 2차카테고리
	List<CategoryVO> subCategoryList(Integer cat_code);
	// 상품목록
	List<ProductVO> pro_list(@Param("cat_code") Integer cat_code, @Param("cri") Criteria cri);
	// 상품개수
	int pro_count(@Param("cat_code") Integer cat_code, @Param("cri") Criteria cri);
	
	ProductVO pro_detail(Integer pro_num);
}
