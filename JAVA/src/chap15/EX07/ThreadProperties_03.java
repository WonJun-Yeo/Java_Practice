package chap15.EX07;

/* �Ϲ� ������( .setDaemon(false) ) : default off : ������ �Ϲݽ����尡 ����Ǵ��� �ڽ��� ���� ��� ��ġ�� �����Ѵ�.
 * ���� ������( .setDaemon(true) )
 * 		�����带 start�ϱ� ���� ����
 * 		���� ������ �Ұ�
 * 		������ �Ϲݽ����尡 ����Ǵ� ������ �Բ� ����ȴ�.
 * 		�Ϲ������� �ٸ� �������� �۾��� ���� ���� ������� Ȱ��
 * 		��������� ������ �Ϲݽ����� �����϶� ������ �ܴ̿� �Ϲݽ������ ����
 * 		���� ������ ����ؼ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����ϸ� �۾��� �����ϰ� �ٽ� ��� ���¿� ����.
 * 		������ �÷��� (�޸��� ������ �ʴ� ��ü�� ������ �÷��Ͱ� �ڵ����� ����)
 * 			- ���μ����� ��������� �ڵ�����, ȭ�� �ڵ� ����
 */

class MyThread extends Thread {													// �����带 �۵���ų Ŭ����
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "���󾲷���":"�Ϲݽ�����"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class ThreadProperties_03 {

	public static void main(String[] args) {
		// 1. �Ϲ� ������
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();
		
		// 2. ���� ������ : ������ �����尡 ����Ǵ� ������ ����ȴ�.
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		
		// 3.5�� �Ŀ� main thread�� ����
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {}
		
		System.out.println("main Thread ����");
		
		
		
		
	}

}
