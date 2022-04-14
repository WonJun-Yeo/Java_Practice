package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* PrintWriter
 * auto flush ó���� ������ Ȱ��ȭ ��Ű�־�� �Ѵ�.
 * 		1. close() ó���� �ϸ� �ڵ����� flush()�� Ȱ��ȭ �ȴ�.
 * 			try with source ������ ����ϸ� auto close�� �Ǳ� ������ auto flush�� �ȴ�.
 * 		2. PrintWriter(System.out, true)
 */


public class PrintWriterExample {

	public static void main(String[] args) {
		// ���� ��ü ����
		File pw1= new File("JAVA\\src\\chap19\\EX08\\pw1.txt");
		File pw2= new File("JAVA\\src\\chap19\\EX08\\pw2.txt");
		File pw3= new File("JAVA\\src\\chap19\\EX08\\pw3.txt");
		
		// 1. PrintWriter (File file)
		try (PrintWriter pw = new PrintWriter(pw1);){
			pw.println("PrintWriter ���� #1");
			pw.println(13);
			pw.println(5.8);
			pw.print("�ȳ��ϼ���.");
			pw.print("�ݰ����ϴ�.");
			pw.print('\n');
			pw.printf("%d, %s", 7, "�ȳ� ").printf("%s %f","����", 3.7);
		} catch (Exception e) {}
		
		// 2. PrintWriter (OutputStream os)
		try (PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));){
			pw.println("PrintWriter ���� #1");
			pw.println(13);
			pw.println(5.8);
			pw.print("�ȳ��ϼ���.");
			pw.print("�ݰ����ϴ�.");
			pw.print('\n');
			pw.printf("%d, %s", 7, "�ȳ� ").printf("%s %f","����", 3.7);
		} catch (Exception e) {}
		
		// 3. PrintWriter(System.out, true)
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("PrintWriter ���� #1");
		pw.println(13);
		pw.println(5.8);
		pw.print("�ȳ��ϼ���.");
		pw.print("�ݰ����ϴ�.");
		pw.print('\n');
		pw.printf("%d, %s", 7, "�ȳ� ").printf("%s %f","����", 3.7);
		
	}

}
