package chap10.EX06;

/*	this() �� super()�� ȥ��
 * this() :  �ڽ� ��ü�� ������ ȣ��
 * super() : �θ� ��ü�� ������ ȣ��
 * �� �� ������ ���ο����� ���Ǹ�, �׻� ������ ������ ù ���ο� �;��Ѵ�.
 */

class AAAA {
	AAAA() {
		this(3);
		System.out.println("AAAA ������");
	}
	
	AAAA(int a) {
		System.out.println("AAAA �Ű����� ���� 1�� ������ " + a);
	}
}

class BBBB extends AAAA {
	BBBB(){
		this(3);
		System.out.println("BBBB ������");
	}
	
	BBBB (int b) {
		// super(); �� �����Ǿ� �ִ�.
		System.out.println("BBBB �Ű����� ���� 1�� ������ " + b);
	}
}


public class SuperMethod_02 {

	public static void main(String[] args) {
		// 1. �θ� Ŭ���� ��ü ����
		
		AAAA aaaa1 = new AAAA();
		
		System.out.println();
		
		AAAA aaaa2 = new AAAA(3);
		
		System.out.println("====================");
		
		// 2. �ڽ� Ŭ���� ��ü ����
		
		BBBB bbbb1 = new BBBB();
		
		System.out.println("====================");
		
		// 3. �ڽ� Ŭ���� ��ü ���� (�Ű����� 1���� ������ ȣ��)
		
		BBBB bbbb2 = new BBBB(3);

	}

}
