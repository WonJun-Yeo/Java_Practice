package chap10.EX07.EX03;

/*	HashMap : key = value �� ����Ǵ� �ڷᱸ��
 * HashMap<key, value> �ؽ��ʸ� = new asdgsdf 
 * key�� �ߺ��� �� ����.
 * �ϳ��� key�� �ϳ��� value�� �� �� �ִ�.
 * HashMap�� Key�� ��ü�� ������ ���, key�� ����Ǵ� ��ü�� �ߺ����� �ʴ� ������ ����(HashCode)�� �������־�� �Ѵ�.
 * Object Ŭ������ hashcode() �޼ҵ带 ����ؼ�, ��ü�� key�� ����� ��� �ߺ����� �ʵ��� ������ �� �ִ�.
 */

import java.util.HashMap;


class A {									// equals() �޼ҵ常 �������̵�
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



class B {									// hashCode() + equals() �޼ҵ带 �������̵�
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
		hm1.put(1, "������1");
		hm1.put(1, "������2");						// 1�� value�� "������1"���� "������2"�� �ٲ�
		hm1.put(2, "������3");
		
		System.out.println(hm1);
		
		System.out.println();
		
		HashMap<A, String> hm2 = new HashMap<>();
		
		hm2.put(new A("ù��°"), "������1");
		hm2.put(new A("ù��°"), "������2");
		hm2.put(new A("�ι�°"), "������3");
		
		System.out.println(hm2);					// HashMap�� �߸� ������ ���
		
		
		System.out.println("==========================");
		
		/* hm3�� HashMap�� ��ü
		 * hm3�� toString() �޼ҵ尡 �ּҰ� ������ ���̾ƴ϶�, key�� value�� ��µǵ��� �����ǵǾ����ִ�.
		 */
		
		
		HashMap<B, String> hm3 = new HashMap<>();				
		
		hm3.put(new B("ù��°"), "������1");
		hm3.put(new B("ù��°"), "������2");
		hm3.put(new B("�ι�°"), "������3");
		
		System.out.println(hm3);
		
		System.out.println();
		
		System.out.println("ù��°".hashCode());
		System.out.println("ù��°".hashCode());
		
		System.out.println("�ι�°".hashCode());
		
	}

}
