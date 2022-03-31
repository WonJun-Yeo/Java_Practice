package chap16.EX08;


class A {}
class B extends A {}
class C extends B {}

// Generic 클래스
// Generic 타입에 들어오는 객체를 제한 (extends)
class D <T extends B> {						// T의 타입은 class B와 C만 올 수 있다.
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
		// D <A> d1 = new D<A>();			// T에 들어갈 객체를 제한, B와 C만 가능 
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		
		/* 
		 * 타입을 지정하지 않고 객체 생성 시, 최상위 타입으로 설정된다.
		 */
		D d4 = new D();						// = D<B> d4 = new D<B>();
		
		
		
		//d2.set(new A());					// 불가능
		d2.set(new B());
		d2.set(new C());
		
		//d2.set(new A());					// 불가능
		//d3.set(new B());					// 불가능
		d3.set(new C());
		
		//d4.set(new A());
		
		
	}

}
