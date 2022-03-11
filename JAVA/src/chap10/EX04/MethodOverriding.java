package chap10.EX04;

/*	메소드 오버라이딩(method overriding)
 * 1. 반드시 상속관계에서만 메소드 오버라이딩이 구현된다.
 * 2. 부모클래스에서 선언된 메소드를 새롭게 정의해서 사용하는 것 (덮어쓰기 개념)
 * 3. 메소드 오버라이딩 시, 시그니쳐가 같아야한다. (메소드명, 매개변수 타입, 매개변수 갯수)
 * 4. 메소드의 접근제어자의 범위가 넓거나 같아야 한다.
 * 5. @Overrinde 라는 어노테이션을 사용하면 메소드 재정의시, 오류를 줄일 수 있다.
 * 6. @Override 어노테이션을 사용하지 않을 경우, 오타가 나거나 형식에 맞지 않을 경우에 별개의 메소드로 정의된다.
 */

class A {
	void print() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	@Override					// 메소드 오버라이딩시, 반드시 부모의 메소드를 재정의 하도록 설정 (설정하지 않으면 오류)
	void print() {
		System.out.println("B 클래스");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		// 1. A 타입
		A aa = new A();
		aa.print();				// A클래스의 print() 출력
		
		// 2. B 타입
		B bb = new B();
		bb.print();				// B클래스의 print() 출력
		
		/* 3. B타입을 A타입으로 업캐스팅
		 * B타입 내에 포함된 A타입의 print()메소드를 B타입의 print()메소드가 덮어쓰기 된다.
		 */
		A ab = new B();
		ab.print();				// A클래스의 print() 출력, 하지만 B 클래스에서 print() 메소드가 오버라이딩되었기 떄문에 B 클래스의 print()로 연결되어 B 클래스의 print()가 출력된다. (동적바인딩)

	}

}
