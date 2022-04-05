package chap17.EX09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* Map
 * 		key�� �ߺ��Ǹ� �ȵȴ�.  => equals(), hashCode()�� �������ؾ� �Ѵ�.
 * 
 */

// equals(), hashCode() �� ������ ���� ���� �Ϲ� Ŭ����
class A {
	int data;
	
	public A(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "" + data;
	}
}

//equals() ������, hashCode() ������X Ŭ����
class B {
	int data;
	
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			if (this.data == ((B)obj).data) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "" + data;
	}
	
}


//equals(), hashCode() �� ������ �� Ŭ����
class C {
	int data;
	
	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof C) {
			if (this.data == ((C)obj).data) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}
	
	@Override
	public String toString() {
		return "" + data;
	}
}


public class HashMapMechanism {

	public static void main(String[] args) {
		// 1. �� �޼ҵ� ��� �������̵� ���� ���� ��� : �� ��ü ��� Map�� key�� ����.
		Map<A, String> hashMap1 = new HashMap();
		
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		hashMap1.put(a1, "ù��°");
		hashMap1.put(a2, "�ι�°");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		
		System.out.println("===================================");
		
		// 2. equals() ������, hashCode() ������X
		Map<B, String> hashMap2 = new HashMap();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
		hashMap2.put(b1, "ù��°");
		hashMap2.put(b2, "�ι�°");
		
		System.out.println(hashMap2.size());
		System.out.println(hashMap2);

		System.out.println("===================================");
		
		// 3. equals(), hashCode() ������
		Map<C, String> hashMap3 = new HashMap();
		
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode() + ", " + c2.hashCode());
		
		hashMap3.put(c1, "ù��°");
		hashMap3.put(c2, "�ι�°");
		
		System.out.println(hashMap3.size());
		System.out.println(hashMap3);

		
		
		
		
		
		
		
		
	}

}
