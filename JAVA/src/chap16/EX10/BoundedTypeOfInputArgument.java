package chap16.EX10;

/* Generic �޼ҵ忡�� �Ű����� ���� ����
 * 
 */

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {									// Generic Ŭ����
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

/*�Ϲ� Ŭ����, �Ϲ� �޼ҵ�,�Ű������� ������ Ÿ���� Generic Ÿ��
 * 
 */
class Test {
	void method1 (Goods<A> g) {}						// g�� �Ű������� A Ŭ���� Ÿ�� ����
	void method2 (Goods<?> g) {}						// g�� �Ű������� A,B,C,D Ŭ���� Ÿ�� ���� (���Ŭ���� ����)
	void method3 (Goods<? extends B> g) {}				// g�� �Ű������� B, C, D Ŭ���� Ÿ�� ����
	void method4 (Goods<? super B> g) {}				// g�� �Ű������� A, B Ŭ���� Ÿ�Ը� ����
}


public class BoundedTypeOfInputArgument {

	public static void main(String[] args) {
		Test t = new Test();
		
		// 1. Method1 : A Ÿ���� ��ü�� �� �� �ִ�.
		t.method1(new Goods<A>());
		//t.method1(new Goods<B>());
		//t.method1(new Goods<C>());
		//t.method1(new Goods<D>());
		
		// 2. Method2 : ��� Ÿ���� ��ü�� �� �� �ִ�.
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		// 3. Method3 : B������ ��ü(B�� ������ ����Ŭ��������)�� �� �� �ִ�.
		//t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());

		// 4. Method4 : B�� ������ ����Ŭ���������� �� �� �ִ�.
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
		//t.method4(new Goods<C>());
		//t.method4(new Goods<D>());


		
		
		
		
	}

}
