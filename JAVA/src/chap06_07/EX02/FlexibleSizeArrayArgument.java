package chap06_07.EX02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
// �迭�� ���̰� �����Ǿ� ���� �ʰ� �����ϴ� ������ ���
	
	public static void main(String[] args) {
	// 1. �޼���� (int...values) : ���� ���̸� ó���ϴ� input �Ű������� ����
		method1();
		method1(1,2);
		method1(1,2,3);
		method1(1,2,3,4);
		method1(1,2,3,4,5);
		method1(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		method2("�ȳ�", "�氡");
		method2("��", "ȭ", "��", "��", "��", "��", "��");
		method2("�䳢", "ȣ����", "����", "��");
	}
	
	
	static void method1 (int...values) {			// �迭������ ��� ���� �ްڴ�.
		System.out.println(values.length);
		
		// Arrays.toString()���� �迭 ���
		System.out.println(Arrays.toString(values));
		System.out.println("=================");
		
		// for������ �迭 ���
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println("=================");
		
		// ����(enhanced) for������ �迭 ���
		for (int k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=================");
	}
	
	static void method2 (String...values) {
		// Arrays.toString()���� �迭 ���
		System.out.println(Arrays.toString(values));
		System.out.println("=================");
		
		// for������ �迭 ���
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println("=================");
		
		// ����(enhanced) for������ �迭 ���
		for (String k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=================");
	}
	
	
	
	
	
	
	/* �޼ҵ� �����ε����� ó��
	static void method1() {
		System.out.println("�Ű������� ���� �޼ҵ��Դϴ�.");
	}
	
	static void method1(int a, int b) {
		System.out.println(a + ", " + b);
	}
	
	static void method1(int a, int b, int c) {
		System.out.println(a + ", " + b + ", " + c);
	}
	
	static void method1(int a, int b, int c, int d) {
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
	
	static void method1(int a, int b, int c, int d, int e) {
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
	}
	*/
}
