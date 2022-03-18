package chap12.EX01;

/* Heap 영역에 저장되는 필드는 값을 할당하지 않으면 초기값(default 값)이 할당된다.
 * 필드는 Heap에 필드명과 값이 저장
 * 인스턴스 메소드는 클래스 영역의 인스턴스영역에 메소드 구현코드가 저장되고, Heap 영역에는 포인터(주소값)의 정보를 저장한다.
 */

class AA {											// 일반클래스 : 객체 생성 시, 필드와 메소드는 Heap 메모리 영역에 저장 
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	boolean g;
	char h;											// char 의 기본값은 공백(" ")이다.
	String i;
	
	void cry() {}									// 완전한 메소드
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a + " ," + b + " ," + b + " ," + d + " ," + e + " ," + f + " ," + g + " ," + h + " ," + i;
	}
}

/*	추상클래스를 객체화 하는 방법
 * 1. 상속을 통해 자식 클래스를 생성 후, 자식클래스에서 추상메소드를 모두 정의하고 자식클래스를 객체로 생성 후 출력
 * 		많은 객체를 생성해서 사용해야 하는 경우에 사용
 * 2. 자식클래스 생성 없이, main 메서드영역에서 익명 객체를 생성해서 출력
 * 		일회성으로 사용해야 하는 경우에 자식객체를 생성할 필요없이 임시로 사용
 */


abstract class A {									// 추상클래스 : 추상메소드(미완성메소드)를 포함하므로 객체 생성이 불가능하다.
	abstract void abc();							// 추상메소드 : 구현부가 없는 미완성 메소드
}

class B extends A {									// 콘크리트클래스 : 추상 클래스를 구현한 객체
	@Override
	void abc() {
		System.out.println("방법 1번");
		
	}
}



public class AbstractClass_01 {

	public static void main(String[] args) {
		// 1. AA 클래스는 객체화가 가능하다.
		AA aa = new AA();							// 객체화 시, 핃드값 & 일반메소드 저장
		System.out.println(aa);
		
		// 2. A a = new A();							// 객체 생성 불가, 추상메소드를 포함하고 잇는 추상클래스이기 때문
		
		// 3. 추상 클래스가 구련된 자식 클래스 생성, 객체를 여러개 생성할 때 사용
		A a1 = new B();
		A a2 = new B();
		A a3 = new B();
		
		a1.abc();									// A의 abc() 호출하면 오버라이딩에의해 B의 abc()	
		a2.abc();
		a3.abc();
		
		
	}
}
