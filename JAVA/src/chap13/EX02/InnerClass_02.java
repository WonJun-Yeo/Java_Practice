package chap13.EX02;

// 이너클래스에서 외부클래스의 필드와 메소드 접근 방법

class A {
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	void abc( ) {
		System.out.println("A클래스의 abc() 메소드");
	}
	
	class B {
		int a = 5;
		int b = 6;
		
		void abc() {											// ** 오버라이딩이 아니라 별개의 메소드, 오버라이딩은 상속관계에서 인스턴스 메소드를 재정의하는 것. 이너클래스는 상속관계가 아니다.
			System.out.println("B클래스의 abc() 메소드");
		}
		
		void bcd() {
			// 이너클래스(자기자신) 멤버 호출
			System.out.println(a);								// this.a
			System.out.println(b);								// this.b
			abc();
			
			System.out.println();
			
			//아우터클래스 멤버 호출
			System.out.println(A.this.a);						// 필드와 메소드의 이름이 같을 경우에만 A.this 키워드를 넣어 구분해주어야 한다.
			System.out.println(A.this.b);						// ** super 키워드는 상속관계에서 부모클래스를 나타내는 것
			System.out.println(c);								// A.this.c
			System.out.println(d);								// A.this.d
			A.this.abc();
		}
	}
}


public class InnerClass_02 {

	public static void main(String[] args) {
		// 1. 외부클래스 객체 생성
		A a = new A();
		
		// 2. 이너클래스 객체 생성
		A.B b = a.new B();
		
		// 3. 내부클래스의 필드와 메소드 호출
		b.bcd();
		
		System.out.println();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
	}

}
