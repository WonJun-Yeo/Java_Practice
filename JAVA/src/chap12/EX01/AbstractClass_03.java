package chap12.EX01;
/*추상메소드를 한 개 이상 포함한 추상 클래스
 * 자식 클래스에서 반드시 오류없이 메소드를 오버라이딩(재정의)하는 것을 보장받을 수 있다.
 * 추상클래스는 객체화 할 수 없다.
 */

abstract class D {												
	abstract void print();										// 구현부가 없는 추상메소드
}


class E extends D {												// 추상클래스의 자식클래스는 반드시 메소드를 오버라이딩 하여야 한다.
	@Override
	void print() {
		System.out.println("E클래스의 print()메소드");
	}
}


public class AbstractClass_03 {

	public static void main(String[] args) {
		// 1. 객체화 해서 출력 (객체 3개 생성 후, print() 메소드 출력)
		
		D d1 = new E();
		D d2 = new E();
		D d3 = new E();
		
		d1.print();
		d2.print();
		d3.print();
		
		System.out.println("===========================================");
		
		// 2. 익명 클래스를 생성 해서 출력 (print()메소드 3번 출력)
		
		D d4 = new D() {
			void print() {
				System.out.println("익명클래스로 pinrt() 메소드 출력 1");
			}
		};
		
		D d5 = new D() {
			void print() {
				System.out.println("익명클래스로 pinrt() 메소드 출력 2");
			}
		};
		
		D d6 = new D() {
			void print() {
				System.out.println("익명클래스로 pinrt() 메소드 출력 3");
			}
		};
		
		d4.print();
		d5.print();
		d6.print();

	}

}
