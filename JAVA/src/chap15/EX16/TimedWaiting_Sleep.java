package chap15.EX16;

/*	Thread.sleep(1000) 를 적용하면 TimedWaiting 상태로 이동한다.
 * Thread.sleep(1000)에 선언한 특정시간(1s)이 경과되면 다시 RUNNALBE 상태로 이동한다.
 * TimedWaiting 상태에서 interrupt가 발생되면 다시 RUNNALBE 상태로 이동한다.
 */

/*	a.join(1000) : 자신의 스레드는 1초동안 기다리고 a 객체에세 CPU 할당, 1초 뒤에 다시 자신의 스레드도 RUNNABLE 상태로 이동
 *  참고) 인스턴스명(객체명).join(1000) : 시간이 있을 경우, TimedWaiting 상태로 이동
 *  참고) 인스턴스명(객체명).join() : 시간이 없을 경우, Waiting 상태로 이동
 *  		자신의 스레드는 잠시 waiting 샅애로 가고 a 객체에서 CPU 사용하도록 할당, a 객체가 작업을 모두 완료하면 자신의 스레드가 RUNNABLE 상태로 이동
 */


class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);												// 3초 동안 TimedWaiting 상태로 이동, 3초 내에 interrupt 발생 시에는 예외를 발생시키고 즉시  RUNNABLE 상태로 이동,3초 후 RUNNABLE 상태로 이동
		} catch (InterruptedException e) {
			System.out.println("sleep() 진행중 interrupt 발생");
			for (long i = 0; i < 100000000L; i++) {}						// 대략 0.5초 시간이 지연된다.
		}
	}
}


public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();													// 시작하면 3초동안 RUNNABLE 상태로 들어간다.
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}			// 없이 출력하면 RUNNABLE 상태로 출력된다.
		System.out.println("MyThread State : " + myThread.getState());		// TimedWait 로 출력
		
		// 3초 이전에 interrupt 강제 발생.
		myThread.interrupt();
		try {Thread.sleep(1);} catch (InterruptedException e) {}			// 없이 출력하면 TimeWait 상태로 출력된다.
		System.out.println("MyThread State2 : " + myThread.getState());
		
		
	}

}
