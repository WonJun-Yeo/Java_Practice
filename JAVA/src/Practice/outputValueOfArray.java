package Practice;

public class outputValueOfArray {

	public static void main(String[] args) {
		// �迭 ����
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		// �迭 �� ���� ���
		System.out.println(a[3]);					// 4 ���
		System.out.println(a[7]);					// 8 ���
		System.out.println(a[9]);					// 10 ���
		System.out.println(a[10]);					// 11 ���
		
		// for ���� �̿��� ��� �迭 �� ���
		for (int i = 0; i < a.length; i++) {		// 1���� 20���� ��� ���
			System.out.println(a[i]);
		};
		
		// for-each ���� �̿��� ��� �迭 �� ���
		for (int i : a) {							// 1���� 20���� ��� ���
			System.out.println(i);
		};
	}
}
