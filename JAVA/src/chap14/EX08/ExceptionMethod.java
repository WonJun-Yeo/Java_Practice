package chap14.EX08;

/*	�޼ҵ��� ���ܸ� main method ���� throws
 * 		main method���� ���ܰ� ������ ���, ������ ���â�� ���� ���α׷��� ����ȴ�.
 * 		main method�� ���� ó���� ���� �ʴ´�.
 */

class AA {
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");									// Runtime Exception, NumberFormatException �߻� 
	}
}





public class ExceptionMethod {

	public static void main(String[] args) {
		// 1. ��ü ����
		AA aa = new AA();
		
		
		// 2. �޼ҵ� ȣ��
		
		try {
			aa.abc();												// Runtime Exception �̹Ƿ� ������ �ܰ迡�� ���ܰ� �߻����� �ʰ�, ����� ���ܰ� �߻��ȴ�.
		} catch (NumberFormatException e) {
			e.printStackTrace();									// ������ �ڼ��� ������ ���
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}
		
		
		System.out.println("���α׷�����");
		
		
	}

}
