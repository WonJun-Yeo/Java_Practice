package chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*	�߰� ����� �����ϴ� Stream 
 * 1. BufferedInputStream
 * 		InputStream�� ���͸� �����ؼ� �б� ������ �������� Stream
 * 		Buffer(�޸�)�� ����Ѵ�.
 * 		��� Stream�� �߰� ���
 * 		�ܵ����� ����� �� ����.
 * 2. BufferedOutputStream
 * 		OutputStream�� ���͸� �����ؼ� ���� ������ �������� Stream
 * 		Buffer(�޸�)�� ����Ѵ�.
 *  	��� Stream�� �߰� ���
 * 		�ܵ����� ����� �� ����.
 */




public class BufferedInput_BufferedOutputStream {

	public static void main(String[] args) {
		/* �� ������ ���� (�ӵ����� Ȯ��)
		 * 	1) Buffered�� ���� �ʰ� ó���ϴ� ���
		 * 	2) Buffered�� ���� ó���ϴ� ���
		 */
		
		File orgFile =  new File("JAVA\\src\\chap19\\EX07\\mycat_origin.jpg");		// ��������
		File copyFile1 =  new File("JAVA\\src\\chap19\\EX07\\mycat_copy1.jpg");		// buffered ��������ʰ� ����
		File copyFile2 =  new File("JAVA\\src\\chap19\\EX07\\mycat_copy2.jpg");		// buffered ����ؼ� ����
		
		/* ���� ������ �ϱ����� ���� ����
		 * start : ���۽ð�
		 * end : ������ �ð�
		 * time1 : buffered�� ������� �ʴ� ����� �ð�
		 * time2 : buffered�� ����� ����� �ð�
		 */
		long start, end, time1, time2;
		
		
		// 1. Buffered�� ������� �ʰ� ó���� ��� (InputStream, OutputStream)
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(orgFile);
				OutputStream os = new FileOutputStream(copyFile1);) {				// try with source ���� : Auto Close
			// ������ ���� �ڵ� ����
			int data;
			while ((data = is.read()) != -1) {										// 1byte���� �б�
				os.write(data);														// 1byte���� ����
			}
			
		} catch (IOException e) {
		}
		
		end = System.nanoTime()	;
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1);					// Buffered�� ������� �ʰ� ������ �ð�
		
		
		// 2. Buffered�� ����ؼ� ó���� ��� (BufferedInputStream, BufferOutputStream)
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgFile);							// ��� Stream
				BufferedInputStream bis = new BufferedInputStream(is);				// �߰������ �����ϴ� Stream, ������ ������ ó��
				OutputStream os = new FileOutputStream(copyFile2);					// ��� Stream
				BufferedOutputStream bos = new BufferedOutputStream(os)){			// �߰������ �����ϴ� Stream, ������ ������ ó��
			int data;
			while ((data = bis.read()) != -1) {										// Buffer�� ����ؼ� �б�
				bos.write(data);													// Buffer�� ����ؼ� ����
			}
		} catch (IOException e) {
		}
		
		end = System.nanoTime()	;
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);					// Buffered�� ����ϰ� ������ �ð�
		
		
		// 3. Buffered ����� ���(time2), ������� ���� ���(time1)�� ����
		System.out.println("�ӵ� ���� : " + time1/time2 + "��");
		
	}

}
