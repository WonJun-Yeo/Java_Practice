package EX;
public class Random {
	public static void main(String[] args) {
		// ���� ���� �迭 ���� �� ��� ���
		
		int[] array = new int[10];
		
		// ���� ���� �迭 ����
		for (int j = 0; j < 10; j++) {
			array[j] = (int)(Math.random()*10+1);		// 1���� 10������ ������ ���� ����, *10�� 10��, +1�� ���� 0���� �����̳� 1�� ���ؼ� 1���� �����ϴ� ȿ���� �ش�.
		}
		
		// ���� ���� �迭 ���
		
		System.out.print("������ ������ : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// ���� ���� �迭 ��� ���
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("����� " + sum / array.length);
	}
}
