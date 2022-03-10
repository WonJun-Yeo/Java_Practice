package chap06_07.EX06;


/*	접근제어자
 * 접근제어자가 붙을 수 있는 키워드 : class, 필드, 메소드, 생성자 앞)
 * 반드시 접근제어자가 할당되어 있다. (생략되어 있을 경우, default)
 * 1. public : 다른 패키지에서 접근 가능 (import)
 * 2. protected : 상속구현이 되어 있을 경우, 다른 패키지에서 접근 가능 (import)
 * 3. default : 같은 패키지에서 접근 가능
 * 4. private : 같은 클래스 내부에서만 접근 가능
 */


/*	외부 클래스 : 하나의 java file에서 외부에 선언된 클래스
 * public 접근 제어자(modifier)를 사용하지 못한다. (public은 file에 하나만 존재할 수 있다.)
 * default 접근 제어자가 기본으로 적용되어 있다. (클래스의 접근제어자는 public or default)
 */


// 외부클래스
class Abc {
	
	// 필드
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	// 메소드
	public void print1() {
		System.out.println("다른 패키지에서 접근가능");
	}
	
	protected void print2() {
		System.out.println("상속구현 시, 다른 패키지에서 접근가능");
	}
	
	void print3() {
		System.out.println("같은 패키지에서 접근가능");
	}
	
	private void print4() {
		System.out.println("같은 클래스 내부에서만 접근가능");
	}
	
	// 생성자
	
	//Abc(){}					// 기본생성자 : 필드의 초기값을 부여해서 객체를 생성, 생략가능
	
}

public class EX06_All {

	public static void main(String[] args) {
		// 같은 패키지 내에서 필드 호출
		
		Abc abc1 = new Abc();					// 기본생성자 호출
		
		abc1.a = 100;							// public
		abc1.b = 200;							// protected
		abc1.c = 300;							// default
		//abc1.d = 400;							// private
		
		
		// 같은 패키지 내에서 메소드 호출
		
		abc1.print1();							// public
		abc1.print2();							// protected
		abc1.print3();							// default
		// abc1.print4();						// private
	}

}
