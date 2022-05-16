package Practice;

public class outputValueOfTowDimensionalArray {

	public static void main(String[] args) {
		// 2���� �迭 ����
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
		
		// �迭 �� ���� ���
		System.out.println(arr[0][0]);		// 1 ���
		System.out.println(arr[1][0]);		// 6 ���
		System.out.println(arr[1][3]);		// 9 ���
		
		// for ���� �̿��� ��� �迭 �� ���
		for (int i = 0; i < arr.length; i++) {					// 1���� 9���� ��� ���
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// for-each ���� �̿��� ��� �迭 �� ���
		for (int[] i : arr) {									// 1���� 9���� ��� ���
			for (int j : i) {
				System.out.println(j);
			}
		}
	}

}
