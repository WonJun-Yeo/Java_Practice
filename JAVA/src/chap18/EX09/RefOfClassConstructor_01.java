package chap18.EX09;

interface A {
	B abc();							// ����Ÿ���� B ��ü
}

class B {
	B() {
		System.out.println("ù��° ������");
	}
	
	B(int k) {
		System.out.println("�ι�° ������");
	}
	
}

public class RefOfClassConstructor_01 {

	public static void main(String[] args) {
		// 1. Ŭ���� ������ ����
		
		// �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc() {									// abc() �޼ҵ� ȣ��� ������ ����
				return new B();
			}
		};
		
		
		// ���ٽ�
		A a2 = () -> {return new B();};							// ��ü����
		A a3 = () -> new B();									// ���� ���Ž� �߰�ȣ�� ����
		
		// Ŭ���� ������ ����
		A a4 = B::new;
		
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
		
		System.out.println("==============================================");
		
		
	}

}
