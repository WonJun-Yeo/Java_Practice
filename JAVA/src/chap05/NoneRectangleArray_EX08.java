package chap05;
public class NoneRectangleArray_EX08 {
	public static void main(String[] args) {
		// NonRectangle (비정방형) : 행에 따라서 열의 갯수가 다르다.
		
		// 1. 배열 객체의 생성 및 원소갑 대입 (방법1)
		
		int [][] array1 = new int[2][];			// 행의 갯수만 할당하여 방의 크기를 만든다.
		array1[0] = new int[2];					// index 0 행의 열갯수가 2개
		
		array1[0][0] = 1;
		array1[0][1] = 2;
		
		
		array1[1] = new int[3];					// index 1 행의 열갯수가 3개
		
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;
		
		System.out.println(array1[0][0] + " " + array1[0][1]);
		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
		System.out.println("============================");
		
		// 2. 배열 객체의 생성 및 원소갑 대입 (방법2)
		
		int[][] array2 = new int[2][];
		array2[0] = new int[] {1,2};
		array2[1] = new int[] {3,4,5};
		
		System.out.println(array2[0][0] + " " + array2[0][1]);
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println("============================");
		
		
		// 3. 배열 객체의 생성 및 원소갑 대입 (방법3)
		int[][] array3 = new int[][] {{1,2}, {3,4,5}};		// 비정방형으로 값을 바로 할당, 초기값을 알 때 사용
		
		System.out.println(array3[0][0] + " " + array3[0][1]);
		System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
		System.out.println("============================");
		
		// 4. 배열 객체의 생성 및 원소갑 대입 (방법4)
		int[][] array4;
		array4 = new int[][] {{1,2}, {3,4,5}};		// 선언 후 값할당, 비정방형으로 값을 바로 할당, 초기값을 알 때 사용
		
		System.out.println(array4[0][0] + " " + array4[0][1]);
		System.out.println(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
		System.out.println("============================");
				
		// 5. 배열 객체의 생성 및 원소갑 대입 (방법5)
		int[][] array5 = {{1,2}, {3,4,5}};		// new int 생략, 비정방형으로 값을 바로 할당, 초기값을 알 때 사용
		
		System.out.println(array5[0][0] + " " + array5[0][1]);
		System.out.println(array5[1][0] + " " + array5[1][1] + " " + array5[1][2]);
		System.out.println("============================");		
		
		// 6. 배열 객체의 생성 및 원소갑 대입
//		int[][] array6;
//		array6 = {{1,2}, {3,4,5}};		// 오류 발생

		
	}
}
