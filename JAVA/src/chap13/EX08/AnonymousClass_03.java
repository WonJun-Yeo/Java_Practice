package chap13.EX08;

// Ŭ���� ���� �� ���������� ���, �̻���� ��쿡�� �Ű������� ��ü�� ����

interface A {
	public abstract void abc();
}

// 1. �ڽ�Ŭ������ ���� ����
class B implements A {
	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}

class C {													// cde() �޼ҵ忡 ��ǲ������ A Ÿ���� ��ü�� �޴´�.
	void cde (A a) {										// cde() �޼ҵ� ȣ�� ��, �Ű������� AŸ���� ��ü�� �Ҵ�
		a.abc();
	}
}


public class AnonymousClass_03 {

	public static void main(String[] args) {
		
		C c = new C();
		
		// ��� 1 : Ŭ������ O + ���������� O
		
		A a = new B();
		
		c.cde(a);
		
		System.out.println("================================");
		
		// ��� 2 : Ŭ������ O + ���������� X
		
		c.cde(new B());
		
		
		
		
	}

}
