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
		
		// 1. Ŭ����X, �Ű����� O
		
		A a = new A() {
			public void cry() {
				System.out.println("cry()�޼ҵ� : Ŭ���� X, �Ű����� O");
			};
			public void fly() {
				System.out.println("fly()�޼ҵ� : Ŭ���� X, �Űܺ��� O");
			};
		};
		
		c.abc(a);
		
		System.out.println("==============================");
		
		// 2. Ŭ���� X, �Ű����� X
		
		c.abc(new A() {
			public void cry() {
				System.out.println("cry()�޼ҵ� : Ŭ���� X, �Ű����� X");
			};
			public void fly() {
				System.out.println("fly()�޼ҵ� : Ŭ���� X, �Űܺ��� X");
			};
		});
		
	}

}
