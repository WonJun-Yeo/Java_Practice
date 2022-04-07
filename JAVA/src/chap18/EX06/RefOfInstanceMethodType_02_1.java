package chap18.EX06;

interface A {
	void abc(B b, int k);
}

class B {
	void bcd(int k) {										// �ν��Ͻ��޼ҵ�
		System.out.println(k);
	}
}



public class RefOfInstanceMethodType_02_1 {

	public static void main(String[] args) {
		// �ν��Ͻ� �޼ҵ� ����
		
		
		// �͸��̳�Ŭ���� Ȱ��
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			};
		};
		
		// ���ٽ� Ȱ��

		A a2 = (b, k) -> b.bcd(k);
		
		
		// �ν��Ͻ� �޼ҵ� ����
		
		/* �޼ҵ���� �빮�ڷ� ���� ���
		 * 1. �����޼ҵ�� ��ü������ �ʿ���� ���
		 * 2. �ν��Ͻ��޼ҵ� ������, ��ü�� �Ű������� ���� ���
		 */
		
		A a3 = B::bcd;
		
		B b = new B();
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
	}

}
