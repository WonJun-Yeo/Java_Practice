package chap10.EX02;

class Aa {
	int m;
	void abc () {
		System.out.println("�θ� �޼ҵ�");
	}
}

class Bb extends Aa {
	int n;
	void bcd() {
		System.out.println("�θ� �޼ҵ�");
	}
}


public class Inheritance_01 {

	public static void main(String[] args) {
		
		// Ÿ��ĳ������ ���� �ʴ� ��� (�׳� ��ü ����)
		Bb b = new Bb();				// b�� Aa, Bb�� �ʵ�� �޼ҵ带 ����, Aa, Bb�� �ʵ�� �޼ҵ� ��� ���� ����
		b.m = 10;						// �θ��ʵ�
		b.n = 20;						// �ڽ��ʵ�
		b.abc();						// �θ�޼ҵ�
		b.bcd();						// �ڽĸ޼ҵ�
		
		
		// ��ĳ���� : �ڽ� => �θ�
		Aa a = new Bb();
		
		a.m = 100;
		a.abc();
		
		
		// �ٿ�ĳ���� : �θ� => �ڽ�
		Bb bb6 =(Bb) a;
		
		bb6.m = 10;						// �θ��ʵ�
		bb6.n = 20;						// �ڽ��ʵ�
		bb6.abc();						// �θ�޼ҵ�
		bb6.bcd();						// �ڽĸ޼ҵ�
		
		
	}

}
