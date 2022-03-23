package chap13.EX09.EX2;

interface A {
	void cry();
	void fly();
}

class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_04_2 {

	public static void main(String[] args) {
		
		C c = new C();
		
		// 1. 클래스X, 매개변수 O
		
		A a = new A() {
			public void cry() {
				System.out.println("cry()메소드 : 클래스 X, 매개변수 O");
			};
			public void fly() {
				System.out.println("fly()메소드 : 클래스 X, 매겨변수 O");
			};
		};
		
		c.abc(a);
		
		System.out.println("==============================");
		
		// 2. 클래스 X, 매개변수 X
		
		c.abc(new A() {
			public void cry() {
				System.out.println("cry()메소드 : 클래스 X, 매개변수 X");
			};
			public void fly() {
				System.out.println("fly()메소드 : 클래스 X, 매겨변수 X");
			};
		});
		
	}

}
