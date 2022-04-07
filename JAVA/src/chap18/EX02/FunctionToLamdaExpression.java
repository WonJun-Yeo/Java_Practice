package chap18.EX02;

// 람다식 문법
// 생략할 수 있는 한 최대로 생략하여 사용

// 아래 4개의 인터페이스는 람다식으로 처리가 가능하다. 함수형 인터페이스이기 때문

@FunctionalInterface
interface A {								// 입력X, 리턴X, 
	void method1();
}

@FunctionalInterface
interface B {								// 입력 1개, 리턴X,
	void method2(int a);
}

@FunctionalInterface
interface C {								// 입력X, 리턴 int
	int method3();
}

@FunctionalInterface
interface D {								// 입력 2개, 리턴 double
	double method4(int a, int b);
}



public class FunctionToLamdaExpression {

	public static void main(String[] args) {
		// 인터페이스의 함수를 구현
		
		// 1. 입력x, 리턴x
			// 익명 이너클래스로 처리
			A a1 = new A() {
				@Override
				public void method1() {
					System.out.println("메소드1 익명이너클래스");
				};
			};
			// 람다식으로 처리
			A a2 = () -> {System.out.println("메소드1 람다식 전체");};			// 람다식 전체
			A a3 = () -> System.out.println("메소드1 람다식 중괄호 생략");			// 구현부 코드가 한 줄 일때, 구현부 중괄호 생략 가능
			
			
			a1.method1();
			a2.method1();
			a3.method1();
			
			System.out.println("===============================================");
			
		// 2. 입력 1개, 리턴X
			// 익명 이너클래스로 처리
			B b1 = new B() {
				@Override
				public void method2(int a) {
					System.out.println("메소드2 익명이너클래스");
				}
			};
			
			// 람다식으로 처리
			B b2 = (int a) -> {System.out.println("메소드2 람다식전체");};					// 람다식 전체
			B b3 = (int a) -> System.out.println("메소드2 람다식 중괄호 생략");				// 구현부 코드가 한 줄 일때, 구현부 중괄호 생략 가능
			B b4 = (a) -> System.out.println("메소드2 람다식 입력매개변수 타입 생략");			// 입력매개변수의 타입은 생략가능, 인터페이스에서 선언해놨기 때문
			B b5 = a -> System.out.println("메소드2 람다식 입력매개변수 소괄호 생략");			// 입력매개변수가 하나일때 소괄호 생략가능
			
			
			b1.method2(1);
			b2.method2(1);
			b3.method2(1);
			b4.method2(1);
			b5.method2(1);
			
			System.out.println("===============================================");
			
		// 3. 입력X, 리턴 int
			// 익명 이너클래스로 처리
			C c1 = new C() {
				public int method3() {
					return 4;
				};
			};
			
			// 람다식으로 처리
			C c2 = () -> {return 5;};					// 람다식 전체
			C c3 = () -> 6;								// return이 한 라인으로 적용된 경우, return 생략 가능, 반드시 중괄호와 함께 생략
			
			
			
			System.out.println("메소드3 익명이너클래스" + c1.method3());
			System.out.println("메소드3 람다식전체" + c2.method3());
			System.out.println("메소드3 람다식 리턴, 중괄호 생략" + c3.method3());
			
			System.out.println("===============================================");
		
		// 4. 입력 2개, 리턴 double
			// 익명 이너클래스로 처리
			D d1 = new D() {
				public double method4(int a, int b) {
					return a + b;
				};
			};
			
			// 람다식으로 처리
			D d2 = (int a, int b) -> {return a + b;};	// 람다식 전체
			D d3 = (a, b) -> {return a + b;};			// 입력매개변수의 타입은 생략가능, 인터페이스에서 선언해놨기 때문
			D d4 = (a, b) -> a + b;						// return이 한 라인으로 적용된 경우, return 생략 가능, 반드시 중괄호와 함께 생략
			
			
			System.out.println("메소드4 익명이너클래스" + d1.method4(1,2));
			System.out.println("메소드4 람다식전체" + d2.method4(3,4));
			System.out.println("메소드4 람다식 입력매개변수 타입 생략" + d3.method4(5,6));
			System.out.println("메소드4 람다식 리턴, 중괄호 생략" + d4.method4(7,8));
			
			
			
			
	}

}
