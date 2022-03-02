package chap05;
public class ValueAssignment_EX02 {
	public static void main(String[] args) {
		// 1. 배열 변수의 방에 갑 할당하기 (배열의 각 방에 값을 할당)
		
		int[] array1 = new int[3];			// 배열 변수 : array1, 방크기 : 3, 방번호(index) : 0, 1, 2
											// array1[0], array1[1], array1[2]
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		System.out.println();
		
		int[] array2;						// 배열 변수 : array2, 방크기 : 3, 방번호(index) : 0, 1, 2
		array2 = new int[3];				// array2[0], array2[1], array2[2]
								
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		System.out.println("====================");
				
		
		// 2. 배열 변수의 방에 갑 할당하기 (방크기 지정없이 바로 값 할당)
		
		int[] array3 = new int[] {6, 7, 8, 9, 10};			// 배열 변수 선언과 동시에 값 할당, 방크기를 지정해서는 안된다.
		
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2] + " " + array3[3] + " " + array3[4]);
		System.out.println("");
		
		int[] array4;
		array4 = new int[] {6, 7, 8, 9, 10};
		
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2] + " " + array4[3] + " " + array4[4]);
		System.out.println("=====================");
		
		
		// 3. 배열 변수의 방에 갑 할당하기
		
		int[] array5 = {11, 12, 13};						// new int[] 를 생략할 수 있다.
		
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		/*
		int[] array6;
		array6 = {11, 12, 13};						// 오류 발생
		
		System.out.println(array6[0] + " " + array6[1] + " " + array6[2]);
		*/
	}
}
