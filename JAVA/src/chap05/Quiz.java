package chap05;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
		// for�� �̿��� �迭���� �� ����
		int[] arr1 = new int[100];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		System.out.println();
		
		
		// for���� �̿��� ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		
		// ���� for���� �̿��� ���
		for (int k : arr1) {
			System.out.println(k);
		}
		System.out.println();
		
		
		// Arrays.toString�� �̿��� ���
		System.out.println(Arrays.toString(arr1));
		
	}

}
