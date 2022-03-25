package chap15.EX05;

// 객체 생성없이 익명객체를 사용해 스레드 생성 **가장 많이 사용되는 방법


public class CreateAndStartThread_04 {

	public static void main(String[] args) {
		// 첫 번째 스레드 : 자막 번호 풀력 
		Thread thread1 = new Thread(new Runnable() {
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
		});
		
		// 두 번째 스레드 : 비디오 프레임 풀력 
		Thread thread2 = new Thread(new Runnable() {
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
		});
		
		// 스레드 시작
		thread1.start();
		thread2.start();
	}
}
