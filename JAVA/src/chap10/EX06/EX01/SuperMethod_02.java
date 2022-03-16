package chap10.EX06.EX01;

/*	�ڽ� ��ü�� ������ �� �θ�Ŭ������ �⺻ �����ڸ� ���� ȣ��
 * ��� �ڽ� Ŭ������ �����ڿ��� super() �޼ҵ尡 �����Ǿ� �ִ�.
 * ����, �θ�Ŭ������ �⺻ �����ڰ� ���ٸ� �θ��� �ٸ� �����ڸ� �ڽ�Ŭ������ ������ �� ���ٿ� �������־�� �Ѵ�.
 */



class A {
	A() {
		System.out.println("A class�� �⺻ ������");
	}
	
	A(int a) {							// �����ε�
		System.out.println("A class�� �Ű����� ���� 1���� �޴� ������" + a);
	}
	
	A(int a, int b) {					// �����ε�
		System.out.println("A class�� �Ű����� ���� 2���� �޴� ������" + a + b);
	}
}

class B extends A {
	B() {
		System.out.println("B class�� �⺻ ������");
	}
	
	B (String a) {
		super(5,3);
		System.out.println("B Ŭ������ ���ڿ� 1���� �޴� ������" + a);
	}
}

class C extends B {
	C() {
		super("C���� ȣ��");									// ��Ӱ�����, �θ��� �⺻�����ڸ� ȣ���ϴ� super() �޼ҵ尡 �����Ǿ� �ִ�.
		System.out.println("C class�� �⺻ ������");
	}
}



public class SuperMethod_02 {

	public static void main(String[] args) {
		
		C c = new C();
	}

}
