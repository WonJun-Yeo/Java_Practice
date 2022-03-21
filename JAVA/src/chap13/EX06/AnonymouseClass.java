package chap13.EX06;

//인터페이스를 상속한 클래스를 생성해서 객체 출력

class A {
	C c = new B();										// C타입의 인스턴스 변수 c
	
	void abc() {
		c.bcd();
	}
	
	class B implements C {								// 이너클래스
		@Override
		public void bcd() {								// 인터페이스 C의 추상메소드를 구현
			System.out.println("인스턴스 이너클래스");
		}
	}
}


interface C {											// 인터페이스, 추상메소드 정의
	public abstract void bcd();
}


public class AnonymouseClass {

	public static void main(String[] args) {
		// 1. 객체 생성 및 메소드 호출
		 A a = new A();
		 a.abc();										// 인스턴스 이너클래스
		 
	}

}
