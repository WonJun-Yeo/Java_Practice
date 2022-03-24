package chap14.EX08;

/*	사용자 정의 예외
 * 1. Checked Exception : Exception을 상속하는 예외, 컴파일 시 예외 발생
 * 2. Runtime Exception : RuntimeException을 상속하는 예외, 실행 시 예외 발생
 */ 

class MyException extends Exception {										// Checked Exception
	public MyException () {													// 기본생성자
		super();
	}
	
	public MyException (String message) {									// 예외 메세지 출력시 사용
		super(message);
	}										
		
}

class MyRTException extends RuntimeException {								// Runtime Exception
	public  MyRTException () {												// 기본생성자
		super();
	}
	
	public  MyRTException (String message) {								// 예외 메세지 출력시 사용
		super(message);
	}
}


class A {
	// 1. 사용자 정의 예외 객체 생성 : Checked Exception
	MyException me1 = new MyException();									// 기본생성자 호출
	MyException me2 = new MyException("에외 메세지");							// 예외메세지를 출력하는 생성자 호출
	
	
	// 2. 사용자 정의 예외 객체 생성 : Runtime Exception
	
	MyRTException mre1 = new MyRTException();								// 기본생성자 호출
	MyRTException mre2 = new MyRTException("예외 메세지");						// 예외메세지를 출력하는 생성자 호출
	
	
	// 3. 예외를 강제로 발생시키기 (throw)
	
	void abc_1(int num ) {
		try {
			if (num > 70) {
				System.out.println("정상작동");
			} else {
				throw me2;														// throw를 사용해서 예외를 강제로 발생
			}
		} catch (MyException e) {
			System.out.println("입력값 : " + e.getMessage());
			System.out.println("70이하의 값을 넣었습니다. 70 이상값을 넣으세요.");
		}
		
	}
	
	void bcd_1 () {
		abc_1(65);																// 예외가 강제로 발생된다.
	}
	
	
	// 4. 예외를 강제로 발생(throw) 후, 예외 전가 (throws)
	void abc_2 (int num) throws MyException {
		if (num > 70) {
			System.out.println("정상작동");
		} else {
			throw me2;														// throw를 사용해서 예외를 강제로 발생
		}
	};
	
	void bcd_2 () {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("입력값 : " + e.getMessage());
			System.out.println("70이하의 값을 넣었습니다. 70 이상값을 넣으세요.");
		}																// 예외가 강제로 발생된다.
	}
	
}




public class CreateUserException_01 {

	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();
		
		System.out.println();
		
		a.bcd_2();
		

	}

}
