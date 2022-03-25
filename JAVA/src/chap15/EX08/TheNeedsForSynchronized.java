package chap15.EX08;

/* ����ȭ (Synchronized) : ���� �����尡 �ϳ��� ������ �ʵ带 ������ ���, �� �۾��� ������ �Ϸ� �� ���� �۾��� ó�� �ϵ��� ����
 * ���� �۾��� �� Lock�� �ɰ� �۾��� ��ġ�� Lock�� �����Ͽ� �۾��� ���ٸ��ϵ��� �Ѵ�.
 */

// 1. ����ȭ�� ó������ �ʾ��� �� ����

class MyData {											// ��������� �����ϴ� ��ü �ʵ� ����
	int data = 3;
	
	public void plusData () {
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
		System.out.println(getName() + " �ǻ���� : " + myData.data);
	}
}

public class TheNeedsForSynchronized {

	public static void main(String[] args) {
		// ���� ��ü ����
		MyData myData = new MyData();
		
		// 1. PlusThread ����
		Thread plusThread1 = new PlusThread(myData);
		
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		
		// 2. PlusThread2 ����
		Thread plusThread2 = new PlusThread(myData);
		
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
		
	}

}
