package chap19.EX08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class File_Reader_Writer_UTF8 {

	public static void main(String[] args) {
		// 1. ���ϰ�ü ����
				File rwFile = new File("JAVA\\src\\chap19\\EX08\\refile_UTF8.txt");
				
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
