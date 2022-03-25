package chap15.EX02;

/* 새로운 스래드 생성
 * 1. thread 클래스를 상속해서 run() 오버라이딩 해서구현
 * 2. Runnable 인터페이스의 run() 메소드를 구현
 */

class SMFileThread extends Thread {
	// 1번째 스레드 (0 스레드)
	@Override
	public void run() {														// 생성된 스레드에서 작업할 내용
		// 2번째 스레드(0 스레드)에서 작업할 내용
		// 자막을 출력하는 스레드
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(" (자막 프래임)" + strArray[i]);
			
			// 작업 지연 (0.2초 딜레이)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	};
}



public class CreateAndStartThread {

	public static void main(String[] args) {
		
		// 0 스레드 작동
		/* start() : 스레드를 작동하기위한 메모리 할당(스레드 생성) 후, run() 메소드를 실행 
		 * run()메소드를 직접 호출하면 쓰레드가 작동되는 것이 아니라 메소드만 출력된다.
		 */
		Thread sm = new SMFileThread();									// Thread 타입으로 객체 생성
		sm.start();														
		
		//1. 첫번째 스레드 (main Thread 에서 작동) - 비디오 프레임 출력
		int [] intArray = {1,2,3,4,5};
		
		//비디오 프레임 출력
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" (비디오 프래임)" + intArray[i]);
			
			// 작업 지연 (0.2초 딜레이)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
