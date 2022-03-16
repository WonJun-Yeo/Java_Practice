package chap10.EX06.EX01;

/*	자식 객체를 생성할 때 부모클래스의 기본 생성자를 먼저 호출
 * 모든 자식 클래스의 생성자에는 super() 메소드가 생략되어 있다.
 * 만약, 부모클래스의 기본 생성자가 없다면 부모의 다른 생성자를 자식클래스의 생성자 맨 윗줄에 선언해주어야 한다.
 */



class A {
	A() {
		System.out.println("A class의 기본 생성자");
	}
	
	A(int a) {							// 오버로딩
		System.out.println("A class의 매개변수 정수 1개를 받는 생성자" + a);
	}
	
	A(int a, int b) {					// 오버로딩
		System.out.println("A class의 매개변수 정수 2개를 받는 생성자" + a + b);
	}
}

class B extends A {
	B() {
		System.out.println("B class의 기본 생성자");
	}
	
	B (String a) {
		super(5,3);
		System.out.println("B 클래스의 문자열 1개를 받는 생성자" + a);
	}
}

class C extends B {
	C() {
		super("C에서 호출");									// 상속관계라면, 부모의 기본생성자를 호출하는 super() 메소드가 생략되어 있다.
		System.out.println("C class의 기본 생성자");
	}
}



public class SuperMethod_02 {

	public static void main(String[] args) {
		
		C c = new C();
	}

}
