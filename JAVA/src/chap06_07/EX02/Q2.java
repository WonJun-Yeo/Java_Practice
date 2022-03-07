package chap06_07.EX02;

import java.util.Scanner;

public class Q2 {
	
	static void method(String...values) {
		int sum = 0;
		double avg;
		
		for (int i = 0; i < values.length; i++) {
			sum += Integer.parseInt(values[i]);
		}
		
		avg = (double) sum / values.length;
		
		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + avg + " 입니다.");
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// 임의의 정수값을 할당 받아서 합계와 평균을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 공백을 넣어서 입력해 주세요.");
		
		String num = sc.nextLine();							// 공백을 포함한 전체 String값을 받는다.
		
		String[] array = num.split(" ");					// 공백을 기준으로 자료를 나눠 배열로 저장
		
		System.out.print("입력한 정수는 : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		method(array);										// 가변 길이 메소드 method를 호출하면서 매개변수로 array를 할당
		
	}

}
