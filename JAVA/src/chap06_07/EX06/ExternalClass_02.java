package chap06_07.EX06;

import chap06_07.EX05.Bb;							// 다른 패키지의 public 클래스에 접근하기 위해서는 import 해주어야 한다.

// import chap06_07.EX05.B; 						// class B는 클래스 접근제어자가 default이기 때문에 import를 하더라도 다른 패키지에서 접근불가

public class ExternalClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// B b = new b()							// class B는 클래스 접근제어자가 default이기 때문에 다른 패키지에서 접근불가
		
		/* 다른 package의 class에서 Bb class를 접근하는 경우
		 *  1. import를 먼저 사용
		 *  2. Bb class의 class 접근 제어자는 public
		 *  3. 필드, method의 접근 제한자에 따라서 접근이 가능할 수도 불가능할 수도 있다.
		 */
		
		Bb bb = new Bb();							// class Bb는 클래스 접근제어자가 public이기 때문에 import 하여 다른 패키지에서 접근가능
		
		// 필드접근
		
		// bb.a = 10;								// a의 접근제어자는 private이므로 선언된 클래스 내부에서만 사용이 가능하다.
		// bb.b = 20;								// b의 접근제어자는 default이므로 같은 패키지의 다른 클래스에서 사용이 가능
		// bb.c = 30;								// c의 접근제어자는 protected이므로 default를 포함하므로 같은 패키지의 다른 클래스에서 사용이 가능, 다른 패키지에서 사용하려면 상속관계일 때만 가능하다.
		bb.d = 40;									// d의 접근제어자는 public이므로 다른 패키지의 다른 클래스에서도 import를 이용해 사용이 가능하다.
		
		// 메소드 접근
		
		// bb.print1();								// print1()의 접근제어자는 private이므로 선언된 클래스 내부에서만 사용이 가능하다.
		// bb.print2();								// print2()의 접근제어자는 default이므로 같은 패키지의 다른 클래스에서 사용이 가능
		// bb.print3();								// print3()의 접근제어자는 protected이므로 default를 포함하므로 같은 패키지의 다른 클래스에서 사용이 가능, 다른 패키지에서 사용하려면 상속관계일 때만 가능하다.
		bb.print4();								// print4()의 접근제어자는 public이므로 다른 패키지의 다른 클래스에서도 import를 이용해 사용이 가능하다.
}

}
