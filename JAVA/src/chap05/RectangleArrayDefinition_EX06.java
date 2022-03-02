package chap05;
public class RectangleArrayDefinition_EX06 {
	public static void main(String[] args) {
		
		// 1. 2차원 배열 선언과 방갯수 할당 (자료형뒤 대괄호)
		
		int[][] array1 = new int[3][4];				// 행갯수 : 3, 열의 갯수: 4개
		System.out.println("====================");
		
		// 2. 2차원 배열 선언 후, 방갯수 할당 (자료형뒤 대괄호)
		
		int [][] array2;
		array2 = new int[3][4];
		
		System.out.println(array1[0][0]);
		System.out.println("====================");			// 참조변수의 초기값 int : 0
		
		// 3. 2차원 배열 선언과 방갯수 할당 (배열변수뒤 대괄호)
		
		int array3[][] = new int[3][4];
		System.out.println("====================");
		
		// 4. 2차원 배열 선언 후, 방갯수 할당 (배열변수뒤 대괄호)
		
		int array4[][];
		array4 = new int[3][4];
		System.out.println("====================");			// 참조변수의 초기값 int : 0
		
		// 5. 2차원 배열 선언과 방갯수 할당 (자료형 및 배열변수뒤 대괄호)
		
		int[] array5[] = new int[3][4];
		System.out.println("====================");			// 참조변수의 초기값 int : 0
		
		// 6. 2차원 배열 선언 후, 방갯수 할당 (자료형 및 배열변수뒤 대괄호)
		
		int [] array6[];
		array6 = new int[3][4];
		System.out.println("====================");			// 참조변수의 초기값 int : 0
		
		
		// 7. 다양한 자료형의 배열 선언 (기본 자료형 배열, 참조자료형 배열)
		
		boolean[][] array7 = new boolean[3][4];				// default 값이 false
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6];				// String은 참조 자료형 (파란색), default 값이 null
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
