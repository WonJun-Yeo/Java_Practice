package chap15.EX04;

// Runnable 인터페이스의 run() 메소드를 구현해서 스레드 생성

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		//1. 자막 번호 
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {}
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - 자막번호" + strArray[i]);
			try {
				// 0.2 초 딜레이
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		//1. 비디오 번호 
		int[] intArray = {1, 2, 3, 4, 5};
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("비디오프레임" + intArray[i]);
			try {
				// 0.2 초 딜레이
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_03 {

	public static void main(String[] args) {
		// 첫 번째 객체 생성 후, 시작
		
		Runnable smi = new SMIFileRunnable();
		// smi.start();											// start() 메소드는 Runnable 인터페이스 내에 존재하지 않는다.
		Thread thread1 = new Thread(smi);						// Thread 타입으로 생성하고, 매개변수로 Runnable 객체를 넣어준다.
		thread1.start();
		
		
		// 두 번째 객체 생성 후, 시작
		Runnable video = new VideoFileRunnable();
		// smi.start();											// start() 메소드는 Runnable 인터페이스 내에 존재하지 않는다.
		Thread thread2 = new Thread(video);						// Thread 타입으로 생성하고, 매개변수로 Runnable 객체를 넣어준다.
		thread2.start();
		
		
		
	}

}
