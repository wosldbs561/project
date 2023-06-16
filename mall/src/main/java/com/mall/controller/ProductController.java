package com.mall.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.domain.CategoryVO;
import com.mall.domain.ProductVO;
import com.mall.dto.Criteria;
import com.mall.dto.PageDTO;
import com.mall.service.ProductService;
import com.mall.util.FileUtils;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/product/*")
@Controller
public class ProductController {

	@Setter(onMethod_ = {@Autowired})
	private ProductService productService;
	
	//업로드폴더 주입
	@Resource(name = "uploadPath") // servlet-context.xml 참조.
	private String uploadPath;  // C:\\dev\\upload\\pds\\
	
	@ResponseBody // jackson-databind 라이브러리 필수
	@GetMapping("/subCategory/{cat_code}")  // product/subCategory/1     product/subCategory?cat_code=1
	public ResponseEntity<List<CategoryVO>> subCategory(@PathVariable("cat_code") Integer cat_code) {
		
		ResponseEntity<List<CategoryVO>> entity = null;
		
		entity = new ResponseEntity<List<CategoryVO>>(productService.subCategoryList(cat_code), HttpStatus.OK);
		
		return entity;
	}
	
	@GetMapping("/pro_list/{cat_code}/{cat_name}")
	public String pro_list(@ModelAttribute("cri") Criteria cri,@PathVariable("cat_code") Integer cat_code, @PathVariable("cat_name") String cat_name, Model model) {
		
		
		model.addAttribute("cat_code", cat_code);
		model.addAttribute("cat_name", cat_name);
		
		List<ProductVO> pro_list = productService.pro_list(cat_code, cri);
		
		pro_list.forEach(vo -> {
			vo.setPro_up_folder(vo.getPro_up_folder().replace("\\", "/"));
		});
		
		model.addAttribute("pro_list", pro_list);
		
		int count = productService.pro_count(cat_code, cri);
		PageDTO pageDTO = new PageDTO(count, cri);
		
		model.addAttribute("pageMaker", pageDTO);
		
		
			
		return "/product/pro_list";
	}
	
	@ResponseBody
	@GetMapping("/displayImage")
	public ResponseEntity<byte[]> displayFile(String folderName, String fileName) throws IOException {
		
		//                  C:\\dev\\upload\\pds\\
		return FileUtils.getFile(uploadPath + folderName, fileName);
	}
	
	// 상품상세
		@GetMapping("/pro_detail")
		public void pro_detail(Integer	pro_num, @ModelAttribute("cri") Criteria cri, Model model) {
			
			ProductVO vo = productService.pro_detail(pro_num);
			vo.setPro_up_folder(vo.getPro_up_folder().replace("\\", "/"));
			
			model.addAttribute("productVO", vo);
		}
		
}
