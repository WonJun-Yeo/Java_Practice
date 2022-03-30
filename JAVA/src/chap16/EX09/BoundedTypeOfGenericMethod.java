package chap16.EX09;

/* Generic �޼ҵ��� ���� ����
 * 
 */

class A {															// �Ϲ�Ŭ����
	// Number : Boolean, Character �� ������ 6���� Ÿ��(Byte, Short, Integer, Long, Float, Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue());							// intValue() : Number Ÿ���� �޼ҵ�, ���������� ���
	}
}


interface MyInterface {
	void print();													// �����ΰ� ������ �߻�޼ҵ�, �������̽� �������� public abstract �� �����Ǿ� ����
}


class B {															// **Generic Ÿ�� ���ο��� �������̽��� ���� �� ���� extends�� ����Ѵ�.
	public <T extends MyInterface> void method2 (T t) {				// T Ÿ�Կ� �ü� �ִ� ���� MyInterface�� ������ Ŭ�����̴�.
		t.print();
	}
}

class C implements MyInterface {									// interface�� ������ Ŭ����
	@Override
	public void print() {											// interface ���� �޼ҵ�� public abstract�� �����Ǿ� �־� overriding�� �� �����ؾ� �Ѵ�.
		System.out.println("interface�� ������ Ŭ�������� ���");
	}
}

class D {
	public <T extends String> void abc(T t) {
		System.out.println(t);										// String Ÿ�Կ��� toString()�޼ҵ�� �����ǵǾ� �־� ���� ��µȴ�.
		System.out.println(t.toString());
	}
}


public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();												// �Ϲ�Ŭ���� ��ü ���� ��, Generic �޼ҵ� ȣ��
		a.<Double> method1(5.8);
		a.method1(22.5);											// �Ű������� ���� Ÿ���� �ĺ��� �� ������ <> ��������
		
		a.<Long> method1(1000000L);
		a.method1(100L);
		
		a.<Float> method1(100F);
		a.method1(1000F);
		
		// a.<Boolean> method1(true);								// Boolean�� Character�� Number Ÿ���� �ƴϴ�.
		
		B b = new B();												// �Ϲ�Ŭ���� ��ü ���� ��, Generic �޼ҵ� ȣ��
		
		// �������̽��� ������ ���� �͸� Ŭ����
		b.<MyInterface> method2 (new MyInterface() {				// Method2�� �Ű������� �� �� �ִ� ���� MyInterface�� ������ �ڽ�Ŭ����
			@Override
			public void print() {									// print() �޼ҵ� ����
				System.out.println("�͸�Ŭ������ ���");
			}
		});
		
		// �͸�Ŭ������ Generic �޼ҵ� ȣ�� ��, �Ű������� �����ֱ�
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("�͸����� ó���� Ŭ������ ���");
			}
		});
		
		// �������̽��� ������ �ڽ� Ŭ���� (��ũ��Ʈ Ŭ����)
		b.<MyInterface> method2(new C());							// MyInterface Ÿ�� & MyInterface�� ������ C������
		
		
		D d = new D();
		d.<String> abc("�ȳ�");
		d.abc("�ϼ���");
		
		
		
	}
	
}
