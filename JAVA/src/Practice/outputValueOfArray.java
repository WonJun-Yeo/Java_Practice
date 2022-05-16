package Practice;

public class outputValueOfArray {

	public static void main(String[] args) {
		// 배열 생성
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		// 배열 값 단일 출력
		System.out.println(a[3]);					// 4 출력
		System.out.println(a[7]);					// 8 출력
		System.out.println(a[9]);					// 10 출력
		System.out.println(a[10]);					// 11 출력
		
		// for 문을 이용한 모든 배열 값 출력
		for (int i = 0; i < a.length; i++) {		// 1부터 20까지 모두 출력
			System.out.println(a[i]);
		};
		
		// for-each 문을 이용한 모든 배열 값 출력
		for (int i : a) {							// 1부터 20까지 모두 출력
			System.out.println(i);
		};
	}
}
