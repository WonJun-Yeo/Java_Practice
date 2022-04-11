package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* 1. is1 : InputStream
 * 		절대경로로 접근
 * 		ms949.txt
 * 		예외처리
 * 2. is2 : InputStream
 * 		상대경로로 접근
 * 		UTF-8.txt
 * 		예외처리 (try with resource 이용)
 * 		close() 메소드를 자동으로 처리
 */



public class EX03_Exception01 {

	public static void main(String[] args) {
		// 각각 Exception 처리
		File isFile1 = new File("D:\\YWJ\\JAVA\\src\\chap19\\EX04\\exception-ms949.txt");
		InputStream is1 = null;										// 전역변수로 선언, finally 블락에서 close()메소드를 사용하기 위해
		
		int data1 = 0;
		byte[] b = null;
		int c = 0;
		
		try {
			is1 = new FileInputStream(isFile1);
		} catch (FileNotFoundException e) {							// 파일이 없을 수도 있으므로, FileNotFoundException 예외 발생 처리
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		try {
			b = new byte[is1.available()];
			while((data1 = is1.read()) != -1) {
				b[c] = (byte) data1;
				c++;
			}
			String str1 = new String(b, Charset.defaultCharset());
			System.out.println(str1);
			/* 다른방법
			 * String str1 = new String(b, 0, data1_1, Charset.forName("MS949"));
			 * 				= new String(byte배열, offset, length, "encoding");
			 */ System.out.println(str1);
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} finally {
			try {
				is1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("==================================================");
		
		// 여러 Exception 한 번에 처리
		
		InputStream is1_1 = null;										// 전역변수로 선언, finally 블락에서 close()메소드를 사용하기 위해
		
		int data1_1 = 0;
		byte[] b_1 = null;
		int c_1 = 0;
		
		try {
			is1_1 = new FileInputStream(isFile1);						// FileNotFoundException
			b_1 = new byte[is1_1.available()];
			while((data1_1 = is1_1.read()) != -1) {						// IOException
				b_1[c_1] = (byte) data1_1;
				c_1++;
			}
			String str1_1 = new String(b_1, Charset.defaultCharset());
			System.out.println(str1_1);
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} finally {
			try {
				is1_1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("==================================================");
		
		File isFile2 = new File("JAVA\\src\\chap19\\EX04\\exception-UTF8.txt");
		
		byte[] arr = new byte[100];						// 한글처리를 위함
		int data2 = 0;
		
		try(InputStream is2 = new FileInputStream(isFile2)) {
			while((data2 = is2.read(arr)) != -1) {
				String str2 = new String (arr, 0, data2, Charset.forName("UTF-8"));
				// 한글처리 3 : new String (byte배열, offset, length, "encoding");
				System.out.println(str2);
			}
		} catch(IOException e) {
			System.out.println("예외가 발생되었습니다.");	
		}
		
		
//		InputStream is2 = null;
//		
//		try {
//			is2 = new FileInputStream(isFile2);
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 존재하지 않습니다.");
//		}
//		
//		int data2 = 0;
//		
//		byte[] b2 = null;
//		int c2 = 0;
//		try {
//			b2 = new byte[is2.available()];
//			while((data2 = is2.read()) != -1) {
//				b2[c2] = (byte) data2;
//				c2++;
//			}
//		} catch (IOException e) {
//			System.out.println("파일이 존재하지 않습니다.");
//		} finally {
//			String str2 = new String(b2, Charset.forName("UTF-8"));
//			System.out.println(str2);
//		}
//		
//		System.out.println();
																				
	}

}
