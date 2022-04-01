package chap17.EX06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* Set : �ߺ��� ���� ���� �� ����.
 equals() �޼ҵ�, hashCode() �޼ҵ尡 ���ǵǾ� �־���Ѵ�.
 String, Integer Ŭ�������� equals() �޼ҵ�� hashCode()�� �ߺ����� �������� �ʵ��� �����ǵǾ� �ִ�.
 String, Integer ������ Ÿ���� �ƴ� Ư�� ��ü�� set�� ������ ���, �ߺ������� ���� ���ϵ��� �ϱ����ؼ��� equals()�� hashCode() �޼ҵ带 ������ �ؾ��Ѵ�.
 ���������� ���� Object Ŭ������ equals()�� ==�� ����. (stack �޸��� ���� ��)
*/ 


// equals(), hashCode() �� ������ �������� Ŭ����
class A {
	int data;
	public A (int data) {
		this.data = data;
	}
}

//equals()�� ������, hashCode()�� ������ �������� Ŭ����
class B {
	int data;
	public B (int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {											// �ּ� �񱳰� �ƴ� ��ü ������ Ư�� �ʵ� ���� ���ϵ��� ������
		if (obj instanceof B) {													//** �߸� �ٿ�ĳ������ ���, ���ܰ� �߻��� �� �ִ�. �̸� ����
			if (this.data == ((B)obj).data) {
				return true;
			}
		}
		return false;
	}
}

//equals(), hashCode()�� ������ �� Ŭ����
class C {
	int data;
	public C (int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {											// �ּ� �񱳰� �ƴ� ��ü ������ Ư�� �ʵ� ���� ���ϵ��� ������
		if (obj instanceof C) {													//** �߸� �ٿ�ĳ������ ���, ���ܰ� �߻��� �� �ִ�. �̸� ����
			if (this.data == ((C)obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {														// Objects.hash(�ʵ��, �ʵ��, �ʵ��) : �������� �ʵ��� hashCode�� ���� ������ �� �ִ�.
		return Objects.hash(data);
		
		// return data;															// data �ʵ��� ���� ������� ������ hashCode�� �����ϰ� �����ϴ� ����
	}
}

public class HashSetMechanism {

	public static void main(String[] args) {
		// 1. equals(), hashCode() �� ������ ���� ���� ���� : �ߺ����� ����ȴ�.
		Set<A> hashSet1 = new HashSet();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1 == a2);											// stack ������ �޸𸮰� �� (heap������ �ּҰ�)
		System.out.println(a1.equals(a2));										// ���������� ���� Object Ŭ������ equals()�� ==�� ����.
		System.out.println(a1.hashCode() + ", " + a2.hashCode());				// 16���� hashCode�� 10������ �ٲپ� ���
		
		hashSet1.add(a1);
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size());
		
		System.out.println("=========================================");
		
		// 2. equals()�� ���� ���ϵ��� ������, hashCode()�� ������ �������� ���� : �ߺ����� ����ȴ�.
		Set<B> hashSet2 = new HashSet();
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));										// ���� ���ϵ��� ������ �Ǿ� �ִ�.
		System.out.println(b1.hashCode() + ", " + b2.hashCode());
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size());
		
		System.out.println("=========================================");
		
		// 3. equals()�� ���� ���ϵ��� ������, hashCode()�� ������ �������� ���� : �ߺ����� ����ȴ�.
		
		Set<C> hashSet3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));										// ���� ���ϵ��� ������ �Ǿ� �ִ�.
		System.out.println(c1.hashCode() + ", " + c2.hashCode());				// hashCode�� ���������� ������ �Ǿ� �ִ�.
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		
		System.out.println(hashSet3.size());
		
		
		
		
		
		
		
	}		
}

