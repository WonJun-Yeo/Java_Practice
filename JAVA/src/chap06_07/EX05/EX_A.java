package chap06_07.EX05;

// 같은 패키지 내에서 class A에 접근

public class EX_A {

	public static void main(String[] args) {
		// A 클래스는 같은 패키지 내부에 존재하므로 import 없이 사용이 가능하다.
		
		A a = new A();					// import 없이 사용
		
		a.m = 10;						// default 접근제어자는 같은 패키지 내의 외부클래스에서 접근이 가능하다.
		// a.n = 20;					// private 접근제어자는 외부클래스에서의 접근을 막는다.
		
		a.print();						// default 접근제어자는 같은 패키지 내의 외부클래스에서 접근이 가능하다.
		
		System.out.println(a.m);
		
	}

}
