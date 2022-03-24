package chap14.EX07;

/*	Exception
 * 1. Checked Exception : �����Ͻ� ���� �߻�, �ݵ�� ����ó��
 * 2. Runtime Exception (Unchecked Exception) : ����� ���� �߻�
 * 
 * 	���� ó�� ���
 * 1. try/catch : ������ ���� ���ܸ� ó��
 * 2. throws : ���� ó�� ����, �޼ҵ������� ���ܸ� �޼ҵ带 ȣ���ϴ� ������ �̷��.
 * 				**main method�� throws�ϸ� ���α׷��� �����Ų��.
 * 				**throw : ���ܸ� ������ �߻���Ų��.
 */



// 1. try/catch�� �̿��� �ڽ��� ���� ���ܸ� ó��

class A {
	void abc() {
		bcd();												// bcd()�޼ҵ� ȣ��
	}
	
	void bcd() {
		
		/*	Class.forName : �����ε�
		 * �����ε� : �����Ͻÿ� üũ���� �ʰ� ������ ��, ��ü�� �����ϴ��� Ȯ��
		 * 			���� ��, Ŭ���� ������ ������ ���� �ְ� �������� ���� ���� �ֱ� ������ ����ó���� �ʿ��ϴ�.
		 * 
		 */
		
		try {
			Class cls = Class.forName("java.lang.Object");						// �Ϲݿ���(Checked Exception) ClassNotFoundException �߻�
			Thread.sleep(1000);													// �Ϲݿ���(Checked Exception) InterruptedException �߻�
		} catch (ClassNotFoundException | InterruptedException e) {
			
		}
		
	}
	
}

// 2. Throws�� �̿��� ���� ����

class B {
	void abc() {
		try {
			bcd();																// bcd()�޼ҵ� ȣ��
		} catch (ClassNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void bcd() throws ClassNotFoundException, InterruptedException  {
		Class cls = Class.forName("java.lang.Object");							// �Ϲݿ���(Checked Exception) ClassNotFoundException �߻�
		Thread.sleep(1000);														// �Ϲݿ���(Checked Exception) InterruptedException �߻�
	}
}



public class ThrowsException_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
