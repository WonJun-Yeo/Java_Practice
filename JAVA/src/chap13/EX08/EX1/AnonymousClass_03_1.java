package chap13.EX08.EX1;

/*3. �޼ҵ��� �Ű������� �����ϴ� ���
 *
 *1. ��ü ���� ��, �Ű������� ���� (Ŭ������O, ��������O)
 *2. ��ü ���� ��, �Ű������� ���� (Ŭ������O, ��������X)
 *
 */
interface A {																// �������̽� : �߻�޼ҵ带 ����
	void cry();																// �߻�޼ҵ�, public abstract �� �����Ǿ� �ִ�
	public abstract void fly();
}

class B implements A {														// B�� A �������̽��� ������ Ŭ����
	@Override
	public void cry() {System.out.println("�۸� : �Ű����� ������, ���");}
	
	@Override
	public void fly() {System.out.println("�������մϴ� : �Ű����� ���� ��, ���");}
}

class C {																	// C ��ü�� abc() �޼ҵ� ȣ�� ��, AŸ���� ��ü�� �Ű������� �޴´�.
	void abc(A a) {															// �Ű������� ���� �ڽ�Ŭ������ ���� ���, AŸ������ �ڵ� ��ĳ������ �Ͼ��.
		a.cry();
		a.fly();
	}
}


public class AnonymousClass_03_1 {

	public static void main(String[] args) {
		C c = new C();
		
		// 1. Ŭ������ ����O + ��������O
		A a = new B();														// B�� ��üȭ�ؼ� AŸ������ ����, a�� ���������� Ȱ��
		
		c.abc(a);
		
		System.out.println("===================");
		
		// 2. Ŭ������ ����O + ��������X
		c.abc(new B());
	}

}
