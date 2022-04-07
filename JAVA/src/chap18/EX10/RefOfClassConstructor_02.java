package chap18.EX10;

interface A {
	B abc(int k);							// 리턴타입이 B 객체
}

class B {
	B() {
		System.out.println("첫번째 생성자");
	}
	
	B(int k) {
		System.out.println("두번째 생성자");
	}
	
}

public class RefOfClassConstructor_02 {

	public static void main(String[] args) {
		// 익명이너클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(k);
			}
		};
		
		
		// 람다식
		
		A a2 = (int k) -> {return new B(k);};
		A a3 = k ->  new B(k);
		
		// 클래스 생성자 참조
		A a4 = B::new;
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
		
		
	}

}
