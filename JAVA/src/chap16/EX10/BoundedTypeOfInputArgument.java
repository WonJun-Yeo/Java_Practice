package chap16.EX10;

/* Generic 메소드에서 매개변수 값을 제한
 * 
 */

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {									// Generic 클래스
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

/*일반 클래스, 일반 메소드,매개변수로 들어오는 타입이 Generic 타입
 * 
 */
class Test {
	void method1 (Goods<A> g) {}						// g의 매개변수로 A 클래스 타입 가능
	void method2 (Goods<?> g) {}						// g의 매개변수로 A,B,C,D 클래스 타입 가능 (모든클래스 가능)
	void method3 (Goods<? extends B> g) {}				// g의 매개변수로 B, C, D 클래스 타입 가능
	void method4 (Goods<? super B> g) {}				// g의 매개변수로 A, B 클래스 타입만 전성
}


public class BoundedTypeOfInputArgument {

	public static void main(String[] args) {
		Test t = new Test();
		
		// 1. Method1 : A 타입의 객체만 들어갈 수 있다.
		t.method1(new Goods<A>());
		//t.method1(new Goods<B>());
		//t.method1(new Goods<C>());
		//t.method1(new Goods<D>());
		
		// 2. Method2 : 모든 타입의 객체가 들어갈 수 있다.
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		// 3. Method3 : B까지의 객체(B를 포함한 하위클래스까지)가 들어갈 수 있다.
		//t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());

		// 4. Method4 : B를 포함한 상위클래스까지가 들어갈 수 있다.
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
		//t.method4(new Goods<C>());
		//t.method4(new Goods<D>());


		
		
		
		
	}

}
