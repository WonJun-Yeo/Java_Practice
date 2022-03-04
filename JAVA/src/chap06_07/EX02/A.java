package chap06_07.EX02;

public class A {
	// 1. 리턴 타입이 없는 메소드 : void 메소드명() {실행코드}
	
	public void print() {
		System.out.println("안녕");
	}
	
	// 2. 리턴 타입이 있는 메소드 (int)
	
	public int data() {						// 정수값으로 반환
		return 3;
	}
	
	// 3. 리턴 타입이 있는 메소드 (double)
	
	public double sum(int a, double b) {		// 실수값으로 반환
		return a + b;
	}
	
	// 4. 리턴 타입이 없는 메소드(void) + 메소드 내부에서 리턴을 포함하는 경우 = 함수의 종료를 의미
	
	public void printMethod(int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력값입니다. 1 ~ 12 사이의 숫자를 입려해주세요.");
			return;						// 메소드를 종료한다는 의미
		}
		System.out.println(m + "월입니다.");
	}
	
	
	
}
