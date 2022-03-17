package chap10.EX07.EX01;

/*	Object Ŭ������ toString() �޼ҵ�
 * ��ü�� ����� ��, Object Ŭ������ toString() �޼ҵ尡 ȣ��ȴ�.
 * toString() : ��Ű����.Ŭ������@�ؽ��ڵ� �� ��µȴ�.
 * �ؽ��ڵ� : ��ü�� ����Ű�� �ִ� heap�޸��� ������ �ؽ��ڵ�(16����)�� ��ȣȭ�Ѱ�
 * toString() �޼ҵ�� �Ϲ������� �������Ͽ� ���ȴ�. (ex. �ʵ尪, �޼ҵ� ȣ��� ������)
 */

class A {
	int m = 3;
	int n = 4;
}

class B {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a ������ �� : " + a + "b ������ �� : " + b;
	}
}


public class ObjectMethod_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a);								// .toString() �� �����Ȱ�
		System.out.println(a.toString());
		System.out.printf("%x\n", a.hashCode());			// %x : 16����  hashCode() �޼ҵ�� �ؽ��ڵ带 ����ϴ� Object Ŭ������ �޼ҵ�
		System.out.println(a.hashCode());					// println�� 10������ ��ȯ�Ǿ� ��ȯ
		
		System.out.println();
		
		B b = new B();
		System.out.println(b);								// toString() �޼ҵ带 �������ؿ� ��ü�� �ʵ� ������ ���
		
		
		
		
		
	}

}
