package chap10.EX07.EX02;

/*	== 
 * 기본 타입일 경우, 값을 비교해서 논리갑(true, false)으로 반환
 * 참조 타입일 경우, 객체의 번지를 비교
 */

/*	equals()
 * 객체의 번지를 비교
 */


class A {
	String name;
	
	A (String name) {
		this.name = name;
	}
}

class B {
	String name;
	
	B (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {							// 매견변수를 넣으면 Object 타입으로 자동 업캐스팅
		if (this.name == ((B) obj).name) {						// B타입으로 다운 캐스팅후, 객체의 name 필드 값을 비교
			return true;
		}  else {
			return false;
		}
	}
}


public class ObjectMethod_equals {

	public static void main(String[] args) {
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		
		// 두객체 비교 ( ==, equals() )
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println();
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));						// a1.equals(a2) : a2 객체가 Object 타입으로 자동 업캐스팅
		
		System.out.println("====================");
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		// 두객체 비교 ( ==, equals() )
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println();
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));						// b1.equals(b2) : b2 객체가 Object 타입으로 자동 업캐스팅되었다가 B타입으로 다시 다운캐스팅 
	}

}
