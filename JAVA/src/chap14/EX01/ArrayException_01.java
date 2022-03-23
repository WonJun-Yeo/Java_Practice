package chap14.EX01;

public class ArrayException_01 {

	public static void main(String[] args) {

		int[] arr = new int[5];								// arr 배열의 index : 0, 1, 2, 3, 4
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();							// 예외에 대한 정보를 출력
			System.out.println("배열의 index 번호를 초과하였습니다.");
		} finally {
			System.out.println("finally 반드시 출력");
		}
		
		
		System.out.println("프로그램 종료");
		
	}

}
