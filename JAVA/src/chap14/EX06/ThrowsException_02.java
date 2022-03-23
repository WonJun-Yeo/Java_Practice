package chap14.EX06;

/* 	일반예외 (checked exception) : 컴파일 단계에서 예외가 발생
 * 1. 직접처리
 * 2. throws 로 예외전가
 * 
 * main 메소드가 throws를 이용해 전가 시키는 경우, 정보를 출력하고 중지된다. 
 * 
 */




public class ThrowsException_02 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 파일이 존재, 예외 발생없이 정상적으로 작동
		Class cls = Class.forName("java.lang.Object");
		
		// 파일이 존재X, ClassNotFoundException 예외 발생
		Class cls2 = Class.forName("java.lang.Object123");

	}

}
