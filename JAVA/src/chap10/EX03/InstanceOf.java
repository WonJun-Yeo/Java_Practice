package chap10.EX03;

/*instanceof : ��ü ������ ĳ������ ��ɿ��θ� �� �� �ֵ��� �ϴ� Ű����
 * ��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� Boolean�� (True, False) ���� ����
 * �ٿ� ĳ���ý� ��Ÿ�� ������ �߻��� �� �ִ�. ������ ���ǹ����� ���� �� �ִ�.
 */

class A {
	int m;
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println("n : " + n);
	}
}


public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof
		A aa = new A();						// aa�� AŸ�Ը� ������. �Ϲ� ��üȭ
		A ab = new B();						// ab�� A, BŸ���� ������ A���� ���� ����. ��ĳ����
		
		
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		System.out.println(ab instanceof B);
		
		System.out.println();
		
		// ��Ÿ�� ���� ���� : ���ǹ�
		if (aa instanceof B) {					// aa ��ü�� BŸ���� �����ϰ� ���� ���
			B b = (B) aa;						// �ٿ�ĳ����, ��Ÿ�� ����
			System.out.println("aa�� BŸ�� b�� ĳ�����߽��ϴ�.");
		} else {
			System.out.println("ab�� BŸ������ ĳ������ �Ұ����մϴ�.");
		}
		
		System.out.println();
		
		if (ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab�� BŸ�� b�� ĳ���� �߽��ϴ�.");
		} else {
			System.out.println("ab�� BŸ������ ĳ������ �Ұ����մϴ�.");
		}

		System.out.println();
		
		if ("�ȳ�" instanceof String) {			// "�ȳ�"�� String Ÿ���� �����ϰ� ���, ��ü������ Ÿ�Ը� ����(�⺻������ Ÿ�� �Ұ��� ex.int)
			System.out.println("\"�ȳ�\"�� String ������Ÿ�� �Դϴ�.");		// \ �ڿ����� ���ڴ� �״�� ��µȴ�.
		} else {
			System.out.println("\"�ȳ�\"�� String ������Ÿ���� �ƴմϴ�.");
		}
		
	}
}
