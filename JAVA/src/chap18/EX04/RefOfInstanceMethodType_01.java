package chap18.EX04;

/* 람다식의 활용
 * 1. 익명이너클래스를 활용하는 방법
 * 2. 메서드 참조 : 메소드를 구현하지않고, 구현되어있는 메소드를 참조해서 사용 **메소드를 참조하기 위해서는 return 타입과 매개변수가 동일해야한다.
 * 		1. 인스턴스 메소드 참조
 * 		2. 정적메소드 참조
 */

interface A {
	void abc();
}

class B {
	void bcd() {								// 인스턴스 메소드 : 객체 생성 후, 호출 가능
		System.out.println("메서드");
	}
}



public class RefOfInstanceMethodType_01 {

	public static void main(String[] args) {
		// 1. 인스턴스 메서드 참조 : 익명이너클래스
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};

		
		// 2. 람다식 활용
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		// 3. 인스턴스 메소드 참조 표현식
		// 인스턴스 참조 표현( 객체명::메소드명 )
		B b = new B();
		A a3 = b::bcd;							// b 객체의 bcd() 메소드를 호출, 리턴타입이 같아야하고 매개변수가 동일해야한다.
		
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
	}

}
