package chap14.EX06;

/*	����ó�� 2���� ���
 * 1. ����ó�� : try/catch
 * 2. ���� ����(throws) : �޼ҵ带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� ���� (�̷��)
 * 		** [s������ ����] throw : ������ ���ܸ� �߻���Ų��.
 */

class A {														// �޼��峻���� ���� ����ó��
	void abc() {
		bcd();
	}
	
	void bcd () {
		try {
			Thread.sleep(1000);									// �Ϲݿ���(checked exception) InterruptedException �߻�
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("���� �߻� 1");
		}
	}
}


class B {
	void abc() {
		try {
			bcd();												//  bcd() �޼ҵ带 ȣ���Ͽ��⶧���� bcd()�޼ҵ��� ���ܸ� ó���� �ǹ��� ������.
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("���� �߻� 2");
		}
	}
	
	void bcd () throws InterruptedException {					// bcd() �޼ҵ带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� �̷��.
		Thread.sleep(1000);										// �Ϲݿ���(checked exception) InterruptedException �߻�
	}
}


public class ThrowsException_01 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();
	}

}