package chap15.EX15;

/* Thread.yield() : �������(RUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� �����带 �Ͻ� �纸
 * ������� ���ο��� �ٸ� �����带 ���� �����ϵ��� �纸
 * ����ȭ���� Key�� ���� �����ϴ� ������ �߻��Ǵµ�, Key�� �纸������ ���ؼ� �յ��ϰ� ó���ϵ��� �� �� ���
 */

class MyThread extends Thread {
	boolean yieldFlag;
	
	@Override
	public void run() {
		while(true) {											// ���ѷ���
			if(yieldFlag) {										// yieldFlag�� true�� ��, �����带 �纸
				Thread.yield();									// �����带 �纸
			} else {											// yieldFlag�� false�� ��, ������ ������ ���
				System.out.println(getName() + "����");
				for (long i = 0; i < 100000000L; i++) {}		// �ð�����
			}
		}
	};
}


public class YieldInRunnableState {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;
		thread1.setDaemon(true);								// ������ �Ϲݽ����尡 ����� ��, ���� ���� **while ���ѷ����� ���������� ����
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);								// ������ �Ϲݽ����尡 ����� ��, ���� ����
		thread2.start();
		
		// ���ν�����
		// ������ 6�� ���� (1�ʿ� �� ���� �纸)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag = !thread1.yieldFlag;				// ���϶� ������ ����, �����϶� ���� ����
			thread2.yieldFlag = !thread2.yieldFlag;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
