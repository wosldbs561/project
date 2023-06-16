<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!doctype html>
<html lang="en">
<head>
	<title>Login Page</title>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
	$('#signup').click(function() {
	  $('.pinkbox').css('transform', 'translateX(80%)');
	  $('.signin').addClass('nodisplay');
	  $('.signup').removeClass('nodisplay');
	});

	$('#signin').click(function() {
	  $('.pinkbox').css('transform', 'translateX(0%)');
	  $('.signup').addClass('nodisplay');
	  $('.signin').removeClass('nodisplay');
	});
});	
     
    $(document).ready(function() {
      let msg = '${msg}';
      if(msg == 'failID') {
        alert("아이디 확인바람");
        $("#mbsp_id").focus();
      }else if(msg == 'failPW') {
        alert("비밀번호 확인바람");
        $("#mbsp_password").focus();
      }
    });
    
</script>
<style>
@import url("https://fonts.googleapis.com/css?family=Open+Sans:300,400|Lora");
body {
  background: #CBC0D3;
}

/* div box styling */
.container {
  margin: auto;
  width: 650px;
  height: 550px;
  position: relative;
}

.welcome {
  background: #f6f6f6;
  width: 650px;
  height: 415px;
  position: absolute;
  top: 25%;
  border-radius: 5px;
  box-shadow: 5px 5px 5px rgba(0, 0, 0, 0.1);
}

.pinkbox {
  position: absolute;
  top: -10%;
  left: 5%;
  background: #EAC7CC;
  width: 320px;
  height: 500px;
  border-radius: 5px;
  box-shadow: 2px 0 10px rgba(0, 0, 0, 0.1);
  transition: all 0.5s ease-in-out;
  z-index: 2;
}

.nodisplay {
  display: none;
  transition: all 0.5s ease;
}

.leftbox, .rightbox {
  position: absolute;
  width: 50%;
  transition: 1s all ease;
}

.leftbox {
  left: -2%;
}

.rightbox {
  right: -2%;
}

/* font & button styling */
h1 {
  font-family: "Open Sans", sans-serif;
  text-align: center;
  margin-top: 95px;
  text-transform: uppercase;
  color: #f6f6f6;
  font-size: 2em;
  letter-spacing: 8px;
}

.title {
  font-family: "Lora", serif;
  color: #8E9AAF;
  font-size: 1.8em;
  line-height: 1.1em;
  letter-spacing: 3px;
  text-align: center;
  font-weight: 300;
  margin-top: 20%;
}

.desc {
  margin-top: -8px;
}

.account {
  margin-top: 45%;
  font-size: 10px;
}

p {
  font-family: "Open Sans", sans-serif;
  font-size: 0.7em;
  letter-spacing: 2px;
  color: #8E9AAF;
  text-align: center;
}

span {
  color: #EAC7CC;
}

.flower {
  position: absolute;
  width: 120px;
  height: 120px;
  top: 46%;
  left: 29%;
  opacity: 0.7;
}

.smaller {
  width: 90px;
  height: 100px;
  top: 48%;
  left: 38%;
  opacity: 0.9;
}

button {
  padding: 12px;
  font-family: "Open Sans", sans-serif;
  text-transform: uppercase;
  letter-spacing: 3px;
  font-size: 11px;
  border-radius: 10px;
  margin: auto;
  outline: none;
  display: block;
}
button:hover {
  background: #EAC7CC;
  color: #f6f6f6;
  transition: background-color 1s ease-out;
}

.button {
  margin-top: 3%;
  background: #f6f6f6;
  color: #ce7d88;
  border: solid 1px #EAC7CC;
}

/* form styling */
form {
  display: flex;
  align-items: center;
  flex-direction: column;
  padding-top: 7px;
}

.more-padding {
  padding-top: 35px;
}
.more-padding input {
  padding: 12px;
}
.more-padding .submit {
  margin-top: 45px;
}

.submit {
  margin-top: 25px;
  padding: 12px;
  border-color: #ce7d88;
}
.submit:hover {
  background: #CBC0D3;
  border-color: #bfb1c9;
}

input {
  background: #EAC7CC;
  width: 65%;
  color: #ce7d88;
  border: none;
  border-bottom: 1px solid rgba(246, 246, 246, 0.5);
  padding: 9px;
  margin: 7px;
}
input::placeholder {
  color: #f6f6f6;
  letter-spacing: 2px;
  font-size: 1.3em;
  font-weight: 100;
}
input:focus {
  color: #ce7d88;
  outline: none;
  border-bottom: 1.2px solid rgba(206, 125, 136, 0.7);
  font-size: 1em;
  transition: 0.8s all ease;
}
input:focus::placeholder {
  opacity: 0;
}

label {
  font-family: "Open Sans", sans-serif;
  color: #ce7d88;
  font-size: 0.8em;
  letter-spacing: 1px;
}

.checkbox {
  display: inline;
  white-space: nowrap;
  position: relative;
  left: -62px;
  top: 5px;
}

input[type=checkbox] {
  width: 7px;
  background: #ce7d88;
}

.checkbox input[type=checkbox]:checked + label {
  color: #ce7d88;
  transition: 0.5s all ease;
}
</style>
</head>
<body>
<div class="container">
  <div class="welcome">
    <div class="pinkbox">
      <div class="signup nodisplay">
        <h1>register</h1>
        <form autocomplete="off">
          <input type="text" placeholder="username">
          <input type="email" placeholder="email">
          <input type="password" placeholder="password">
          <input type="password" placeholder="confirm password">
          <a href="/member/join" class="button submit">ACCOUNT</a> 
        </form>
      </div>
      <div class="signin">
        <h1>sign in</h1>
        <!--  
        <form id="loginForm" class="more-padding" autocomplete="off" method="post" action="/member/login" >
          <input type="text" placeholder="username">
          <input type="password" placeholder="password">
          <div class="checkbox">
            <input type="checkbox" id="remember" /><label for="remember">remember me</label>
          </div>

          <button type="submit" id="login" class="button submit">login</button>
        </form>
        -->
        <form id="loginForm" method="post" action="/member/login">
		  <input type="text" name="mbsp_id" placeholder="아이디">
		  <input type="password" name="mbsp_password" placeholder="비밀번호">
		  <button type="submit">로그인</button>
		</form>
        
      </div>
    </div>
    <div class="leftbox">
      <h2 class="title"><span>BLOOM</span>&<br>BOUQUET</h2>
      <p class="desc">pick your perfect <span>bouquet</span></p>
      <img class="flower smaller" src="https://image.ibb.co/d5X6pn/1357d638624297b.jpg" alt="1357d638624297b" border="0">
      <p class="account">have an account?</p>
      <button class="button" id="signin">login</button>
    </div>
    <div class="rightbox">
      <h2 class="title"><span>BLOOM</span>&<br>BOUQUET</h2>
      <p class="desc"> pick your perfect <span>bouquet</span></p>
      <img class="flower" src="https://preview.ibb.co/jvu2Un/0057c1c1bab51a0.jpg"/>
      <p class="account">don't have an account?</p>
      <button class="button" id="signup">sign up</button>
    </div>
  </div>
 </div>
<script>
    

</script>
</body>
</html>
