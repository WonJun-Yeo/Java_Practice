package chap06_07.EX06;

class Aaa {
	int m = 3;					// �ν��Ͻ��ʵ� : static�� ���� ���� �ʵ�, ��ü ���� �Ŀ� ��밡�� 
	static int n = 4;			// ����ƽ �ʵ� :  static�� ���� �ʵ�, ��ü �������� Ŭ���������� ��밡��, ��ü ���� �Ŀ��� ��밡��, ��� ��ü�� �����ϴ� ����
	
	void print1() {				// �ν��Ͻ��޼ҵ� : static�� ���� ���� �޼ҵ�, ��ü ���� �Ŀ� ��밡��
		System.out.println("�ν��Ͻ��ʵ带 ����ϴ� �ν��Ͻ��޼ҵ� Ǯ�� : m : " + m + ", n : " + n);			// �ν��Ͻ��޼ҵ� ������ �ν��Ͻ��ʵ�� ����ƽ�ʵ� ��� �� �� �ִ�.
	}
	
	static void print2() {		// ����ƽ�޼ҵ� : static�� ���� �޼ҵ�, ��ü �������� Ŭ���������� ��밡��, ��ü ���� �Ŀ��� ��밡��
		System.out.println("����ƽ�ʵ带 ����ϴ� ����ƽ�޼ҵ� ��� : " + "n : " + n);			// ����ƽ�޼ҵ� ������ �ν��Ͻ��ʵ尡 �� �� ����.
	}
}

public class Static_01 {

	public static void main(String[] args) {
		// 1. ��ü ������ �ʵ�� �޼ҵ� ȣ�� (�ν��Ͻ��ʵ�, ����ƽ�ʵ�, �ν��Ͻ��޼ҵ�, ����ƽ�޼ҵ�)
		Aaa aaa = new Aaa();
		
		aaa.m = 10;				// �ν��Ͻ��ʵ� ȣ��
		aaa.n = 20;				// ����ƽ�ʵ� ȣ��
		
		aaa.print1();			// �ν��Ͻ��޼ҵ� ȣ��
		aaa.print2();			// ����ƽ�޼ҵ� ȣ��
		
		System.out.println("==================");
		
		
		// 2. ��ü �������� �ʵ�� �޼ҵ� ȣ�� (����ƽ�ʵ�, ����ƽ�޼ҵ�)
		
		Aaa.n = 100;
		Aaa.print2();
		System.out.println("==================");
		
		
		// ����ƽ�� ��� ��ü�� �����Ѵ�.
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);
		
		ccc.n = 300;
		System.out.println();
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
	}

}
