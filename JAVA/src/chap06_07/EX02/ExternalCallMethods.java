package chap06_07.EX02;

// 다양한 타입의 메소드 형식 (리턴타입 유무)

public class ExternalCallMethods {

	public static void main(String[] args) {
		// 객체 새성
		A a = new A();								// 같은 패키지 내의 클래스는 import 없이 호출해서 사용가능
		
		// 메소드 호출
		a.print();
		System.out.println();
		
		int k = a.data();
		System.out.println(k);
		System.out.println();
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		System.out.println();
		
		a.printMethod(5);
		a.printMethod(13);
		System.out.println();
		
		// 주의 : 
		
		System.out.println(a.data());				// 출력구문에 호출 가능한 메소드(리턴이 있는 메소드)
		// System.out.println(a.print());			// 메소드내에 이미 출력구문이 있기 때문에 오류
		a.print();
		System.out.println(a.sum(4, 10.5));
		// System.out.println(a.printMethod(3));	// 메소드내에 이미 출력구문이 있기 때문에 오류
		
		
	
	}

}
