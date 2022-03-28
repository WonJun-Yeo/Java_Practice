package chap15.EX18;

/*	BLOCKED ���� : ����ȭ �޼ҵ峪 ����ȭ ������� �� �����尡 Key�� ������ ���, ��� ����
 * 
 */

class MyBlockTest {
	// 1. ������ü (����ȭ �޼ҵ�, ����ȭ ��)
	MyClass mc = new MyClass();
	
	// 2. 3���� ������ �ʵ� ����
	Thread t1 = new Thread("thread1") {
		@Override
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t2 = new Thread("thread2") {
		@Override
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("thread3") {
		@Override
		public void run() {
			mc.syncMethod();
		};
	};
	
	void startALL() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class MyClass {
		synchronized void syncMethod() {									// ����ȭ �޼ҵ� : �⺻ Ű�� this�̸�, ������ �Ұ����ϴ�.
			try {Thread.sleep(100);} catch (InterruptedException e) {}		// ������ �غ�ð� 0.1�� ����
			System.out.println(Thread.currentThread().getName());			// currentThread() :���� �������� ������
			System.out.println("thread1 ===> " + t1.getState());
			System.out.println("thread2 ===> " + t2.getState());
			System.out.println("thread3 ===> " + t3.getState());
			System.out.println();
		}
	}
}




public class BlockedState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startALL();
	}

}
