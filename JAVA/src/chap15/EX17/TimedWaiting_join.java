package chap15.EX17;

/*	a.join(1000) : �ڽ��� ������� 1�ʵ��� ��ٸ��� a ��ü���� CPU �Ҵ�, 1�� �ڿ� �ٽ� �ڽ��� �����嵵 RUNNABLE ���·� �̵�
 *  ����) �ν��Ͻ���(��ü��)[a].join(1000) : �ð��� ���� ���, TimedWaiting ���·� �̵�
 *  ����) �ν��Ͻ���(��ü��)[a].join() : �ð��� ���� ���, Waiting ���·� �̵�
 *  		�ڽ��� ������� ��� waiting ���ַ� ���� a ��ü���� CPU ����ϵ��� �Ҵ�, a ��ü�� �۾��� ��� �Ϸ��ϸ� �ڽ��� �����尡 RUNNABLE ���·� �̵�
 */

//a.join(1000) : a ��ü���� CPU�� �Ҵ��ϰ� �ڽ��� TimeWaiting ���·� ���

class MyThread1 extends Thread {
	@Override
	public void run() {
	   for (long i = 0; i < 300000000L; i++) {}   							// 0.5�� �ð� ����
	   for (long i = 0; i < 300000000L; i++) {}
	   for (long i = 0; i < 300000000L; i++) {}
	};
}
	
class MyThread2 extends Thread {
	MyThread1 myThread1;      // classŸ�� ����������;
	
	public MyThread2(MyThread1 myThread1) {      							// �����ڸ� ���ؼ� ���������� �� �Ҵ�
	   this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
	   try {
	      myThread1.join(3000);      										// MyThread2�� 3�� ����ϰ� myThread1���� CPU �Ҵ�
	   } catch (InterruptedException e) {
	      System.out.println("join() ���� �� Interrupt �߻�");
	      for (long i = 0; i < 300000000L; i++) {}   // 0.5�� �ð� ����
	   }
	}
}

public class TimedWaiting_join {

public static void main(String[] args) {
   // 1. ��ü ����
   
   MyThread1 myThread1 = new MyThread1();
   MyThread2 myThread2 = new MyThread2(myThread1);
   myThread1.start();
   myThread2.start();

   try {Thread.sleep(1);} catch (InterruptedException e) {}     			// ������ ���� �غ� �ð� 0.1��
   System.out.println("MyThread1 State : " + myThread1.getState());      	// RUNNABLE
   System.out.println("MyThread2 State : " + myThread2.getState());      	// TimedWaiting
   
   myThread2.interrupt();													// 3�� ����߿� interrupt�� �߻��Ǹ� RUNNABLE�� ���� �̵�
   try {Thread.sleep(1);} catch (InterruptedException e) {}     			// ������ ���� �غ� �ð� 0.1��
   System.out.println("MyThread1 State : " + myThread1.getState());      	// RUNNABLE
   System.out.println("MyThread2 State : " + myThread2.getState());			// RUNNABLE
   
   
   
   
   
	}

}
