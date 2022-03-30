package chap16.EX09;

/* Generic 메소드의 범위 지정
 * 
 */

class A {															// 일반클래스
	// Number : Boolean, Character 를 제외한 6개의 타입(Byte, Short, Integer, Long, Float, Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue());							// intValue() : Number 타입의 메소드, 정수값으로 출력
	}
}


interface MyInterface {
	void print();													// 구현부가 생략된 추상메소드, 인터페이스 내에서는 public abstract 가 생략되어 있음
}


class B {															// **Generic 타입 내부에서 인터페이스를 적용 할 때는 extends를 사용한다.
	public <T extends MyInterface> void method2 (T t) {				// T 타입에 올수 있는 것은 MyInterface를 구현한 클래스이다.
		t.print();
	}
}

class C implements MyInterface {									// interface를 구현한 클래스
	@Override
	public void print() {											// interface 내의 메소드는 public abstract가 생략되어 있어 overriding할 때 유의해야 한다.
		System.out.println("interface를 구현한 클래스에서 출력");
	}
}

class D {
	public <T extends String> void abc(T t) {
		System.out.println(t);										// String 타입에서 toString()메소드는 재정의되어 있어 값이 출력된다.
		System.out.println(t.toString());
	}
}


public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();												// 일반클래스 객체 생성 후, Generic 메소드 호출
		a.<Double> method1(5.8);
		a.method1(22.5);											// 매개변수의 값이 타입을 식별할 수 있으면 <> 생략가능
		
		a.<Long> method1(1000000L);
		a.method1(100L);
		
		a.<Float> method1(100F);
		a.method1(1000F);
		
		// a.<Boolean> method1(true);								// Boolean과 Character는 Number 타입이 아니다.
		
		B b = new B();												// 일반클래스 객체 생성 후, Generic 메소드 호출
		
		// 인터페이스를 구현한 내부 익명 클래스
		b.<MyInterface> method2 (new MyInterface() {				// Method2에 매개변수로 올 수 있는 것은 MyInterface를 구현한 자식클래스
			@Override
			public void print() {									// print() 메소드 구현
				System.out.println("익명클래스로 출력");
			}
		});
		
		// 익명클래스로 Generic 메소드 호출 후, 매개변수로 던져주기
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명으로 처리된 클래스로 출력");
			}
		});
		
		// 인터페이스를 구현한 자식 클래스 (콘크리트 클래스)
		b.<MyInterface> method2(new C());							// MyInterface 타입 & MyInterface를 구현한 C생성자
		
		
		D d = new D();
		d.<String> abc("안녕");
		d.abc("하세요");
		
		
		
	}
	
}
