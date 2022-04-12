package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* 한글을 콘솔에 출력
 * 1byte 출력 시 출력이 안됨
 * n-byte씩 출력 (byte[] 배열)
 */

public class ConsoleoutputObject_02 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		// 2. n-byte 출력 (byte[] 배열에 처음부터 끝까지 데이터 쓰기)
		byte[] byteArray1 = "안녕하세요".getBytes()	;
		
		os.write(byteArray1);														// write() : 버퍼(메모리)에 쓰기
		os.write('\n');
		
		os.flush();																	// 버퍼의 내용을 콘솔에 출력
		
		
		// 3. n-byte 출력 (byte[]의 offset부터 length 개의 byte 데이터 쓰기)
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		
		os.write(byteArray2, 6, 4);
		
		os.flush();
		
		os.close();
	}

}
