package chap04;

import java.util.Scanner;

public class If_EX02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		} else if ( operator == '-') {
			result = num1 - num2;
		} else if ( operator == '*') {
			result = num1 * num2;
		} else if ( operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("������ �����Դϴ�.");
//			return;									// else �۵����� if�� ���������� ���� ���ư� ���� ������ �۵���Ű�� ����
		}
		
		System.out.println("��� ���� : " + result + " �Դϴ�.");
		
	}
}
