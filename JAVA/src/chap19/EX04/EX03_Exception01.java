package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* 1. is1 : InputStream
 * 		�����η� ����
 * 		ms949.txt
 * 		����ó��
 * 2. is2 : InputStream
 * 		����η� ����
 * 		UTF-8.txt
 * 		����ó�� (try with resource �̿�)
 * 		close() �޼ҵ带 �ڵ����� ó��
 */



public class EX03_Exception01 {

	public static void main(String[] args) {
		// ���� Exception ó��
		File isFile1 = new File("D:\\YWJ\\JAVA\\src\\chap19\\EX04\\exception-ms949.txt");
		InputStream is1 = null;										// ���������� ����, finally ������� close()�޼ҵ带 ����ϱ� ����
		
		int data1 = 0;
		byte[] b = null;
		int c = 0;
		
		try {
			is1 = new FileInputStream(isFile1);
		} catch (FileNotFoundException e) {							// ������ ���� ���� �����Ƿ�, FileNotFoundException ���� �߻� ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		try {
			b = new byte[is1.available()];
			while((data1 = is1.read()) != -1) {
				b[c] = (byte) data1;
				c++;
			}
			String str1 = new String(b, Charset.defaultCharset());
			System.out.println(str1);
			/* �ٸ����
			 * String str1 = new String(b, 0, data1_1, Charset.forName("MS949"));
			 * 				= new String(byte�迭, offset, length, "encoding");
			 */ System.out.println(str1);
		} catch (IOException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				is1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("==================================================");
		
		// ���� Exception �� ���� ó��
		
		InputStream is1_1 = null;										// ���������� ����, finally ������� close()�޼ҵ带 ����ϱ� ����
		
		int data1_1 = 0;
		byte[] b_1 = null;
		int c_1 = 0;
		
		try {
			is1_1 = new FileInputStream(isFile1);						// FileNotFoundException
			b_1 = new byte[is1_1.available()];
			while((data1_1 = is1_1.read()) != -1) {						// IOException
				b_1[c_1] = (byte) data1_1;
				c_1++;
			}
			String str1_1 = new String(b_1, Charset.defaultCharset());
			System.out.println(str1_1);
		} catch (IOException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				is1_1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("==================================================");
		
		File isFile2 = new File("JAVA\\src\\chap19\\EX04\\exception-UTF8.txt");
		
		byte[] arr = new byte[100];						// �ѱ�ó���� ����
		int data2 = 0;
		
		try(InputStream is2 = new FileInputStream(isFile2)) {
			while((data2 = is2.read(arr)) != -1) {
				String str2 = new String (arr, 0, data2, Charset.forName("UTF-8"));
				// �ѱ�ó�� 3 : new String (byte�迭, offset, length, "encoding");
				System.out.println(str2);
			}
		} catch(IOException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");	
		}
		
		
//		InputStream is2 = null;
//		
//		try {
//			is2 = new FileInputStream(isFile2);
//		} catch (FileNotFoundException e) {
//			System.out.println("������ �������� �ʽ��ϴ�.");
//		}
//		
//		int data2 = 0;
//		
//		byte[] b2 = null;
//		int c2 = 0;
//		try {
//			b2 = new byte[is2.available()];
//			while((data2 = is2.read()) != -1) {
//				b2[c2] = (byte) data2;
//				c2++;
//			}
//		} catch (IOException e) {
//			System.out.println("������ �������� �ʽ��ϴ�.");
//		} finally {
//			String str2 = new String(b2, Charset.forName("UTF-8"));
//			System.out.println(str2);
//		}
//		
//		System.out.println();
																				
	}

}
