package chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

/* 	���ҽ� �ڵ����� ���� ó��
 * JDK 1.7 ���� ���ҽ��� �ڵ����� ������ �� �ִ� ��������
 * ���� �߻� ���ο� ���� ���� try/catch �Ϸ� ��, �ڵ����� is.close() ����
 * ����
 * 	1. ����ϴ� ��ü�� AutoCloseable �������̽��� ������ ��ü���� �Ѵ�.
 * 	2. �ݵ�� close() �޼��带 �����ؾ��Ѵ�.
 * ���� 2���� ������ ������ ��, �ڵ� ���ҽ�����
 * try{(�ڵ����� ���ҽ��� ������ ��ü ����)} catch{} finally{}
 */



public class TryWithResource_01 {

	public static void main(String[] args) {
		
		// ���� ���ҽ� ����
		
		System.out.println("���ڸ� �Է��ϼ���.");
		
		InputStreamReader isr2 = null;							// ���� �ݵ�� �޸𸮿��� ��ü�� �������־����, isr2.close()
		
		try {
			isr2 = new InputStreamReader(System.in);			// System.in : �ֿܼ��� �� �� �Է��� �ް�� ó��
			char input = (char) isr2.read();					// �Ϲݿ��� (checked ����) : IOException : ��Ʈ��ũ���� ��(����)�� �о���� ���C �� ���� �߻�
			System.out.println("�Է±��� : " + input);
		} catch (IOException e) {
			e.printStackTrace();								// try ������� ���ܰ� �߻��� ��� �ڼ��� ������ ���
		} finally {												// ��ü�� ��� ��, �޸� �������� ����
			if (isr2 != null) {									// ���ҽ� ���� : isr2.close()
				try {
					isr2.close();								// IOException �߻����� try/catch �� ��������Ѵ�.
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		// 2. �ڵ� ���ҽ� ����
		// Try With Resource : try(with resource : ��ü �޸� �ε�) {}
		try (InputStreamReader isr1 = new InputStreamReader(System.in);) {								// InputStreamReader�� AutoCloseable �������̽��� �����ϰ� �ִ�. & close()�޼ҵ带 ������ �ִ�.
			char input = (char) isr1.read();
			System.out.println("�Է±��� : " + input);
		} catch (IOException e) {
			e.printStackTrace();
		}	// finally ����� �����ϴ��� ��ü�� �ڵ����� close()
		
	}
}