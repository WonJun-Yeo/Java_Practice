package chap13.EX06.EX1;

// 1. �����丮���� �߻�޼ҵ带 ������ class ���� �Ŀ� ��ü�� ���� ��, ȣ��
// ������ϰ� ����ϴ� ���

interface A {																// �������̽� : �߻�޼ҵ带 ����
	void cry();																// �߻�޼ҵ�, public abstract �� �����Ǿ� �ִ�
	public abstract void fly();
}

class B {
	
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	
	class C implements A {																// A interface�� �޼ҵ带 ������ Ŭ����
		@Override
		public void cry() {
			System.out.println("�۸�");
		}
		
		@Override
		public void fly() {
			System.out.println("�������մϴ�.");
		}
	}
}

public class AnonymousClass_01_1 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}

}
