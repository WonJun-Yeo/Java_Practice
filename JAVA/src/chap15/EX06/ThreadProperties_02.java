package chap15.EX06;

/* Thread �켱����
 * �⺻���� 5�̸�, 0~10���� �Ҵ��� �� �ִ�.
 * ���� Ŭ���� �켱������ ����. (���� ó���Ѵ�.)
 */

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) {}													// �ð�������
		System.out.println(getName() + "�켱����" + getPriority());
	}
}

public class ThreadProperties_02 {

	public static void main(String[] args) {
		// 1. ���� : CPU core Ȯ���ϱ�
		System.out.println("�ھ�� : " + Runtime.getRuntime().availableProcessors());
		
		System.out.println("=======================================");
		
		// 2. �⺻(default : 5) �켱 ����
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t");
			System.out.println(thread.getPriority());
			thread.start();
		}

		System.out.println("=======================================");
		
		try {
			Thread.sleep(1000);															// 1�� ������
		} catch (InterruptedException e) {}
		
		
		// 3. �켱���� ��������
		for (int i = 0; i < 10; i++) {													// ������ 0~8������ �켱������ 5
			Thread thread = new MyThread();
			thread.setName(i + "��° ������");
			if (i == 9) {				
				thread.setPriority(10);													// ������ �������� �켱������ 10���� �Ҵ�
			}
			thread.start();
			//System.out.print(thread.getName() + "\t");
			//System.out.println(thread.getPriority());
		}
	}
}
