package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_01_1 {

	public static void main(String[] args) {
		
		// 예외처리 방법1 : 각 예외에 대해서 각각 처리
		
		File inFile = new File("JAVA\\src\\chap19\\files\\FileInputStream01.txt");
		
		InputStream is = null;
			
		
		try {																				// FileNotFoundException 처리
			is = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		
		int data;
		try {																				// IOException 처리
			while((data = is.read()) != -1) {
				System.out.println("읽은 데이터 : " + (char) data + ", 남은 바이트 수 : " + is.available());		// available() : 남은 바이트 수를 출력
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생하였습니다.");
		}
		
		
		try {																				// IOException 처리
			if(is != null) {
				is.close();
			}
		} catch (IOException e) {}
		
		System.out.println("===============================");
		
		// 예외처리 방법2 : 2개의 예외에 대해서 합번에 처리
		
		InputStream is2 = null;
		int data2;
		
		try {																				// FileNotFoundException, IOException 처리
			is2 = new FileInputStream(inFile);
			
			while((data2 = is2.read()) != -1) {
				System.out.println("읽은 데이터 : " + (char) data2 + ", 남은 바이트 수 : " + is2.available());		// available() : 남은 바이트 수를 출력
			}
			
		} catch (IOException e) {															// IOException이 상위 Exception 이므로 한 번에 처리가능
			e.printStackTrace();
		} finally {
			try {																			// IOException 처리
				is2.close();
			} catch (IOException e) {
				System.out.println("예외가 발생하였습니다.");
			}
		}
		
		
	}

}
