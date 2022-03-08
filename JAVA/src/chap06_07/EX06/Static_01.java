package chap06_07.EX06;

class Aaa {
	int m = 3;					// 인스턴스필드 : static이 붙지 않은 필드, 객체 생성 후에 사용가능 
	static int n = 4;			// 스태틱 필드 :  static이 붙은 필드, 객체 생성없이 클래스명으로 사용가능, 객체 생성 후에도 사용가능, 모든 객체가 공유하는 변수
	
	void print1() {				// 인스턴스메소드 : static이 붙지 않은 메소드, 객체 생성 후에 사용가능
		System.out.println("인스턴스필드를 사용하는 인스턴스메소드 풀력 : m : " + m + ", n : " + n);			// 인스턴스메소드 내에는 인스턴스필드와 스태틱필드 모두 올 수 있다.
	}
	
	static void print2() {		// 스태틱메소드 : static이 붙은 메소드, 객체 생성없이 클래스명으로 사용가능, 객체 생성 후에도 사용가능
		System.out.println("스태틱필드를 사용하는 스태틱메소드 출력 : " + "n : " + n);			// 스태틱메소드 내에는 인스턴스필드가 올 수 없다.
	}
}

public class Static_01 {

	public static void main(String[] args) {
		// 1. 객체 생성후 필드와 메소드 호출 (인스턴스필드, 스태틱필드, 인스턴스메소드, 스태틱메소드)
		Aaa aaa = new Aaa();
		
		aaa.m = 10;				// 인스턴스필드 호출
		aaa.n = 20;				// 스태틱필드 호출
		
		aaa.print1();			// 인스턴스메소드 호출
		aaa.print2();			// 스태틱메소드 호출
		
		System.out.println("==================");
		
		
		// 2. 객체 생성없이 필드와 메소드 호출 (스태틱필드, 스태틱메소드)
		
		Aaa.n = 100;
		Aaa.print2();
		System.out.println("==================");
		
		
		// 스태틱은 모든 객체가 공유한다.
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);
		
		ccc.n = 300;
		System.out.println();
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
	}

}
