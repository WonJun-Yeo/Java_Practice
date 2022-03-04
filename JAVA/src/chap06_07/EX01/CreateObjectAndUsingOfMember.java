package chap06_07.EX01;

// 클래스(class) : 객체를 생성하기위한 틀(like. 템플릿,설계도, 붕어빵틀)
// 객체(Object) = 인스턴스 : class를 복사해서 RAM(메모리)에서 작동되는 실행코드 (like. 집, 붕어빵)
// 메인 메소드에서 객체를 객체화 (= 인스턴스화) 시킨다
// A a = new A() : 클래스를 객체화 시켜서 메모리에 로드

class A {										// 외부 클래스
	int m = 3;									// m : 필드 : 클래스 블락에서 선언된 변수
												// 필드는 객체화(인스턴스화) 시켜야 사용이 가능
												// 필드는 메모리의 Heep 영역에 생성
	
	void print() {								// 메소드 : 절차지향언어의 함수가 객체지향언어에서는 메소드
		System.out.println("객체 생성 및 활용");	// void : 리턴타입, pint() : 메소드명
	}
}

class B {										// 외부 클래스
	
	String name = "홍길동";
	int age = 24;
	String phone = "010-1234-5678";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}


public class CreateObjectAndUsingOfMember {				// 하나의 Java 파일에는 오직 하나의 public class를 포함할 수 있다.

	public static void main(String[] args) {

		A a = new A();				// class A를 객체화(인스턴스화) 시켜서 a라는 객체를 생성한다. (RAM에 로드시킨다.)
		System.out.println(a.m);
		a.print();	
		System.out.println();
		
		A b = new A();				// class A를 객체화(인스턴스화) 시켜서 a라는 객체를 생성한다. (RAM에 로드시킨다.)
		System.out.println(b.m);
		b.print();	
		System.out.println();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("=======================");
		
		B bb = new B();				// class B를 객체화(인스턴스화) 시켜서 bb라는 객체를 생성한다. (RAM에 로드시킨다.)
		bb.printAge();				// bb객체의 printAge메소드를 호출
		bb.printName();				// bb객체의 printName메소드를 호출
		bb.printPhone();			// bb객체의 printPhone메소드를 호출
		System.out.println();
		
		B cc = new B();
		cc.printAge();				// bb객체의 printAge메소드를 호출
		cc.printName();				// bb객체의 printName메소드를 호출
		cc.printPhone();			// bb객체의 printPhone메소드를 호출
		
	}

}
