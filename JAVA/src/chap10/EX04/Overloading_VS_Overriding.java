package chap10.EX04;

/* 	�޼ҵ� �����ε�(Method Overloading) vs �޼ҵ� �����ε�(Method Overriding)
 * 1. �޼ҵ� �����ε� : ������ �޼ҵ������ �ñ״�ó(�Ű����� Ÿ��, �Ű����� ��)�� ���� �ش� �޼ҵ尡 ȣ��
 * 					��Ӱ��� ������ ������, �����ڿ��� ���� ����Ѵ�.
 * 2. �޼ҵ� �������̵� : �θ��� �޼ҵ带 ���� �ñ״���(�޼ҵ��, �Ű�����Ÿ��, �Ű����� ��)�� ���Ӱ� �����Ͽ� ���
 * 					�ݵ�� ��Ӱ��迡�� ���ȴ�.
 * 					�ڽ��� ���������ڰ� �θ��� ���������ڰ� ���Ͽ� ���ų� �� ���� ���������Ѵ�.
 */

class Ab {
	void print1() {										// �������̵�
		System.out.println("Ab Ŭ������ pint1() �޼ҵ�");
	}
	void print2() {										// �����ε�
		System.out.println("Ab Ŭ������ print2() �޼ҵ�");
	}
}


class Bc extends Ab {
	@Override
	void print1() {										// �������̵�
		System.out.println("Bc Ŭ������ print1() �޼ҵ�");
	}
	
	void print2 (int a) {								// �����ε�
		System.out.println("Bc Ŭ������ print2(int a) �޼ҵ�");
	}
}


public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. Ab Ÿ���� ��ü ����
		
		Ab aa = new Ab();
		aa.print1();								 // Ab Ŭ������ print1() �޼ҵ� ȣ��
		aa.print2();								 // Ab Ŭ������ print2() �޼ҵ� ȣ��
		
		System.out.println("=================");
		
		// 2. Bc Ÿ���� ��ü ����, Bc Ÿ���� ������ ȣ��
		
		Bc bb = new Bc();
		bb.print1();								// Bc Ŭ������ print1() �޼ҵ� ȣ��
		bb.print2();								// Ab Ŭ������ print2() �޼ҵ� ȣ��, Bc�� print2(int a) �޼ҵ�� �����ε��Ǿ��⶧���� �Ű������� ���ԵǾ�� �Ѵ�.
		bb.print2(1);								// Bc Ŭ������ print2() �޼ҵ� ȣ��
		
		System.out.println("=================");
		
		// 4. Ab Ÿ���� ��ü ����, Bc Ÿ���� ������ ȣ��
		
		Ab cc = new Bc();
		cc.print1();								// Ab Ŭ������ print1() �޼ҵ尡 ȣ��ǳ�, �������ε����� ���� Bc Ŭ������ print1()���� ����Ǿ� ���
		cc.print2();								// Ab Ŭ������ print2() �޼ҵ� ȣ��
		// cc.print2(1);							// Ab Ÿ������ ��ü�� ���������Ƿ� Bc Ŭ������ �޼ҵ�� ���� �Ұ�
	}

}
