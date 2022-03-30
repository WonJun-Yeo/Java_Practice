package chap16.EX07;

/* 	Generic �޼ҵ� ���ο��� ��� ������ �޼ҵ�
 * Object Ŭ������ �޼ҵ常 ����� �����ϴ�.
 */

class A {
	public <T> void method (T t) {
		//System.out.println(t.length());								// length() �޼ҵ�� String Ŭ������ �޼ҵ�
		System.out.println(t.equals("�ȳ�"));								// equals() �޼ҵ�� Object Ŭ������ �޼ҵ�
	}
	
	public <T extends Object> void method2(T t) {						// extends Object �� �����Ǿ� �ִ�.
		System.out.println(t.equals("�ݰ����ϴ�."));						// equals() �޼ҵ�� Object Ŭ������ �޼ҵ�
	}
	
	
	public <T extends String> void method3(T t) {
		System.out.println(t.length());
	}
	
}




public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String> method ("�ȳ�");

	}

}
