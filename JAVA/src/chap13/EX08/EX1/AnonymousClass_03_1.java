package chap13.EX08.EX1;

/*3. 메소드의 매개변수로 전달하는 방법
 *
 *1. 객체 생성 후, 매개변수로 전달 (클래스명O, 참조변수O)
 *2. 객체 생성 후, 매개변수로 전달 (클래스명O, 참조변수X)
 *
 */
interface A {																// 인터페이스 : 추상메소드를 정의
	void cry();																// 추상메소드, public abstract 가 생략되어 있다
	public abstract void fly();
}

class B implements A {														// B는 A 인터페이스를 구현한 클래스
	@Override
	public void cry() {System.out.println("멍멍 : 매개변수 전달후, 출력");}
	
	@Override
	public void fly() {System.out.println("날지못합니다 : 매개변수 전달 후, 출력");}
}

class C {																	// C 객체의 abc() 메소드 호출 시, A타입의 객체를 매개변수로 받는다.
	void abc(A a) {															// 매개변수로 하위 자식클래스가 들어올 경우, A타입으로 자동 업캐스팅이 일어난다.
		a.cry();
		a.fly();
	}
}


public class AnonymousClass_03_1 {

	public static void main(String[] args) {
		C c = new C();
		
		// 1. 클래스가 존재O + 참조변수O
		A a = new B();														// B를 객체화해서 A타입으로 생성, a를 참조변수로 활용
		
		c.abc(a);
		
		System.out.println("===================");
		
		// 2. 클래스가 존재O + 참조변수X
		c.abc(new B());
	}

}
