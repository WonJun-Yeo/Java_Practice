package chap14.EX01;

public class CheckException_01_1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);								// 프로그램이 비정상 종료된다. 예외처리 필요
		} catch (ArithmeticException e) {							// try 블락에서 오류가 발생되었을 때, 작동
			e.printStackTrace();									// 오류에 대한 자세한 정보 출력
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {													// try 블락이 오류가 없어도 작동되고, 오류가 있어도 작동된다. 객체를 사용 후, 객체의 메모리를 제거 할 때 사용 (ex. sc.close)
			System.out.println("finally 블락은 항상 작동됩니다.");
		}
		
		System.out.println("프로그램을 정상 종료합니다.");
		
	}
}
