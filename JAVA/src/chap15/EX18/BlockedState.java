package chap15.EX18;

/*	BLOCKED 상태 : 동기화 메소드나 동기화 블락에서 한 스레드가 Key를 점유한 경우, 대기 상태
 * 
 */

class MyBlockTest {
	// 1. 공유객체 (동기화 메소드, 동기화 블럭)
	MyClass mc = new MyClass();
	
	// 2. 3개의 스레드 필드 생성
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
		synchronized void syncMethod() {									// 동기화 메소드 : 기본 키가 this이며, 변경이 불가능하다.
			try {Thread.sleep(100);} catch (InterruptedException e) {}		// 스레드 준비시간 0.1초 지연
			System.out.println(Thread.currentThread().getName());			// currentThread() :현재 실행중인 스레드
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
