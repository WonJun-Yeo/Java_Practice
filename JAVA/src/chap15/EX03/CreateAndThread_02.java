package chap15.EX03;

// 1 ��° ������ (0 ������) : �ڸ����� ó��
class SMIFileTread extends Thread {
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

// 2��° ������ (1 ������) : ���� ������ ó��
class VideoFileTread extends Thread {
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

public class CreateAndThread_02 {
// 3. ���� ������
	public static void main(String[] args) {
		
		// VideoFileThread ��ü ����
		Thread vedio = new VideoFileTread();
		vedio.start();
		
		// SMIFileThread ��ü ����
		Thread smi = new SMIFileTread();
		smi.start();
	}

}
