package chap13.EX09.EX1;

/* �Ű������� �޾Ƽ� ó��
 * �������̽��� ������ Ŭ������ ����.
 */



interface A {
	void abc();							// public abstract
}

class C {
	void cde(A a) {
		a.abc();
	}
}


public class AnonymousClass_04_1 {

	public static void main(String[] args) {
		
		C c = new C();
		
		// 3. �������̽��� ������ Ŭ����X, ���������� ���� O
		A a = new A() {									// �������̽��� ������ �ڽ� �͸� ��ü�� AŸ������ ���� ��, ���������� �Ҵ�
			@Override
			public void abc() {
				System.out.println("class X, parameter O");
			}
		};
		
		c.cde(a);
		
		System.out.println("===================================");
		
		// 4. �������̽��� ������ Ŭ����X, ���������� ���� X **���� ���� ��� (�ӽ÷� �� ���� ����ϴ� ���)
		
		c.cde(new A() {									// �͸�Ŭ������ ó���� ��, �������̵����� �� ���� ó��
			public void abc() {
				System.out.println("class X, parameter X");
			}
		});
		
		

	}

}
