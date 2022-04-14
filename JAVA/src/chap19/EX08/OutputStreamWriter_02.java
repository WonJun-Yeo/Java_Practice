package chap19.EX08;

import java.io.OutputStreamWriter;

/* Reader/Writer : �߻�Ŭ����
 * 		char ���� ó��
 * 		����, �̹���, MP3 �� ��� ���� ó�� ����
 * 
 * FileReader/FileWriter : �߻�Ŭ������ ������ Ŭ����
 * 		defaultChatset �� ��밡��
 * 
 * InputStreamReader/OutputStreamWriter
 * 		Charset�� ������ �� �ִ�.
 * 
 * System.in/System.out
 * 		console�� ��,���
 * 		byte ���� ��,���
 * 		�� �� close �Ǹ� ������ �ȵȴ�.
 * 		try with resource ó���� �ϸ� �ڵ� close ó���ǹǷ� �����ؾ� �Ѵ�.
 */

public class OutputStreamWriter_02 {

	public static void main(String[] args) {
		// console ��� (defaultCharset : MS949 => MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray());					// String�� char[] �迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");										// String
			osw.write('\n');																// char
			osw.write("Good Bye!!!\n\n");
			osw.flush();																	// ����(�޸�)�� ����� ���� console�� ���
		} catch (Exception e) {}

		System.out.println("====================================================");
		
		
		// console ��� (defaultCharset : MS949 => UTF-8)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray());					// String�� char[] �迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");										// String
			osw.write('\n');																// char
			osw.write("Good Bye!!!\n\n");
			osw.flush();																	// ����(�޸�)�� ����� ���� console�� ���
		} catch (Exception e) {}
	}

}
