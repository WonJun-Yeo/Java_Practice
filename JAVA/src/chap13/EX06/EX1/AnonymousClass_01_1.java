package chap13.EX06.EX1;

// 1. 인터페리승의 추상메소드를 구혀한 class 생성 후에 객체를 생성 후, 호출
// 빈법ㄴ하게 사용하는 경우

interface A {																// 인터페이스 : 추상메소드를 정의
	void cry();																// 추상메소드, public abstract 가 생략되어 있다
	public abstract void fly();
}

class B {
	
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	
	class C implements A {																// A interface의 메소드를 구현한 클래스
		@Override
		public void cry() {
			System.out.println("멍멍");
		}
		
		@Override
		public void fly() {
			System.out.println("날지못합니다.");
		}
	}
}

public class AnonymousClass_01_1 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}

}
