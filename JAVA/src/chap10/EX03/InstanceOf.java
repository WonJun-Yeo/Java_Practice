package chap10.EX03;

/*instanceof : 객체 내부의 캐스팅이 사능여부를 알 수 있도록 하는 키워드
 * 업캐스팅한 객체 내부에 어떤 타입이 존재하는지 Boolean값 (True, False) 으로 리턴
 * 다운 캐스팅시 런타임 오류가 발생될 수 있다. 때문에 조건문으로 사용될 수 있다.
 */

class A {
	int m;
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println("n : " + n);
	}
}


public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof
		A aa = new A();						// aa는 A타입만 가진다. 일반 객체화
		A ab = new B();						// ab는 A, B타입을 가지고 A에만 접근 가능. 업캐스팅
		
		
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		System.out.println(ab instanceof B);
		
		System.out.println();
		
		// 런타임 오류 방지 : 조건문
		if (aa instanceof B) {					// aa 객체에 B타입이 내포하고 있을 경우
			B b = (B) aa;						// 다운캐스팅, 런타임 오류
			System.out.println("aa를 B타입 b로 캐스팅했습니다.");
		} else {
			System.out.println("ab는 B타입으로 캐스팅이 불가능합니다.");
		}
		
		System.out.println();
		
		if (ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab를 B타입 b로 캐스팅 했습니다.");
		} else {
			System.out.println("ab는 B타입으로 캐스팅이 불가능합니다.");
		}

		System.out.println();
		
		if ("안녕" instanceof String) {			// "안녕"이 String 타입을 내포하고 경우, 객체데이터 타입만 가능(기본데이터 타입 불가능 ex.int)
			System.out.println("\"안녕\"은 String 데이터타입 입니다.");		// \ 뒤에오는 문자는 그대로 출력된다.
		} else {
			System.out.println("\"안녕\"은 String 데이터타입이 아닙니다.");
		}
		
	}
}
