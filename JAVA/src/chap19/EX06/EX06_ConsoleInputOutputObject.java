package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 1. console���� �ѱ��� ��ǲ���� ���� defaultCharset���� input.txt�� ����
 * 		�迭 100byte ����
 * 		System.in : �ֿܼ��� ��ǲ�ޱ�
 * 		FileOutputStream : ��ǲ ���� ���� ���Ͽ� ����
 * 2. input.txt ���Ͽ��� ���� �о� console�� ���
 * 		FileInputStream : ����� ������ ������ �о�´�.
 * 		System.out : �ֿܼ� ���
 * 3. Exception Throws�� ó��
 */

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		// console���� �ѱ��� ��ǲ���� ���� defaultCharset���� input.txt�� ����
		
		InputStream is = System.in;
		
		System.out.println("�ѱ��� �Է��ϼ���. >>>");
		
		byte[] inArray = new byte[100];
		is.read(inArray);
		
		File outFile = new File("JAVA/src/chap19/EX06/input.txt");
		OutputStream oFile = new FileOutputStream(outFile);
		oFile.write(inArray);
		
		oFile.flush();
		oFile.close();
		
		// input.txt ���Ͽ��� ���� �о� console�� ���
		
		File inFile = new File("JAVA/src/chap19/EX06/input.txt");
		InputStream iFile = new FileInputStream(inFile);
		
		OutputStream os = System.out;
		
		byte[] byteArray =  new byte[100];
		
		iFile.read(byteArray);
		
		os.write(byteArray);
		
		os.flush();
		os.close();
		
		iFile.close();

	}
}