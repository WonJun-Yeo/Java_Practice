package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_01_1 {

	public static void main(String[] args) {
		
		// ����ó�� ���1 : �� ���ܿ� ���ؼ� ���� ó��
		
		File inFile = new File("JAVA\\src\\chap19\\files\\FileInputStream01.txt");
		
		InputStream is = null;
			
		
		try {																				// FileNotFoundException ó��
			is = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		
		int data;
		try {																				// IOException ó��
			while((data = is.read()) != -1) {
				System.out.println("���� ������ : " + (char) data + ", ���� ����Ʈ �� : " + is.available());		// available() : ���� ����Ʈ ���� ���
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		
		
		try {																				// IOException ó��
			if(is != null) {
				is.close();
			}
		} catch (IOException e) {}
		
		System.out.println("===============================");
		
		// ����ó�� ���2 : 2���� ���ܿ� ���ؼ� �չ��� ó��
		
		InputStream is2 = null;
		int data2;
		
		try {																				// FileNotFoundException, IOException ó��
			is2 = new FileInputStream(inFile);
			
			while((data2 = is2.read()) != -1) {
				System.out.println("���� ������ : " + (char) data2 + ", ���� ����Ʈ �� : " + is2.available());		// available() : ���� ����Ʈ ���� ���
			}
			
		} catch (IOException e) {															// IOException�� ���� Exception �̹Ƿ� �� ���� ó������
			e.printStackTrace();
		} finally {
			try {																			// IOException ó��
				is2.close();
			} catch (IOException e) {
				System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			}
		}
		
		
	}

}
