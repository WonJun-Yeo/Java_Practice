package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_02 {

	public static void main(String[] args) throws IOException {
		// 입력 파일 생성
		File inFile = new File("JAVA\\src\\chap19\\EX04\\FileInputStream01.txt");
		
		// 1. 첫 번째, 한 byte 단위씩 읽어서 처리
		InputStream is1 = null;									// finally 블락에서 close()메소드를 사용하기 위해 try문 밖에 선언
		
		try {
			is1 = new FileInputStream(inFile);
			
			int data;
			
			// 영문만 존재하므로 read()메소드만 사용
			// 한글이 있을 경우, read(byte배열) 사용
			while((data = is1.read()) != -1) {									
				System.out.print((char)data);
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if (is1 != null) {									// 객체가 null일 때 close()메소드를 호출하면 IOException이 발생하기 때문
				try {
					is1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("=====================================================");
		
		/* 1_1. try(with resource : 객체 생성) {} 로 구현
		 *  with resource 에는 autoClosable을 구현하고 있는 객체만 올 수 있다.
		 *  close() 가 자동구현
		 *  FileInputStream은 Closable interface를 구현하고 있다.
		 */
		
		try (InputStream is1_1 = new FileInputStream(inFile)) {
			int data;
			
			// 영문만 존재하므로 read()메소드만 사용
			// 한글이 있을 경우, read(byte배열) 사용
			while((data = is1_1.read()) != -1) {									
				System.out.print((char)data);
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
		
		System.out.println("=====================================================");
		
		/* 2. 두 번째, n-byte 단위씩 읽어서 처리
		 * byte[]의 처음위치에서부터 읽은 데이터 저장
		 * 여러 바이트를 동시에 읽어서 처리 속도가 빠르다.
		 */
		
		InputStream is2 = new FileInputStream(inFile);			// throws로 처리 (비권장, 위처럼 try/catch 처리 권장)
		
		byte[] byteArray1 =  new byte[9];						// 배열 방 갯수 9개 (index 0~8)
		
		int count1;
		
		while((count1 = is2.read(byteArray1)) != -1) {			//  
			/* read() :  1byte씩 읽어온다.
			 * read(배열변수) : 배열변수의 length 만큼 byte를 읽어온다.
			 * 남은 갯수가 배열변수의 length 만큼 되지 않으면 남은만큼 byte를 읽어온다.
			 * 남은 갯수가 없으면 -1이 되면서 while문을 빠져나온다.
			 */
			for (int i = 0; i < count1; i++) {
				System.out.print((char) byteArray1[i]);
			}
			System.out.println();
			System.out.println("count1 = " + count1);
			
//			System.out.println();
//			System.out.println("=====================");
//			String str = new String(byteArray1,Charset.forName("MS949"));
//			System.out.println(str);
			
		}
		
		is2.close();
		
		System.out.println("=====================================================");
		
		// 2_2. n-byte 단위씩 읽어서 한글 처리
		
		InputStream is3 = new FileInputStream(inFile);			// throws로 처리 (비권장, 위처럼 try/catch 처리 권장)
		
		byte[] byteArray2 =  new byte[100];						// 배열 방 갯수 100개 (index 0~99)
		
		int count2;
		
		while((count2 = is3.read(byteArray2)) != -1) {			//  
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		
		System.out.println("=====================================================");
		
		// 2_3. n-byte 단위씩 읽어서 한글 처리 (offset, length 사용)
		
		InputStream is4 = new FileInputStream(inFile);			// throws로 처리 (비권장, 위처럼 try/catch 처리 권장)
		byte[] byteArray3 =  new byte[9];
		
		int offset = 3;
		int length = 6;
		
		// (byteArray3, offset, length) : length 만큼 byte를 읽어와서 byte[] 배열에 offset 위치(offset index)에 저장
		int count3 = is4.read(byteArray3, offset, length);
		
		for (int i = 0; i < offset + count3; i++) {
			System.out.print((char) byteArray3[i]);
		}
		System.out.println();
		System.out.println(count3);
		is4.close();
	}

}
