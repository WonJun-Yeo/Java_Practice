package chap17.EX09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* Map
 * 		key는 중복되면 안된다.  => equals(), hashCode()를 재정의해야 한다.
 * 
 */

// equals(), hashCode() 를 재정의 하지 않은 일반 클래스
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

//equals() 재정의, hashCode() 재정의X 클래스
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


//equals(), hashCode() 를 재정의 한 클래스
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
		// 1. 두 메소드 모두 오버라이딩 하지 않은 경우 : 두 객체 모두 Map의 key로 들어간다.
		Map<A, String> hashMap1 = new HashMap();
		
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		
		System.out.println("===================================");
		
		// 2. equals() 재정의, hashCode() 재정의X
		Map<B, String> hashMap2 = new HashMap();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
		hashMap2.put(b1, "첫번째");
		hashMap2.put(b2, "두번째");
		
		System.out.println(hashMap2.size());
		System.out.println(hashMap2);

		System.out.println("===================================");
		
		// 3. equals(), hashCode() 재정의
		Map<C, String> hashMap3 = new HashMap();
		
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode() + ", " + c2.hashCode());
		
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		
		System.out.println(hashMap3.size());
		System.out.println(hashMap3);

		
		
		
		
		
		
		
		
	}

}
