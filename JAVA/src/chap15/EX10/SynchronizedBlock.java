package chap15.EX10;

/* 블락동기화 : 메소드 내부의 일부분만 동기화
 * 구문 : synchronized (임의의 객체){}
 * 임의의 객체의 default 값은 this 이다.
 * this 자신의 객체를 뜻하며, 동기화 블록에 접근하는 Key이다.
 * 모든 스레드는 Key를 가져야 동기화 블럭을 접근할 수 있다.
 * 임의의 객체를 Key로 사용할 수 있다.
 */


class A{}
class B{}
class C{}

class MyData {											// 스레드들이 공유하는 객체 필드 생성
	int data = 3;
	
	public void plusData () {
		synchronized (this) {							// 블락 동기화
			int myData = data;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			data = myData + 1;
		}
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

public class SynchronizedBlock {

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
