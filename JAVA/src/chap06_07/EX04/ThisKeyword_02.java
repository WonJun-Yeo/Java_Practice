package chap06_07.EX04;


// ����� this Ű���� �߰� (�ݵ�� this Ű���带 �������� �ϴ� ���)

class Aa {								// this Ű���带 ������� ���� ��� : ���������� �ν�
	int m, n;
	
	void init(int m, int n) {
		m = m;							// this Ű���带 ������� �ʴ� ��� m�� �������� m
		n = n;							// this Ű���带 ������� �ʴ� ��� n�� �������� n
	}
}

class Bb {								// this Ű���带 ����ϴ� ��� : �ʵ�� �ν�
	int m, n;
	
	void init(int m, int n) {
		this.m = m;						// this Ű���带 ����ϴ� ��� m�� �ʵ� m
		this.n = n;						// this Ű���带 ����ϴ� ��� n�� �ʵ� n
	}
}




public class ThisKeyword_02 {
	public static void main(String[] args) {
		// 1. �ʵ��� ������������ ���� ��� (this Ű���带 ������� ���� ��� : ���������� ����)
		
		Aa aa = new Aa();
		aa.init(1, 3);
		System.out.println(aa.m);
		System.out.println(aa.n);
		System.out.println("=====================");
		
		// 2. �ʵ��� ������������ ���� ��� (this Ű���带 ����� ��� : �ʵ忡 ����)

		Bb bb = new Bb();
		bb.init(1, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);
		System.out.println("=====================");
	}
}
