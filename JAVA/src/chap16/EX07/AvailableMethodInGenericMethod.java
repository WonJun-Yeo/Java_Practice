package chap16.EX07;

/* 	Generic �޼ҵ� ���ο��� ��� ������ �޼ҵ�
 * Object Ŭ������ �޼ҵ常 ����� �����ϴ�.
 */

class A {
	public <T> void method (T t) {
		//System.out.println(t.length());								// length() �޼ҵ�� String Ŭ������ �޼ҵ�
		System.out.println(t.equals("�ȳ�"));								// equals() �޼ҵ�� Object Ŭ������ �޼ҵ�
	}
}


public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String> method ("�ȳ�");

	}

}
