package chap12.EX08;

/* �������̽� ���ο� static Ű�� �� �޼ҵ�
 * �ڽĿ��� ��ü �������� �������̽������� �ٷ� ȣ�� ����
 * default ó�� �����ΰ� �����Ѵ�.
 * java 1.8 (8 version) ���� ���Ӱ� �߰��� ���
 * 
 */

/*	�������̽�(Interface) ���� �������
 * �ʵ� : public static final		��������
 * �޼ҵ� : public abstract		��������
 * 		  public default : �����ΰ� �ִ� �޼ҵ� (java 1.8 �̻�)
 * 		  public static : ���úΰ� �ְ�, ��ü �������� ȣ���� ������ �޼ҵ� (java 1.8 �̻�)
 */

interface A {
	static void abc() {
		System.out.println("A �������̽��� �����޼ҵ� abc()");
	}
}




public class StaticMethod {

	public static void main(String[] args) {
		// static �޼ҵ� ȣ��
		A.abc();							// ��ü �������� �������̽������� �ٷ� ȣ��
	}

}
