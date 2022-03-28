package chap15.EX11;

/* 여러 스레드가 공유된 필드에 접근할 때, 동시성의 문제가 발생한다.
 * 		하나의 스레드의 작업이 끝나기 전에 다른 스레드가 data를 가져가 원치 않는 결과를 도출하게 된다.
 * 		동기화는 동시성 문제를 해결하는 방법이다.
 * 동기화(synchronized) : 여러 스레드가 공유된 필드에 접근할 때, 하나의 스레드의 작업이 완료될 때까지 Lock을 걸고, 작업이 끝나면 다른 스레드가 작업이 가능하다.
 * 		모든 동기화된 메소드는 this(자신의 객체)라는 키만 가진다.
 * 		여러 메소드가 동기화된 메소드일 경우, 하나의 스레드만 접근이 가능하다.
 * 		같은 클래스 내의 동기화된 여러 메소드들의 Key가 모두 this 이므로, 스레드들이 각각 다른 메소드를 호출하더라도 동시에 작동되지 않는다.
 */

class MyData {																			// 공유객체 : 여러 스레드가 공유 객체에 접근
	
	// 동기화된 메소드는 Key값이 모두 this 이며, 수정이 불가능하다.
	// 동기화된 메소드는 Key값을 넣을 수 없다.
	// 하나의 스레드가 접근할 때, key를 가지고 동기화된 메소드에 접근이 가능하다.
	
	// 동기화 블럭은 Key 값을 임의로 할당이 가능하다.
	// 객체를 Key로 사용할 수 있다.
	
	synchronized void abc() {															// 여러 스레드가 접근할 때, 동시성 문제를 방지하기위해 동기화처리
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e1) {}
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}					// 1초 딜레이
		}
	}
	
	synchronized void bcd() {															// 여러 스레드가 접근할 때, 동시성 문제를 방지하기위해 동기화처리
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(20);} catch (InterruptedException e1) {}
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}					// 1초 딜레이
		}
	}
	
	synchronized void cde() {															// 여러 스레드가 접근할 때, 동시성 문제를 방지하기위해 동기화처리
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(30);} catch (InterruptedException e1) {}
			System.out.println(i + "번 째");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}					// 1초 딜레이
		}
	}
}

public class KeyObject_01 {
	public static void main(String[] args) {
		
		// 공유 객체
		MyData myData = new MyData();
		
		// 세개의 쓰레드가 각각의 메소드 호출
		new Thread() {																	// Thread 클래스를 구현하는 자식 익명 클래스
			@Override
			 public void run() {
				myData.abc();															// 첫 번째 스레드, abc() 메소드 호출
			};
		}.start();
		
		new Thread() {																	// Thread 클래스를 구현하는 자식 익명 클래스
			@Override
			 public void run() {
				myData.bcd();															// 두 번째 스레드, bcd() 메소드 호출
			};
		}.start();
		
		new Thread() {																	// Thread 클래스를 구현하는 자식 익명 클래스
			@Override
			 public void run() {
				myData.cde();															// 세 번째 스레드, cde() 메소드 호출
			};
		}.start();
		
	}

}
