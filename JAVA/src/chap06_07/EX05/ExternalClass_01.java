package chap06_07.EX05;
/*	외부클래스
 * public 접근제어자 사용이 불가능 하다.
 * default 접근제어자가 생략되어 있다.
 * 다른 패키지의 클래스에서는 접근이 불가능하다.
 * 같은 패기지 내에서만 접근가능
 */

// private < default < protected < public

class B {
	private int a = 1;						// private 접근제어자 : 같은 클래스 내에서만 사용 가능
	int b = 2;								// default 접근제어자 : 같은 패키지 내의 다른 클래스에서 접근 가능
	protected int c = 3;					// protected 접근제어자 : 다른 패키지에서 상속된 경우에만 가능
	public int d = 4;						// public 접근제어자 : 다른 패키지내의 다른 클래스에서 접근 가능
	
	private void print1() {					// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {							// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {				// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {					// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}


public class ExternalClass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();						// default 접근제어자 B는 같은 패키지에 존재하므로 접근가능
		
		Bb bb = new Bb();					//public 접근 제어자는 같은 패키지내에서 접근이 가능
		
		
		// 같은 패키지의 다른 클래스에서 접근
		
		// 필드접근
		
		// bb.a = 10;						// a의 접근제어자는 private이므로 선언된 클래스 내부에서만 사용이 가능하다.
		bb.b = 20;							// b의 접근제어자는 default이므로 같은 패키지의 다른 클래스에서 사용이 가능
		bb.c = 30;							// c의 접근제어자는 protected이므로 default를 포함하므로 같은 패키지의 다른 클래스에서 사용이 가능, 다른 패키지에서 사용하려면 상속관계일 때만 가능하다.
		bb.d = 40;							// d의 접근제어자는 public이므로 다른 패키지의 다른 클래스에서도 import를 이용해 사용이 가능하다.
		
		// 메소드 접근
		
		// bb.print1();						// print1()의 접근제어자는 private이므로 선언된 클래스 내부에서만 사용이 가능하다.
		bb.print2();						// print2()의 접근제어자는 default이므로 같은 패키지의 다른 클래스에서 사용이 가능
		bb.print3();						// print3()의 접근제어자는 protected이므로 default를 포함하므로 같은 패키지의 다른 클래스에서 사용이 가능, 다른 패키지에서 사용하려면 상속관계일 때만 가능하다.
		bb.print4();						// print4()의 접근제어자는 public이므로 다른 패키지의 다른 클래스에서도 import를 이용해 사용이 가능하다.
		
	
		
	}

}
