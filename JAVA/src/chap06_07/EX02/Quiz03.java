package chap06_07.EX02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 3. ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ���

		
		System.out.println("�հ� ����� ���ϰ� ���� ���� ���� �Է��ϼ���");
		
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
