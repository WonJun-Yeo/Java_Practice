package chap19.EX04;

public class Character_EX1 {

	public static void main(String[] args) {
		// 1. char로 저장 후, int로 캐스팅 (영문)
		
		char ch1 = 'A';										// char : 2byte
		System.out.println(ch1);
		System.out.println((int)ch1);						// 아스키코드
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		
		// 1-2. char에 정수(아스키코드)로 저장할 수 있다.
		
		char ch3 = 66;										// 문자에 해당하는 아스키코드를 직접 입력
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println((int)ch3);
		
		
		// 2. int로 저장 후 char로 캐스팅
		int ch4 = 65;
		System.out.println(ch4);
		System.out.println((char)ch4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
