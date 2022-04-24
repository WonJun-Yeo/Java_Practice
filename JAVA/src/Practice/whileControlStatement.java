package Practice;

public class whileControlStatement {

	public static void main(String[] args) {
		// 기본구조
		int a = 0; 											// 초기식
		while(a < 10) {										// 조건식
			System.out.println("a가 10이될때까지 출력");			// 실행구문
			a++;											// 증감식
		}
		
		// 무한루프
		int b = 0;
		while(b < 10) {
			b = 0;
			System.out.println("무한출력");
			b++;
		}
		
		// unreachable code
		int c = 0;
		while(c < 10) {
			c = 0;
			System.out.println("무한출력");
			c++;
		}
		System.out.println("절대출력안됨");						// unreachable code
		
		
		
		
		
		
		
		
		
	}

}
