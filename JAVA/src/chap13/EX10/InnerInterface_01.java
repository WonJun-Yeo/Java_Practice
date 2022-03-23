package chap13.EX10;

/*	이너인터페이스 (InnerInterface)
 * 클래스 내부의 인터페이스
 * 외부클래스가 간단하게 사용할 목적으로 선언
 * 이너인터페이스에는 static 키워드가 필수, 생략 시 컴파일러에 의해서 자동으로 생성된다.
 * implements 시 static 키워드 주의
 */

class A {
	interface B {											// static 이 생략
		void bcd();											// public abstract 가 생략
	}
}


// 이너인터페이스를 구현한 클래스
class C implements A.B {									// A.B : A 클래스의 이너인터페이스 B    *** A,B : A 인터페이스, B 인터페이스
	@Override
	public void bcd() {
		System.out.println("이너인터페이스를 구현한 C 클래스");
		
	}
}




public class InnerInterface_01 {

	public static void main(String[] args) {
		// 1. 자식 객체를 직접 생성 후, 출력 (자식 클래스가 존재하는 경우)
		A.B ab = new C();			// 부모 타입으로 업캐스팅 후, 오버라이딩을 통해 출려
		ab.bcd();
		
		System.out.println();
		
		C c = new C();				// 자식타입으로 직접 출력
		c.bcd();
		
		
		System.out.println("===================================");
		
		// 2. 익명 이너클래스로 출력 (자식 클래스가 없는 경우)
		
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("익명 이너클래스로 객체 생성 후, 출력");
			};
		};
		
		b.bcd();
		
	}

}
