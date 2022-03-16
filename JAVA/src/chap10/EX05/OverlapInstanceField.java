package chap10.EX05;

class AA {						// ���� Ŭ����
	int m = 3;					// �ν��Ͻ� �ʵ�
	
	void print() {
		System.out.println("AA class");
	}
}

class BB extends AA {			// �ڽ� Ŭ����
	int m = 4;					// �ν��Ͻ� �ʵ�
	
	@Override
	void print() {
		System.out.println("BB class");
	}
}

class CC extends AA {			// �ڽ� Ŭ����
	int m = 5;					// �ν��Ͻ� �ʵ�
	
	@Override
	void print() {
		System.out.println("CC class");
	}
}






public class OverlapInstanceField {

	public static void main(String[] args) {
		AA aa =  new AA();
		BB bb = new BB();
		CC cc = new CC();
		
		AA ab = new BB();
		AA ac = new CC();
		
		// �ν��Ͻ� �ʵ� ���
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(cc.m);
		
		System.out.println();
		
		// �ν��Ͻ� �ʵ�� Overriding�� ���� �ʴ´�.
		System.out.println(ab.m);
		System.out.println(ac.m);
		
		System.out.println("===================");
		
		// �ν��Ͻ� �޼ҵ�� Overriding �ȴ�.
		
		aa.print();
		bb.print();
		cc.print();
		
		System.out.println();
		
		ab.print();
		ac.print();
		
	}

}
