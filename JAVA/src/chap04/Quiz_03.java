package chap04;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// 3. switch������ scanner�� �����ؼ� ���

		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		int num1 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		int num2 = scanner.nextInt();
		
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
			System.out.println("������ �����Դϴ�.");
		}
		
		scanner.close();
	}

}
