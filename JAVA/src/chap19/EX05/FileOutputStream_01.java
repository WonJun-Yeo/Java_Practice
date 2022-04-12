package chap19.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// FileInputStream : byte ���� ������ �б�
// FileOutputStream : byte ���� ������ ����

// InputStream : �߻�Ŭ����, FileInputStream : InputStream�� ������ Ŭ����, ��ο� ������ �������� �ʴ� ��� ���� �߻�
// OutputStream : �߻�Ŭ����, FileInputStream : OutputStream�� ������ Ŭ����, ��ο� ������ �������� �ʴ� ��� ������ ����

// write() �޼��� : ����(�޸�, RAM)�� ����(����), ���۰� ������ ���Ͽ� ����.
// flush() �޼��� : ���ۿ� ����� ������ ���Ͽ� ������ ������ �� ���

// windows �ݼ�, �޸��忡 Enter�� ������ '\r'�� '\n'�� �Էµȴ�. (Enter�� ó��)
// MAC �ݼ�, �޸��忡 Enter�� ������ '\n'�� �Էµȴ�. (Enter�� ó��)

public class FileOutputStream_01 {

	public static void main(String[] args) throws IOException {
		// �Է����� ���� (���� �������� ����)
		File outFile = new File("JAVA/src/chap19/EX05/FileOutput1.txt");
		
		// 1. 1byte ����
		OutputStream os1 = new FileOutputStream(outFile);						// FileNotFoundException
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');														// byte 13 ��������
		os1.write('\n');														// byte 10
		
		//os1.flush();															// ���۰� ������ �ʴ��� ���Ͽ� �����ϵ��� �Ѵ�. close() ȣ�� ��, �ڵ����� �۵��ǹǷ� ��������
		os1.close();
		
		// 2. n-byte ���� (byte[] ũ�� ��ŭ ����)
		
		OutputStream os2 = new FileOutputStream(outFile, false);
						// new FileOutputStream(File, boolean append) : true�� �̾��, false(default)�� ����� 
		byte[] byteArray1 = "Hello!".getBytes();								// getBytes() : String�� byte�� ��ȯ�� �迭�� ����
		
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		// 3. n-byte ���� (byte[]�� offset���� length ���� byte ������ ����)
		
		OutputStream os3 = new FileOutputStream(outFile, true);
		// new FileOutputStream(File, boolean append) : true�� �̾��, false(default)�� ����� 
		byte[] byteArray2 = "Better the last smile than first laughter".getBytes();								// getBytes() : String�� byte�� ��ȯ�� �迭�� ����
		
		int offset = 7;
		int length = 8;
		
		os3.write(byteArray2, offset, length);							// byteArray2�� offset byte���� length byte ��ŭ �о ����
																		// ** read()�� ��� length byte��ŭ �о offset byte���� byteArray�� ���� 
		os3.write('\n');
		
		os3.flush();
		os3.close();
		
	}

}
