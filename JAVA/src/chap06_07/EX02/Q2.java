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
		
		System.out.println("�հ�� " + sum);
		System.out.println("����� " + avg + " �Դϴ�.");
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// ������ �������� �Ҵ� �޾Ƽ� �հ�� ����� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �־ �Է��� �ּ���.");
		
		String num = sc.nextLine();							// ������ ������ ��ü String���� �޴´�.
		
		String[] array = num.split(" ");					// ������ �������� �ڷḦ ���� �迭�� ����
		
		System.out.print("�Է��� ������ : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		method(array);										// ���� ���� �޼ҵ� method�� ȣ���ϸ鼭 �Ű������� array�� �Ҵ�
		
	}

}
