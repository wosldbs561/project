package com.docmall.kakaopay;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// 1)결제준비요청에의한 응답데이타. https://kapi.kakao.com/v1/payment/ready(첫번째 요청)
public class ReadyResponse {

	private String tid; // 결제 고유 번호, 20자
	// 요청한 클라이언트가 PC 웹일 경우. 	카카오톡으로 결제 요청 메시지(TMS)를 보내기 위한 사용자 정보 입력 화면 Redirect URL
	private String next_redirect_pc_url;

}
