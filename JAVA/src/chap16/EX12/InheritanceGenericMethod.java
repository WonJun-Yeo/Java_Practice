package chap16.EX12;

/* Generic 메소드의 상속
 * 
 */

class Parent {																// 일반클래스
	// Number 클래스 : Boolean, Character를 제외한 Wrapper 타입의 클래스가 올 수 있다.
	<T extends Number> void print(T t) {									// Generic 메소드
		System.out.println(t);
	}
}

class Child extends Parent {												// Generic 메소드 상속은 일반 상속과 같이 사용할 수 있다.
	
}



public class InheritanceGenericMethod {

	public static void main(String[] args) {
		// 1. 부모클래스의 Generic 메소드 사용
		
		Parent p = new Parent();
		p.<Integer>print(100);
		p.print(300);														// 매개변수의 타입을 알 수 있는 경우, 데이터타입 생략 가능
		p.<Double>print(0.5);
		p.print(1.5);
		p.<Long>print(100000L);
		p.print(105000L);
		p.<Float>print(100000F);
		p.print(1011000F);
		//p.<Byte>print(1);
		// p.<String>print("안녕");											// String은 Number 클래스가 아니다.
		
		System.out.println("=========================");
		
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(5.5);
		c.<Long>print(150000L);
		c.<Float>print(102000F);
		
		
		
		
		
	}

}
