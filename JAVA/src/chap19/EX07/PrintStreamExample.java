package chap19.EX07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* PrintStream
 * FilterStream�̴�. (�߰������ �����ϴ� Stream)
 * ��� Stream�� �־�� �Ѵ�.
 * �پ��� ������� ����� �� ���Ǵ� ��¿� Ưȭ�� Stream
 * flush() �޼ҵ带 ȣ������ �ʾƵ� �ڵ����� flush �ȴ�.
 * println(), print(), printf()
 * ���� ���, �ܼ� ���, ...
 */


public class PrintStreamExample {
	public static void main(String[] args) {
		// ���� ���
		// File ��ü ����
		File outFile1 = new File("JAVA\\src\\chap19\\EX07\\printstream1.txt");
		File outFile2 = new File("JAVA\\src\\chap19\\EX07\\printstream2.txt");
		
		// 1. PrintStream ( FileOutputStream(File) )
		
		try (OutputStream os1 = new FileOutputStream(outFile1);				// ��� Stream
				PrintStream ps = new PrintStream(os1);){					// �߰������ �������ִ� Filter Stream
			ps.println(9.8);												// ��� ��, ���ΰ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");								// ��� ��, ���ΰ���X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n",7);								// %d : int ���� ȣ��
			ps.printf("%s %f �� ȣ��Ǿ����ϴ�.","�ȳ�",5.8);						// %s : String, %f : double ���� ȣ��								// %d : int ���� ȣ��
			//ps.flush();													// �ڵ����� ȣ��ȴ�.
		} catch (Exception e) {
		}
		
		
		// 2. PrintStream(File)
		try (PrintStream ps = new PrintStream(outFile2)){
			ps.println(9.8);												// ��� ��, ���ΰ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");								// ��� ��, ���ΰ���X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n",7);								// %d : int ���� ȣ��
			ps.printf("%s %f �� ȣ��Ǿ����ϴ�.","�ȳ�",5.8);						// %s : String, %f : double ���� ȣ��								// %d : int ���� ȣ��
			//ps.flush();	
		} catch (FileNotFoundException e) {
		}
		
		
		
		
		// console�� ���
		// 1. PrintStream ps = new PrintStream(System.out)
		try(OutputStream os2 = System.out;
				PrintStream ps = new PrintStream(os2);) {
			ps.println(9.8);												// ��� ��, ���ΰ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");								// ��� ��, ���ΰ���X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n",7);								// %d : int ���� ȣ��
			ps.printf("%s %f �� ȣ��Ǿ����ϴ�.","�ȳ�",5.8);						// %s : String, %f : double ���� ȣ��								// %d : int ���� ȣ��
			//ps.flush();	
		} catch(Exception e) {
		}
		
		
		// 2. PrintStream ps = System.out;
		try(PrintStream ps = System.out;) {
			ps.println(9.8);												// ��� ��, ���ΰ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");								// ��� ��, ���ΰ���X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n",7);								// %d : int ���� ȣ��
			ps.printf("%s %f �� ȣ��Ǿ����ϴ�.","�ȳ�",5.8);						// %s : String, %f : double ���� ȣ��								// %d : int ���� ȣ��
			//ps.flush();	
		} catch(Exception e) {
		}
		
		
		
		
	}
}
