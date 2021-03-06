package chap06_07.EX02;

class B {
	static String name = "에스파";					// static 키가 할당되면 객체 생성없이 호춯
	
	static void print() {
		System.out.println("static이 붙은 메소드입니다.");
	}
}

//메소드 오버라이딩 : 상속에서 부모 클래스의 메소드를 재정의해서 사용
//메소드 오버로딩 : 하나의 메소드에 매개변수타입, 갯수에 따라 호춯 (Java)

public class MethodOverloading {

	public static void main(String[] args) {
		// static : 객체 생성 없이 바로 호출해서 사용가능하도록 하는 키워드, 객체이름이 아니라 클래스명으로 호출해서 사용가능
		
		System.out.println(B.name);		// 객체명이 아닌 클래스명으로 호출 
		B.print();
		
		print1();						// static 키워드가 들어가 있고 동일한 클래스에 생성된 메소드는 바로 호출이 가능하다.
		print1(1);						// 매개변수가 1개이고 정수타입의 메소드를 호출
		print1(1.1);					// 매개변수가 1개이고 실수타입의 메소드를 호출
		print1(1, 2);					// 매개변수가 2개이고 정수타입의 메소드를 호출
		
		System.out.println();		
	}
	
	
	
	// 메소드 오버라이딩 : 메스드명은 동일, 매개변수타입 & 매개변수 값 & 매개변수 갯수에 따라 호춯
	// 매개변수의 데이터 타입과 매개변수 갯수가 같으면 오류
	//JVM이 동일한 메소드명의 데이터타입이나 갯수에 따라서 해당 메소드를 작동
	
	
	public static void print1() {		// 객체명이 아닌 클래스명으로 호출
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print1(int a) {
		System.out.println("정수 : " + a);
	}

	public static void print1(double a) {
		System.out.println("double : " + a);
	}
	
	public static void print1(int a, int b) {
		System.out.println("a : " + a + ", b : " + b);
	}
	
	
}
