package chap14.EX03;

public class MultiCatch_02 {

	public static void main(String[] args) {
		// 1. Exception 에서 모든 예외를 처리 할 수 있다. (모든 예외 클래스는 Exception을 상속하고 있다.)
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch(Exception e) {
			// try{} 블락에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
			System.out.println("모든 예외처리 (Exception)");
		}
		
		System.out.println("===================================================");
		
		// 2. catch 블락의 순서가 잘못된 경우 (최상위 Exception은 가장 마지막에 위치해야 한다.)
		/*
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10B");
		} catch(Exception e) {
			// try{} 블락에서 발생하는 모든 예외는 Exception 클래스가 모두 처리 (모든 예외 클래스는 Exception을 상속하고 있다.)
			System.out.println("모든 예외처리 (Exception)");
		} catch (ArithmeticException e) {
			
		} catch (NumberFormatException e) {
			
		}
		*/
		
		
		// 3. catch 블락의 올바른 순서 : 최상위 Exception은 catch블락의 마지막에 위치
		
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10C");
		} catch (ArithmeticException e) {
			
		} catch (NumberFormatException e) {
			
		} catch(Exception e) {
			// try{} 블락에서 발생하는 모든 예외는 Exception 클래스가 모두 처리 (모든 예외 클래스는 Exception을 상속하고 있다.)
			System.out.println("모든 예외처리 (Exception)");
		}
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
