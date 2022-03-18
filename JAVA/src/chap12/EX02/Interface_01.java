package chap12.EX02;

/*	인터페이스(Interface) : 외부와 내부를 연결 시켜주는 접점
 * 외부전기장치 >> 콘선트 << 전기
 * 
 * 인터페이스는 객체 생성이 불가능 (구현되지 않은 메소드가 포함되어있기 때문에)	
 * 모든 필드는 반드시 public static final
 * 모든 메소드는 반드시 public abstract (java 1.8 version 까지)
 * 
 * 
 */

interface A {
	public static final int A = 3;						// 인터페이스 필드의 정식 표현
	
	public abstract void abc();							// 인터페이스 메소드의 정식 표현
}


interface B {
	int A = 3;											// 인터페이스 필드의 생략된 표현
	void abc();											// 인터페이스 메소드의 생략된 표현
}

abstract class C {										// 추상클래스일 때는 abstract를 생략할 수 없다.
	abstract void abc();
}


public class Interface_01 {

	public static void main(String[] args) {
		
		// 인터페이스는 객체 생성이 불가능 하다.
		// A a = new A();
		
		// 인터페이스 static 필드 출력
		
		System.out.println(A.A);
		System.out.println(B.A);
		
		
	}

}
