package chap10.EX06;

// Ű����� ��Ī

/*	super Ű���� : �θ�Ŭ������ ��Ī
 * �޼ҵ� �� ������ ���ο��� ���
 * �ʵ��, �޼ҵ�� �տ� ���
 */

/*	this Ű���� : �ڽ��� ��ü�� ��Ī
 * �޼ҵ� �� ������ ���ο��� ���
 * �ʵ��, �޼ҵ�� �տ� ���
 */



// �޼ҵ�� ������ ȣ��

/*	super() : ������ ���ο����� ���Ǵ� �޼ҵ�
 * �θ� �����ڸ� ȣ���� �� ���
 * �ݵ�� ù ���ο� ��ġ�ؾ� �Ѵ�.
 */

/*	this() : ������ ���ο����� ���Ǵ� �޼ҵ�
 * �ڽ��� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
 * �ݵ�� ù ���ο� ��ġ�ؾ� �Ѵ�.
 */



class AAA {
	AAA() {
		System.out.println("AAA ������");
	}
}

class BBB extends AAA {
	BBB() {
		super();									// �θ� Ŭ������ �⺻������
		System.out.println("BBB ������");
	}
}

class CCC {
	
	CCC(){};
	
	CCC(int a) {
		System.out.println("CCC ������ " + a);
	}
}

class DDD extends CCC {
	DDD() {
		super();
	}
	DDD (int a) {
		super(3);
		System.out.println("DDD ������ �Ű����� ���� 1�� " + a);
	}
}

public class SuperMethod_01 {

	public static void main(String[] args) {
		// 1. ��ü ����
		
		AAA aaa = new AAA();
		
		System.out.println("============================");
		
		BBB bbb = new BBB();
		
		System.out.println("============================");
		
		DDD ddd = new DDD();
		
		System.out.println("============================");
		
		DDD ddd2 = new DDD(5);
		
		
	}

}
