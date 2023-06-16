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
    <title>Mall</title>

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


    <style>
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
      
body {
  background: #CBC0D3;
}
    .input-form {
      max-width: 680px;

      margin-top: 80px;
      padding: 32px;

      background: #EAC7CC;
      -webkit-border-radius: 10px;
      -moz-border-radius: 10px;
      border-radius: 10px;
      -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)
    }
    </style>

    
    
  </head>
  <body>
    
<%@ include file="/WEB-INF/views/include/header.jsp" %>


<div class="container">
   <div class="input-form-backgroud row">
      <div class="input-form col-md-12 mx-auto">
        <h4 class="mb-3">회원가입</h4>
        <form class="validation-form" id="joinForm" method="post" action="/member/join">
          <div class="row">
            <div class="col-md-4 mb-3">
              <label for="mbsp_id">아이디</label>
              <input type="text" class="form-control" name="mbsp_id" id="mbsp_id" placeholder="아이디는 8~15자 이내 입력">
            </div>
            <div class="col-md-3 mb-3">
              <label for="mbsp_idcheck">아이디</label>
              <button type="button" id="btn_IdCheck" class="btn btn-primary">ID Check</button>              
            </div>
            <div class="col-md-5 mb-3">
              <label for="mbsp_name">이름</label>
              <input type="text" class="form-control" name="mbsp_name" id="mbsp_name" placeholder="이름을 입력">
            </div>
          </div>
          <div class="row">
            <div class="col-md-6 mb-3">
              <label for="mbsp_password">비밀번호</label>
              <input type="text" class="form-control" name="mbsp_password" id="mbsp_password" placeholder="비밀번호 입력">
 			</div>
            <div class="col-md-6 mb-3">
              <label for="mbsp_repassword">비밀번호확인</label>
              <input type="text" class="form-control" id="mbsp_repassword" placeholder="비밀번호 확인">
            </div>
          </div>
		 <div class="row">
          <div class="col-md-4 mb-3">
            <label for="mbsp_email">이메일</label>
            <input type="email" class="form-control" name="mbsp_email" id="mbsp_email" placeholder="you@example.com">
          </div>
          <div class="col-md-3 mb-3">
            <label for="mbsp_email_authcode">메일인증코드</label>
            <button type="button" class="btn btn-primary" id="btn_authcode">인증코드요청</button>
          </div>
          <div class="col-md-2 mb-3">
            <label for="email">인증코드</label>
            <input type="text" class="form-control" id="email_auth_code" placeholder="">
          </div>
          <div class="col-md-3 mb-3">
            <label for="mbsp_mailconfirm">메일인증확인</label>
            <button type="button" class="btn btn-primary" id="btn_confirmAuthcode">인증확인</button>
          </div>
         </div> 
         <div class="row">
          <div class="col-md-2 mb-3">
            <label for="sample2_postcode">우편번호</label>
            <input type="text" class="form-control" name="mbsp_zipcode" id="sample2_postcode">
          </div>
          <div class="col-md-3 mb-3">
            <label for="email">우편버튼</label>
            <button type="button" onclick="sample2_execDaumPostcode()" class="btn btn-primary">우편번호 찾기</button>
          </div>
		 
          <div class="col-md-7 mb-3">
            <label for="sample2_address">주소</label>
            <input type="text" class="form-control" name="mbsp_addr" id="sample2_address" placeholder="서울특별시 강남구">
          </div>
		 </div>
         <div class="row">
          <div class="col-md-12 mb-3">
            <label for="sample2_detailAddress">상세주소<span class="text-muted">&nbsp;(필수 아님)</span></label>
            <input type="text" class="form-control" name="mbsp_deaddr" id="sample2_detailAddress" placeholder="상세주소를 입력해주세요.">
            <input type="hidden" id="sample2_extraAddress" placeholder="참고항목">
          </div>
         </div>

		  <div class="row">
		  	<div class="col-md-6 mb-3">
              <label for="mbsp_phone">연락처</label>
              <input type="text" class="form-control" name="mbsp_phone" id="mbsp_phone" placeholder="">
            </div>
            <div class="col-md-6 mb-3">
              <label for="mbsp_nick">닉네임</label>
              <input type="text" class="form-control" name="mbsp_nick" id="mbsp_nick" placeholder="">
            </div>
		  </div>
          
          <hr class="mb-4">
          <div class="custom-control custom-checkbox">
            <input type="checkbox" class="custom-control-input" name="mbsp_receive" id="mbsp_receive">
            <label class="custom-control-label" for="mbsp_receive">개인정보 수집 및 이용에 동의합니다.</label>
          </div>
          <div class="mb-4"></div>
          <button class="btn btn-primary btn-lg btn-block" id="btn_join" type="button">가입 완료</button>
        </form>
      </div>
    </div>
 
</div>

	<!-- iOS에서는 position:fixed 버그가 있음, 적용하는 사이트에 맞게 position:absolute 등을 이용하여 top,left값 조정 필요 -->
<div id="layer" style="display:none;position:fixed;overflow:hidden;z-index:1;-webkit-overflow-scrolling:touch;">
<img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnCloseLayer" style="cursor:pointer;position:absolute;right:-3px;top:-3px;z-index:1" onclick="closeDaumPostcode()" alt="닫기 버튼">
</div>

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    // 우편번호 찾기 화면을 넣을 element
    var element_layer = document.getElementById('layer');

    function closeDaumPostcode() {
        // iframe을 넣은 element를 안보이게 한다.
        element_layer.style.display = 'none';
    }

    function sample2_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample2_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample2_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample2_postcode').value = data.zonecode;
                document.getElementById("sample2_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample2_detailAddress").focus();

                // iframe을 넣은 element를 안보이게 한다.
                // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)
                element_layer.style.display = 'none';
            },
            width : '100%',
            height : '100%',
            maxSuggestItems : 5
        }).embed(element_layer);

        // iframe을 넣은 element를 보이게 한다.
        element_layer.style.display = 'block';

        // iframe을 넣은 element의 위치를 화면의 가운데로 이동시킨다.
        initLayerPosition();
    }

    // 브라우저의 크기 변경에 따라 레이어를 가운데로 이동시키고자 하실때에는
    // resize이벤트나, orientationchange이벤트를 이용하여 값이 변경될때마다 아래 함수를 실행 시켜 주시거나,
    // 직접 element_layer의 top,left값을 수정해 주시면 됩니다.
    function initLayerPosition(){
        var width = 300; //우편번호서비스가 들어갈 element의 width
        var height = 400; //우편번호서비스가 들어갈 element의 height
        var borderWidth = 5; //샘플에서 사용하는 border의 두께

        // 위에서 선언한 값들을 실제 element에 넣는다.
        element_layer.style.width = width + 'px';
        element_layer.style.height = height + 'px';
        element_layer.style.border = borderWidth + 'px solid';
        // 실행되는 순간의 화면 너비와 높이 값을 가져와서 중앙에 뜰 수 있도록 위치를 계산한다.
        element_layer.style.left = (((window.innerWidth || document.documentElement.clientWidth) - width)/2 - borderWidth) + 'px';
        element_layer.style.top = (((window.innerHeight || document.documentElement.clientHeight) - height)/2 - borderWidth) + 'px';
    }  
</script>

  <script>

    $(document).ready(function(){

      let idCheck = false;
      let isAuthcode = false;

      // ID중복체크
      $("#btn_IdCheck").click(function() {

        if($("#mbsp_id").val() == "") {
          alert("아이디를 입력하세요.");
          $("#mbsp_id").focus();
          return;
        }

        $.ajax({
          url: '/member/idCheck',
          type: 'get',
          dataType: 'text',
          data: {mbsp_id : $("#mbsp_id").val()},
          success: function(result) {

            if(result == "yes") {
              alert("아이디 사용가능");
              idCheck = true;
            }else {
              alert("아이디 사용불가능");
              $("#mbsp_id").val("");
              $("#mbsp_id").focus();
            }        
            
          }
        });
      });

      // 메일인증코드
      $("#btn_authcode").click(function(){
        if($("#mbsp_email").val() == "") {
          alert("메일주소를 입력하세요.");
          $("#mbsp_email").focus();
          return;
        }

        $.ajax({
          url: '/email/send',
          type: 'get',
          dataType: 'text',  
          data: {receiverMail : $("#mbsp_email").val() }, 
          success : function(result) {
            if(result == "success") {
              alert("인증메일이 발송되었습니다. 메일 확인해주세요.");
            }
          }
        });
      });

      //인증확인
      $("#btn_confirmAuthcode").click(function() {
        if($("#email_auth_code").val() == "") {
          alert("인증코드를 입력하세요.");
          $("#email_auth_code").focus();
          return;
        }

        $.ajax({
          url: '/email/confirmAuthcode',
          type: 'get',
          dataType: 'text',   
          data: {authCode : $("#email_auth_code").val() }, 
          success : function(result) {
            if(result == "success") {
              alert("인증코드가 확인 되었읍니다.");
              isAuthcode = true;
            }else if(result == "fail") {
              alert("인증코드가 다릅니다. 인증코드 요청을 다시 해주세요.");   
            }
          }
        });
      });

      // 회원가입 전송
      $("#btn_join").click(function() {
        let joinForm = $("#joinForm");

        // 자바스크립트 유효성검사 코드작업

        joinForm.submit();
      });

    }); // jQuery read event end

  </script>
    
  </body>
</html>