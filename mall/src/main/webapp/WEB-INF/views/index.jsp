<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.101.0">
    <title>Pricing example · Bootstrap v4.6</title>
	 <!-- slick 스와이퍼  -->
	<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
    <link rel="canonical" href="https://getbootstrap.com/docs/4.6/examples/pricing/">
	
    <%@ include file="/WEB-INF/views/include/config.jsp" %>

    


    <!-- Favicons 
<link rel="apple-touch-icon" href="/docs/4.6/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/4.6/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/4.6/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/4.6/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/4.6/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
<link rel="icon" href="/docs/4.6/assets/img/favicons/favicon.ico">
<meta name="msapplication-config" content="/docs/4.6/assets/img/favicons/browserconfig.xml">
-->
<meta name="theme-color" content="#563d7c">


	<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
	<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!--	<link href="/docs/4.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    
    <style>
    	@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo&display=swap');}
    	<!--Noto Serif Korean -->
    	@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo&family=Noto+Serif+KR:wght@300;400;500&display=swap');
    	@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo&family=Noto+Serif+KR:wght@500&display=swap');
    			
		.bd-placeholder-img {
		  font-size: 1.125rem;
		  text-anchor: middle;
		  -webkit-user-select: none;
		  -moz-user-select: none;
		  -ms-user-select: none;
		  user-select: none;
		}
		
		@media (min-width: 768px) {
		  .bd-placeholder-img-lg {
		    font-size: 3.5rem;
		  }
		}
		
		
		.swiper-container {
			margin-left: 5%;
			margin-right: 5%;
		}
      
      	body {
      		font-family: 'Nanum Myeongjo', serif;
      
        }
    </style>
		    
  </head>
  
  
	<script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
	<script>
	
	   $(document).ready(function() {
		   
		   $('.swiper-container').slick({
		   	  	prevArrow: $('.prev'),
		      	nextArrow: $('.next'),
		   		slidesToShow: 1,
		   	  	slidesToScroll: 3,
		   	    autoplay: true,
		   	    autoplaySpeed: 3000,
		   	 	fade: true,
		   	    responsive: [
		   	    {
		   	      breakpoint: 4000,
		   	      settings: {
		   	        slidesToShow: 2,
		   	        slidesToScroll: 2,
		   	     	infinite: true,
		         	dots: true
		   	      }
		   	    },
		   	    {
		   	      breakpoint: 2000,
		   	      settings: {
		   	        slidesToShow: 1,
		   	        slidesToScroll: 1,
		   	      }
		   	    }
		   	    // You can unslick at a given breakpoint now by adding:
		   	    // settings: "unslick"
		   	    // instead of a settings object
		   	  ]
		   	});   
	   });
   	
   	 
   </script>  
  
  <body>
    
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<%@ include file="/WEB-INF/views/include/categoryMenu.jsp" %>


	<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
	  <h1 class="display-4">FROM HEARTS</h1>
	</div>

    <div class="swiper-container">
	    <div><img style="width: 100%; height: 600px" src="/resources/img/forment.jpg"></div>
	    <div><img style="width: 100%; height: 600px" src="/resources/img/nature1.jpg"></div>
	    <div><img style="width: 100%; height: 600px" src="/resources/img/nature2.jpg"></div>
	</div>
	
	

<%@include file="/WEB-INF/views/include/footer.jsp" %>  
  </body>
</html>