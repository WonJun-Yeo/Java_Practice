package chap05;

import java.util.Arrays;

public class EX01 {
	public static void main(String[] args) {
		int[] arr1 = new int[100];
		
		// for���� ����ؼ� arr1 �迭�� �� �濡 ���� �Է�
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		
		// ��� ���� for
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + "��°���� �� : " + arr1[i]);
		}
		
		// ���� for��
		
		for (int g : arr1) {
			System.out.println(g);
		}
		
		// Arrays.toString()
		System.out.println(Arrays.toString(arr1));
		
	}
}
