package chap15;

/*	������ 4�� ����
 * 1. Thread ���
 * 2. Runnable ����
 * 3, 4. �͸� ���� Ŭ���� ������ ����
 * 
 * ��������
 * �� ���� String �迭�� ���� �� �Ʒ��� ���� ���
 * 1�� ������ : �̸�, ����, ����, ����, ����
 * 2�� ������ : ȫ�浿, 40, 100, 70 , 50
 * 3�� ������ : �̼���, 50, 90, 60, 70
 * 4�� ������ : �Ż��Ӵ�, 60, 80, 100, 80
 */

class FistThread extends Thread {
	@Override
	public void run() {
		String[] arr1 = {"�̸�", "����", "����", "����", "����"};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {}
			
		}
	};
}

class SecondThread implements Runnable {
	@Override
	public void run() {
		String[] arr2 = {" ȫ�浿", " 40", " 100", " 70", " 50"};
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {}
		}
	};
}


public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		// ù ��° ������
		Thread thread1 = new FistThread();
		
		
		// �� ��° ������
		Runnable runnable = new SecondThread();
		Thread thread2 = new Thread(runnable);
		
		
		// �� ��° ������
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] arr3 = {" �̼���", " 50", " 90", " 60", " 70"};
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e1) {}
				
				for (int i = 0; i < arr3.length; i++) {
					System.out.print(arr3[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {}
				}
			};
		});
		
		
		// �� ��° ������
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] arr4 = {" �Ż��Ӵ�", " 60", " 80", " 100", " 80"};
				
				try {
					Thread.sleep(60);
				} catch (InterruptedException e1) {}
				
				for (int i = 0; i < arr4.length; i++) {
					System.out.println(arr4[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {}
				}
			};
		});
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
