package chap10.EX04;

/* 	메소드 오버로딩(Method Overloading) vs 메소드 오버로딩(Method Overriding)
 * 1. 메소드 오버로딩 : 동일한 메소드명으로 시그니처(매개변수 타입, 매개변수 수)에 따라 해당 메소드가 호출
 * 					상속과는 관련이 없으며, 생성자에서 많이 사용한다.
 * 2. 메소드 오버라이딩 : 부모의 메소드를 같은 시그니쳐(메소드명, 매개변수타입, 매개변수 수)로 새롭게 정의하여 사용
 * 					반드시 상속관계에서 사용된다.
 * 					자식의 접근제한자가 부모의 접근제한자과 비교하여 같거나 더 넓은 범위여야한다.
 */

class Ab {
	void print1() {										// 오버라이딩
		System.out.println("Ab 클래스의 pint1() 메소드");
	}
	void print2() {										// 오버로딩
		System.out.println("Ab 클래스의 print2() 메소드");
	}
}


class Bc extends Ab {
	@Override
	void print1() {										// 오버라이딩
		System.out.println("Bc 클래스의 print1() 메소드");
	}
	
	void print2 (int a) {								// 오버로딩
		System.out.println("Bc 클래스의 print2(int a) 메소드");
	}
}


public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. Ab 타입의 객체 선언
		
		Ab aa = new Ab();
		aa.print1();								 // Ab 클래스의 print1() 메소드 호출
		aa.print2();								 // Ab 클래스의 print2() 메소드 호출
		
		System.out.println("=================");
		
		// 2. Bc 타입의 객체 선언, Bc 타입의 생성자 호출
		
		Bc bb = new Bc();
		bb.print1();								// Bc 클래스의 print1() 메소드 호출
		bb.print2();								// Ab 클래스의 print2() 메소드 호출, Bc의 print2(int a) 메소드는 오버로딩되었기때문에 매개변수가 삽입되어야 한다.
		bb.print2(1);								// Bc 클래스의 print2() 메소드 호출
		
		System.out.println("=================");
		
		// 4. Ab 타입의 객체 선언, Bc 타입의 생성자 호출
		
		Ab cc = new Bc();
		cc.print1();								// Ab 클래스의 print1() 메소드가 호출되나, 동적바인딩으로 인해 Bc 클래스의 print1()으로 연결되어 출력
		cc.print2();								// Ab 클래스의 print2() 메소드 호출
		// cc.print2(1);							// Ab 타입으로 객체를 생성했으므로 Bc 클래스의 메소드로 접근 불가
	}

}
