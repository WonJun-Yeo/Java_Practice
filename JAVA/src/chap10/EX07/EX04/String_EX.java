package chap10.EX07.EX04;

// String���� ������ Ư¡ : ��ü�� ����ϸ� toString() �޼ҵ�� �ּҰ� ��ȯ�Ǿ� ������, ���� ��ȯ�ǵ��� �����ǰ� �Ǿ��ִ�.

class A {
	String name;
	A (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class String_EX {

	public static void main(String[] args) {
		
		String s0 = new String("�ȳ�");
		String s1 = "�ȳ�";			// String�� ���� ����
		
		System.out.println(s0);	
		System.out.println(s1);
		
		
		A a = new A("�ȳ�");
		System.out.println(a);
		
		
	}

}
