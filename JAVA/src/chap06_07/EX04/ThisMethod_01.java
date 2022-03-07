package chap06_07.EX04;

/* 1. this가 키워드로 사용되는 경우 : this.필드명(or 메소드명)
 * 2. this가 메소드로 사용되는 경우 : this();
 * 		생성자 내에서 다른 생성자를 호출할 때 사용한다. (메소드 내에서는 사용할 수 없다.)
 * 		반드시 생성자 내부의 첫 줄에 와야한다.
 */

class Abc {
	Abc(){									// 기본 생성자
		System.out.println("첫 번째 생성자 입니다.");
	}
	
	Abc(int a) {
		this();								// 매개변수가 없는 기본 생성자를 호출, this(); : 생성자의 첫 줄에 와야한다.
		System.out.println("두 번째 생성자 입니다.");
	}
	
	Abc(int a, String b) {
		this(1);							// 매개변수가 있는 생성자를 호출, this(); : 생성자의 첫 줄에 와야한다.
		System.out.println("세 번째 생성자 입니다.");
	}
	
	
	void abc() {
		// this();							// 메소드 내에서는 this(); 를 사용할 수 없다.
	}
}

public class ThisMethod_01 {
	public static void main(String[] args) {
		// 객체 생성
		
		Abc abc = new Abc();
		System.out.println("=================");
		
		Abc abc1 = new Abc(1);
		System.out.println("=================");
		
		Abc abc2 = new Abc(1, "a");
	}
}
