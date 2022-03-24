package chap14.EX07;

/*	Exception
 * 1. Checked Exception : 컴파일시 예외 발생, 반드시 예외처리
 * 2. Runtime Exception (Unchecked Exception) : 실행시 예외 발생
 * 
 * 	예외 처리 방법
 * 1. try/catch : 저신이 직접 예외를 처리
 * 2. throws : 예외 처리 전가, 메소드블락안의 예외를 메소드를 호출하는 쪽으로 미룬다.
 * 				**main method는 throws하면 프로그램을 종료시킨다.
 * 				**throw : 예외를 강제로 발생시킨다.
 */



// 1. try/catch를 이용해 자신이 직접 예외를 처리

class A {
	void abc() {
		bcd();												// bcd()메소드 호출
	}
	
	void bcd() {
		
		/*	Class.forName : 동적로딩
		 * 동적로딩 : 컴파일시에 체크하지 않고 실행할 때, 객체가 존재하는지 확인
		 * 			실행 시, 클래스 파일이 존재할 수도 있고 존재하지 않을 수도 있기 때문에 예외처리가 필요하다.
		 * 
		 */
		
		try {
			Class cls = Class.forName("java.lang.Object");						// 일반예외(Checked Exception) ClassNotFoundException 발생
			Thread.sleep(1000);													// 일반예외(Checked Exception) InterruptedException 발생
		} catch (ClassNotFoundException | InterruptedException e) {
			
		}
		
	}
	
}

// 2. Throws를 이용해 예외 전가

class B {
	void abc() {
		try {
			bcd();																// bcd()메소드 호출
		} catch (ClassNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void bcd() throws ClassNotFoundException, InterruptedException  {
		Class cls = Class.forName("java.lang.Object");							// 일반예외(Checked Exception) ClassNotFoundException 발생
		Thread.sleep(1000);														// 일반예외(Checked Exception) InterruptedException 발생
	}
}



public class ThrowsException_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
