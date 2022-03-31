package chap16.EX08;


class A {}
class B extends A {}
class C extends B {}

// Generic Ŭ����
// Generic Ÿ�Կ� ������ ��ü�� ���� (extends)
class D <T extends B> {						// T�� Ÿ���� class B�� C�� �� �� �ִ�.
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}


public class BoundTypeOfGeneric {

	public static void main(String[] args) {
		// D <A> d1 = new D<A>();			// T�� �� ��ü�� ����, B�� C�� ���� 
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		
		/* 
		 * Ÿ���� �������� �ʰ� ��ü ���� ��, �ֻ��� Ÿ������ �����ȴ�.
		 */
		D d4 = new D();						// = D<B> d4 = new D<B>();
		
		
		
		//d2.set(new A());					// �Ұ���
		d2.set(new B());
		d2.set(new C());
		
		//d2.set(new A());					// �Ұ���
		//d3.set(new B());					// �Ұ���
		d3.set(new C());
		
		//d4.set(new A());
		
		
	}

}
