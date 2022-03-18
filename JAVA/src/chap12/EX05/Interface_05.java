package chap12.EX05;

// 인터페이스 선언은 기업 최고 프로그래머(PM)가 한다.




interface A {
	double PI = 3.14;						// public static final 이 생략
	
	void run();								// public abstract 가 생략
}

class B implements A {
	@Override
	public void run() {
		System.out.println("달립니다.");
	}
}

public class Interface_05 {

	public static void main(String[] args) {
		// 1. 객체 생성 후, 출력
		
		A a1 = new B();
		a1.run();
		
		
		// 2. 익명 객체를 이용하여 출력
		
		A a2 = new A() {
			public void run() {
				System.out.println("훨훨 납니다.");
			}
		};
		
		a2.run();
		
		

	}

}
