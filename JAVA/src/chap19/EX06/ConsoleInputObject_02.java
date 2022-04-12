package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_02 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;									// System.in �� ������������ �� ���� ���� �� �ִ�.
		System.out.println("������ �Է��ϼ��� >>");
		
		
		// 1. 1byte ���� �б�
		int data;
		while ((data = is.read()) != '\r') {						// ù��° read : �ֿܼ����� -1�� ������� �ʰ�, \r�� ó��
			System.out.print((char)data);
		}
		is.read();													// \n�� ������ ������� �Ѵ�.
		
		System.out.println();
		System.out.println();
		System.out.println("==================================");
		
		// 2. n-byte ���� �б� (byte[]�� ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);							// �ι�° read
		
		for (int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println("\t count1 = " + count1);
		}
		
		System.out.println("==================================");
		
		int count2;
		
		count2 = is.read(byteArray1);								// ����° read, �迭 ���ο� /r�� /n�� �迭 ���ο� ����.
		System.out.println(new String (byteArray1, 0, count2));
		
//		while ((count2 = is.read(byteArray1)) != '\r') {
//			System.out.println(new String (byteArray1));
//		}
		// is.read(); \n�� ���ۿ��� ������ ������Ѵ�.
		// �ٸ�, �迭���ο� \r\n�� ���� �޸𸮿� ���� ������ ���ۿ��� ���� �ʾƾ� �Ѵ�. 
		
		System.out.println("==================================");
		
		// 3. n-byte ���� �б� (byte[]�� offset���� length ���� byte ������ �б�)
		
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray2, offset, length);
		
		for (int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		is.close();													// ���� �������� ó��, �߰��� ó�� �� ��� �ٽ� ȣ���� ���ư���.

	}

}
