package chap03;

import java.util.Scanner;

public class Qiz02 {

	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int numb = scanner.nextInt();
		System.out.println( (numb % 3 == 0)? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.");
	}
}
