package chap04;

public class Quiz {

	public static void main(String[] args) {
		// 1. switch 문으로 바꾸기
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default :
			System.out.println("연산자 오류입니다.");
		}
		
		
	}

}
