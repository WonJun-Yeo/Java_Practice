package chap14.EX06;

/* 	�Ϲݿ��� (checked exception) : ������ �ܰ迡�� ���ܰ� �߻�
 * 1. ����ó��
 * 2. throws �� ��������
 * 
 * main �޼ҵ尡 throws�� �̿��� ���� ��Ű�� ���, ������ ����ϰ� �����ȴ�. 
 * 
 */




public class ThrowsException_02 {

	public static void main(String[] args) throws ClassNotFoundException {
		// ������ ����, ���� �߻����� ���������� �۵�
		Class cls = Class.forName("java.lang.Object");
		
		// ������ ����X, ClassNotFoundException ���� �߻�
		Class cls2 = Class.forName("java.lang.Object123");

	}

}
