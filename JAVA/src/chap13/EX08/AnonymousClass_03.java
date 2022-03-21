package chap13.EX08;

// 클래스 정의 및 참조변수를 사용, 미사용인 경우에는 매개변수로 객체를 전달

interface A {
	public abstract void abc();
}

// 1. 자식클래스를 직접 생성
class B implements A {
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}

class C {													// cde() 메소드에 인풋값으로 A 타입의 객체를 받는다.
	void cde (A a) {										// cde() 메소드 호출 시, 매개변수로 A타입의 객체를 할당
		a.abc();
	}
}


public class AnonymousClass_03 {

	public static void main(String[] args) {
		
		C c = new C();
		
		// 방법 1 : 클래스명 O + 참조변수명 O
		
		A a = new B();
		
		c.cde(a);
		
		System.out.println("================================");
		
		// 방법 2 : 클래스명 O + 참조변수명 X
		
		c.cde(new B());
		
		
		
		
	}

}
