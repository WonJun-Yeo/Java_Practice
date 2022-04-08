package chap19.EX01;

import java.io.File;									// ���ϰ� ������ �ٷ�� ��ü
import java.io.IOException;

/* ����** : ��Ŭ�������� ���� ������, c:\�� ������ �� ���� ������ ���� ���ܰ� �߻��� �� �ִ�. (IOException)
 * 		1. ��Ŭ������ �����ڱ������� ����
 * 		2. ���� ���ο� ���� ����
 * 
 * File ��ü ���� ���� �ĺ��ڸ� ������ ���
 * 		c:\abc\abc.txt
 * 1. Windows
 * 		String path = "C\\abc\\abc.txt"
 * 		\�� Ư������ �̸� "" �ȿ��� \�� ó���ϱ� ���ؼ��� Ư�����ڸ� ó���ϴ� \�� �տ� �ٿ�����ϹǷ� �ᱹ 2�� ����Ѵ�.
 * 		** windows 10 �̻��� ��� MAC�� ���� ����� �� �ִ�.
 * 2. MAC
 * 		String path = "C:/abc/abc.txt"
 * 
 * 3. ȣȯ�� ���ؼ� ���������� ����� �� �ִ� �ڵ�
 * 		String path = "C:" + File.separator + "abc" + File.separator + "abc.txt"
 */


public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		// 1. File ��ü�� ����ؼ� ���� ����.
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) {										// �ش� ��ο� ������ �������� �ʴ� ���
			tempDir.mkdir();										// ���� ���� ��ɾ�
		}
		
		System.out.println(tempDir.exists());						// ��� ��ο� ������ �����ϸ� true, �������� ������ false
		System.out.println();
		
		// 2. File ��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp001/newfile.txt");
		if(!newFile.exists()) {										// �ش� ��ο� ������ �������� �ʴ� ���
			newFile.createNewFile();								// ���� ���� ��ɾ�, ����ó���� �ʿ� (�������������� ������ ������ �� ���� ��� IOException)
		}
		
		System.out.println(newFile.exists());						// ��� ��ο� ������ �����ϸ� true, �������� ������ false
		System.out.println();
		
		// 3. ���� ������
		File newFile2 = new File("C:\\temp001\\newfile01.txt");												// window
		File newFile3 = new File("C:/temp001/newfile02.txt");												// MAC + window10�̻�
		File newFile4 = new File("C:" + File.separator + "temp001" + File.separator + "newfile03.txt");		// ��� OS
		
		if(!newFile2.exists()) {									// �ش� ��ο� ������ �������� �ʴ� ���
			newFile2.createNewFile();								// ���� ���� ��ɾ�, ����ó���� �ʿ� (�������������� ������ ������ �� ���� ��� IOException)
		}
		
		if(!newFile3.exists()) {									// �ش� ��ο� ������ �������� �ʴ� ���
			newFile3.createNewFile();								// ���� ���� ��ɾ�, ����ó���� �ʿ� (�������������� ������ ������ �� ���� ��� IOException)
		}
		
		if(!newFile4.exists()) {									// �ش� ��ο� ������ �������� �ʴ� ���
			newFile4.createNewFile();								// ���� ���� ��ɾ�, ����ó���� �ʿ� (�������������� ������ ������ �� ���� ��� IOException)
		}
		
		System.out.println(newFile2.exists());						// ��� ��ο� ������ �����ϸ� true, �������� ������ false
		System.out.println();
		
		System.out.println(newFile3.exists());						// ��� ��ο� ������ �����ϸ� true, �������� ������ false
		System.out.println();
		
		System.out.println(newFile4.exists());						// ��� ��ο� ������ �����ϸ� true, �������� ������ false
		System.out.println();
		
		
		// 4. ���� ��η� ó�� : �ٸ� �ý������� �̵��� ���, �� �ý��ۿ� �µ��� ������ �ʿ��ϴ�.
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile.getAbsolutePath());				// File ��ü�� ����� ������ �����θ� ���
		
		
		// 5. ��� ��η� ó�� **���� : ���� ���� �۾� ������ġ�� �˾ƾ� �Ѵ�.
		System.out.println(System.getProperty("user.dir"));			// ���� �۾� ���� ��ġ ��� (D:\YWJ)
		
		File newFile6 = new File("newfile06.txt");					// ����η� ���
		if(!newFile6.exists()) {									// �ش� ��ο� ������ �������� �ʴ� ���
			newFile6.createNewFile();								// ���� ���� ��ɾ�, ����ó���� �ʿ� (�������������� ������ ������ �� ���� ��� IOException)
		}
		
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
		
		
	}

}
