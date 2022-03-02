package chap04;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// 2. if문에서 scanner를 장착해서 인풋 받아서 사용
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		int num2 = scanner.nextInt();
		
		int result = 0;
		if (operator == '+') {
			result = num1 + num2;
			System.out.println(result);
		} else if (operator == '-') {
			result = num1 - num2;
			System.out.println(result);
		} else if (operator == '/') {
			result = num1 / num2;
			System.out.println(result);
		} else if (operator == '*') {
			result = num1 * num2;
			System.out.println(result);
		} else {
			System.out.println("연산자 오류입니다.");
		}
		
		scanner.close();
		
		

	}

}
