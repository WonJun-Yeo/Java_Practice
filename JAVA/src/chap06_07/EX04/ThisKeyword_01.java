package chap06_07.EX04;



/*	������ this Ű���� �ڵ� �߰�
 * 1. Ŭ���� ���ο��� �ʵ��, �޼ҵ�� �տ� �ڵ����� this Ű���尡 �ٴ´�.
 * 2. this Ű����� �ڱ��ڽ��� ��ü �ʵ�� ��ü �޼ҵ带 ��Ī�Ѵ�.
 */

class A {
	int m, n;
	
	void init(int a, int b) {			// init() �޼ҵ� ������, ������������ ���� and �޼ҵ尡 ������ �Ҹ�
		int c = 3;						// a, b, c�� ��������, stack ������ ������� ���� ����
		this.m = a;						// this Ű���带 ������, �����Ϸ��� �ڵ����� �߰�
		this.n = b;						// ���������� �ƴ϶� ��ü�� �ʵ����� �˷��ش�.
	}
	
	void work() {
		this.init(2, 3);				// this Ű���带 ������, �����Ϸ��� �ڵ����� �߰�
		System.out.println(this.m + ", " + this.n);
	}
}




public class ThisKeyword_01 {
	public static void main(String[] args) {
		// ��ü ����
		
		A a = new A();
		
		// �޼��� ȣ��
		
		a.work();
	}

}
