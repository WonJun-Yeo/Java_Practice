package chap15.EX20;

/*	WAITING : 
 * 객체명.join() : 시간을 할당하지 않을 경우에 WAITING 상태로 이동 후, 객체에게 CPU를 할당
 * CPU를 할당한 객체의 실행이 모두 완료되면 자신의 스레드가 RUNNABLE 상태로 이동한다.
 * 자신의 스레드가 처리할 내용이, 다른 스레드가 처리한 결과를 받아서 처리해야할 경우 이용
 * 
 * 	wait(), notify(), notifyAll() : 동기화 메소드,블럭 내에서만 사용된다.
 * 1. wait() : 스레드가 동기화 메소블럭의 코드를 실행 중 wait() 메소드를 만나면 WAITING 샅태로 이동한다. (얼음)
 * 2. notify() : WAITING 상태의 스레드를 RUNNABLE 상태로 이동 (반드시 다른 스레드에서  (떙)
 */

class DataBox {
	boolean isEmpty = true;																// 기본값 세팅
	int data;
	
	synchronized void inputData (int data) {											// 동기화 메소드
		if (!isEmpty) {																	// isEmpty 가 false 일 때,
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}			// wait(); : 동기화 블럭,메소드에서 스레드를 WAIT 상태로 이동
		}
		
		isEmpty = false;																// Data 필드에 값을 넣고 wait 상태로 들어가기 위함
		
		this.data = data;
		System.out.println("입력 데이터 : " + data);
		notify();																		// WAIT 상태의 스레드를 RUNNALBE 상태로 이동
	}
	
	synchronized void outputData () {													// 동기화 메소드
		if (isEmpty) {																	// isEmpty 가 true 일 때,
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}			// wait(); : 동기화 블럭,메소드에서 스레드를 wait 상태로 이동
		}
		isEmpty = true;																	// Data 필드에 값을 넣고 wait 상태로 들어가기 위함
		
		System.out.println("출력 데이터 : " + data);
		notify();																		// WAIT 상태의 스레드를 RUNNALBE 상태로 이동
	}
}

public class Waiting_WaitNotify_02 {

	public static void main(String[] args) {
		// 객체 생성
		DataBox dataBox = new DataBox();
		
		
		// 첫 번째 스레드 : 공유객체에 값을 할당하는 스레드
		Thread t1 = new Thread() {									// 익명 내부클래스
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		// 두 번째 스레드 : 공유객체로부터 값을 읽어오는 스레드
		Thread t2 = new Thread() {									// 익명 내부클래스
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};
		
		t1.start();
		t2.start();

	}
}
