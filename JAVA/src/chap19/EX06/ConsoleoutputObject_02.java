package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* �ѱ��� �ֿܼ� ���
 * 1byte ��� �� ����� �ȵ�
 * n-byte�� ��� (byte[] �迭)
 */

public class ConsoleoutputObject_02 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		// 2. n-byte ��� (byte[] �迭�� ó������ ������ ������ ����)
		byte[] byteArray1 = "�ȳ��ϼ���".getBytes()	;
		
		os.write(byteArray1);														// write() : ����(�޸�)�� ����
		os.write('\n');
		
		os.flush();																	// ������ ������ �ֿܼ� ���
		
		
		// 3. n-byte ��� (byte[]�� offset���� length ���� byte ������ ����)
		byte[] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.defaultCharset());
		
		os.write(byteArray2, 6, 4);
		
		os.flush();
		
		os.close();
	}

}
