package chap05;

import java.util.Arrays;

public class ReadArrayData_EX05 {
	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		// 1. 배열의 방(index) 길이
		
		System.out.println(array.length);			// 방의 갯수를 출력, 배열변수.length
		System.out.println("====================");
		
		// 2. 출력(1) : 방법호를 직접 입력하여 출력, 특정 방번호의 값을 출력할 때 사용
		
		System.out.print(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
		// System.out.println(array[5]); Array Index Out Of Bounds Exception, 방법호 초과 출력시 오류
		System.out.println();
		System.out.println("====================");
		
		// 3. 출력(2) : for문을 사용해서 모든 범위를 출력
		
		for (int i =0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		// 4. 출력(3) : for문을 사용해서 특정 범위만 출력
		
		for (int i = 0; i < 3; i++) {				// 몇 번방꺼지, 몇 씩 증가하는지 지정이 가능
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		
		// 5. 출력(4) : 향상된 for문, 처음 방부터 마지막 방까지 순환하면서 출력, 범위를 지정해서 출력할 수 없다는 단점
		
		for (int k : array) {					// for (출력할자료형 변수 :  배열변수) {자료형 변수 포함 실행구문}
			System.out.print(k + " ");			// 벼열변수의 방의 값을 차례로 k에 대입
		}
		System.out.println();
		System.out.println("====================");
		
		// 6. 출력(5) : Arrays.toString(배열변수명), 배열 변수의 모든 값을 출력, 범위를 지정해서 출력할 수 없다는 단점
		System.out.println(Arrays.toString(array));
		
	}
}
