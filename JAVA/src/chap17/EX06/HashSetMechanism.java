package chap17.EX06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* Set : 중복된 값을 넣을 수 없다.
 equals() 메소드, hashCode() 메소드가 정의되어 있어야한다.
 String, Integer 클래스들은 equals() 메소드와 hashCode()가 중복값을 저장하지 않도록 재정의되어 있다.
 String, Integer 데이터 타입이 아닌 특정 객체를 set에 저장할 경우, 중복저장을 하지 못하도록 하기위해서는 equals()와 hashCode() 메소드를 재정의 해야한다.
 재정의하지 않은 Object 클래스의 equals()는 ==과 같다. (stack 메모리의 값을 비교)
*/ 


// equals(), hashCode() 가 제정의 되지않은 클래스
class A {
	int data;
	public A (int data) {
		this.data = data;
	}
}

//equals()는 재정의, hashCode()는 제정의 되지않은 클래스
class B {
	int data;
	public B (int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {											// 주소 비교가 아닌 객체 내부의 특정 필드 값을 비교하도록 재정의
		if (obj instanceof B) {													//** 잘못 다운캐스팅할 경우, 예외가 발생할 수 있다. 이를 방지
			if (this.data == ((B)obj).data) {
				return true;
			}
		}
		return false;
	}
}

//equals(), hashCode()가 제정의 된 클래스
class C {
	int data;
	public C (int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {											// 주소 비교가 아닌 객체 내부의 특정 필드 값을 비교하도록 재정의
		if (obj instanceof C) {													//** 잘못 다운캐스팅할 경우, 예외가 발생할 수 있다. 이를 방지
			if (this.data == ((C)obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {														// Objects.hash(필드명, 필드명, 필드명) : 여러개의 필드의 hashCode를 같게 설정할 수 있다.
		return Objects.hash(data);
		
		// return data;															// data 필드의 값을 기분으로 갑으면 hashCode를 동일하게 생성하는 원리
	}
}

public class HashSetMechanism {

	public static void main(String[] args) {
		// 1. equals(), hashCode() 가 제정의 되지 않은 상태 : 중복값이 저장된다.
		Set<A> hashSet1 = new HashSet();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1 == a2);											// stack 영역의 메모리값 비교 (heap영역의 주소값)
		System.out.println(a1.equals(a2));										// 재정의하지 않은 Object 클래스의 equals()는 ==과 같다.
		System.out.println(a1.hashCode() + ", " + a2.hashCode());				// 16진수 hashCode를 10진수로 바꾸어 출력
		
		hashSet1.add(a1);
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size());
		
		System.out.println("=========================================");
		
		// 2. equals()는 값을 비교하도록 재정의, hashCode()는 제정의 되지않은 상태 : 중복값이 저장된다.
		Set<B> hashSet2 = new HashSet();
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));										// 값을 비교하도록 재정의 되어 있다.
		System.out.println(b1.hashCode() + ", " + b2.hashCode());
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size());
		
		System.out.println("=========================================");
		
		// 3. equals()는 값을 비교하도록 재정의, hashCode()는 제정의 되지않은 상태 : 중복값이 저장된다.
		
		Set<C> hashSet3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));										// 값을 비교하도록 재정의 되어 있다.
		System.out.println(c1.hashCode() + ", " + c2.hashCode());				// hashCode가 같아지도록 재정의 되어 있다.
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		
		System.out.println(hashSet3.size());
		
		
		
		
		
		
		
	}		
}

