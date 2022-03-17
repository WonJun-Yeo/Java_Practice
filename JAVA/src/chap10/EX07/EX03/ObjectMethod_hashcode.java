package chap10.EX07.EX03;

/*	HashMap : key = value 로 저장되는 자료구조
 * HashMap<key, value> 해쉬맵명 = new asdgsdf 
 * key는 중복될 수 없다.
 * 하나의 key에 하나의 value가 올 수 있다.
 * HashMap에 Key에 객체를 저장할 경우, key에 저장되는 객체가 중복되지 않는 고유한 정보(HashCode)를 저장해주어야 한다.
 * Object 클래스의 hashcode() 메소드를 사용해서, 객체가 key에 저장될 경우 중복되지 않도록 설정할 수 있다.
 */

import java.util.HashMap;


class A {									// equals() 메소드만 오버라이딩
	String name;
	
	A(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}



class B {									// hashCode() + equals() 메소드를 오버라이딩
	String name;
	
	B(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}

public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");						// 1의 value가 "데이터1"에서 "데이터2"로 바뀜
		hm1.put(2, "데이터3");
		
		System.out.println(hm1);
		
		System.out.println();
		
		HashMap<A, String> hm2 = new HashMap<>();
		
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		
		System.out.println(hm2);					// HashMap이 잘못 구현된 경우
		
		
		System.out.println("==========================");
		
		/* hm3는 HashMap의 객체
		 * hm3는 toString() 메소드가 주소가 찍히는 것이아니라, key와 value가 출력되도록 재정의되어져있다.
		 */
		
		
		HashMap<B, String> hm3 = new HashMap<>();				
		
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		
		System.out.println(hm3);
		
		System.out.println();
		
		System.out.println("첫번째".hashCode());
		System.out.println("첫번째".hashCode());
		
		System.out.println("두번째".hashCode());
		
	}

}
