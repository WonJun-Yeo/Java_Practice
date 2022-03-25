package chap15.EX04;

// Runnable �������̽��� run() �޼ҵ带 �����ؼ� ������ ����

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		//1. �ڸ� ��ȣ 
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {}
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - �ڸ���ȣ" + strArray[i]);
			try {
				// 0.2 �� ������
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		//1. ���� ��ȣ 
		int[] intArray = {1, 2, 3, 4, 5};
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("����������" + intArray[i]);
			try {
				// 0.2 �� ������
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_03 {

	public static void main(String[] args) {
		// ù ��° ��ü ���� ��, ����
		
		Runnable smi = new SMIFileRunnable();
		// smi.start();											// start() �޼ҵ�� Runnable �������̽� ���� �������� �ʴ´�.
		Thread thread1 = new Thread(smi);						// Thread Ÿ������ �����ϰ�, �Ű������� Runnable ��ü�� �־��ش�.
		thread1.start();
		
		
		// �� ��° ��ü ���� ��, ����
		Runnable video = new VideoFileRunnable();
		// smi.start();											// start() �޼ҵ�� Runnable �������̽� ���� �������� �ʴ´�.
		Thread thread2 = new Thread(video);						// Thread Ÿ������ �����ϰ�, �Ű������� Runnable ��ü�� �־��ش�.
		thread2.start();
		
		
		
	}

}
