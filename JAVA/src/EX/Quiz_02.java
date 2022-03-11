package EX;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int nu = 0;					// 스캐너로 번호를 인춧 받는 변수
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("=============================================================");
			System.out.println("1. 19단까지 출력 | 2. 홀수단만 출력 | 3. 3의 배수단만 출력 | 4. 프로그램 종료");
			System.out.println("=============================================================");
			System.out.println("번호를 입력해 주세요.");
			
			
			nu = sc.nextInt();
			
			if (nu == 1) {
				for (int i = 1; i < 20; i++) {
					for (int j = 1; j < 10; j++) {
						System.out.println(i + " x " + j + " = " + i * j);
					}
				}
			} else if (nu == 2) {
				for (int i = 1; i < 20; i++) {
					for (int j = 1; j < 10; j++) {
						if (i % 2 != 0) {
							System.out.println(i + " x " + j + " = " + i * j);
						}
					}
				}
			} else if (nu == 3) {
				for (int i = 1; i < 20; i++) {
					for (int j = 1; j < 10; j++) {
						if (i % 3 == 0) {
							System.out.println(i + " x " + j + " = " + i * j);
						}
					}
				}
			} else if (nu == 4) {
				break;
			}
			
		} while (run);
		sc.close();
		
		System.out.println("프로그램을 종효합니다.");

	}

}
