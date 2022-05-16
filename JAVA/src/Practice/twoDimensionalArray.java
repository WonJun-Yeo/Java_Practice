package Practice;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// 2차원 정방 행렬 배열 생성 방법 1
		int[][] arr1 = new int[2][2];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		
		// 2차원 정방 행렬 배열 생성 방법 2
		int[][] arr2 = new int[2][];
		arr1[0] = new int[2];
		arr1[1] = new int[2];
		
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		
		// 2차원 정방 행렬 배열 생성 방법 3
		int[][] arr3 = new int[][] {{1, 2}, {3, 4}};
		
		int[][] arr4 = {{1, 2}, {3, 4}};
		
		
		
		// 2차원 비정방 행렬 배열 생성 방법 1
		int [][] arr5 = new int[2][];
		arr5[0] = new int [2];			// 두 1차원 배열의 길이가 다른게 비정방 행열 배열의 특징이다.
		arr5[1] = new int [3];
		
		arr5[0][0] = 1;
		arr5[0][1] = 2;
		arr5[1][0] = 4;
		arr5[1][1] = 5;
		arr5[1][2] = 6;
		
		// 2차원 비정방 행렬 배열 생성 방법 2
		int [][] arr6 = new int[][] {{1, 2}, {4, 5, 6}};
		int [][] arr7 = {{1, 2}, {4, 5, 6}};
	}
}
