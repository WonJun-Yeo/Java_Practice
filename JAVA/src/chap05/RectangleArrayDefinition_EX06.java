package chap05;
public class RectangleArrayDefinition_EX06 {
	public static void main(String[] args) {
		
		// 1. 2���� �迭 ����� �氹�� �Ҵ� (�ڷ����� ���ȣ)
		
		int[][] array1 = new int[3][4];				// �హ�� : 3, ���� ����: 4��
		System.out.println("====================");
		
		// 2. 2���� �迭 ���� ��, �氹�� �Ҵ� (�ڷ����� ���ȣ)
		
		int [][] array2;
		array2 = new int[3][4];
		
		System.out.println(array1[0][0]);
		System.out.println("====================");			// ���������� �ʱⰪ int : 0
		
		// 3. 2���� �迭 ����� �氹�� �Ҵ� (�迭������ ���ȣ)
		
		int array3[][] = new int[3][4];
		System.out.println("====================");
		
		// 4. 2���� �迭 ���� ��, �氹�� �Ҵ� (�迭������ ���ȣ)
		
		int array4[][];
		array4 = new int[3][4];
		System.out.println("====================");			// ���������� �ʱⰪ int : 0
		
		// 5. 2���� �迭 ����� �氹�� �Ҵ� (�ڷ��� �� �迭������ ���ȣ)
		
		int[] array5[] = new int[3][4];
		System.out.println("====================");			// ���������� �ʱⰪ int : 0
		
		// 6. 2���� �迭 ���� ��, �氹�� �Ҵ� (�ڷ��� �� �迭������ ���ȣ)
		
		int [] array6[];
		array6 = new int[3][4];
		System.out.println("====================");			// ���������� �ʱⰪ int : 0
		
		
		// 7. �پ��� �ڷ����� �迭 ���� (�⺻ �ڷ��� �迭, �����ڷ��� �迭)
		
		boolean[][] array7 = new boolean[3][4];				// default ���� false
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6];				// String�� ���� �ڷ��� (�Ķ���), default ���� null
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
