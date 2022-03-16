package chap10.EX05;

/* 	�ν��Ͻ� �޼ҵ� �������̵� : ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵� �ȴ�.
 * ��Ӱ��迡�� �ν��Ͻ� �ʵ�, static �ʵ�, static �޼ҵ�� �������̵� ���� �ʴ´�. (�������̵� ��ü�� �޼ҵ忡 �ϴ°Ŵϱ� �ʵ�� ���� �ȵǴ°� �ϵ�)
 * �������̵� �Ҷ��� �ñ״�ó(����Ÿ��, �޼ҵ��, �Ű����� ������ Ÿ��, �Ű����� ����)�� ���ƾ� �Ѵ�. 
 */

class A {
	
	A () {}										// �⺻�����ڴ� �ٸ� �����ڰ� ���� ��� ������ �����ϴ�.
	
	void print() {
		System.out.println("Class A ���");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("Class B ���");
	};
}

class C extends A {
	@Override
	void print() {
		System.out.println("Class C ���");
	};
}



public class MethodOverriding {

	public static void main(String[] args) {
		// 1. A Ÿ��, A ������
		
		A a = new A();
		a.print();
		
		// 2. B Ÿ��, B ������
		
		B b = new B();
		b.print();
		
		// 3. C Ÿ��, C ������
		
		C c = new C();
		c.print();
		
		System.out.println("======================================");
		
		// 4. A Ÿ��, B ������
		
		A ab = new B();						// �������̵� �Ǿ� A�� print() �޼ҵ� ȣ�� ��, B�� print() ��������� ��µȴ�.
		ab.print();
		
		A ac = new C();						// �������̵� �Ǿ� A�� print() �޼ҵ� ȣ�� ��, C�� print() ��������� ��µȴ�.
		ac.print();
		
		System.out.println("======================================");
		
		A[]	 arr = {ab, ac};				// �迭�� A Ÿ���� ��ü�� ����
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		
		System.out.println("======================================");
		
		for (A k : arr) {
			k.print();
		}
		
		
		
		

	}

}
