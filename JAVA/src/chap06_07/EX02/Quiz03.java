package chap06_07.EX02;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 3. 스캐너로 임의의 정수값을 받아서 합계, 평균
		
		System.out.println("합과 평균을 구하고 싶은 정수 값을 입력하세요");

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String[] array = num.split(" ");
		
		System.out.println(Arrays.toString(array));

		sc.close();
		
		method(array);
	}
	
	static void method (String...values) {
		int sum = 0;
		double avg;
		for (int k = 0; k < values.length; k++) {
			sum += Integer.parseInt(values[k]);
		}	
		
		avg = sum / values.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
