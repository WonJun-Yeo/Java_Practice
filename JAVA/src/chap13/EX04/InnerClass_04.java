package chap13.EX04;

/*	지역 이너클래스
 * 클레스의 메소드 내부에 선언된 클래스
 * 지역이너클래스는 static 지정이 불가능하다.
 * 메소드 내부의 지역변수는 지역이너클래스에서 사용되는 경우, 자동으로 final 키가 컴파일러에 의해서 자동으로 할당
 */

class A {
	int a = 3;															// 인스턴스필드, 메모리의 heap 공간에 저장된다. 반드시 초기값이 할당되야한다. 선언만 할 시, default값 할당(강제초기화)
	// a = 4;															// 필드의 초기값을 할당 후, 재할당하려면 객체화하여 수정해야 한다.
																		// 생성자나 setter를 통해 초기값을 할당 후에 객체를 생성할 수 있다.
	A (int a) {															// 생성자를 통해서 a의 초기값 할당
		this.a = a;
	}
	public void setA(int a) {											// setter를 통헤서 필드의 값을 초기화
		this.a = a;
	}
	
	
	void ccc() {
		int a =3;														// 지역변수, 메모리의 stack 공간에 저장된다.
		a = 4;
		a = 10;
		int b;
		
		System.out.println(a);
		// System.out.println(b);										// stack 영역의 지역변수는 강제초기화가 되지 않기 때문에 값이 할당되지 않으면 오류가 발생한다.
	}
	
	
	
	
	
	void abc() {
		int b = 5;														// 지역변수 : 메소드 내부에 선언된 변수, 지역클래스에서 사용되는 경우에 final 키가 생략되어있다.
		// b = 10;														// final키가 붙으면 메소드가 끝났을 때, stack영역에서 사라지는 것이아니라 값이 복사되어 클래스영역의 지역이내클러스 내부에 저장되게 된다. 
		int c = 10;
		c = 20;
		
		class B {
			void bcd() {
				System.out.println(a);									// 필드 a
				System.out.println(b);									// 지역변수 b
				a = 5;
				// b = 7;												// 지역변수는 지역이너클래스에서 사용시, 자동으로 final 키가 컴파일러에 의해서 자동으로 할당된다. 즉, 재할당이 불가능 하다.
				
			}
		}
		B bb = new B();
		bb.bcd();
	}
}










public class InnerClass_04 {
	public static void main(String[] args) {
		// 1. 객체를 생성 후 메소드 호출
		
		A a = new A(1);
		a.abc();
		
		
		

	}
}
