package chap15.EX05;

// ��ü �������� �͸�ü�� ����� ������ ���� **���� ���� ���Ǵ� ���


public class CreateAndStartThread_04 {

	public static void main(String[] args) {
		// ù ��° ������ : �ڸ� ��ȣ Ǯ�� 
		Thread thread1 = new Thread(new Runnable() {
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
		});
		
		// �� ��° ������ : ���� ������ Ǯ�� 
		Thread thread2 = new Thread(new Runnable() {
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
		});
		
		// ������ ����
		thread1.start();
		thread2.start();
	}
}
