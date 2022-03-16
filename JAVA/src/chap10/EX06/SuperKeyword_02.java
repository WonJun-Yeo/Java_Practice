package chap10.EX06;

/* super : 부모 클래스
 * super 키워드를 사용하면, 오버라이딩 되어 있더라도 덮어쓰여진값을 원래의 부모 코드로 돌려서 호출한다.
 */
// this : 자신의 객체

// 오버라이딩 : 부모의 메소드가 완전히 삭제되어진 것이 아니라, 덮어져있는 것이다.

class AA {
	int m;
	
	void abc() {
		System.out.println("AA class의 abc()메소드");
		System.out.println(m);
	}
}

class BB extends AA {
	@Override
	void abc() {
		System.out.println("BB class의 abc()메소드");
		System.out.println(m);
	}
	void bcd() {
		super.m = 300;
		super.abc();
	}
}

public class SuperKeyword_02 {

	public static void main(String[] args) {
		// 객체 생성
		
		BB bb = new BB();
		
		bb.bcd();
		
		System.out.println();
		
		bb.abc();

	}

}
