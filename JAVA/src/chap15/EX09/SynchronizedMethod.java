package chap15.EX09;


/* 메소드 동시화 : 메소드 전체를 동시화 하는 것
 * key 값이 this로 할당됨
 */

class MyData {											// 스레드들이 공유하는 객체 필드 생성
	int data = 3;
	
	public synchronized void plusData () {				// 동기화처리 메소드 : 여러 스레드가 접근할 때, 하나의 스레드의 작업이 완료될 때까지 Lock하고 완료되면 다음 스레드가 작업할 수 있다.
		int myData = data;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		data = myData + 1;
	}
}

class PlusThread extends Thread {
	MyData myData;
	public PlusThread (MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " 실생결과 : " + myData.data);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		// 공유 객체 생성
		MyData myData = new MyData();
		
		// 1. PlusThread 생성
		Thread plusThread1 = new PlusThread(myData);
		
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		
		// 2. PlusThread2 생성
		Thread plusThread2 = new PlusThread(myData);
		
		plusThread2.setName("plusThread2");
		plusThread2.start();
		

	}

}
