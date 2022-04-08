package chap19.EX03;

import java.nio.charset.Charset;								// Charset 클래스

public class CreateCharacterObject {

	public static void main(String[] args) {
		// 문자 인코딩 설정을 적용하는 방법1
		
		// 1. Charset.defaultCharset() : 시스템의 기본 설정된 charset을 로드
		Charset cs1 = Charset.defaultCharset();					// 정적메소드, 시스템의 기본 설정된 charset을 로드 (설정에 따라 다르게 출력된다)
		System.out.println(cs1);								// MS949의 확장버전이 x-windows-949
		
		// 2. Charset.forName("MS949") : charset을 직접할당해서 설정
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC-KR");				// 존재하지 않는 인코딩을 넣으면 UnsupportedCharsetException 예외 발생, 실행예외를 처리해주어야한다.
		System.out.println(cs4);
		
		System.out.println("================================================");
		
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("UTF-16"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("EUC-KRrr"));
		
		
		
		
		
		
		
		
	}

}
