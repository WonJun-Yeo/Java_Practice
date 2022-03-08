package chap06_07.EX06;

import chap06_07.EX05.A;

public class EX_A {
	// 다른 패키지에 존재하는 class에 접근하는 방법

	public static void main(String[] args) {
		// 1. 클래스의 Full name(패키지명.클래스명) 사용
		chap06_07.EX05.A a = new chap06_07.EX05.A();
		
		// a.m과 a.print() 는 접근제어자가 default기 때문에 다른 패키지에서 접근할 수 없다.
		
		a.k = 50;
		a.print2();				// public 접근 제어자는 다른 패키지의 클래스에서도 접근할 수 있다.
		
		
		// 2. import를 사용
		A aa = new A();			// import 후 사용
		
		aa.k = 50;
		aa.print2();
		
	}

}
