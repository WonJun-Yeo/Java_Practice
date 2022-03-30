package chap16.EX11;

/* Generic Ŭ������ ���
 * �ڽ� Ŭ���� ���� Generic Ŭ�������� �Ѵ�.
 * �ڽ� Ŭ������ �θ�Ŭ������ ���׸� ������ ���ų� �� ���ƾ� �Ѵ�.
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
		// 1. �θ� Generic class ����
		
		// Parent<String> p = new Parent<String>();							// ������ �ȵ� �ϼ��� ����
		// Parent<String> p = new Parent();									// �տ��� Ÿ���� ������ ���, �������� Ÿ�Լ���θ� ������ �� �ִ�.
		Parent<String> p = new Parent<>();									// ������� ���븸 ������ ���� �ִ�.
		
		p.set("�θ� Generic Ŭ����");
		System.out.println(p.get());
		
		
		Parent<Integer> i1 = new Parent<Integer>();
		i1.set(1);
		System.out.println(i1.get());
		
		System.out.println("==================================");
		
		// 2. �ڽ� Generic class ���� 1
		
		Child1 <String> c1 = new Child1();
		c1.set("�ڽ� Generic Ŭ����");											// �θ𿡼� ��ӵ� �޼ҵ�
		System.out.println(c1.get());										// �θ𿡼� ��ӵ� �޼ҵ�
		
		
		System.out.println("==================================");
		
		
		Child2 <String, Integer> c2 = new Child2();
		
		c2.set("�ڽ� Generic Ŭ����");											// �θ𿡼� ��ӵ� �޼ҵ�
		System.out.println(c2.get());										// �θ𿡼� ��ӵ� �޼ҵ�
		
		System.out.println();
		
		c2.setV(100);														// �ڽ�Ŭ������ �޼ҵ�
		System.out.println(c2.getV());										// �ڽ�Ŭ������ �޼ҵ�
		
	}

}
