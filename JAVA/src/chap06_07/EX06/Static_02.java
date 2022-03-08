package chap06_07.EX06;


// static이 붙은 필드는 메모리(RAM)의 클래스 영역에 저장되고 모든 객체에 공유된다.

class D {
	int m = 3;								// 인스턴스필드 : 객체화(인스턴스화)해야 사용가능 
	static int n = 5;						// 스태틱필드 : 객체화 없이 클래스명으로 사용가능, 객체화해서도 사용가능
}

public class Static_02 {

	public static void main(String[] args) {
		// 객체 생성
		
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
		
		// 인스턴스 필드 : 각 객체에서 공유되지 않고 그 객체에서만 사용
		
		d1.m = 5;
		d2.m = 6;
		d3.m = 7;
		d4.m = 8;
		
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);
		
		System.out.println("======================");
		
		// 스태틱 필드
		d1.n = 10;
		d2.n = 20;
		
		System.out.println(d1.n);
		System.out.println(d2.n);
		System.out.println(d3.n);
		System.out.println(d4.n);
		
		D.n = 200;				// 객체생성 없이 클래스 명으로 호출
		
		
	}

}
