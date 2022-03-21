package chap13.EX01;

/*	이너클래스(inner Class) : 클래스 내부의 클래스
 * 인스턴스 이너클래스 : static이 붙지 않은 이너클래스, 아우터클래스를 개체화한 후에 본인을 객체화 후 사용사능
 * 스태틱 이너클래스 : static이 붙은 이너클래스, 객체 생성없이 클래스명으로 호출하여 사용가능
 * 지역 이너클래스 : 클래스의 인스턴스 메소드 내부에서 선언된 이너클래스
 * 
 * Outer Class의 접근제어자 제한 없이 접근
 * 다른 객체 생성 없이 Outer Class의 필드나 메소드에 접근을 할 수 있게 하기위해 이너클래스를 사용
 */

// 클래스 파일 : A.class, A$B.class


class A {											// Outer Class : 모든 접근제어자를 Inner Class에서 접근할 수 있다.
	public int a = 3;								// 다른패키지, 같은 패키지에서 접근 가능
	protected int b = 4;							// 상속관계일 경우 다른패기지에서 접근가능, 같은 패기지에서 접근가능
	int c = 5;										// 다른 패키지에서 접근 불가능, 같은 패키지에서 접근가능
	private int d = 6;								// class 내부에서만 접근가능
	
	void abc() {
		System.out.println("A클래스의 abc() 메소드");
	}
	
	class B {										// 인스턴스 내부클래스 : 외부클래스가 객체화된 후, 객체화하여 사용가능
		void bcd() {
			// outer class 필드 접근
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			// outer class 메소드 접근
			abc();
		}
	}
}






public class InnerClass_01 {

	public static void main(String[] args) {
		// 1. outer class 객체 생성 (이너클래스를 사용하기 위한 1단계)
		A a = new A();
		
		
		// 2. inner class 객체 생성 (이너클래스를 사용하기 위한 2단계)
		A.B b = a.new B();								// A.B : 외부클래스.내부클래스,	b : 내부클래스 인스턴스 변수,	a.new B(); : 외부인스턴스명.new 내부클래스생성자호출
		
		b.bcd();
	}

}
