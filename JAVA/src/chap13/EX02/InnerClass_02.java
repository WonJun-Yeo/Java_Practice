package chap13.EX02;

// �̳�Ŭ�������� �ܺ�Ŭ������ �ʵ�� �޼ҵ� ���� ���

class A {
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	void abc( ) {
		System.out.println("AŬ������ abc() �޼ҵ�");
	}
	
	class B {
		int a = 5;
		int b = 6;
		
		void abc() {											// ** �������̵��� �ƴ϶� ������ �޼ҵ�, �������̵��� ��Ӱ��迡�� �ν��Ͻ� �޼ҵ带 �������ϴ� ��. �̳�Ŭ������ ��Ӱ��谡 �ƴϴ�.
			System.out.println("BŬ������ abc() �޼ҵ�");
		}
		
		void bcd() {
			// �̳�Ŭ����(�ڱ��ڽ�) ��� ȣ��
			System.out.println(a);								// this.a
			System.out.println(b);								// this.b
			abc();
			
			System.out.println();
			
			//�ƿ���Ŭ���� ��� ȣ��
			System.out.println(A.this.a);						// �ʵ�� �޼ҵ��� �̸��� ���� ��쿡�� A.this Ű���带 �־� �������־�� �Ѵ�.
			System.out.println(A.this.b);						// ** super Ű����� ��Ӱ��迡�� �θ�Ŭ������ ��Ÿ���� ��
			System.out.println(c);								// A.this.c
			System.out.println(d);								// A.this.d
			A.this.abc();
		}
	}
}


public class InnerClass_02 {

	public static void main(String[] args) {
		// 1. �ܺ�Ŭ���� ��ü ����
		A a = new A();
		
		// 2. �̳�Ŭ���� ��ü ����
		A.B b = a.new B();
		
		// 3. ����Ŭ������ �ʵ�� �޼ҵ� ȣ��
		b.bcd();
		
		System.out.println();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
	}

}
