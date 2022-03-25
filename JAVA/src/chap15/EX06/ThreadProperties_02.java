package chap15.EX06;

/* Thread 우선순위
 * 기본값은 5이며, 0~10까지 할당할 수 있다.
 * 값이 클수록 우선순위가 높다. (먼저 처리한다.)
 */

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) {}													// 시간지연용
		System.out.println(getName() + "우선순위" + getPriority());
	}
}

public class ThreadProperties_02 {

	public static void main(String[] args) {
		// 1. 참고 : CPU core 확인하기
		System.out.println("코어수 : " + Runtime.getRuntime().availableProcessors());
		
		System.out.println("=======================================");
		
		// 2. 기본(default : 5) 우선 순위
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t");
			System.out.println(thread.getPriority());
			thread.start();
		}

		System.out.println("=======================================");
		
		try {
			Thread.sleep(1000);															// 1초 딜레이
		} catch (InterruptedException e) {}
		
		
		// 3. 우선순위 직접지정
		for (int i = 0; i < 10; i++) {													// 스레드 0~8까지는 우선순위가 5
			Thread thread = new MyThread();
			thread.setName(i + "번째 스레드");
			if (i == 9) {				
				thread.setPriority(10);													// 마지막 스레드의 우선순위를 10으로 할당
			}
			thread.start();
			//System.out.print(thread.getName() + "\t");
			//System.out.println(thread.getPriority());
		}
	}
}
