package chap12.EX02;

/*	�������̽�(Interface) : �ܺο� ���θ� ���� �����ִ� ����
 * �ܺ�������ġ >> �ܼ�Ʈ << ����
 * 
 * �������̽��� ��ü ������ �Ұ��� (�������� ���� �޼ҵ尡 ���ԵǾ��ֱ� ������)	
 * ��� �ʵ�� �ݵ�� public static final
 * ��� �޼ҵ�� �ݵ�� public abstract (java 1.8 version ����)
 * 
 * 
 */

interface A {
	public static final int A = 3;						// �������̽� �ʵ��� ���� ǥ��
	
	public abstract void abc();							// �������̽� �޼ҵ��� ���� ǥ��
}


interface B {
	int A = 3;											// �������̽� �ʵ��� ������ ǥ��
	void abc();											// �������̽� �޼ҵ��� ������ ǥ��
}

abstract class C {										// �߻�Ŭ������ ���� abstract�� ������ �� ����.
	abstract void abc();
}


public class Interface_01 {

	public static void main(String[] args) {
		
		// �������̽��� ��ü ������ �Ұ��� �ϴ�.
		// A a = new A();
		
		// �������̽� static �ʵ� ���
		
		System.out.println(A.A);
		System.out.println(B.A);
		
		
	}

}
