package chap06_07.EX02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	
	// ���� Ŭ���� ���� �޼ҵ� ȣ�� : static Ű���尡 �ִ� ���, �޼ҵ� �̸����� ȣ�Ⱑ��
	// public : �ٸ� äŰ������ ���� �����ϵ��� ����
	// ���������� (public, protected, default, private)
	// ���������ڰ� �����Ǿ� ���� ��� default : ���� ��Ű������ ���ٰ���
	
	static void printArray (int[] a) {	
		
		
		// Arrays.toString()�� ����ؼ� ���
		System.out.println(Arrays.toString(a));
		System.out.println("======================");
		
		// for���� ����ؼ� ���
		for (int i = 0; i <a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		// ����(enhanced) for���� ����ؼ� ���
		for (int k : a) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("======================");
	}
	

	
	public static void main(String[] args) {
		// �迭�� �Ű� ������ ������ �޼ҵ� ȣǮ
		
		int[] a = new int[] {1, 2, 3};			// �迭������ �����ϰ� ���� ���� ��
		printArray(a);							// �迭������ �޼ҵ� ȣ��� �Ű������� �迭���� �Է� 
		
		printArray(new int[] {4,5,6,7,8});
		
		//printArray({1,2,3}); 					// �����߻�
		
		
		
	}

}
