package chap05;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
		// for문 이용해 배열변수 값 저장
		int[] arr1 = new int[100];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		System.out.println();
		
		
		// for문을 이용한 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		
		// 향상된 for문을 이용한 출력
		for (int k : arr1) {
			System.out.println(k);
		}
		System.out.println();
		
		
		// Arrays.toString을 이용한 출력
		System.out.println(Arrays.toString(arr1));
		
	}

}
