package chap18.EX06;

interface A {
	void abc(B b, int k);
}

class B {
	void bcd(int k) {										// 인스턴스메소드
		System.out.println(k);
	}
}



public class RefOfInstanceMethodType_02_1 {

	public static void main(String[] args) {
		// 인스턴스 메소드 참조
		
		
		// 익명이너클래스 활용
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			};
		};
		
		// 람다식 활용

		A a2 = (b, k) -> b.bcd(k);
		
		
		// 인스턴스 메소드 참조
		
		/* 메소드명이 대문자로 들어가는 경우
		 * 1. 정적메소드라서 객체생성이 필요없는 경우
		 * 2. 인스턴스메소드 이지만, 객체가 매개변수로 들어가는 경우
		 */
		
		A a3 = B::bcd;
		
		B b = new B();
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
	}

}
