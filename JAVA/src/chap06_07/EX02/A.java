package chap06_07.EX02;

public class A {
	// 1. ���� Ÿ���� ���� �޼ҵ� : void �޼ҵ��() {�����ڵ�}
	
	public void print() {
		System.out.println("�ȳ�");
	}
	
	// 2. ���� Ÿ���� �ִ� �޼ҵ� (int)
	
	public int data() {						// ���������� ��ȯ
		return 3;
	}
	
	// 3. ���� Ÿ���� �ִ� �޼ҵ� (double)
	
	public double sum(int a, double b) {		// �Ǽ������� ��ȯ
		return a + b;
	}
	
	// 4. ���� Ÿ���� ���� �޼ҵ�(void) + �޼ҵ� ���ο��� ������ �����ϴ� ��� = �Լ��� ���Ḧ �ǹ�
	
	public void printMethod(int m) {
		if (m < 0 || m > 12) {
			System.out.println("�߸��� �Է°��Դϴ�. 1 ~ 12 ������ ���ڸ� �Է����ּ���.");
			return;						// �޼ҵ带 �����Ѵٴ� �ǹ�
		}
		System.out.println(m + "���Դϴ�.");
	}
	
	
	
}
