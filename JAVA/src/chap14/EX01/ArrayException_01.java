package chap14.EX01;

public class ArrayException_01 {

	public static void main(String[] args) {

		int[] arr = new int[5];								// arr �迭�� index : 0, 1, 2, 3, 4
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();							// ���ܿ� ���� ������ ���
			System.out.println("�迭�� index ��ȣ�� �ʰ��Ͽ����ϴ�.");
		} finally {
			System.out.println("finally �ݵ�� ���");
		}
		
		
		System.out.println("���α׷� ����");
		
	}

}
