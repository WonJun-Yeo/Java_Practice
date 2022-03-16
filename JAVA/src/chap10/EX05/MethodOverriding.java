package chap10.EX05;

/* 	인스턴스 메소드 오버라이딩 : 상속관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩 된다.
 * 상속관계에서 인스턴스 필드, static 필드, static 메소드는 오버라이딩 되지 않는다. (오버라이딩 자체가 메소드에 하는거니까 필드는 원래 안되는거 일듯)
 * 오버라이딩 할때는 시그니처(리턴타입, 메소드명, 매개변수 데이터 타입, 매개변수 객수)가 같아야 한다. 
 */

class A {
	
	A () {}										// 기본생성자는 다른 생성자가 없을 경우 생략이 가능하다.
	
	void print() {
		System.out.println("Class A 출력");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("Class B 출력");
	};
}

class C extends A {
	@Override
	void print() {
		System.out.println("Class C 출력");
	};
}



public class MethodOverriding {

	public static void main(String[] args) {
		// 1. A 타입, A 생성자
		
		A a = new A();
		a.print();
		
		// 2. B 타입, B 생성자
		
		B b = new B();
		b.print();
		
		// 3. C 타입, C 생성자
		
		C c = new C();
		c.print();
		
		System.out.println("======================================");
		
		// 4. A 타입, B 생성자
		
		A ab = new B();						// 오버라이딩 되어 A의 print() 메소드 호출 시, B의 print() 결과값으로 출력된다.
		ab.print();
		
		A ac = new C();						// 오버라이딩 되어 A의 print() 메소드 호출 시, C의 print() 결과값으로 출력된다.
		ac.print();
		
		System.out.println("======================================");
		
		A[]	 arr = {ab, ac};				// 배열에 A 타입의 객체를 저장
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		
		System.out.println("======================================");
		
		for (A k : arr) {
			k.print();
		}
		
		
		
		

	}

}
