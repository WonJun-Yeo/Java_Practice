package chap15.EX03;

// 1 번째 스레드 (0 스레드) : 자막파일 처리
class SMIFileTread extends Thread {
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

// 2번째 스레드 (1 스레드) : 비디오 프레임 처리
class VideoFileTread extends Thread {
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

public class CreateAndThread_02 {
// 3. 메인 스레드
	public static void main(String[] args) {
		
		// VideoFileThread 객체 시작
		Thread vedio = new VideoFileTread();
		vedio.start();
		
		// SMIFileThread 객체 시작
		Thread smi = new SMIFileTread();
		smi.start();
	}

}
