package chap11.EX03;

/* 	abstract 메소드 : 실행영역이 없는 메소드, 선언만 되어있는 메소드
 * 메소드의 기본형식 : 리턴타입 메소드명(매개변수){실행부}
 * 추상메소드의 기본형식 : abstract 리턴타입 메소드명(매개변수);
 * 추상메소드는 반드시 추상클래스 내에 포함되어 있어야한다.
 * 
 * 추상클래스의 기본형식 : abstract class 클래스명{추상메소드를 하나 이상 포함}
 * 추상클래스는 객체화 할 수 없다.
 * 실무에서 팀장이 구현해야할 메소드를 추상메소드로 정의해주면 팀원이 추상메소드를 오버라이딩해서 메소드를 구현한다.
 * 팀원이 임의로 메소드명을 지정하여 메소드 오버라이딩 시에 오류나는 것을 방지
 * 
 * 콘크리트 클래스 : 추상클래스를 부모클래스로 둔 자식 클래스
 * 콘크리트 클래스는 반드시 추상메소드를 오버라이딩(재정의)하여 구현부를 생성한다.
 * 
 * 추상클래스의 자식클래스가 부모클래스의 추상메소드의 일부만 오버라이딩(재정의) 한다면, 자식클래스는 추상클래스가 되어야한다.
 */

abstract class A {										// 추상클래스는 추상메소드를 하나 이상 포함해야 한다.
	abstract void print();								// 추상메소드는 추상클래스 내에 존재해야 한다.
	abstract void cry();
}

class B extends A {										// 콘크리트 클래스는 추상클래스인 부모클래스의 모든 추상메소드를 오버라이딩해야한다.

	@Override
	void print() {
		System.out.println("print 메소드 오버라이딩");
	}

	@Override
	void cry() {
		System.out.println("cry 메소드 오버라이딩");
	}										
}

abstract class C extends A {							// 추상클래스의 자식클래스가 부모클래스의 추상메소드의 일부만 오버라이딩(재정의) 한다면, 자식클래스는 추상클래스가 되어야한다.
	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}

class D extends C {
	@Override
	void cry() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractModifier_01 {						// 부모의 모든 추상메소드가 오버라이딩(재정의) 되었으므로 콘크리트 클래스가 된다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
