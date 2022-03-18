package chap12.EX07;

interface A {											// 부모 인터페이스
	default void abc() {								// default 인터페이스에서 구현부가 있는 메소드를 정의, public 이 생략되어 있다.
		System.out.println("A 인터페이스의 abc() 메소드");
	}
}

class B extends Object implements A {					// 일반적으로 extends Object 가 생략되어 있다.
	@Override
	public void abc () {
		// super.abc();									// super.abc() 는 Object 클래스의 abc() 메소드를 호출하라는 뜻, 오류가난다.
		A.super.abc();									// A interface의 abc() 메소드 호출
		System.out.println("B 클래스의 abc() 메소드");
	}
}


public class DefaultMethod_02 {

	public static void main(String[] args) {
		// 1. 객체 생성
		A a = new B();
		B b = new B();
		
		// 2. 메소드 호출
		a.abc();										// A 인터페이스의 abc() 메소드 호출
		
		System.out.println();
		
		b.abc();										// B 클래스의 abc() 메소드 호출
		
	}

}
