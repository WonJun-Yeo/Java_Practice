package chap05;

import java.util.Arrays;

public class EX01 {
	public static void main(String[] args) {
		int[] arr1 = new int[100];
		
		// for문을 사용해서 arr1 배열의 각 방에 값을 입력
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		
		// 출력 구문 for
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + "번째방의 값 : " + arr1[i]);
		}
		
		// 향상된 for문
		
		for (int g : arr1) {
			System.out.println(g);
		}
		
		// Arrays.toString()
		System.out.println(Arrays.toString(arr1));
		
	}
}
