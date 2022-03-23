package chap13.EX09.EX1;

/* 매개변수로 받아서 처리
 * 인터페이스를 구현한 클래스가 없다.
 */



interface A {
	void abc();							// public abstract
}

class C {
	void cde(A a) {
		a.abc();
	}
}


public class AnonymousClass_04_1 {

	public static void main(String[] args) {
		
		C c = new C();
		
		// 3. 인터페이스를 구현한 클래스X, 참조변수를 생성 O
		A a = new A() {									// 인터페이스를 구현한 자식 익명 객체를 A타입으로 생성 후, 참조변수로 할당
			@Override
			public void abc() {
				System.out.println("class X, parameter O");
			}
		};
		
		c.cde(a);
		
		System.out.println("===================================");
		
		// 4. 인터페이스를 구현한 클래스X, 참조변수를 생성 X **가장 많이 사용 (임시로 한 번만 사용하는 경우)
		
		c.cde(new A() {									// 익명클래스로 처리할 때, 오버라이딩까지 한 번에 처리
			public void abc() {
				System.out.println("class X, parameter X");
			}
		});
		
		

	}

}
