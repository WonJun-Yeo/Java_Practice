package chap05;
public class ReadArrayData_2D_EX09 {
	public static void main(String[] args) {
		// 1. 2차원 배열 데이터의 길이
		
		int[][] array1 = new int[2][3];
		System.out.println(array1.length);				// 2차원배열변수.length : 행의 갯수
		System.out.println();
		
		System.out.println(array1[0].length);			// 2차원배열변수.length[행번호] : 해당 행의 열의 갯수
		System.out.println();
		
		System.out.println(array1[1].length);
		System.out.println();
		
		int[] array11 = new int[10];
		System.out.println(array11.length);				// 1차원배열변수.length : 열의 갯수
		System.out.println("=========================");
		
		// 2. 2차원 배열 출력 방법 1 : 배열의 index 번호로 출력
		
		int[][] array2 = new int[][] {{1,2}, {3,4,5}};
		
		System.out.println(array2.length);				// 행의 갯수 : 2
		System.out.println(array2[0].length);			// 0번 행의 열의 갯수 : 2
		System.out.println(array2[1].length);			// 1번 행의 열의 갯수 : 3
		System.out.println();
		
		System.out.println(array2[0][0] + " " + array2[0][1]);
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println("=========================");
		
		// 3. 2차원 배열 출력 방법 2 : 2중 for문을 이용해 출력
		
		for (int i = 0; i < array2.length; i++) {				// 바깥쪽 for문 : 행을 루프 돌린다.
			for (int j = 0; j < array2[i].length; j++) {		// 안쪽 for문 : 열을 루프 돌린다.
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		
		// 4. 2차원 배열 출력 방법 3 : 2중 향상된 for문을 이용해 출력
		for (int[] array: array2 ) {							// 2차원 배열 행의 열값을 1차원 배열 변수에 담고
			for(int k : array) {								// 배열의 값을 변수에 담아서 출력
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
