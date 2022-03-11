package chap10.EX02;

class Aa {
	int m;
	void abc () {
		System.out.println("부모 메소드");
	}
}

class Bb extends Aa {
	int n;
	void bcd() {
		System.out.println("부모 메소드");
	}
}


public class Inheritance_01 {

	public static void main(String[] args) {
		
		// 타입캐스팅을 하지 않는 경우 (그냥 객체 생성)
		Bb b = new Bb();				// b는 Aa, Bb의 필드와 메소드를 포함, Aa, Bb의 필드와 메소드 모두 접근 가능
		b.m = 10;						// 부모필드
		b.n = 20;						// 자식필드
		b.abc();						// 부모메소드
		b.bcd();						// 자식메소드
		
		
		// 업캐스팅 : 자식 => 부모
		Aa a = new Bb();
		
		a.m = 100;
		a.abc();
		
		
		// 다운캐스팅 : 부모 => 자식
		Bb bb6 =(Bb) a;
		
		bb6.m = 10;						// 부모필드
		bb6.n = 20;						// 자식필드
		bb6.abc();						// 부모메소드
		bb6.bcd();						// 자식메소드
		
		
	}

}
