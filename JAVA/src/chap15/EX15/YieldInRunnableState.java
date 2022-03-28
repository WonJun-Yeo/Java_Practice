package chap15.EX15;

/* Thread.yield() : 실행상태(RUNNABLE)에 있는 특정 스레드에게 자신의 스레드를 일시 양보
 * 실행상태 내부에서 다른 스레드를 먼저 실행하도록 양보
 * 동기화에서 Key를 서로 점유하는 현상이 발생되는데, Key를 양보함으로 인해서 균등하게 처리하도록 할 때 사용
 */

class MyThread extends Thread {
	boolean yieldFlag;
	
	@Override
	public void run() {
		while(true) {											// 무한루프
			if(yieldFlag) {										// yieldFlag가 true일 때, 스레드를 양보
				Thread.yield();									// 스레드를 양보
			} else {											// yieldFlag가 false일 때, 스레드 정보를 출력
				System.out.println(getName() + "실행");
				for (long i = 0; i < 100000000L; i++) {}		// 시간지연
			}
		}
	};
}


public class YieldInRunnableState {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;
		thread1.setDaemon(true);								// 마지막 일반스레드가 종료될 때, 같이 종료 **while 무한루프를 빠져나오기 위해
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);								// 마지막 일반스레드가 종료될 때, 같이 종료
		thread2.start();
		
		// 메인스레드
		// 스레드 6초 지연 (1초에 한 번씩 양보)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag = !thread1.yieldFlag;				// 참일땐 거짓을 저장, 거짓일땐 참을 저장
			thread2.yieldFlag = !thread2.yieldFlag;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
