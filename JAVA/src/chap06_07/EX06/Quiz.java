package chap06_07.EX06;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// ������ ��� �̸��� �ְ� �ش� ��� ������ (���) �� �־ ����ϴ� ���α׷� �ۼ�	
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("���� �ο����� ������ �ۼ����ּ���");
			
			String input = sc.nextLine();
			int sum = 0;
			double avg = 0.0;
			
			if (input.equals("�׸�")) {
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
				System.out.println("������� ������ �� �հ� : " + sum);
				System.out.println("������� ��� ������ �� : " + avg);
			}
			
		}
		sc.close();	
	}
}
