package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_01 {

	public static void main(String[] args) throws IOException {
		// ���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		// 1. �Է� ���� ���� 
			// ������
			File inFile1 = new File("D:\\YWJ\\JAVA\\src\\chap19\\files\\FileInputStream01.txt");
			
			// ����� : ���� �۾� ���丮�� �������� ����
			File inFile2 = new File("JAVA\\src\\chap19\\files\\FileInputStream01.txt");
			
		// 2. InputStream ��ü ���� ��, ���� ���� ���
			// InputStream�� �߻�Ŭ���� �̹Ƿ�, ���� ��ü ������ �Ұ����ϴ�. Ÿ�������� ����
			// InputStream�� ������ Ŭ������ FileInputStream Ŭ�����̴�.
			// FileInputStream�� �ݵ�� index 0 ������ �о� ���δ�.
			// �߰����� �о���̱����ؼ� FileRamdomAccess�� ����Ѵ�.
		InputStream is = new FileInputStream(inFile2);
		
		System.out.println("=================================");
		
		// ������ ������ ���
		
		//MS949 : ���� 1byte, �ѱ� 2byte
		//EUC : ���� 1byte, �ѱ� 2byte
		//UTF-8 : ���� 1byte, �ѱ� 3byte
		//UTF-16 : ���� 2byte, �ѱ� 2byte, �Ǿտ� BOM 2byte
		
		/* Java���� �ٹٲ� ó��
		 * Unix : \n
		 * Windows : \r\n( \r�� �������� ), �ܼ��̳� �޸��忡�� enter : \r\n
		 * MAC : \r
		 * Linux : 
		 */
		
		
		// ** stream ���� ������ �޸𸮿��� ���� �ȴ�. ������ �б� ���ؼ��� ���� �����ؾ��Ѵ�.
		
		/* read() �޼ҵ�� 1byte�� �о� ����
		 * read() �ƽ�Ű�ڵ�� �ۼ��� �� ����Ʈ�� �о����, ����Ÿ���� int �̹Ƿ� char�� ĳ����
		 * ���� �����Ͱ� �������� ���� ��� -1�� ����
		 */
		System.out.print((char)is.read());								
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		
		System.out.println();
		System.out.println("=================================");
		
		// while ���� �̿뿡 �� ���� ���
		int data;
		InputStream is1 = new FileInputStream(inFile2);
		
		while((data = is1.read()) != -1) {						// ������������ ������(-1) false ��ȯ �� �ݺ��� ��ž
			System.out.print((char) data);
		}
		
		System.out.println();
		System.out.println("=================================");
		
		InputStream is2 = new FileInputStream(inFile2);
		System.out.println("�� ����Ʈ �� : " + is2.available());
		while((data = is2.read()) != -1) {
			System.out.println("���� ������ : " + (char) data + ", ���� ����Ʈ �� : " + is2.available());		// available() : ���� ����Ʈ ���� ���
		}
		
		
	}

}
