package chap10.EX06;

/*	this() 와 super()의 혼용
 * this() :  자신 객체의 생성자 호출
 * super() : 부모 객체의 생성자 호출
 * 둘 다 생성자 내부에서만 사용되며, 항상 생성자 내부의 첫 라인에 와야한다.
 */

class AAAA {
	AAAA() {
		this(3);
		System.out.println("AAAA 생성자");
	}
	
	AAAA(int a) {
		System.out.println("AAAA 매개변수 정수 1개 생성자 " + a);
	}
}

class BBBB extends AAAA {
	BBBB(){
		this(3);
		System.out.println("BBBB 생성자");
	}
	
	BBBB (int b) {
		// super(); 가 생략되어 있다.
		System.out.println("BBBB 매개변수 정수 1개 생성자 " + b);
	}
}


public class SuperMethod_02 {

	public static void main(String[] args) {
		// 1. 부모 클래스 객체 생성
		
		AAAA aaaa1 = new AAAA();
		
		System.out.println();
		
		AAAA aaaa2 = new AAAA(3);
		
		System.out.println("====================");
		
		// 2. 자식 클래스 객체 생성
		
		BBBB bbbb1 = new BBBB();
		
		System.out.println("====================");
		
		// 3. 자식 클래스 객체 생성 (매개변수 1개인 생성자 호출)
		
		BBBB bbbb2 = new BBBB(3);

	}

}
