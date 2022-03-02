package chap05;
public class InitialValue_03 {
	public static void main(String[] args) {
		
		// 1. 메모리의 초기값		
		
		int value1;						// 기본 자료형에 초기값을 할당하지 않았을 때
		// System.out.println(value1);
		
		int [] value2;					// 배열은 참조 자료형
		// System.out.println(value2);
		
		int value3 = 0;					// 기본 자료형은 초기값으로 0을 할당
		System.out.println(value3);
		
		int[] value4 = null;			// 참조 자료형은 초기값으로 null을 할당
		System.out.println(value4);
		System.out.println("========================");
		
		// 2. Heep 메모리의 초기값 (강제 초기화), Heep에는 참조자료형의 값이 저장된다.
		
		boolean[] array1 = new boolean[3];		// 참조자료형에 값을 할당하지 않으면 변수종류에 따라 default 값이 할당된다.
		System.out.print(array1[0] + " " + array1[1] + " " + array1[2]);	// boolean 자료형은 false가 default 값
		System.out.println();
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		System.out.println("객체의 메모리 주소 : " + array1);	// 참조 자료형 변수(객체)를 직접 적는 경우, 객체의 메모리 주소가 출력된다.
		System.out.println("객체의 방의 갯수 : " + array1.length);	// 참조 자료형 변수(객체)에 .length를 붙히면 방의 갯수가 출려된다.
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] 번째 방의 값은 : " + array1[i]);
		}
		System.out.println();
		
		int[] array2 = new int [3];		// 정수 자료형(byte, short, int, long)은 0이 default 값
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		double[] array3 = new double[3];	// 실수 자료형(double, float)은 0.0이 default 값
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		// 3. 참조형 자료형은 null이 default 값
		
		String[] array4 = new String[3];
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println();
		
		
		
		
		
	}
}
