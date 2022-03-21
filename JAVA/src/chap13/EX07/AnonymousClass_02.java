package chap13.EX07;

// 익명 이너클래스를 사용하여 인터페이스 객체 생성


class A {
	C c = new C() {										// 익명 이너클래스
		@Override
		public void bcd() {
			System.out.println("익명 이너클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
}


interface C {											// 인터페이스, 추상메소드 정의
	public abstract void bcd();
}





public class AnonymousClass_02 {

	public static void main(String[] args) {
		A a = new A();
		
		a.abc();

	}

}
