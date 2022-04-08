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
		InputStream is = new FileInputStream(inFile2);
		
		System.out.println("=================================");
		
		// ������ ������ ���
		
		//MS949 : ���� 1byte, �ѱ� 2byte
		//EUC : ���� 1byte, �ѱ� 2byte
		//UTF-8 : ���� 1byte, �ѱ� 3byte
		//UTF-16 : ���� 2byte, �ѱ� 2byte, �Ǿտ� BOM 2byte
		
		
		
		// ** stream ���� ������ �޸𸮿��� ���� �ȴ�. ������ �б� ���ؼ��� ���� �����ؾ��Ѵ�.
		// read() �� ����Ʈ�� �о����, ����Ÿ���� int �̹Ƿ� char�� ĳ����	
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
		// read() : �� ����Ʈ�� �о ���� ������ ��� ����� ����, ���� �����Ͱ� �������� ���� ��� -1�� ����
		
		while((data = is1.read()) != -1) {
			System.out.print((char) data);
		}
		
		System.out.println();
		System.out.println("=================================");
		
		InputStream is2 = new FileInputStream(inFile2);
		while((data = is2.read()) != -1) {
			System.out.println("���� ������ : " + (char) data + ", ���� ����Ʈ �� : " + is2.available());		// available() : ���� ����Ʈ ���� ���
		}
		
		
	}

}
