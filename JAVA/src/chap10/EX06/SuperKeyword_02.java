package chap10.EX06;

/* super : �θ� Ŭ����
 * super Ű���带 ����ϸ�, �������̵� �Ǿ� �ִ��� ����������� ������ �θ� �ڵ�� ������ ȣ���Ѵ�.
 */
// this : �ڽ��� ��ü

// �������̵� : �θ��� �޼ҵ尡 ������ �����Ǿ��� ���� �ƴ϶�, �������ִ� ���̴�.

class AA {
	int m;
	
	void abc() {
		System.out.println("AA class�� abc()�޼ҵ�");
		System.out.println(m);
	}
}

class BB extends AA {
	@Override
	void abc() {
		System.out.println("BB class�� abc()�޼ҵ�");
		System.out.println(m);
	}
	void bcd() {
		super.m = 300;
		super.abc();
	}
}

public class SuperKeyword_02 {

	public static void main(String[] args) {
		// ��ü ����
		
		BB bb = new BB();
		
		bb.bcd();
		
		System.out.println();
		
		bb.abc();

	}

}
