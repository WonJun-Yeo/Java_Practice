package chap11.EX02;

/*	final method와 final class의 특징
 *  - final method : 오버라이딩이 불가능, 중요한 메소드는 자식에서 재정의 하지 못하도록 설정한다.
 *  - final class : 상속이 불가능
 */

class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	void abc() {};							// 메소드 오버라이딩
	// final void bcd() {}					// 메소드 오버라이딩이 불가능
}

final class C {
	
}

/*
class D extends C{							// final class C 는 상속할 수 없다.
	
}
*/

public class FinalModifier_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
