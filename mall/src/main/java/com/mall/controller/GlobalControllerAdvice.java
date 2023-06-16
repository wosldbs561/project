package com.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mall.domain.CategoryVO;
import com.mall.service.ProductService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@ControllerAdvice(basePackages = {"com.mall.controller"})
public class GlobalControllerAdvice {

	@Setter(onMethod_ = {@Autowired})
	private ProductService productService;
	
	@ModelAttribute
	public void categoryList(Model model) {
		log.info("1차 카테고리 목록");
		
		List<CategoryVO> cateList = productService.getCategoryList();
		model.addAttribute("cateList", cateList);
	}
}
