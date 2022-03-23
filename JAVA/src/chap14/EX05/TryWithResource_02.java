package chap14.EX05;

/*	직접 생성한 객체에서 AutoCloseable 사용
 * try (with Resource)
 * try(객체생성) {} catch () {} finally {} : finally는 생략가능하며, 자동으로 close 된다.
 * 1. 객체는 AutoCloseable 인터페이스의 close() 메소드를 오버라이딩 해야한다.
 * 		java.lang.AutoCloseable : java.lang에 있는 class는 import하지 않아도 된다.
 * 		java.lang.Object : 모든 클래스의 최상위 부모, java.lang에 있으므로 역시 import하지 않아도 된다.
 * 
 * 	예외처리방법 2가지
 * 1. try/catch를 사용해서 예외처리 : 자신이 직접 예외를 처리
 * 2. throws 를 통해서 예외를 처리 : 예외를 자신이 처리하는 것이아닌, 호출하는 곳에서 예외를 처리 (메소드 예외 전가)
 * 		** [s의 유무에 따라] throw : 예외를 강제로 발생
 */

class A implements AutoCloseable {
	String resource;												// default 값으로 null 값 할당
	
	A (String resource) {											// 객체 생성 시, resource에 값 재할당
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {							// close() 메소드가 자동으로 호출된다.
		// AutoCloseable 인터페이스의 close() 메소드를 오버라이딩
		System.out.println(resource);
		if (resource != null) {
			resource = null;
			System.out.println("리소스가 해제 되었습니다.");
			System.out.println(resource);
		}
	}
}






public class TryWithResource_02 {

	public static void main(String[] args) {
		// 1. 자동 리소스 해제
		try(A a1 = new A ("특정 파일");) {
			
		} catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
		}																// finally가 생략되어있지만, 자동으로 객체의 close() 메소드를 호출한다.
		
		
		System.out.println("====================================");
		
		// 2. 수동 리소스 해제
		
		A a2 = null;
		
		try {
			a2 = new A("생성자 초기값 할당");
		} catch(Exception e) {
			
		} finally {
			if (a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
