package chap15.EX01;

// ���� ������

public class TheNeedForTread {

	public static void main(String[] args) {
		// 1. ���� ������ 1~ 5
		
		int [] intArray = {1,2,3,4,5};
		
		
		// 2. �ڸ� ������ : �ϳ� ~ �ټ�
		
		String [] strArray = {"�ϳ�","��","��","��","�ټ�"};
		
		
		// 3. ���� ������ ���
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("(����������)" + intArray[i]);
			try {
				Thread.sleep(200);										// ���� ms, 200ms ���� ������ �Ͻ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 4. �ڸ� ������ ���
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("(�ڸ�������)" + strArray[i]);
			try {
				Thread.sleep(200);										// ���� ms, 200ms ���� ������ �Ͻ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
