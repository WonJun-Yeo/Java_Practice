package chap06_07.EX03;


// 셍성자 오버로딩 : 하나의 생성자명에 데이터타입, 갯수에 따라 다른 생성자가 호출된다.
// 주의) 데이터타입과 갯수 모두 같으면 오류가 난다.

class Abc {
	int a, b, c;
	String d;
	
	Abc(){		// 기본생성자
		System.out.println(a + ", " + b + ", " + c + ", " + d);
		System.out.println();
	}
	
	Abc(String d) {		// 매개변수가 하나인 생성자, 데이터 타입이 String
		this.d = d;
		System.out.println(d);
		System.out.println();
	}
	
	Abc(int a) {		// 매개변수가 하나인 생성자, 데이터 타입이 int
		this.a = a;
		System.out.println(a);
		System.out.println();
	}
	
	Abc(int a, int b) {		// 매개변수가 두 개인 생성자
		this.a = a;
		this.b = b;
		System.out.println(a + ", " + b);
		System.out.println();
	}
	
	Abc(int a, int b, int c) {		// 매개변수가 세 개인 생성자
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a + ", " + b + ", " + c);
	}
	
}




public class ConstructorOverloading {

	public static void main(String[] args) {
		Abc abc = new Abc();
		Abc abc0 = new Abc("현대자동차");
		Abc abc1 = new Abc(1);
		Abc abc2 = new Abc(1,2);
		Abc abc3 = new Abc(1,2,3);
	}
}
