package chap14.EX08;

public class ExceptionMessasge {

	public static void main(String[] args) {
		// 1. 예외 객체 생성 시, 메세지를 전달하지 않는 경우
		
		try {
			throw new Exception();								// 강제 예외발생, Exception의 기본 생성자 호출 시 메세지X
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("======================");
		
		// 2. 예외 객체 생성 시, 메세지를 전달하는 경우
		
		try {
			throw new Exception ("예외 메세지 출력");				// Exception 객체 생성자에 String값을 넣어주면 
		} catch (Exception e) {									// catch 블락에서 예외 메세지를 출력
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
