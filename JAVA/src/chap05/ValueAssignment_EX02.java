package chap05;
public class ValueAssignment_EX02 {
	public static void main(String[] args) {
		// 1. �迭 ������ �濡 �� �Ҵ��ϱ� (�迭�� �� �濡 ���� �Ҵ�)
		
		int[] array1 = new int[3];			// �迭 ���� : array1, ��ũ�� : 3, ���ȣ(index) : 0, 1, 2
											// array1[0], array1[1], array1[2]
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		System.out.println();
		
		int[] array2;						// �迭 ���� : array2, ��ũ�� : 3, ���ȣ(index) : 0, 1, 2
		array2 = new int[3];				// array2[0], array2[1], array2[2]
								
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		System.out.println("====================");
				
		
		// 2. �迭 ������ �濡 �� �Ҵ��ϱ� (��ũ�� �������� �ٷ� �� �Ҵ�)
		
		int[] array3 = new int[] {6, 7, 8, 9, 10};			// �迭 ���� ����� ���ÿ� �� �Ҵ�, ��ũ�⸦ �����ؼ��� �ȵȴ�.
		
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2] + " " + array3[3] + " " + array3[4]);
		System.out.println("");
		
		int[] array4;
		array4 = new int[] {6, 7, 8, 9, 10};
		
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2] + " " + array4[3] + " " + array4[4]);
		System.out.println("=====================");
		
		
		// 3. �迭 ������ �濡 �� �Ҵ��ϱ�
		
		int[] array5 = {11, 12, 13};						// new int[] �� ������ �� �ִ�.
		
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		/*
		int[] array6;
		array6 = {11, 12, 13};						// ���� �߻�
		
		System.out.println(array6[0] + " " + array6[1] + " " + array6[2]);
		*/
	}
}