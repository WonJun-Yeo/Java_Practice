package chap06_07.EX02;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 3. ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ���
		
		System.out.println("�հ� ����� ���ϰ� ���� ���� ���� �Է��ϼ���");

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
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

}
