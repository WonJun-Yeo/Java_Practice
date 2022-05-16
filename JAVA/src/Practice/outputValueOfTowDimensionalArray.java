package Practice;

public class outputValueOfTowDimensionalArray {

	public static void main(String[] args) {
		// 2차원 배열 생성
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
		
		// 배열 값 단일 출력
		System.out.println(arr[0][0]);		// 1 출력
		System.out.println(arr[1][0]);		// 6 출력
		System.out.println(arr[1][3]);		// 9 출력
		
		// for 문을 이용한 모든 배열 값 출력
		for (int i = 0; i < arr.length; i++) {					// 1부터 9까지 모두 출력
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// for-each 문을 이용한 모든 배열 값 출력
		for (int[] i : arr) {									// 1부터 9까지 모두 출력
			for (int j : i) {
				System.out.println(j);
			}
		}
	}

}
