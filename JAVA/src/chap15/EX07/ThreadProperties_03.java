package chap15.EX07;

/* 일반 스레드( .setDaemon(false) ) : default off : 마지막 일반스레드가 종료되더라도 자신의 일을 모두 마치고 종료한다.
 * 데몬 스레드( .setDaemon(true) )
 * 		스레드를 start하기 전에 설정
 * 		수정 변경은 불가
 * 		마지막 일반스레드가 종료되는 시점에 함께 종료된다.
 * 		일반적으로 다른 스레드의 작업을 돕는 보조 스레드로 활용
 * 		종료시점이 마지막 일반스레드 종료일때 종료점 이외는 일반스레드와 동일
 * 		무한 루프를 사용해서 항시 대기하고 있다가 특정 조건이 만족하면 작업을 수행하고 다시 대기 상태에 들어간다.
 * 		가비지 컬렉터 (메모리의 사용되지 않는 객체를 가비지 컬렉터가 자동으로 제거)
 * 			- 프로세서가 종료시점에 자동저장, 화면 자동 갱신
 */

class MyThread extends Thread {													// 스레드를 작동기킬 클래스
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬쓰레드":"일반스레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class ThreadProperties_03 {

	public static void main(String[] args) {
		// 1. 일반 스레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();
		
		// 2. 데몬 스레드 : 마지막 스레드가 종료되는 시점에 종료된다.
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		
		// 3.5초 후에 main thread를 종료
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {}
		
		System.out.println("main Thread 종료");
		
		
		
		
	}

}
