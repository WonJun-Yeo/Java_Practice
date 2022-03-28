package chap15.EX19;

/*	WAITING : 
 * ��ü��.join() : �ð��� �Ҵ����� ���� ��쿡 WAITING ���·� �̵� ��, ��ü���� CPU�� �Ҵ�
 * CPU�� �Ҵ��� ��ü�� ������ ��� �Ϸ�Ǹ� �ڽ��� �����尡 RUNNABLE ���·� �̵��Ѵ�.
 * �ڽ��� �����尡 ó���� ������, �ٸ� �����尡 ó���� ����� �޾Ƽ� ó���ؾ��� ��� �̿�
 * 
 * 	wait(), notify(), notifyAll() : ����ȭ �޼ҵ�,�� �������� ���ȴ�.
 * 1. wait() : �����尡 ����ȭ ���� �ڵ带 ���� �� wait() �޼ҵ带 ������ WAITING ���·� �̵��Ѵ�. (����)
 * 2. notify() : WAITING ������ �����带 RUNNABLE ���·� �̵� (�ݵ�� �ٸ� �����忡��  (��)
 */

class DataBox {
	int data;
	
	synchronized void inputData (int data) {						// ����ȭ �޼ҵ�
		this.data = data;
		System.out.println("�Է� ������ : " + data);
	}
	
	synchronized void outputData () {								// ����ȭ �޼ҵ�
		System.out.println("��� ������ : " + data);
	}
}

public class Waiting_WaitNotify_01 {

	public static void main(String[] args) {
		// ��ü ����
		DataBox dataBox = new DataBox();
		
		
		// ù ��° ������ : ������ü�� ���� �Ҵ��ϴ� ������
		Thread t1 = new Thread() {									// �͸� ����Ŭ����
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		// �� ��° ������ : ������ü�κ��� ���� �о���� ������
		Thread t2 = new Thread() {									// �͸� ����Ŭ����
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};
		
		t1.start();
		t2.start();
		
		
		
	}
}
