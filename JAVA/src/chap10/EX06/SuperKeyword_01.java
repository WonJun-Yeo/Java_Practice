package chap10.EX06;

/* super : �θ� Ŭ����
 * super Ű���带 ����ϸ�, �������̵� �Ǿ� �ִ��� ����������� ������ �θ� �ڵ�� ������ ȣ���Ѵ�.
 */
// this : �ڽ��� ��ü

// �������̵� : �θ��� �޼ҵ尡 ������ �����Ǿ��� ���� �ƴ϶�, �������ִ� ���̴�.




class A {
	void abc() {
		System.out.println("A class�� abc �޼ҵ�");
	}
}

class B extends A {
	@Override
	void abc() {
		System.out.println("B class�� abc �޼ҵ�");
	}
	
	void bcd() {
		abc();						// �տ� Ű���尡 ���ٸ� this.abc ���� this Ű���尡 ������ ��, this�� �ڽ��� ��ü�� ����
	}
}


public class SuperKeyword_01 {

	public static void main(String[] args) {
		// 1. ��ü ����
		
		B bb = new B();
		
		
		// 2. �޼ҵ� ȣ��
		
		bb.bcd();

	}

}
