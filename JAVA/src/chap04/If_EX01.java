package chap04;
public class If_EX01 {
	public static void main(String[] args) {
		/* if��
		 * if (����) {
		 * 	���� ���� ���� �ڵ�;
		 * } 
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("����1 : ������ ���϶� ����");
		}
		System.out.println("========================");
		
		/*
		 * if (����) {
		 * 	���� ���� ���� �ڵ�;
		 * } else {
		 * 	������ ���� ���� �ڵ�;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		// ������ True �� �� ����
		if (bool1) {
			System.out.println("����2 : ������ ���϶� ����");
		} else {
			System.out.println("����3 : ������ �����϶� ����");
		}
		
		// ������ False �� �� ����
		if (bool2) {
			System.out.println("����4 : ������ ���϶� ����");
		} else {
			System.out.println("����5 : ������ �����϶� ����");
		}
		System.out.println("==========================");
		
		// if ~ else ���� ���� �����ڷ� ��ȯ�� ����
		System.out.println((bool1)? "����7 : ��" : "����8 : ����");
		System.out.println((bool2)? "����9 : ��" : "����10 : ����");
		System.out.println("==========================");
		/*
		 * if�� ������ ������ �� ��
		 * if (����1) {
		 * 	����1�� ���� �� �����ڵ�
		 * } else if (����2) {
		 * 	����1�� �����̰� ����2�� ���� �� �����ڵ�
		 * } else if (����3) {
		 * 	����1�� 2�� �����̰� ����3�� ���� �� �����ڵ�
		 * } else {
		 * 	���� ������ ��� ������ �� �����ڵ�
		 * } 
		 */
		
		int value2 = 85;
		
		if (value2 >= 90) {
			System.out.println("A ����, ���� : " + value2);
		} else if (value2 >= 80) {
			System.out.println("B ����, ���� : " + value2);			//���� �� if ���� ���� ���´�.
		} else if (value2 >= 70) {
			System.out.println("C ����, ���� : " + value2);
		} else {
			System.out.println("F ����, ���� : " + value2);
		}
		System.out.println("===========================");
		
		/*
		 * if ������ ������ ������ �ٲ�� ���� ���
		 */
		
		value2 = 85;
		
		if (value2 >= 90) {
			System.out.println("A ����, ���� : " + value2);
		} else if (value2 >= 70) {
			System.out.println("C ����, ���� : " + value2);			//���� �� if ���� ���� ���´�.
		} else if (value2 >= 80) {
			System.out.println("B ����, ���� : " + value2);
		} else {
			System.out.println("F ����, ���� : " + value2);
		}
		System.out.println("===========================");
		
		/*
		 * ������ �ο��� �� �����ϰ� ���� (������ �ٲ� ����� ����)
		 */
		value2 = 85;
		if (value2 <=100 && value2 >= 90) {
			System.out.println("A�����Դϴ�.");
		} else if (value2 <80 && value2 >= 70) {
			System.out.println("C�����Դϴ�");
		} else if (value2 <90 && value2 >= 80) {
			System.out.println("B�����Դϴ�");
		} else {
			System.out.println("F�����Դϴ�");
		}
		System.out.println("===========================");
		
		/*
		 * if������ ���๮�� �ϳ��� ��, �߰�ȣ�� ������ �� �ִ�. (�������� �ʴ´�.)
		 */
		
		if (3 < 5)
			System.out.println("�ȳ�1");
		
		if (3 > 5)
			System.out.println("�ȳ�2");
			System.out.println("�ݰ�");
	}
}
