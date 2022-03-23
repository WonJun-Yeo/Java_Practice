package chap13.EX10;

/*	�̳��������̽� (InnerInterface)
 * Ŭ���� ������ �������̽�
 * �ܺ�Ŭ������ �����ϰ� ����� �������� ����
 * �̳��������̽����� static Ű���尡 �ʼ�, ���� �� �����Ϸ��� ���ؼ� �ڵ����� �����ȴ�.
 * implements �� static Ű���� ����
 */

class A {
	interface B {											// static �� ����
		void bcd();											// public abstract �� ����
	}
}


// �̳��������̽��� ������ Ŭ����
class C implements A.B {									// A.B : A Ŭ������ �̳��������̽� B    *** A,B : A �������̽�, B �������̽�
	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ C Ŭ����");
		
	}
}




public class InnerInterface_01 {

	public static void main(String[] args) {
		// 1. �ڽ� ��ü�� ���� ���� ��, ��� (�ڽ� Ŭ������ �����ϴ� ���)
		A.B ab = new C();			// �θ� Ÿ������ ��ĳ���� ��, �������̵��� ���� ���
		ab.bcd();
		
		System.out.println();
		
		C c = new C();				// �ڽ�Ÿ������ ���� ���
		c.bcd();
		
		
		System.out.println("===================================");
		
		// 2. �͸� �̳�Ŭ������ ��� (�ڽ� Ŭ������ ���� ���)
		
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("�͸� �̳�Ŭ������ ��ü ���� ��, ���");
			};
		};
		
		b.bcd();
		
	}

}
