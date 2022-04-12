package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// is1 : MS949 �ѱ� �б� ó��, try(with resource), ����ó��
// is2 : UTF-8 �ѱ� �б� ó��, try ����ó��


public class EX04_FileInputStream_02 {

	public static void main(String[] args) {
		
		// is1
		File inFile = new File("JAVA\\src\\chap19\\EX04\\files\\file-ms949.txt");
		
		
		
		try (InputStream is1 = new FileInputStream(inFile)) {
			int data1;
			byte[] array1 = new byte[200];
			while((data1 = is1.read(array1)) != -1) {									
				String str1 = new String(array1, Charset.forName("MS949"));
				System.out.println(str1);
			}
			System.out.println();
		} catch (IOException e1) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
		}
		
		
		
		System.out.println("=====================================================");
		
		// is2
		File inFile2 = new File("JAVA\\src\\chap19\\EX04\\files\\file-UTF-8.txt");
		
		InputStream is2 = null;	
		int data2;
		byte[] array2 = new byte[200];
		
		try {
			is2 = new FileInputStream(inFile2);
			
			while((data2 = is2.read(array2)) != -1) {
				String str2 = new String(array2, Charset.forName("UTF-8"));
				System.out.println(str2);
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} finally {
			if (is2 != null) {
				try {
					is2.close();
				} catch (IOException e) {
					System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
				}
			}
		}
		
		
		
		
		
		
	}

}
