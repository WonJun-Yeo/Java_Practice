package chap10.EX06;

/* super : 부모 클래스
 * super 키워드를 사용하면, 오버라이딩 되어 있더라도 덮어쓰여진값을 원래의 부모 코드로 돌려서 호출한다.
 */
// this : 자신의 객체

// 오버라이딩 : 부모의 메소드가 완전히 삭제되어진 것이 아니라, 덮어져있는 것이다.




class A {
	void abc() {
		System.out.println("A class의 abc 메소드");
	}
}

class B extends A {
	@Override
	void abc() {
		System.out.println("B class의 abc 메소드");
	}
	
	void bcd() {
		abc();						// 앞에 키워드가 없다면 this.abc 에서 this 키워드가 생략된 것, this는 자신의 객체를 뜻함
	}
}


public class SuperKeyword_01 {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		B bb = new B();
		
		
		// 2. 메소드 호출
		
		bb.bcd();

	}

}
