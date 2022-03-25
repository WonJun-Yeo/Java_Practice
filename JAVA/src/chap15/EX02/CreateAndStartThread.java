package chap15.EX02;

/* ���ο� ������ ����
 * 1. thread Ŭ������ ����ؼ� run() �������̵� �ؼ�����
 * 2. Runnable �������̽��� run() �޼ҵ带 ����
 */

class SMFileThread extends Thread {
	// 1��° ������ (0 ������)
	@Override
	public void run() {														// ������ �����忡�� �۾��� ����
		// 2��° ������(0 ������)���� �۾��� ����
		// �ڸ��� ����ϴ� ������
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(" (�ڸ� ������)" + strArray[i]);
			
			// �۾� ���� (0.2�� ������)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	};
}



public class CreateAndStartThread {

	public static void main(String[] args) {
		
		// 0 ������ �۵�
		/* start() : �����带 �۵��ϱ����� �޸� �Ҵ�(������ ����) ��, run() �޼ҵ带 ���� 
		 * run()�޼ҵ带 ���� ȣ���ϸ� �����尡 �۵��Ǵ� ���� �ƴ϶� �޼ҵ常 ��µȴ�.
		 */
		Thread sm = new SMFileThread();									// Thread Ÿ������ ��ü ����
		sm.start();														
		
		//1. ù��° ������ (main Thread ���� �۵�) - ���� ������ ���
		int [] intArray = {1,2,3,4,5};
		
		//���� ������ ���
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" (���� ������)" + intArray[i]);
			
			// �۾� ���� (0.2�� ������)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
