package Practice;

public class doWhileControlStatement {

	public static void main(String[] args) {
		// 기본 문법 구조
		int a = 0;										// 초기식
		do {
			System.out.println("무조건 1번은 실행");			// 최초 1회는 무조건 실행
			a++;										// 증감식
		} while(a < 10);								// 조건식
		
		// do-while문의 최소 반복 횟수는 1번이다. (무한루프)
		int b = 0;
		do {
			System.out.println("무조건 1번은 실행");
			b++;
		} while(b != 0); 
		
	} 

}
