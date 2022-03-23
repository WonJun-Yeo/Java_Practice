package chap13.EX10.EX1;

class A {
	
	/* B : 인터페이스 타입, b : 참조변수, b 에 null값 할당되어 있음
	 * 	b를 할당하는 방법
	 * 1. 객체 생성 후, 값을 할당
	 * 2. 생성자를 통해서 값을 할당
	 * 3. setter를 통해서 값을 할당
	 */
	
	
	B b;
	
	A() {}												// 기본생성자
	
	A(B b) {
		this.b = b;
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	interface B {
		void play();
		void stop();
	}
	
	// play(), stop() 메소드 재정의
	void abc() {
		b.play();
		b.stop();
	}
}


public class InnerInterface_01_1 {

	public static void main(String[] args) {
		
		// 1. 객체 생성 후 매개변수 b에 값을 할당
		A a1 = new A();
		
		a1.b = (A.B) new A.B() {
			@Override
			public void play() {
				System.out.println("객체 생성 후 매개변수 b에 값을 할당, 익명 클래스 play()메소드");
			}
			@Override
			public void stop() {
				System.out.println("객체 생성 후 매개변수 b에 값을 할당, 익명 클래스 stop()메소드");
			}
		};
		
		a1.abc();
		
		System.out.println("===========================================");
		
		// 2. 생성자를 통해서 b 값을 할당 
		
		A a2 = new A(new A.B() {
			@Override
			public void play() {
				System.out.println("생성자를 통해서 b 값을 할당, 익명 클래스 play()메소드");
			}
			@Override
			public void stop() {
				System.out.println("생성자를 통해서 b 값을 할당, 익명 클래스 stop()메소드");
			}
		});
		
		a2.abc();
		
		System.out.println("===========================================");
		
		// 3. setter를 통해서 값을 할당

		A a3 =  new A();
		
		a3.setB (new A.B() {
			@Override
			public void play() {
				System.out.println("setter를 통해서 값을 할당, 익명 클래스 play()메소드");
			}
			@Override
			public void stop() {
				System.out.println("setter를 통해서 값을 할당, 익명 클래스 stop()메소드");
			}
		});
		
		a3.abc();
		
	}
}
