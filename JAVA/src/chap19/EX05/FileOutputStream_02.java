package chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// FileOutputStream�� ����ؼ� �ѱ� ó��

public class FileOutputStream_02 {

	public static void main(String[] args) throws IOException {
		// ������ ���� ����
		File outFile = new File("JAVA/src/chap19/EX05/FileOutput2.txt");			// �⺻������ default characterSet���� ����
		
		// n-byte ���� ���� ó�� (�ѱ��� �ʼ�, 1byte�� �ƴϱ� ����)
		OutputStream os1 = new FileOutputStream(outFile);
		byte[] byteArray1 = "�ȳ��ϼ���".getBytes(Charset.forName("MS949"));			// String�� byte�迭�� ����
		
		os1.write(byteArray1);
		os1.write('\n');
		
		os1.close();
		
		// n-byte ���� ���� ó�� (byte[]�� offset���� length ���� byte ������ ����)
		
		OutputStream os2 = new FileOutputStream(outFile, true);
		
		byte[] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.defaultCharset());
		// byte[] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.forName("MS949"));	
		
		int offset = 6;
		int length = 2;
		
		os2.write(byteArray2, offset, length);										// byteArray2�� offset byte���� length byte ��ŭ �о ����
																					// ** read()�� ��� length byte��ŭ �о offset byte���� byteArray�� ���� 
		os2.flush();
		os2.close();
		
		
	}

}
