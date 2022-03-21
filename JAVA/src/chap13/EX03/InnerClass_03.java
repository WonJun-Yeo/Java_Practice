package chap13.EX03;

/* 스태틱 이너클래스
 * 외부클래스의 객체 생성없이 이너클래스의 객체 생성이 가능
 * 외부클래스의 인스턴스필드, 인스턴스 메소드는 접근이 불가능
 * 외부클래스의 스태틱필드, 스태틱 메소드는 접근이 가능
 */


class A {
	int a = 3;													// 인스턴스 필드 : 객체 생성해야 접근가능
	static int b = 4;											// 스태틱 필드 : 객체 생성없이 class명으로 접근가능, 객체 생성 후에도 접근가능
	
	void method1 () {											// 인스턴스 메소드 : 객체 생성해야 접근가능
		System.out.println("Instance method");
	}
	
	static void method2 () {									// 스태틱 메소드 : 객체 생성없이 class명으로 접근가능, 객체 생성 후에도 접근가능
		System.out.println("Static method");
	}
	
	
	static class B {											// 스태틱 이너클래스 : 외부 객체를 생성하지않고 객체 생성이 가능 (1단계 생략가능)
		void bcd() {
			// 1. 스태틱 이너클래스에서 외부클래스의 인스턴스 필드, 메소드 접근 (접근불가)
			// System.out.println(a);							// 외부클래스의 인스턴스 필드
			// method1();										// 외부클래스의 인스턴스 메소드
			
			// 2. 스태틱 이너클래스에서 외부클래스의 스태틱 필드, 메소드 접근 (접근가능)
			System.out.println(b);								// 외부클래스의 스태틱 필드
			method2();											// 외부클래스의 스태틱 메소드
		}
	}
}


public class InnerClass_03 {

	public static void main(String[] args) {
		// 1. static 이너클래스 객체 생성
		A.B b = new A.B();									// static 이너클래스는 외부 객체 생성없이 객체 생성이 가능하다.

	}

}
