package chap03;

import java.util.Scanner;

public class Qiz01 {

	public static void main(String[] args) {
		System.out.println("정수값을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int numb = scanner.nextInt();
		if (numb % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
