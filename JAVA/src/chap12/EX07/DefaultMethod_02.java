package chap12.EX07;

interface A {											// �θ� �������̽�
	default void abc() {								// default �������̽����� �����ΰ� �ִ� �޼ҵ带 ����, public �� �����Ǿ� �ִ�.
		System.out.println("A �������̽��� abc() �޼ҵ�");
	}
}

class B extends Object implements A {					// �Ϲ������� extends Object �� �����Ǿ� �ִ�.
	@Override
	public void abc () {
		// super.abc();									// super.abc() �� Object Ŭ������ abc() �޼ҵ带 ȣ���϶�� ��, ����������.
		A.super.abc();									// A interface�� abc() �޼ҵ� ȣ��
		System.out.println("B Ŭ������ abc() �޼ҵ�");
	}
}


public class DefaultMethod_02 {

	public static void main(String[] args) {
		// 1. ��ü ����
		A a = new B();
		B b = new B();
		
		// 2. �޼ҵ� ȣ��
		a.abc();										// A �������̽��� abc() �޼ҵ� ȣ��
		
		System.out.println();
		
		b.abc();										// B Ŭ������ abc() �޼ҵ� ȣ��
		
	}

}
