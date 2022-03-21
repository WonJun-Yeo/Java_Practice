package chap13.EX01;

/*	�̳�Ŭ����(inner Class) : Ŭ���� ������ Ŭ����
 * �ν��Ͻ� �̳�Ŭ���� : static�� ���� ���� �̳�Ŭ����, �ƿ���Ŭ������ ��üȭ�� �Ŀ� ������ ��üȭ �� �����
 * ����ƽ �̳�Ŭ���� : static�� ���� �̳�Ŭ����, ��ü �������� Ŭ���������� ȣ���Ͽ� ��밡��
 * ���� �̳�Ŭ���� : Ŭ������ �ν��Ͻ� �޼ҵ� ���ο��� ����� �̳�Ŭ����
 * 
 * Outer Class�� ���������� ���� ���� ����
 * �ٸ� ��ü ���� ���� Outer Class�� �ʵ峪 �޼ҵ忡 ������ �� �� �ְ� �ϱ����� �̳�Ŭ������ ���
 */

// Ŭ���� ���� : A.class, A$B.class


class A {											// Outer Class : ��� ���������ڸ� Inner Class���� ������ �� �ִ�.
	public int a = 3;								// �ٸ���Ű��, ���� ��Ű������ ���� ����
	protected int b = 4;							// ��Ӱ����� ��� �ٸ��б������� ���ٰ���, ���� �б������� ���ٰ���
	int c = 5;										// �ٸ� ��Ű������ ���� �Ұ���, ���� ��Ű������ ���ٰ���
	private int d = 6;								// class ���ο����� ���ٰ���
	
	void abc() {
		System.out.println("AŬ������ abc() �޼ҵ�");
	}
	
	class B {										// �ν��Ͻ� ����Ŭ���� : �ܺ�Ŭ������ ��üȭ�� ��, ��üȭ�Ͽ� ��밡��
		void bcd() {
			// outer class �ʵ� ����
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			// outer class �޼ҵ� ����
			abc();
		}
	}
}






public class InnerClass_01 {

	public static void main(String[] args) {
		// 1. outer class ��ü ���� (�̳�Ŭ������ ����ϱ� ���� 1�ܰ�)
		A a = new A();
		
		
		// 2. inner class ��ü ���� (�̳�Ŭ������ ����ϱ� ���� 2�ܰ�)
		A.B b = a.new B();								// A.B : �ܺ�Ŭ����.����Ŭ����,	b : ����Ŭ���� �ν��Ͻ� ����,	a.new B(); : �ܺ��ν��Ͻ���.new ����Ŭ����������ȣ��
		
		b.bcd();
	}

}
