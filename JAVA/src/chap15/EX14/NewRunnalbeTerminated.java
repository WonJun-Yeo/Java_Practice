package chap15.EX14;

/*	������ ���� (����� ��� �빮��)
 * 1. NEW 
 * 		������ ��ü ���� ��, start() �޼ҵ尡 ȣ�� �Ǳ� ������ ����
 * 2. RUNNABLE
 * 		start()�޼ҵ尡 ȣ��Ǿ� run()�޼ҵ� ������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
 * 3. TERMINATED
 * 		run()�޼ҵ� ������ ��� �ڵ尡 ����ǰ� �����尡 ����� ����
 * 4. TIMED WAIT
 * 		Ư�� �ð����ȸ� ������ ex) Thread.sleep(1000), a.join(1000):���� �ڽ��� ������� 1�� ��� ���¿� �ְ�, a ��ü�� ������·� ���� ������.(�纸����)
 * 		Ư�� �ð��� ����Ǹ� RUNNABLE ���µ� ���ư���.
 * 		interrupt�� �߻��Ǹ�, ���ܸ� �߻���Ű�� RUNNABLE ���µ� ���ư���.
 * 5. BLOCK
 * 		����ȭ ó�������� �ٸ� �����尡 �޼ҵ� ó���߿� Lock�� �ɷ��� ������ ���ܵǾ� ������ �Ұ����� ����
 * 		�ٸ� �������� ó���� ���� ��, key�� ȹ���Ͽ� RUNNABLE ���·� ���ư���.
 * 6. WAIT
 * 		������ ������.
 * 		�ٸ� �����尡 ������� RUNNABLE ���·� �� �� �ִ�.
 */

public class NewRunnalbeTerminated {

	public static void main(String[] args) {
		
		// �������� ���¸� �����س��� Ŭ����
		// state �������� 6���� ����� ������ �� �ִ�.
		Thread.State state;
		
		// 1. �͸� ���� ��ü ���� (NEW ����)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				// ��ü ������ �ణ�� �ð��� �ʿ�
				for (long i = 0; i < 100000000L; i++) {}
			}
		};
		
		state = myThread.getState();									// �������� ���¸� ������ �ͼ� state ������ �Ҵ�
		System.out.println("myThread state : " + state);
		
		// 2. myThread ���� (RUNNABLE ����)
		myThread.start();												// CPU���� �ڵ����
		
		state = myThread.getState();									// �������� ���¸� ������ �ͼ� state ������ �Ҵ�
		System.out.println("myThread state : " + state);
		
		// 3. myThread ����
			// myThread.join(); : ���� ������(���� ������)�� ����ϰ� myThread �����带 ����ó�� 
		try {myThread.join();} catch (InterruptedException e) {}
		
		state = myThread.getState();									// �������� ���¸� ������ �ͼ� state ������ �Ҵ�
		System.out.println("myThread state : " + state);
	}

}
