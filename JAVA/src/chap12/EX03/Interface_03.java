package chap12.EX03;

/* interface 는 다중 상속 (구현)이 가능하다.
 * class 는 다중 상속이 불가능하다.
 * class와 interface를 한번에 상속할 수 있다.
 */

interface A {
	
}

interface B {
	
}


// 1. 단일 interface 상속
class C implements A {
	
}

// 2. 다중 interface 상속
class D implements A, B {
	
}

// 3. 클래스와 인터페이스를 한번에 상속
class E extends C implements A, B {
	
}

public class Interface_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
