package chap19.EX03;

import java.io.UnsupportedEncodingException;

/* UTF16
 * �ѱ�, ���� ��� 2byte <��������>
 * ���� �տ� 2byte BOM �ĺ��ڵ尡 �߰��ȴ�.
 * 
 * UTF8
 * �ѱ� 3byte, ���� 1byte <��������>
 * 
 */

public class UTF16_VS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// ����
		
		byte[] b1 = "abc".getBytes("UTF-16");
		byte[] b2 = "abc".getBytes("UTF-8");

		System.out.println(b1.length);				// BOM : 2byte, "abc" : 6byte
		System.out.println(b2.length);
		
		
		for (byte b : b1) {
			System.out.printf("%02X", b);			// 16������ ���
			System.out.print(" ");
		}
		System.out.println();
		
		for (byte b : b2) {
			System.out.printf("%02X", b);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		
		System.out.println("================================");
		
		// �ѱ�
		
		byte[] b3 = "������".getBytes("UTF-16");
		byte[] b4 = "������".getBytes("UTF-8");
		
		System.out.println(b3.length);				// BOM : 2byte, "������" : 6byte
		System.out.println(b4.length);				// �ѱ� : 3byte�� ó��
		
		for (byte b : b3) {
			System.out.printf("%02X", b);
			System.out.print(" ");
		}
		System.out.println();
		
		for (byte b : b4) {
			System.out.printf("%02X", b);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
		
		
		
		
		
		
		
		
		
	}

}
