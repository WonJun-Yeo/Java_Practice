package chap13.EX06;

//�������̽��� ����� Ŭ������ �����ؼ� ��ü ���

class A {
	C c = new B();										// CŸ���� �ν��Ͻ� ���� c
	
	void abc() {
		c.bcd();
	}
	
	class B implements C {								// �̳�Ŭ����
		@Override
		public void bcd() {								// �������̽� C�� �߻�޼ҵ带 ����
			System.out.println("�ν��Ͻ� �̳�Ŭ����");
		}
	}
}


interface C {											// �������̽�, �߻�޼ҵ� ����
	public abstract void bcd();
}


public class AnonymouseClass {

	public static void main(String[] args) {
		// 1. ��ü ���� �� �޼ҵ� ȣ��
		 A a = new A();
		 a.abc();										// �ν��Ͻ� �̳�Ŭ����
		 
	}

}
