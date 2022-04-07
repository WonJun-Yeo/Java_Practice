package chap18.EX04;

/* ���ٽ��� Ȱ��
 * 1. �͸��̳�Ŭ������ Ȱ���ϴ� ���
 * 2. �޼��� ���� : �޼ҵ带 ���������ʰ�, �����Ǿ��ִ� �޼ҵ带 �����ؼ� ��� **�޼ҵ带 �����ϱ� ���ؼ��� return Ÿ�԰� �Ű������� �����ؾ��Ѵ�.
 * 		1. �ν��Ͻ� �޼ҵ� ����
 * 		2. �����޼ҵ� ����
 */

interface A {
	void abc();
}

class B {
	void bcd() {								// �ν��Ͻ� �޼ҵ� : ��ü ���� ��, ȣ�� ����
		System.out.println("�޼���");
	}
}



public class RefOfInstanceMethodType_01 {

	public static void main(String[] args) {
		// 1. �ν��Ͻ� �޼��� ���� : �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};

		
		// 2. ���ٽ� Ȱ��
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		// 3. �ν��Ͻ� �޼ҵ� ���� ǥ����
		// �ν��Ͻ� ���� ǥ��( ��ü��::�޼ҵ�� )
		B b = new B();
		A a3 = b::bcd;							// b ��ü�� bcd() �޼ҵ带 ȣ��, ����Ÿ���� ���ƾ��ϰ� �Ű������� �����ؾ��Ѵ�.
		
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
	}

}
