package chap06_07.EX02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	
	// 같은 클래스 내의 메소드 호출 : static 키워드가 있는 경우, 메소드 이름으로 호출가능
	// public : 다른 채키지에서 접근 가능하도록 설정
	// 접근제어자 (public, protected, default, private)
	// 접근제어자가 생략되어 있을 경우 default : 같은 패키지에서 접근가능
	
	static void printArray (int[] a) {	
		
		
		// Arrays.toString()을 사용해서 출력
		System.out.println(Arrays.toString(a));
		System.out.println("======================");
		
		// for문을 사용해서 출력
		for (int i = 0; i <a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		// 향산된(enhanced) for문을 사용해서 출력
		for (int k : a) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("======================");
	}
	

	
	public static void main(String[] args) {
		// 배열을 매개 변수로 가지는 메소드 호풀
		
		int[] a = new int[] {1, 2, 3};			// 배열변수를 선언하고 값을 넣은 후
		printArray(a);							// 배열변수를 메소드 호출시 매개변수로 배열변수 입력 
		
		printArray(new int[] {4,5,6,7,8});
		
		//printArray({1,2,3}); 					// 오류발생
		
		
		
	}

}
