package chap19.EX02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		// 1. c:\�� �۾� ���� ����
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {
			tempDir.mkdir();
		}
		
		// 2. ���� ��ü ���� (C:/Windows)
		File file = new File("C:\\Windows");
		
		
		// 3. ���� �޼ҵ� ���
		System.out.println("���� ��� ��� : " + file.getAbsolutePath());
		System.out.println("���� ���� : " + file.isDirectory());
		System.out.println("���� ���� : " + file.isFile());
		System.out.println("����/���� �̸���� : " + file.getName());
		System.out.println("�θ� ������ ��� : " + file.getParent());
		
		// ��¹��ȿ� �ۼ��� ��� ���� ������ �õ��ϰ� �����Ȱ�� : true, ������ �̹� �־� ������ ��� : false
		File newFile1 = new File("C:/temp/abc");
		System.out.println(newFile1.mkdir());				
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:/temp/bcd/cde");		// �������� �� ���� ����
		System.out.println(newFile2.mkdir());				// mkdir()�� ������������ �� ���� ������ �� ����.
		System.out.println(newFile2.mkdirs());				// mkdirs()�� ������������ �� ���� ������ �� �ִ�.
		
		File newFile3 = new File("C:/temp/def/hij/klm");	// �������� �� ���� ����
		System.out.println(newFile3.mkdirs());				// mkdirs()�� ������������ �� ���� ������ �� �ִ�.
		
		
		// 4. File ��ü�� ����ؼ� ���� ������ ���� ����
		File[] fname = file.listFiles();					// file : "C:\windows" ������ ��� ������, ������ �̸��� File �迭�� ����
		
		for (File k : fname) {
			System.out.println((k.isDirectory() ? "���� : " : "���� : ") + k.getName());
		}
		
		
		
		
		
		
	}

}
