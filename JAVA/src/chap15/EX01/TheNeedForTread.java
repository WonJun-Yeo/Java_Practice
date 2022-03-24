package chap15.EX01;

// 단일 스레드

public class TheNeedForTread {

	public static void main(String[] args) {
		// 1. 비디오 프레임 1~ 5
		
		int [] intArray = {1,2,3,4,5};
		
		
		// 2. 자막 프레임 : 하나 ~ 다섯
		
		String [] strArray = {"하나","둘","셋","넷","다섯"};
		
		
		// 3. 비디오 프레임 출력
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("(비디오프레임)" + intArray[i]);
			try {
				Thread.sleep(200);										// 단위 ms, 200ms 동안 스레드 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 4. 자막 프레임 출력
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("(자막프레임)" + strArray[i]);
			try {
				Thread.sleep(200);										// 단위 ms, 200ms 동안 스레드 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
