package chap15.EX11;

/* ���� �����尡 ������ �ʵ忡 ������ ��, ���ü��� ������ �߻��Ѵ�.
 * 		�ϳ��� �������� �۾��� ������ ���� �ٸ� �����尡 data�� ������ ��ġ �ʴ� ����� �����ϰ� �ȴ�.
 * 		����ȭ�� ���ü� ������ �ذ��ϴ� ����̴�.
 * ����ȭ(synchronized) : ���� �����尡 ������ �ʵ忡 ������ ��, �ϳ��� �������� �۾��� �Ϸ�� ������ Lock�� �ɰ�, �۾��� ������ �ٸ� �����尡 �۾��� �����ϴ�.
 * 		��� ����ȭ�� �޼ҵ�� this(�ڽ��� ��ü)��� Ű�� ������.
 * 		���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ���, �ϳ��� �����常 ������ �����ϴ�.
 * 		���� Ŭ���� ���� ����ȭ�� ���� �޼ҵ���� Key�� ��� this �̹Ƿ�, ��������� ���� �ٸ� �޼ҵ带 ȣ���ϴ��� ���ÿ� �۵����� �ʴ´�.
 */

class MyData {																			// ������ü : ���� �����尡 ���� ��ü�� ����
	
	// ����ȭ�� �޼ҵ�� Key���� ��� this �̸�, ������ �Ұ����ϴ�.
	// ����ȭ�� �޼ҵ�� Key���� ���� �� ����.
	// �ϳ��� �����尡 ������ ��, key�� ������ ����ȭ�� �޼ҵ忡 ������ �����ϴ�.
	
	// ����ȭ ���� Key ���� ���Ƿ� �Ҵ��� �����ϴ�.
	// ��ü�� Key�� ����� �� �ִ�.
	
	synchronized void abc() {															// ���� �����尡 ������ ��, ���ü� ������ �����ϱ����� ����ȭó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e1) {}
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}					// 1�� ������
		}
	}
	
	synchronized void bcd() {															// ���� �����尡 ������ ��, ���ü� ������ �����ϱ����� ����ȭó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(20);} catch (InterruptedException e1) {}
			System.out.println(i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}					// 1�� ������
		}
	}
	
	synchronized void cde() {															// ���� �����尡 ������ ��, ���ü� ������ �����ϱ����� ����ȭó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(30);} catch (InterruptedException e1) {}
			System.out.println(i + "�� °");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}					// 1�� ������
		}
	}
}

public class KeyObject_01 {
	public static void main(String[] args) {
		
		// ���� ��ü
		MyData myData = new MyData();
		
		// ������ �����尡 ������ �޼ҵ� ȣ��
		new Thread() {																	// Thread Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			@Override
			 public void run() {
				myData.abc();															// ù ��° ������, abc() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() {																	// Thread Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			@Override
			 public void run() {
				myData.bcd();															// �� ��° ������, bcd() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() {																	// Thread Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			@Override
			 public void run() {
				myData.cde();															// �� ��° ������, cde() �޼ҵ� ȣ��
			};
		}.start();
		
	}

}
