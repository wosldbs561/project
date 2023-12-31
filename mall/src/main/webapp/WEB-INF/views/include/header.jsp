<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div class="swiper-slide pop2 show" data-time-start="2023/02/27 00:00:00" data-time-end="2025/03/01 23:59:59" style="background: #000000; text-align: center; text-decoration: none;"><a href="/member/join"><span style="color: #ffffff;">신규회원 무료배송</span></a></div>

<style>
	@import url('https://fonts.googleapis.com/css2?family=Noto+Serif+KR:wght@200;500;600;700&display=swap');
	
	.d-flex {
		font-family: 'Noto Serif KR', serif;
		font-weight: 200;
	}	
	
	a.my-0 {
		font-weight: 700;
		font-size: 1.5em;
		text-decoration: none;
	}
	a {
		text-decoration: none;
	}
	
	span {
		margin: 10px;
	}
	
	nav {
		margin-left: 20px;
	}
</style>


<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
  <a class="my-0 mr-md-auto font-weight-normal text-dark" href="/">FromHearts</a>
  <c:if test="${sessionScope.loginStatus != null }">
  <span>${sessionScope.loginStatus.mbsp_name} 님</span> /
  <span>포인트 : ${sessionScope.loginStatus.mbsp_point} </span> /
  <span>최근접속 : 
  	<fmt:formatDate value="${sessionScope.loginStatus.mbsp_lastlogin}" pattern="yyyy-MM-dd HH:mm"/>
   </span>
  </c:if>
  <nav class="my-2 my-md-0 mr-md-3">
    <!-- 로그인 이전 표시 -->
    <c:if test="${sessionScope.loginStatus == null }">
    <a class="p-2 text-dark" href="/member/login">Login</a>
    <a class="p-2 text-dark" href="/member/join">Join</a>
    </c:if>
    <!--  로그인 이후 표시 -->
    <c:if test="${sessionScope.loginStatus != null }">
    <a class="p-2 text-dark" href="/member/logout">Logout</a>
    <a class="p-2 text-dark" href="/member/modify">Modify</a>
     </c:if>
    
    <a class="p-2 text-dark" href="/member/mypage">Mypage</a>
    <a class="p-2 text-dark" href="/order/order_info">Order</a>
    <a class="p-2 text-dark" href="/cart/cart_list">Cart</a>
  </nav>
</div>