package chap11.EX01;

/*	Final : 마지막
 *  - 필드명, 지역변수명 앞에 붙을 경우, 상수를 뜻함(상수는 초기값을 할당 후, 변경할 수 없다. <-> 변수) : final double PI = 3.14
 *  - 메소드명 앞에 붙을 경우, 오바라이딩이 불가능함을 뜻함(부모클래스의 메소드를 자식클래스에서 오버라이딩이 불가능) : final void print(){}
 *  - 클래스명 앞에 붙을 경우, 상속이 불가능함을 뜻함(자식클래스를 두지 않는 마지막 클래스가 됨을 뜻한다.) : final class A {}
 */

class A1 {
	int a = 3;							// 필드명, 지역변수명은 소문자를 사용, 여러문자가 이어질 경우 첫자를 대문자
	final int B = 5;					// 상수명은 대문자를 사용
	
	A1(){}
	
}

class A2 {
	int a;								// 필드명, 지역변수명은 소문자를 사용, 여러문자가 이어질 경우 첫자를 대문자
	final int B;						// 상수명은 대문자를 사용
	
	A2(){
		a = 3;
		B = 5;
	}
}

class A3 {
	int a = 3;							// 필드명, 지역변수명은 소문자를 사용, 여러문자가 이어질 경우 첫자를 대문자
	final int B = 5;					// 상수명은 대문자를 사용
	
	A3(){
		a = 6;
		// B = 10;						// final 은 상수를 뜻하기 때문에 초기값이 할당된 후, 값을 변경할 수 없다.
	}
}


class B {
	void bcd() {						// 지역변수(메소드 내에서 선언된 변수)는 메소드 호출이 끝나면 사라진다.
		int a =3;						// 메모리의 stack 영역에 값이 저장된다.
		final int B = 5;				// 클래스 영역의 상수영역에 복사가되어서 메소드가 끝나더라도 상수영역에 남아있다.
		a = 7;
		// B = 9;						// final 은 상수를 뜻하기 때문에 초기값이 할당된 후, 값을 변경할 수 없다.
	}
	
}


public class FinalModifier_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
