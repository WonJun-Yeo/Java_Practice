package chap15.EX16;

/*	Thread.sleep(1000) �� �����ϸ� TimedWaiting ���·� �̵��Ѵ�.
 * Thread.sleep(1000)�� ������ Ư���ð�(1s)�� ����Ǹ� �ٽ� RUNNALBE ���·� �̵��Ѵ�.
 * TimedWaiting ���¿��� interrupt�� �߻��Ǹ� �ٽ� RUNNALBE ���·� �̵��Ѵ�.
 */

/*	a.join(1000) : �ڽ��� ������� 1�ʵ��� ��ٸ��� a ��ü���� CPU �Ҵ�, 1�� �ڿ� �ٽ� �ڽ��� �����嵵 RUNNABLE ���·� �̵�
 *  ����) �ν��Ͻ���(��ü��).join(1000) : �ð��� ���� ���, TimedWaiting ���·� �̵�
 *  ����) �ν��Ͻ���(��ü��).join() : �ð��� ���� ���, Waiting ���·� �̵�
 *  		�ڽ��� ������� ��� waiting ���ַ� ���� a ��ü���� CPU ����ϵ��� �Ҵ�, a ��ü�� �۾��� ��� �Ϸ��ϸ� �ڽ��� �����尡 RUNNABLE ���·� �̵�
 */


class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);												// 3�� ���� TimedWaiting ���·� �̵�, 3�� ���� interrupt �߻� �ÿ��� ���ܸ� �߻���Ű�� ���  RUNNABLE ���·� �̵�,3�� �� RUNNABLE ���·� �̵�
		} catch (InterruptedException e) {
			System.out.println("sleep() ������ interrupt �߻�");
			for (long i = 0; i < 100000000L; i++) {}						// �뷫 0.5�� �ð��� �����ȴ�.
		}
	}
}


public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();													// �����ϸ� 3�ʵ��� RUNNABLE ���·� ����.
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}			// ���� ����ϸ� RUNNABLE ���·� ��µȴ�.
		System.out.println("MyThread State : " + myThread.getState());		// TimedWait �� ���
		
		// 3�� ������ interrupt ���� �߻�.
		myThread.interrupt();
		try {Thread.sleep(1);} catch (InterruptedException e) {}			// ���� ����ϸ� TimeWait ���·� ��µȴ�.
		System.out.println("MyThread State2 : " + myThread.getState());
		
		
	}

}
