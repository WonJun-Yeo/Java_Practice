package chap14.EX08;

/*	메소드의 예외를 main method 까지 throws
 * 		main method까지 예외가 전가된 경우, 예외의 결과창을 띄우고 프로그램이 종료된다.
 * 		main method는 예외 처리를 하지 않는다.
 */

class AA {
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");									// Runtime Exception, NumberFormatException 발생 
	}
}





public class ExceptionMethod {

	public static void main(String[] args) {
		// 1. 객체 생성
		AA aa = new AA();
		
		
		// 2. 메소드 호출
		
		try {
			aa.abc();												// Runtime Exception 이므로 컴파일 단계에서 예외가 발생하지 않고, 실행시 예외가 발생된다.
		} catch (NumberFormatException e) {
			e.printStackTrace();									// 예외의 자세한 정보를 출력
			System.out.println("예외가 발생되었습니다.");
		}
		
		
		System.out.println("프로그램종료");
		
		
	}

}
