package chap12.EX05;

// �������̽� ������ ��� �ְ� ���α׷���(PM)�� �Ѵ�.




interface A {
	double PI = 3.14;						// public static final �� ����
	
	void run();								// public abstract �� ����
}

class B implements A {
	@Override
	public void run() {
		System.out.println("�޸��ϴ�.");
	}
}

public class Interface_05 {

	public static void main(String[] args) {
		// 1. ��ü ���� ��, ���
		
		A a1 = new B();
		a1.run();
		
		
		// 2. �͸� ��ü�� �̿��Ͽ� ���
		
		A a2 = new A() {
			public void run() {
				System.out.println("���� ���ϴ�.");
			}
		};
		
		a2.run();
		
		

	}

}
