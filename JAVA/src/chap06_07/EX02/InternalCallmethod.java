package chap06_07.EX02;

// �⺻Ÿ���� �޼ҵ�

public class InternalCallMethod {
	public static void main(String[] args) {
		// ���� Ŭ���� ���� �޼ҵ� ȣ�� : static Ű���尡 ���� method ��� �ÿ��� ��üȭ(�ν���Ʈȭ)�� �ʼ��̴�.
		
		InternalCallMethod aaa = new InternalCallMethod();
		
		aaa.print();								// aaa ��ü�� print() �޼ҵ� ȣ��
		System.out.println();
		
		int a = aaa.twice(3);
		System.out.println(a);
		System.out.println();
		
		double b = aaa.sum(a, 5.8);
		System.out.println(b);
		System.out.println();
	}
	
	void print() {									// static Ű���� ���� �޼ҵ� ����
		System.out.println("�ȳ�");
	}
	
	int twice(int k) {
		return k * 2;
	}
	
	double sum(int m, double n) {
		return m + n;
	}
	
	
}
