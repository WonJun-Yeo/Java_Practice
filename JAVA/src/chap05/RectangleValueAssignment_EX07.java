package chap05;
public class RectangleValueAssignment_EX07 {
	public static void main(String[] args) {
		
		// Rectangle (정방형 배열) : 직사각형으로 출력, 각각의 행의 열의 열의 갯수가 같다.
		
		
		// 1. 배열 객체의 생성 및 원소갑 대입 (방법1)
		
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;		
		array1[1][2] = 6;
		
		System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[0][2]);
		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
		System.out.println();

		int array2[][] = new int[2][3];
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[0][2] = 3;
		array2[1][0] = 4;
		array2[1][1] = 5;		
		array2[1][2] = 6;
		
		System.out.println(array2[0][0] + " " + array2[0][1] + " " + array2[0][2]);
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);	
		System.out.println("============================");
		
		// 2. 배열 객체의 생성 및 원소값 대입 (방법2)
		
		int[][] array3 = new int[][] {{1,2,3}, {4,5,6}};		// 배열 변수 선언과 동시에 값 할당, 초기값을 알 때 사용
		
		System.out.println(array3[0][0] + " " + array3[0][1] + " " + array3[0][2]);
		System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
		System.out.println();
		
		int[][] array4;
		array4 = new int[][] {{1,2,3}, {4,5,6}};				// 배열 변수 선언 후, 값 할당, 초기값을 알 때 사용
		
		System.out.println(array4[0][0] + " " + array4[0][1] + " " + array4[0][2]);
		System.out.println(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
		System.out.println("============================");
		
		// 3. 배열 객체의 생성 및 원소값 대입
		
		int[][] array5 = {{1,2,3}, {4,5,6}};				// new int 생략, 배열 변수 선언과 동시에 값 할당, 초기값을 알 때 사용
		
		System.out.println(array5[0][0] + " " + array5[0][1] + " " + array5[0][2]);
		System.out.println(array5[1][0] + " " + array5[1][1] + " " + array5[1][2]);
		System.out.println("============================");
		
//		int[][] array6;
//		array6 = {{1,2,3}, {4,5,6}};				// 사용 불가능
		
		
	}
}
