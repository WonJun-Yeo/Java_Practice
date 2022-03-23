package chap14.EX01;

// Exception 이 예외의 최사의 클래스이다.
// ArrayIndexOutOfBoundsException 도 Exception을 상속하고 있다.

public class ArrayException_02 {

	public static void main(String[] args) {

		int[] arr = new int[5];								// arr 배열의 index : 0, 1, 2, 3, 4
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {								// 하위에 있는 모든 Exception을 모두 처리
			e.printStackTrace();							// 예외에 대한 정보를 출력
			System.out.println("배열의 index 번호를 초과하였습니다.");
		} finally {
			System.out.println("finally 반드시 출력");
		}
		
		
		System.out.println("프로그램 종료");
		
	}

}
