package chap06_07.EX02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
// 배열의 길이가 고정되어 있지 않고 가변하는 길이인 경우
	
	public static void main(String[] args) {
	// 1. 메서드명 (int...values) : 가변 길이를 처리하는 input 매개변수를 설정
		method1();
		method1(1,2);
		method1(1,2,3);
		method1(1,2,3,4);
		method1(1,2,3,4,5);
		method1(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		method2("안녕", "방가");
		method2("월", "화", "수", "목", "금", "토", "일");
		method2("토끼", "호랑이", "여우", "곰");
	}
	
	
	static void method1 (int...values) {			// 배열변수의 모든 값을 받겠다.
		System.out.println(values.length);
		
		// Arrays.toString()으로 배열 출력
		System.out.println(Arrays.toString(values));
		System.out.println("=================");
		
		// for문으로 배열 출력
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println("=================");
		
		// 향상된(enhanced) for문으로 배열 출력
		for (int k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=================");
	}
	
	static void method2 (String...values) {
		// Arrays.toString()으로 배열 출력
		System.out.println(Arrays.toString(values));
		System.out.println("=================");
		
		// for문으로 배열 출력
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println("=================");
		
		// 향상된(enhanced) for문으로 배열 출력
		for (String k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=================");
	}
	
	
	
	
	
	
	/* 메소드 오버로딩으로 처리
	static void method1() {
		System.out.println("매개변수가 없는 메소드입니다.");
	}
	
	static void method1(int a, int b) {
		System.out.println(a + ", " + b);
	}
	
	static void method1(int a, int b, int c) {
		System.out.println(a + ", " + b + ", " + c);
	}
	
	static void method1(int a, int b, int c, int d) {
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
	
	static void method1(int a, int b, int c, int d, int e) {
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
	}
	*/
}
