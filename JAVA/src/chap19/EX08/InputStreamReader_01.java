package chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* InputStreamReader/ OutputStreamWriter
 * 		Stream�� byte �����͸� char�����ͷ� ��ȯ�ϴ� ��ü
 * 		���ڵ��� ������ �� �ִ�.
 * 		byte ������ ���ڵ��� �� �������־�� �Ѵ�.
 * 		char �������� �ٲٸ� ���ڵ� Ÿ���� �Ű澵 �ʿ䰡����.
 */


public class InputStreamReader_01 {

	public static void main(String[] args) {
		// 1. ���� ��ü ���� �� �б�
		File isr = new File("JAVA\\src\\chap19\\EX08\\isr.txt");		// isr.txt �� UTF-8�� ����Ǿ��� �ִ�.
		
		try (Reader reader = new FileReader(isr);){						// FileReader�� ���ڵ� ������ ���� �ʴ´�. defaultCharset�� ����
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("========================================");
		
		// 2. FileInputStream + InputStreamReader�� �̿��� ���� �б�
		try (InputStream is = new FileInputStream(isr);
				InputStreamReader isr1 = new InputStreamReader(is, "UTF-8")){
			int data;
			while((data = isr1.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
		
		
	}

}
