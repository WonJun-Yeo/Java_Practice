package chap04;

import java.util.Scanner;

public class If_EX02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		} else if ( operator == '-') {
			result = num1 - num2;
		} else if ( operator == '*') {
			result = num1 * num2;
		} else if ( operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("연산자 오류입니다.");
//			return;									// else 작동으로 if문 빠져나오고 위로 돌아가 밑의 구문을 작동시키지 않음
		}
		
		System.out.println("결과 값은 : " + result + " 입니다.");
		
	}
}
