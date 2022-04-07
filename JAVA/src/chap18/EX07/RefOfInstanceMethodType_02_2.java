package chap18.EX07;

interface A {
	int abc (String str);
}


public class RefOfInstanceMethodType_02_2 {

	public static void main(String[] args) {
		// 인스턴스 메소드 참조 : 정적메소드 참조
		
		// 1. 익명이너클래스 활용
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		
		// 2. 람다식 활용
		A a2 = (String str) -> {return str.length();};
		
		// 3. 인스턴스 메소드 참조
		
		A a3 = String::length;							// String: 객체명, length : 메소드명
		
		System.out.println(a1.abc("안녕."));
		System.out.println(a2.abc("안녕하세요."));
		System.out.println(a3.abc("안녕하세요 반갑습니다."));
		
		
		
		
		

	}

}
