package chap06_07.EX02;

// 기본타입의 메소드

public class InternalCallMethod {
	public static void main(String[] args) {
		// 같은 클래스 내의 메소드 호출 : static 키워드가 없는 method 출력 시에는 객체화(인스턴트화)가 필수이다.
		
		InternalCallMethod aaa = new InternalCallMethod();
		
		aaa.print();								// aaa 객체의 print() 메소드 호출
		System.out.println();
		
		int a = aaa.twice(3);
		System.out.println(a);
		System.out.println();
		
		double b = aaa.sum(a, 5.8);
		System.out.println(b);
		System.out.println();
	}
	
	void print() {									// static 키워드 없이 메소드 생성
		System.out.println("안녕");
	}
	
	int twice(int k) {
		return k * 2;
	}
	
	double sum(int m, double n) {
		return m + n;
	}
	
	
}
