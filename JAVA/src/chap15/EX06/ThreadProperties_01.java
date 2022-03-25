package chap15.EX06;

public class ThreadProperties_01 {

	public static void main(String[] args) {
		// 1. ��ü �������� ( currentThread() �޼ҵ� ), ������ �� ( activeCount() )
		
		Thread curThread = Thread.currentThread();								// main Thread
		//Ŭ����(Ÿ��) ���������� = Ŭ����.�޼ҵ�()										//currentThread() �޼ҵ�� static Ű���尡 �־� Ŭ���������� ȣ���� �����ϴ�.
		
		System.out.println("���� �������� �̸� : " + curThread.getName());
		System.out.println("�����ϴ� ������ �� : " + Thread.activeCount());
		
		System.out.println("===========================================");
		
		// 2. �������� �̸� ��� (�ڵ����) = JVM�� ������ �̸��� �ڵ� �Ҵ� (Thread-0,Thread-1, Thread-2, Thread-3...)
		
		for (int i = 0; i <= 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("===========================================");
		
		// 3. ������ �̸� ���� ���� : ��ü��.setName();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + " ��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("===========================================");
		
		// 4. �������� �̸� ��� (�ڵ����) = JVM�� ������ �̸��� �ڵ� �Ҵ� (Thread-0,Thread-1, Thread-2, Thread-3...)
		for (int i = 0; i <= 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 5. ������ �� ����ϱ�
		System.out.println("�����ϴ� ������ �� : " + Thread.activeCount());
		
	}

}
