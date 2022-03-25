package chap15;

/*	스레드 4개 생성
 * 1. Thread 상속
 * 2. Runnable 구현
 * 3, 4. 익명 내부 클래스 생성해 구현
 * 
 * 구현내용
 * 각 값을 String 배열에 저장 후 아래와 같이 출력
 * 1번 스레드 : 이름, 나이, 국어, 영어, 수학
 * 2번 스레드 : 홍길동, 40, 100, 70 , 50
 * 3번 스레드 : 이순신, 50, 90, 60, 70
 * 4번 스레드 : 신사임당, 60, 80, 100, 80
 */

class FistThread extends Thread {
	@Override
	public void run() {
		String[] arr1 = {"이름", "나이", "국어", "영어", "수학"};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {}
			
		}
	};
}

class SecondThread implements Runnable {
	@Override
	public void run() {
		String[] arr2 = {" 홍길동", " 40", " 100", " 70", " 50"};
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {}
		}
	};
}


public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		// 첫 번째 스레드
		Thread thread1 = new FistThread();
		
		
		// 두 번째 스레드
		Runnable runnable = new SecondThread();
		Thread thread2 = new Thread(runnable);
		
		
		// 세 전째 스레드
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] arr3 = {" 이순신", " 50", " 90", " 60", " 70"};
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e1) {}
				
				for (int i = 0; i < arr3.length; i++) {
					System.out.print(arr3[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {}
				}
			};
		});
		
		
		// 네 전째 스레드
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] arr4 = {" 신사임당", " 60", " 80", " 100", " 80"};
				
				try {
					Thread.sleep(60);
				} catch (InterruptedException e1) {}
				
				for (int i = 0; i < arr4.length; i++) {
					System.out.println(arr4[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {}
				}
			};
		});
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
