package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* InputStreamReader : byte => char ����, �б�, Charset�� �����ؼ� ������ ���� �� �ִ�.
 * OutputStreamWriter : byte => char ����, ����, Charset�� �����ؼ� ������ �� �� �ִ�.
 */



public class OutputStreamWriter_01 {

	public static void main(String[] args) {
		// FileWriter�� ���ؼ� ������ ���� (DefaultCharset : MS949)
		File osw1 = new File("JAVA\\src\\chap19\\EX08\\osw1.txt");
		try (Writer writer =  new FileWriter(osw1);){
			writer.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray());					// String�� char[] �迭�� ����
			writer.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");											// String
			writer.write('\n');																	// char
			writer.write("Good Bye!!!\n\n");
			writer.flush();
		} catch (IOException e) {}
		
		
		// OutputStreamWriter�� ����ؼ� MS949 => UTF-8 �� ���� ����
		// ������ defaultCharset�� MS949�ε� UTF-8�� ����� ������ ������.
		// �ܺη� ������ �̻����.
		File osw2 = new File("JAVA\\src\\chap19\\EX08\\osw2.txt");
		
		try (OutputStream os =  new FileOutputStream(osw2);
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8")){
			osw.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray());					// String�� char[] �迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");										// String
			osw.write('\n');																	// char
			osw.write("Good Bye!!!\n\n");
			osw.flush();
		} catch (IOException e) {}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
