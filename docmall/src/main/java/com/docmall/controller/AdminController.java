package com.docmall.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.docmall.domain.AdminVO;
import com.docmall.service.AdminService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/admin/*")
@Controller
public class AdminController {

	@Setter(onMethod_ = {@Autowired})
	private AdminService adminService;
	
	@Setter(onMethod_ = {@Autowired})
	private PasswordEncoder passwordEncoder;
	
	//관리자 로그인페이지
	@GetMapping("")
	public String adLogin() {
		
		return "/admin/adLogin";
	}
	
	//로그인.  매핑주소 : admin_ok
	@PostMapping("/admin_ok")
	public String admin_ok(AdminVO vo, HttpSession session, RedirectAttributes rttr) {
		
		AdminVO db_vo = adminService.admin_ok(vo.getAdmin_id());
		
		String url = "";
		String msg = "";
		
		if(db_vo != null) {
			if(passwordEncoder.matches(vo.getAdmin_pw(), db_vo.getAdmin_pw())) {
				session.setAttribute("adminStatus", db_vo);
				url = "admin/admin_menu";
				
				//로그인 시간 업데이트작업.
				adminService.now_visit(vo.getAdmin_id());
			}else {
				msg = "failPW";
				url = "admin/";
			}
			
		}else {
			msg = "failID";
			url = "admin/";
		}
		
		rttr.addFlashAttribute("msg", msg);
		
		return "redirect:/" + url;
	}
	
	//관리자기능 메뉴
	@GetMapping("/admin_menu")
	public void admin_menu() {
		
	}
	
	//로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/admin/";
	}
}
