package chap05;

import java.util.Arrays;

public class Quiz_02 {

	public static void main(String[] args) {
		int[] arr2 = new int[300];
		
		// for문 이용해 배열변수 값 저장
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i + 1) * 3;
		}
		System.out.println();
		
		// for문을 이용한 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		// 향상된 for문을 이용한 출력
		for (int k : arr2) {
			System.out.println(k);
		}
		System.out.println();
		
		
		// Arrays.toString을 이용한 출력
		System.out.println(Arrays.toString(arr2));		
		System.out.println();
		
		
		for (int i = 100; i < arr2.length; i++) {
			if (i % 2 == 1) {
				System.out.println(arr2[i]);
			}
		}
		System.out.println();
		
	}
}
