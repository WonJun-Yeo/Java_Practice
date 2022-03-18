package chap12.EX06;

/* interface의 default 메소드
 * interface 내에서 구현부가 있는 메소드
 * 여기서 사용하는 default는 접근지정자가 아니다.
 * java 1.8 (8 version) 이상에서 새롭게 추가된 기능
 * 
 * 만약, 새로운 기능을 추가 시키기위해 interface에 추상메소드를 추가했을 경우
 * implement 하고 있는 모든 자식에서 오류가 나게된다. (추가된 추상메소드를 오버라이딩하지 않았기때문)
 * 이때, 추가되는 메소드를 default 메소드로 넣게되면 오류 없이 추가할 수 있다.
 */


interface A {
	void abc();												// 2005년도애 생성된 메소드라 가정, public abstract가 생략되어 있다. 구현부가 없는 추상메소드
	
	default void bcd() {									// 2020년도에 생성된 메소드라 가정, public이 생략되어 있다.
		System.out.println("A 인터페이스의 bcd() 메소드");
	}
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("B 클래스의 abc() 메소드");
	}
}

class C implements A {
	@Override
	public void abc() {
		System.out.println("C 클래스의 abc() 메소드");
	}
	
	@Override
	public void bcd() {										// default 메소드도 오버라이딩 할 수 있다.
		System.out.println("C 클래스의 bcd() 메소드");
	}
}



public class DefaultMethod {

	public static void main(String[] args) {
		// 1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		// 2. 메소드 호출
		a1.abc();
		a1.bcd();
		
		System.out.println();
		
		a2.abc();
		a2.bcd();
		

	}

}
