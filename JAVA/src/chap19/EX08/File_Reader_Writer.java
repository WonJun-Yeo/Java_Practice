package chap19.EX08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* Reader/Writer
 * ���ڸ� ó���ϵ��� Ưȭ�� �߻�Ŭ����
 * char ���� �����
 * 		byte : 1byte
 * 		char : 2byte
 * UTF-16���� ó�� (��� ��� 2byte)
 * ���ڵ��� �Ű��� ���ᵵ �ȴ�.
 * 
 * FileReader/FileWriter
 * Reader/Writer �� ������ Ŭ����
 * charset ���� �ɼ��� ����. (default Charset)
 */

/* ��
 * OutputStream
 * 		byte ���� ���
 * 		�߻�Ŭ����
 * 		FileOutputStream�� ����
 * 		����, ������, mp3, JPG, AVG... ��� ó�� ����
 * 		charset ���� ����
 * 
 * Writer
 * 		char ���� ���
 * 		�߻�Ŭ����
 * 		FileWriter�� ����
 * 		���ڸ� Ưȭ ó��
 * 		charset ���� �Ұ���
 */



public class File_Reader_Writer {

	public static void main(String[] args) {
		// 1. ���ϰ�ü ����
		File rwFile = new File("JAVA\\src\\chap19\\EX08\\refile.txt");
		
		try (Writer writer = new FileWriter(rwFile);){
			writer.write("�ȳ��ϼ���\n".toCharArray());					// .toCharArray() : String�� char[] �迭�� ����
			writer.write("Hello \n");										// String
			writer.write('A');											// char
			writer.write('\r');											// char
			writer.write('\n');											// char
			writer.write("�ݰ����ϴ�", 2, 3);
			writer.flush();
			
		} catch (IOException e) {}
		
		// 2. FileReader�� �̿��� ���� �б� (Default MS949)  **Characterset �����ɼ��� ����. ������ default
		
		try (Reader reader = new FileReader(rwFile);){
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		

	}

}
