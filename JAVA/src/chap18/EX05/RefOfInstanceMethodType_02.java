package chap18.EX05;

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
	static void bcd() {									// static(����) �޼ҵ� : ��ü ���� ���� Ŭ���������� ȣ�� ����
		System.out.println("�޼���");
	}
}


public class RefOfInstanceMethodType_02 {

	public static void main(String[] args) {
		// 1. ���� �޼��� ���� : �͸��̳�Ŭ����
		
		A a1 = new A() {
			public void abc() {
				B.bcd();								// static �޼ҵ� ������ ��ü�������� Ŭ���������� ȣ��
			};
		};
		
		// 2. ���ٽ� Ȱ��
		A a2 = () -> B.bcd();
		
		
		// 3. ���� �޼ҵ� ���� ǥ����
		// ���� ���� ǥ��( Ŭ������::�޼ҵ�� )
		
		A a3 = B::bcd;							// b ��ü�� bcd() �޼ҵ带 ȣ��
		
		a1.abc();
		a2.abc();
		a3.abc();
		

	}

}
