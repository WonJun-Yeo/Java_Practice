package Practice;

public class whileControlStatement {

	public static void main(String[] args) {
		// �⺻����
		int a = 0; 											// �ʱ��
		while(a < 10) {										// ���ǽ�
			System.out.println("a�� 10�̵ɶ����� ���");			// ���౸��
			a++;											// ������
		}
		
		// ���ѷ���
		int b = 0;
		while(b < 10) {
			b = 0;
			System.out.println("�������");
			b++;
		}
		
		// unreachable code
		int c = 0;
		while(c < 10) {
			c = 0;
			System.out.println("�������");
			c++;
		}
		System.out.println("������¾ȵ�");						// unreachable code
		
		
		
		
		
		
		
		
		
	}

}
