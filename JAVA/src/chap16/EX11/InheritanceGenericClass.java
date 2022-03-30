package chap16.EX11;

/* Generic 클래스의 상속
 * 자식 클래스 또한 Generic 클래스여야 한다.
 * 자식 클래스는 부모클래스의 제네릭 변수와 같거나 더 많아야 한다.
 */

class Parent<T> {
	T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}


class Child1 <T> extends Parent<T> {
	
}

class Child2 <T, V> extends Parent<T> {
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}


public class InheritanceGenericClass {

	public static void main(String[] args) {
		// 1. 부모 Generic class 생성
		
		// Parent<String> p = new Parent<String>();							// 생략이 안된 완성된 구문
		// Parent<String> p = new Parent();									// 앞에서 타입을 선언한 경우, 생성자의 타입선언부를 생략할 수 있다.
		Parent<String> p = new Parent<>();									// 꺽쇄안의 내용만 생략할 수도 있다.
		
		p.set("부모 Generic 클래스");
		System.out.println(p.get());
		
		
		Parent<Integer> i1 = new Parent<Integer>();
		i1.set(1);
		System.out.println(i1.get());
		
		System.out.println("==================================");
		
		// 2. 자식 Generic class 생성 1
		
		Child1 <String> c1 = new Child1();
		c1.set("자식 Generic 클래스");											// 부모에서 상속된 메소드
		System.out.println(c1.get());										// 부모에서 상속된 메소드
		
		
		System.out.println("==================================");
		
		
		Child2 <String, Integer> c2 = new Child2();
		
		c2.set("자식 Generic 클래스");											// 부모에서 상속된 메소드
		System.out.println(c2.get());										// 부모에서 상속된 메소드
		
		System.out.println();
		
		c2.setV(100);														// 자식클래스의 메소드
		System.out.println(c2.getV());										// 자식클래스의 메소드
		
	}

}
