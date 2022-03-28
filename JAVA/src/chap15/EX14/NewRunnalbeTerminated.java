package chap15.EX14;

/*	스레드 상태 (상수라 모두 대문자)
 * 1. NEW 
 * 		스레드 객체 생성 후, start() 메소드가 호출 되기 전까지 상태
 * 2. RUNNABLE
 * 		start()메소드가 호출되어 run()메소드 내부의 코드가 CPU에서 실행되고 있는 상태
 * 3. TERMINATED
 * 		run()메소드 내부의 모든 코드가 실행되고 스레드가 종료된 상태
 * 4. TIMED WAIT
 * 		특정 시간동안만 대기상태 ex) Thread.sleep(1000), a.join(1000):현재 자신의 스레드는 1초 대기 상태에 있고, a 객체를 실행상태로 먼저 보낸다.(양보개념)
 * 		특정 시간이 종료되면 RUNNABLE 상태도 돌아간다.
 * 		interrupt가 발생되면, 예외를 발생시키고 RUNNABLE 상태도 돌아간다.
 * 5. BLOCK
 * 		동기화 처리에의해 다른 스레드가 메소드 처리중에 Lock이 걸려서 접근이 차단되어 접근이 불가능한 상태
 * 		다른 스레드의 처리가 끝난 후, key를 획득하여 RUNNABLE 상태로 돌아간다.
 * 6. WAIT
 * 		무한정 대기상태.
 * 		다른 스레드가 깨워줘야 RUNNABLE 상태로 갈 수 있다.
 */

public class NewRunnalbeTerminated {

	public static void main(String[] args) {
		
		// 스레드의 상태를 저장해놓은 클래스
		// state 변수에는 6가지 상수만 저장할 수 있다.
		Thread.State state;
		
		// 1. 익명 내부 객체 생성 (NEW 상태)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				// 객체 생성시 약간의 시간이 필요
				for (long i = 0; i < 100000000L; i++) {}
			}
		};
		
		state = myThread.getState();									// 쓰레드의 상태를 가지고 와서 state 변수에 할당
		System.out.println("myThread state : " + state);
		
		// 2. myThread 시작 (RUNNABLE 상태)
		myThread.start();												// CPU에서 코드실행
		
		state = myThread.getState();									// 쓰레드의 상태를 가지고 와서 state 변수에 할당
		System.out.println("myThread state : " + state);
		
		// 3. myThread 종료
			// myThread.join(); : 현재 스레드(메인 스레드)는 대기하고 myThread 스레드를 먼저처리 
		try {myThread.join();} catch (InterruptedException e) {}
		
		state = myThread.getState();									// 쓰레드의 상태를 가지고 와서 state 변수에 할당
		System.out.println("myThread state : " + state);
	}

}
