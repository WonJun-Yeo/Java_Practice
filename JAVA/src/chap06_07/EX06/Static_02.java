package chap06_07.EX06;


// static�� ���� �ʵ�� �޸�(RAM)�� Ŭ���� ������ ����ǰ� ��� ��ü�� �����ȴ�.

class D {
	int m = 3;								// �ν��Ͻ��ʵ� : ��üȭ(�ν��Ͻ�ȭ)�ؾ� ��밡�� 
	static int n = 5;						// ����ƽ�ʵ� : ��üȭ ���� Ŭ���������� ��밡��, ��üȭ�ؼ��� ��밡��
}

public class Static_02 {

	public static void main(String[] args) {
		// ��ü ����
		
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
		
		// �ν��Ͻ� �ʵ� : �� ��ü���� �������� �ʰ� �� ��ü������ ���
		
		d1.m = 5;
		d2.m = 6;
		d3.m = 7;
		d4.m = 8;
		
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);
		
		System.out.println("======================");
		
		// ����ƽ �ʵ�
		d1.n = 10;
		d2.n = 20;
		
		System.out.println(d1.n);
		System.out.println(d2.n);
		System.out.println(d3.n);
		System.out.println(d4.n);
		
		D.n = 200;				// ��ü���� ���� Ŭ���� ������ ȣ��
		
		
	}

}
