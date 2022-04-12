package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleoutputObject_01 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		// 1. 1byte�� ���
		os.write('J');														// write()�� ����(�޸�)�� ����ȴ�.
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		
		os.flush();															// ������ ������ �ֿܼ� ���
		// os.close();
		
		// 2. n-byte[] ������ ���
		byte[] byteArray1 = "Hello!".getBytes();
		
		os.write(byteArray1);
		os.write('\n');														// \r\n ���� \r ����
		os.flush();
		
		// 3. n-byte[] ������ ���
		byte[] byteArray2 = "Btter the last smile than fitst lauther".getBytes();
		
		os.write(byteArray2, 7, 8);
		os.write('\n');														// \r\n ���� \r ����
		os.flush();
		
		os.close();
	}

}
