package chap15.EX17;

/*	a.join(1000) : 자신의 스레드는 1초동안 기다리고 a 객체에세 CPU 할당, 1초 뒤에 다시 자신의 스레드도 RUNNABLE 상태로 이동
 *  참고) 인스턴스명(객체명)[a].join(1000) : 시간이 있을 경우, TimedWaiting 상태로 이동
 *  참고) 인스턴스명(객체명)[a].join() : 시간이 없을 경우, Waiting 상태로 이동
 *  		자신의 스레드는 잠시 waiting 샅애로 가고 a 객체에서 CPU 사용하도록 할당, a 객체가 작업을 모두 완료하면 자신의 스레드가 RUNNABLE 상태로 이동
 */

//a.join(1000) : a 객체에게 CPU를 할당하고 자신은 TimeWaiting 상태로 대기

class MyThread1 extends Thread {
	@Override
	public void run() {
	   for (long i = 0; i < 300000000L; i++) {}   							// 0.5초 시간 지연
	   for (long i = 0; i < 300000000L; i++) {}
	   for (long i = 0; i < 300000000L; i++) {}
	};
}
	
class MyThread2 extends Thread {
	MyThread1 myThread1;      // class타입 참조변수명;
	
	public MyThread2(MyThread1 myThread1) {      							// 생성자를 통해서 참조변수의 값 할당
	   this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
	   try {
	      myThread1.join(3000);      										// MyThread2는 3초 대기하고 myThread1에게 CPU 할당
	   } catch (InterruptedException e) {
	      System.out.println("join() 진행 중 Interrupt 발생");
	      for (long i = 0; i < 300000000L; i++) {}   // 0.5초 시간 지연
	   }
	}
}

public class TimedWaiting_join {

public static void main(String[] args) {
   // 1. 객체 생성
   
   MyThread1 myThread1 = new MyThread1();
   MyThread2 myThread2 = new MyThread2(myThread1);
   myThread1.start();
   myThread2.start();

   try {Thread.sleep(1);} catch (InterruptedException e) {}     			// 스레드 시작 준비 시간 0.1초
   System.out.println("MyThread1 State : " + myThread1.getState());      	// RUNNABLE
   System.out.println("MyThread2 State : " + myThread2.getState());      	// TimedWaiting
   
   myThread2.interrupt();													// 3초 대기중에 interrupt가 발생되면 RUNNABLE로 상태 이동
   try {Thread.sleep(1);} catch (InterruptedException e) {}     			// 스레드 시작 준비 시간 0.1초
   System.out.println("MyThread1 State : " + myThread1.getState());      	// RUNNABLE
   System.out.println("MyThread2 State : " + myThread2.getState());			// RUNNABLE
   
   
   
   
   
	}

}
