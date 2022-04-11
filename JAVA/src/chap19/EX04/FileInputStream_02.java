package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_02 {

	public static void main(String[] args) throws IOException {
		// �Է� ���� ����
		File inFile = new File("JAVA\\src\\chap19\\EX04\\FileInputStream01.txt");
		
		// 1. ù ��°, �� byte ������ �о ó��
		InputStream is1 = null;									// finally ������� close()�޼ҵ带 ����ϱ� ���� try�� �ۿ� ����
		
		try {
			is1 = new FileInputStream(inFile);
			
			int data;
			
			// ������ �����ϹǷ� read()�޼ҵ常 ���
			// �ѱ��� ���� ���, read(byte�迭) ���
			while((data = is1.read()) != -1) {									
				System.out.print((char)data);
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} finally {
			if (is1 != null) {									// ��ü�� null�� �� close()�޼ҵ带 ȣ���ϸ� IOException�� �߻��ϱ� ����
				try {
					is1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("=====================================================");
		
		/* 1_1. try(with resource : ��ü ����) {} �� ����
		 *  with resource ���� autoClosable�� �����ϰ� �ִ� ��ü�� �� �� �ִ�.
		 *  close() �� �ڵ�����
		 *  FileInputStream�� Closable interface�� �����ϰ� �ִ�.
		 */
		
		try (InputStream is1_1 = new FileInputStream(inFile)) {
			int data;
			
			// ������ �����ϹǷ� read()�޼ҵ常 ���
			// �ѱ��� ���� ���, read(byte�迭) ���
			while((data = is1_1.read()) != -1) {									
				System.out.print((char)data);
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}
		
		System.out.println("=====================================================");
		
		/* 2. �� ��°, n-byte ������ �о ó��
		 * byte[]�� ó����ġ�������� ���� ������ ����
		 * ���� ����Ʈ�� ���ÿ� �о ó�� �ӵ��� ������.
		 */
		
		InputStream is2 = new FileInputStream(inFile);			// throws�� ó�� (�����, ��ó�� try/catch ó�� ����)
		
		byte[] byteArray1 =  new byte[9];						// �迭 �� ���� 9�� (index 0~8)
		
		int count1;
		
		while((count1 = is2.read(byteArray1)) != -1) {			//  
			/* read() :  1byte�� �о�´�.
			 * read(�迭����) : �迭������ length ��ŭ byte�� �о�´�.
			 * ���� ������ �迭������ length ��ŭ ���� ������ ������ŭ byte�� �о�´�.
			 * ���� ������ ������ -1�� �Ǹ鼭 while���� �������´�.
			 */
			for (int i = 0; i < count1; i++) {
				System.out.print((char) byteArray1[i]);
			}
			System.out.println();
			System.out.println("count1 = " + count1);
			
//			System.out.println();
//			System.out.println("=====================");
//			String str = new String(byteArray1,Charset.forName("MS949"));
//			System.out.println(str);
			
		}
		
		is2.close();
		
		System.out.println("=====================================================");
		
		// 2_2. n-byte ������ �о �ѱ� ó��
		
		InputStream is3 = new FileInputStream(inFile);			// throws�� ó�� (�����, ��ó�� try/catch ó�� ����)
		
		byte[] byteArray2 =  new byte[100];						// �迭 �� ���� 100�� (index 0~99)
		
		int count2;
		
		while((count2 = is3.read(byteArray2)) != -1) {			//  
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		
		System.out.println("=====================================================");
		
		// 2_3. n-byte ������ �о �ѱ� ó�� (offset, length ���)
		
		InputStream is4 = new FileInputStream(inFile);			// throws�� ó�� (�����, ��ó�� try/catch ó�� ����)
		byte[] byteArray3 =  new byte[9];
		
		int offset = 3;
		int length = 6;
		
		// (byteArray3, offset, length) : length ��ŭ byte�� �о�ͼ� byte[] �迭�� offset ��ġ(offset index)�� ����
		int count3 = is4.read(byteArray3, offset, length);
		
		for (int i = 0; i < offset + count3; i++) {
			System.out.print((char) byteArray3[i]);
		}
		System.out.println();
		System.out.println(count3);
		is4.close();
	}

}
