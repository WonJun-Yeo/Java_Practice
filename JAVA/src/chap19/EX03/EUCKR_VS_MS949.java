package chap19.EX03;

import java.io.UnsupportedEncodingException;

/* EUCKR
 * 한국 표준, 한글 표현 가능
 * 전체 중 표기 가능한 것만 구성되어 있음
 * 약 11,000 자 중 2,200자 정도만 표기 가능
 * 8,000자는 표시 안됨
 * 영문 : 1byte, 한글 2byte
 * 웹페이지로 출력할 때 
 */

/* MS-949
 * Microsoft 사에서 개발한 한글 표기 방식
 * windows의 기본 타입
 * 11,000 모두를 표기할 수 있다.
 * 영문 : 1byte, 한글 2byte
 */

/* UTF-8
 * windows 를 제외한 모든 서버의 기본 타입
 * 영문 : 1byte, 한글 3byte <가변길이>
 */

/* UTF-16
 * 영문 : 2byte, 한글 2byte <고정길이>
 */

// 문자를 해당 인코딩 타입으로 바이트 스트림으로 생성한 경우, 해당 인코딩 타입으로 조합을 해야 깨어지지 않는다.

/* 이클립스에서 인코딩 타입 설정 3가지
 * 1. 전역 설정
 * 2. 프로젝트 설정
 * 3. 파일 설정
 * 
 * 우선순위 : 파일 > 프로젝트 > 전역
 * 
 */

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// EUCKR vs MS949
		
		// 1. 영문자를 byte로 내보내고 다시 String으로 변환
		
		byte[] b1 = "a".getBytes("EUC-KR");					// 문자를 byte 배열로 변환, 네트워크로 문자를 byte 스트림으로 변환해서 전송				
		// 예외 발생 UnsupportedEncodingException : 오타가 발생한 경우, 인코딩 할 수 없는 예외가 발생이된다.
		
		byte[] b2 = "a".getBytes("MS949");					// 문자를 byte 배열로 변환
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1, "EUC-KR"));		// byte[] 를 문자열로 변환
		System.out.println(new String(b2, "MS949"));
		
		System.out.println();
		
		// 2. 한글을 byte로 내보래고 String으로 가져오기 
		byte[] b3 = "가".getBytes("EUC-KR");	
		byte[] b4 = "가".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3, "EUC-KR"));		// byte[] 를 문자열로 변환
		System.out.println(new String(b4, "MS949"));
		
		System.out.println();
		
		// 3. 한글을 byte로 내보래고 String으로 가져오기 
		byte[] b5 = "뷁".getBytes("EUC-KR");					// EUC-KR는 11,000자 중 2,000 자만 표기되어있다.
		byte[] b6 = "뷁".getBytes("MS949");					// MS949는 11,000 자 모두 표기가 되어있다.
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC-KR"));		// byte[] 를 문자열로 변환
		System.out.println(new String(b6, "MS949"));
		
		System.out.println();

	}

}
