package chap14.EX03;

// 여러개의 Exception이 동시에 발생될 경우

public class MultiCatch_01 {

	public static void main(String[] args) {
		// 1. 단일 Exception 처리 : try, catch 처리
		try {
			System.out.println(10 / 0);								// ArithmeticException
		} catch (ArithmeticException e) {
			// catch 블락에 아무 처리를 하지 않아도 예외처리가 된다.
			System.out.println("단일 예외처리 (ArithmeticException)");
		}
		
		
		try {
			int num = Integer.parseInt("10A");							// NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println("단일 예외처리 (NumberFormatException)");
		}
		
		System.out.println("==================================================");
		
		// 2. 다중 Exception 처리 방법1
		
		try {
			System.out.println(10 / 0);
			int num2 = Integer.parseInt("10B");
		} catch (ArithmeticException e) {
			System.out.println("다중 예외처리 (ArithmeticException)");
		} catch (NumberFormatException k) {
			System.out.println("다중 예외처리 (NumberFormatException)");
		}
		
		System.out.println("==================================================");
		
		// 3. 다중 Exception 처리 방법2 
		
		try {
			System.out.println(10 / 0);
			int num3 = Integer.parseInt("10C");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("다중 예외처리 (ArithmeticException | NumberFormatException)");
		}
		
		
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
