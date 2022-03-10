package chap06_07.EX06;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 임의의 운동의 이름을 넣고 해당 운동의 구성원 (명수) 를 넣어서 출력하는 프로그램 작성	
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("운동명과 인원수를 번갈아 작성해주세요");
			
			String input = sc.nextLine();
			int sum = 0;
			double avg = 0.0;
			
			if (input.equals("그만")) {
				break;
			} else {
				String[] array = input.split(" ");
				
				for (int i = 0; i < array.length; i++) {
					if (i % 2 == 0) {
						System.out.print(array[i] + " : ");
					} else {
						System.out.print(Integer.parseInt(array[i]) + " ");
						sum += Integer.parseInt(array[i]);
						avg = (double) sum / (array.length / 2);
					}
				}
				System.out.println();
				System.out.println("운동종목의 구성원 총 합계 : " + sum);
				System.out.println("운동종목의 평균 구성원 수 : " + avg);
			}
			
		}
		sc.close();	
	}
}
