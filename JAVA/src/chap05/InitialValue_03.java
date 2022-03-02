package chap05;
public class InitialValue_03 {
	public static void main(String[] args) {
		
		// 1. �޸��� �ʱⰪ		
		
		int value1;						// �⺻ �ڷ����� �ʱⰪ�� �Ҵ����� �ʾ��� ��
		// System.out.println(value1);
		
		int [] value2;					// �迭�� ���� �ڷ���
		// System.out.println(value2);
		
		int value3 = 0;					// �⺻ �ڷ����� �ʱⰪ���� 0�� �Ҵ�
		System.out.println(value3);
		
		int[] value4 = null;			// ���� �ڷ����� �ʱⰪ���� null�� �Ҵ�
		System.out.println(value4);
		System.out.println("========================");
		
		// 2. Heep �޸��� �ʱⰪ (���� �ʱ�ȭ), Heep���� �����ڷ����� ���� ����ȴ�.
		
		boolean[] array1 = new boolean[3];		// �����ڷ����� ���� �Ҵ����� ������ ���������� ���� default ���� �Ҵ�ȴ�.
		System.out.print(array1[0] + " " + array1[1] + " " + array1[2]);	// boolean �ڷ����� false�� default ��
		System.out.println();
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		System.out.println("��ü�� �޸� �ּ� : " + array1);	// ���� �ڷ��� ����(��ü)�� ���� ���� ���, ��ü�� �޸� �ּҰ� ��µȴ�.
		System.out.println("��ü�� ���� ���� : " + array1.length);	// ���� �ڷ��� ����(��ü)�� .length�� ������ ���� ������ ����ȴ�.
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] ��° ���� ���� : " + array1[i]);
		}
		System.out.println();
		
		int[] array2 = new int [3];		// ���� �ڷ���(byte, short, int, long)�� 0�� default ��
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		double[] array3 = new double[3];	// �Ǽ� �ڷ���(double, float)�� 0.0�� default ��
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		// 3. ������ �ڷ����� null�� default ��
		
		String[] array4 = new String[3];
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println();
		
		
		
		
		
	}
}
