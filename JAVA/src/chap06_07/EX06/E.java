package chap06_07.EX06;

// 정적 초기화 블럭 : 생성자와 같이 static 필드의 값을 호출 시, 초기화 하는 역할을 한다.

/* 생성자와 static 블럭
 * 생성자 : 인스턴스 필드를 초기화, 스태틱 필드의 값도 초기환
 * 스태틱 블럭 : 스태틱 필드의 값만을 초기화
 */

public class E {
	
	int a;
	static int b;										// 객체 생성없이 호출가능
	
	static {											// static (정적) 초기화 블럭 : 객체 생성 없이 클래스명으로 호출할 때, 초기화
		// a = 3;										// 오류 발생 : 인스턴스 필드는 초기화 할 수 없다.
		b = 5;
		System.out.println("클래스 E가 로딩되었습니다. 뱐수 b : " + b);
	}
	
	E() {												// 생성자 : 객체화를 할 때, 인스턴스필드 초기화, 스태틱필드 초기화
		a = 3;
		b = 10;
	}
	

	public static void main(String[] args) {
		
		System.out.println(E.b);						// 객체 생성 없이 E.b 호출 될 때, static 블럭이 작동된다.
		
		
	}

}
