package chap12.EX04;

/*	인터페이스 상속시 자식 클래스 접근 지정자 오류 <중요>
 * 인터페이스의 메소드를 구현할 때는 반드시 public 접근지정자를 붙여줘야한다.
 * 		자식의 접근지정자는 상속받을 때, 그 범위가 부모보다 넓거나 같아야한다.
 * 		인터페이스의 메소드는 모두 public이기 때문에 범위가 넓거나 같은 것은 public 뿐이다.
 */

interface A {
	public abstract void abc();
}

interface B {
	void abc();					// public abstract가 생략된 상태
}


class C implements A {
	@Override					// A 인터페이스의 abc() 메소드를 오버라이딩해서 구현
	public void abc() {			// 자식의 접근지정자는 상속받을 때, 그 범위가 부모보다 넓거나 같아야한다.
		
	}
}

class D implements B {
	@Override
	public void abc() {
		
	}
}

class E implements B {
	@Override
	public void abc() {
		
	}
}
/* implements 를 하면 미완성된 메소드를 무조건 완성시켜주어야한다. 아닐경우 에러발생
class F implements A {

}
*/



public class Interface_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
