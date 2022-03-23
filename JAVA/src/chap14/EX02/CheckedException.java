package chap14.EX02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*	Checked Exception (일반예외) : 컴파일 단계에서 예외가 발생
 * 컴파일(빌드)하기 전, 예외처리를 해주어야 한다.
 */
/*	unChecked Exception, Runtime Exception (실행예외) : 실행시에 예외가 발생할 수 있다.
 * 예외처리가 필수는 아니지만 예외처리를 권장 (처리를 하지 않고 예외발생 시, 프로그램이 멈춘다.)
 */

class A {
	   B b;										// 초기값으로 null 할당
	   
	   A() {} 									// 기본 생성자
	   A (B b) {
		   this.b = b;
	   }
	   
	   interface B {   							//인터페이스 선언
		   void cry();
	   }
	   
	   void abc() {
		   System.out.println(b);
	       b.cry();
	   }
}




public class CheckedException {

	public static void main(String[] args) {
		// 1. 일반 예외 (Checked Exception) : 컴파일 단계에서 예외처리가 필요
		
			// InterruptedException : 스레드 중간에 끼어들기가 발생할 때 예외 발생
			// Thread.sleep(1000);
			
			// ClassNotFoundException : 클래스를 찾지 못할 때 예외 발생
			// Class cls = Class.forName("java.lang.Object");
			
			// IOEception : 네트워크에서 값(정보)를 읽어오지 못핧 때 예외 발생
			InputStreamReader in = new InputStreamReader(System.in);										// System.in 은 콘솔을 뜻함
			// in.read();
			
			// FileNotFoundException : 파일을 찾지 못할 때 예외 발생
			// FileInputStream fis = new FileInputStream("text.txt");
		
		
		// 2. 실행예외 (unChecked Exception) : 컴파일 단계가 아닌 실행시에 발생되는 예외 
		
			// NullPointerException : 객체가 Null 인 상태에서 객체의 필드나 메소드를 호출할 때 에외 발생
			A a1 = new A();
			// a1.abc();
		
		
		

	}

}
