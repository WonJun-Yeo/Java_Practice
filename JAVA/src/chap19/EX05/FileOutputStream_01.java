package chap19.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// FileInputStream : byte 단위 데이터 읽기
// FileOutputStream : byte 단위 데이터 쓰기

// InputStream : 추상클래스, FileInputStream : InputStream을 구현한 클래스, 경로에 파일이 존재하지 않는 경우 예외 발생
// OutputStream : 추상클래스, FileInputStream : OutputStream을 구현한 클래스, 경로에 파일이 존재하지 않는 경우 파일을 생성

// write() 메서드 : 버퍼(메모리, RAM)에 쓰기(저장), 버퍼가 꽉차면 파일에 쓴다.
// flush() 메서드 : 버퍼에 저장된 내용을 파일에 강제로 쓰기할 때 사용

// windows 콜솔, 메모장에 Enter를 넣으면 '\r'과 '\n'이 입력된다. (Enter를 처리)
// MAC 콜솔, 메모장에 Enter를 넣으면 '\n'이 입력된다. (Enter를 처리)

public class FileOutputStream_01 {

	public static void main(String[] args) throws IOException {
		// 입력파일 생성 (현재 존재하지 않음)
		File outFile = new File("JAVA/src/chap19/EX05/FileOutput1.txt");
		
		// 1. 1byte 쓰기
		OutputStream os1 = new FileOutputStream(outFile);						// FileNotFoundException
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');														// byte 13 생략가능
		os1.write('\n');														// byte 10
		
		//os1.flush();															// 버퍼가 꽉차지 않더라도 파일에 저장하도록 한다. close() 호출 시, 자동으로 작동되므로 생략가능
		os1.close();
		
		// 2. n-byte 쓰기 (byte[] 크기 만큼 쓰기)
		
		OutputStream os2 = new FileOutputStream(outFile, false);
						// new FileOutputStream(File, boolean append) : true는 이어쓰기, false(default)는 덮어쓰기 
		byte[] byteArray1 = "Hello!".getBytes();								// getBytes() : String을 byte로 변환해 배열에 저장
		
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		// 3. n-byte 쓰기 (byte[]의 offset부터 length 개의 byte 데이터 쓰기)
		
		OutputStream os3 = new FileOutputStream(outFile, true);
		// new FileOutputStream(File, boolean append) : true는 이어쓰기, false(default)는 덮어쓰기 
		byte[] byteArray2 = "Better the last smile than first laughter".getBytes();								// getBytes() : String을 byte로 변환해 배열에 저장
		
		int offset = 7;
		int length = 8;
		
		os3.write(byteArray2, offset, length);							// byteArray2의 offset byte부터 length byte 만큼 읽어서 저장
																		// ** read()의 경우 length byte만큼 읽어서 offset byte부터 byteArray에 저장 
		os3.write('\n');
		
		os3.flush();
		os3.close();
		
	}

}
