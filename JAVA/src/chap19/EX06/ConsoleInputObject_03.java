package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* �ܼ� ��ǲ�� �ѱ� ó��
 * 1byte�� ������ �ѱ��� ó���� �� ����.
 * ���� �迭�� �о�� �ѱ� ó���� �����ϴ�.
 * 
 * InputStream System.in
 * 
 * 
 */

public class ConsoleInputObject_03 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;										// System.in : ������ ������ �� ���� ������ �� �ִ�.
		System.out.println("�ѱ��� �Է��ϼ��� >>");
		
		
		// 2. n-byte�� �о� ó�� (byte[] �迭�� ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);								// \r�� \n�� ���Ե� ����
		
		String str1 = new String(byteArray1, 0, count1, Charset.forName("MS949"));
		System.out.println(str1);
		System.out.println("�迭 ���� r�� n�� ������ �� ���� : " + count1);
		
		System.out.println("========================");
		
		// 3. n-byte ���� �б� (length ��ŭ �о�ͼ� byte[] �迭 offset[index] ��ġ�� ����)
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length);
		
		String str2 = new String(byteArray2, 0, offset + length, Charset.defaultCharset());
		System.out.println(str2);
	}

}
