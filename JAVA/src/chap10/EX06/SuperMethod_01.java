package chap10.EX06;

// 키워드는 지칭

/*	super 키워드 : 부모클래스를 지칭
 * 메소드 및 생성자 내부에서 사용
 * 필드명, 메소드명 앞에 사용
 */

/*	this 키워드 : 자신의 객체를 지칭
 * 메소드 및 생성자 내부에서 사용
 * 필드명, 메소드명 앞에 사용
 */



// 메소드는 생성자 호출

/*	super() : 생성자 내부에서만 사용되는 메소드
 * 부모 생성자를 호출할 때 사용
 * 반드시 첫 라인에 위치해야 한다.
 */

/*	this() : 생성자 내부에서만 사용되는 메소드
 * 자신의 클래스의 다른 생성자를 호출할 때 사용
 * 반드시 첫 라인에 위치해야 한다.
 */



class AAA {
	AAA() {
		System.out.println("AAA 생성자");
	}
}

class BBB extends AAA {
	BBB() {
		super();									// 부모 클래스의 기본생성자
		System.out.println("BBB 생성자");
	}
}

class CCC {
	
	CCC(){};
	
	CCC(int a) {
		System.out.println("CCC 생성자 " + a);
	}
}

class DDD extends CCC {
	DDD() {
		super();
	}
	DDD (int a) {
		super(3);
		System.out.println("DDD 생성자 매개변수 정수 1개 " + a);
	}
}

public class SuperMethod_01 {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		AAA aaa = new AAA();
		
		System.out.println("============================");
		
		BBB bbb = new BBB();
		
		System.out.println("============================");
		
		DDD ddd = new DDD();
		
		System.out.println("============================");
		
		DDD ddd2 = new DDD(5);
		
		
	}

}
