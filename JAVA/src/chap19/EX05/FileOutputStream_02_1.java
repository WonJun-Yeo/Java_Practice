package chap19.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_02_1 {

	public static void main(String[] args) throws IOException {
		// 저장할 파일 생성
		File outFile = new File("JAVA/src/chap19/EX05/FileOutput2_1.txt");			// 기본적으로 default characterSet으로 저장
		
		// n-byte 단위 쓰기 처리 (한글은 필수, 1byte가 아니기 때문)
		OutputStream os1 = new FileOutputStream(outFile, true);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));			// String을 byte배열에 저장
		
		os1.write(byteArray1);
		os1.write('\n');
		
		os1.close();
		
		// n-byte 단위 쓰기 처리 (byte[]의 offset부터 length 개의 byte 데이터 쓰기)
		
		OutputStream os2 = new FileOutputStream(outFile, true);
		
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		//byte[] byteArray2 = "반갑습니다.".getBytes(Charset.forName("UTF-8"));	
		
		int offset = 6;
		int length = 2;
		
		os2.write(byteArray2, offset, length);										// byteArray2의 offset byte부터 length byte 만큼 읽어서 저장
																					// ** read()의 경우 length byte만큼 읽어서 offset byte부터 byteArray에 저장 
		
		System.out.println(Charset.defaultCharset());
		
		os2.flush();
		os2.close();

	}

}
