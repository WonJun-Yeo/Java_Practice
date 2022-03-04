package chap06_07.EX02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 3. 스캐너로 임의의 정수값을 받아서 합계, 평균

		
		System.out.println("합과 평균을 구하고 싶은 정수 값을 입력하세요");
		
		int num = 0;
		int s = 0;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		
		
//		for (int i = 0; ; i++) {
//			int num = sc.nextInt();
//		}
		
		sc.close();

	}
	
	static void method (int...values) {
//		int[] test = new int [] {values};
		int sum = 0;
		double avg;
		for (int k = 0; k < values.length; k++) {
			sum += values[k];
		}	
		
		avg = sum / values.length;
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
