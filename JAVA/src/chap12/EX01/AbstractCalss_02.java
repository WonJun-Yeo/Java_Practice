package chap12.EX01;

/* �߻� �޼ҵ带 ����ϴ� 2��° ��� : �ڽ� ��ü �������� �߻� Ŭ������ Ȱ���ϴ� ���
* ���� : �ڽ� Ŭ���� ������ ���� �ʴ´�. �ӽ������� ����� ��� ����
* ���� : ���� ���� ��ü�� �����ؾ��� ��� �ڵ尡 �������. �̶��� ��ũ��Ʈ Ŭ������ ����� ������� ���
*/


abstract class AAA {
	abstract void abc();						// �߻�޼ҵ�
}



public class AbstractCalss_02 {

	public static void main(String[] args) {
		
		AAA aaa = new AAA() {					// �͸� ��ü�� Ȱ����, �߻�޼ҵ带 ��ũ��ƮŬ���� �������� ����
			void abc() {
				System.out.println("���2��");
			}
		};
		
		aaa.abc();
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("���2");
			}
		};
		
		aaa2.abc();
	}

}
