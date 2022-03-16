package chap10.EX05;

/*	스태틱 메소드는 오버라이딩되지 않는다.
 * static 키워드가 붙으면 메모리 클래스 영역내에 static method영역에 코드가 저장되기 때문에, 클래스명으로 호출할 수 있다.
 */

class AAAA {
	static void print() {
		System.out.println("A 클래스");
	}
}

class BBBB extends AAAA {
	static void print() {
		System.out.println("B 클래스");
	}
}

class CCCC extends AAAA {
	static void print() {
		System.out.println("C 클래스");
	}
}


public class OverlapStaticMethod {

	public static void main(String[] args) {
		// 객체 생성없이 메소드 호출
		
		AAAA.print();
		BBBB.print();
		CCCC.print();
		
		System.out.println("==================");
		
		// 객체 생성 후, 메소드 호출
		
		AAAA aaaa = new AAAA();
		BBBB bbbb = new BBBB();
		CCCC cccc = new CCCC();
		
		AAAA aaab = new BBBB();
		AAAA aaac = new CCCC();
		
		aaaa.print();
		bbbb.print();
		cccc.print();
		
		System.out.println();
		
		aaab.print();
		aaac.print();
		
		
	}

}
