package chap13.EX07.EX1;

// 2. �������̽� �߻�޼ҵ带 ������ �͸� ���� Ŭ������ ȣ�� : �ѹ��� ����ϴ� ���



interface A {																// �������̽� : �߻�޼ҵ带 ����
	void cry();																// �߻�޼ҵ�, public abstract �� �����Ǿ� �ִ�
	public abstract void fly();
}

class B {
	
	/*	�������̽��� ��üȭ �� �� ������, �͸���Ŭ������ �����ؼ� ����
	 * A �������̽��� ������ �ڽ� Ŭ���� ���
	 * Ŭ���� �̸��� ����.(�����Ϸ��� ������ �̸����� �ڵ����� �Ҵ�)
	 */
	A a = new A() {															// 
		public void cry() {System.out.println("�۸�");};
		public void fly() {System.out.println("���� �������մϴ�.");};
	};
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	
	
}

public class AnonymousClass_02_1 {

	public static void main(String[] args) {
		B b = new B();
		
		b.abc();

	}

}
