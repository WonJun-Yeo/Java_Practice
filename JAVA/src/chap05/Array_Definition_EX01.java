package chap05;
public class Array_Definition_EX01 {
	public static void main(String[] args) {
		/*
		 * 배열 변수 선언 방법
		 * 	- 배열은 참조 변수이다.
		 * 	- 배열은 하나의 배열 변수에 많은 데이터를 저장
		 * 	- 배열은 선언시 동일한 자료형의 값을 저장 (컬렉션은 여러 데이터 타입을 저장할 수 있음)
		 * 	- 배열은 값을 저장할 방크기를 지정, 지정후에는 수정이 불가능하다. (컬렉션은 방의 크기가 자동으로 늘어남)
		 * 	- 배열 변수는 메모리의 stack 영역에 저장
		 *  - 배열 변수의 값들은 메모리의 heap 영역에 저장
		 */
		
		// 1. 배열 변수 선언 방법 첫 번째 : 자료형 뒤에 대괄호
		
		int[] array1 = new int[3];		// 배열 변수 선언과 동시에 배열의 방크기를 할당하는 방법
		
		int[] array2;					// 배열의 변수를 선언한 뒤, 배열의 방크기를 할당하는 방법
		array2 = new int[3];
		
		// 2. 배열 변수 선언 방법 두 번째 : 변수명 뒤에 대괄호
		
		int array3[] = new int[3];		// 배열 변수 선언과 동시에 배열의 방크기를 할당하는 방법
		
		int array4[];					// 배열의 변수를 선언한 뒤, 배열의 방크기를 할당하는 방법
		array4 = new int[3];
		
		// 다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열)
		
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];			// 참조 자료형 배열
		
		
		
		
		
		
		
		
		
		
		
	}
}
