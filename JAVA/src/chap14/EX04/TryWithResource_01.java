package chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

/* 	리소스 자동해제 예외 처리
 * JDK 1.7 이후 리소스를 자동으로 해지할 수 있는 문법구조
 * 예외 발생 여부와 관계 없이 try/catch 완료 후, 자동으로 is.close() 실행
 * 조건
 * 	1. 사용하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야 한다.
 * 	2. 반드시 close() 메서드를 포함해야한다.
 * 위의 2가지 조건을 만족할 때, 자동 리소스해제
 * try{(자동으로 리소스를 해제할 객체 선언)} catch{} finally{}
 */



public class TryWithResource_01 {

	public static void main(String[] args) {
		
		// 수동 리소스 해제
		
		System.out.println("문자를 입력하세요.");
		
		InputStreamReader isr2 = null;							// 사용루 반드시 메모리에서 객체를 삭제해주어야함, isr2.close()
		
		try {
			isr2 = new InputStreamReader(System.in);			// System.in : 콘솔에서 한 번 입력을 받고록 처리
			char input = (char) isr2.read();					// 일반예외 (checked 예외) : IOException : 네트워크에서 값(정보)를 읽어오지 못핧 때 예외 발생
			System.out.println("입력글자 : " + input);
		} catch (IOException e) {
			e.printStackTrace();								// try 블락에서 예외가 발생될 경우 자세한 정보를 출력
		} finally {												// 객체를 사용 후, 메모리 영역에서 삭제
			if (isr2 != null) {									// 리소스 해제 : isr2.close()
				try {
					isr2.close();								// IOException 발생으로 try/catch 로 묶어줘야한다.
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		// 2. 자동 리소스 해제
		// Try With Resource : try(with resource : 개체 메모리 로드) {}
		try (InputStreamReader isr1 = new InputStreamReader(System.in);) {								// InputStreamReader는 AutoCloseable 인터페이스를 구현하고 있다. & close()메소드를 가지고 있다.
			char input = (char) isr1.read();
			System.out.println("입력글자 : " + input);
		} catch (IOException e) {
			e.printStackTrace();
		}	// finally 블락을 생략하더라도 객체를 자동으로 close()
		
	}
}