package chap06_07.EX04;



/*	묵시적 this 키워드 자동 추가
 * 1. 클래스 내부에서 필드명, 메소드명 앞에 자동으로 this 키워드가 붙는다.
 * 2. this 키워드는 자기자신의 객체 필드와 객체 메소드를 지칭한다.
 */

class A {
	int m, n;
	
	void init(int a, int b) {			// init() 메소드 생성시, 지역변수들이 저장 and 메소드가 끝나면 소멸
		int c = 3;						// a, b, c는 지역변수, stack 영역에 변수명과 값이 저장
		this.m = a;						// this 키워드를 생략시, 컴파일러가 자동으로 추가
		this.n = b;						// 지역변수가 아니라 객체의 필드임을 알려준다.
	}
	
	void work() {
		this.init(2, 3);				// this 키워드를 생략시, 컴파일러가 자동으로 추가
		System.out.println(this.m + ", " + this.n);
	}
}




public class ThisKeyword_01 {
	public static void main(String[] args) {
		// 객체 생성
		
		A a = new A();
		
		// 메서드 호출
		
		a.work();
	}

}
