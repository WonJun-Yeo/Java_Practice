package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleoutputObject_01 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		// 1. 1byte씩 출력
		os.write('J');														// write()는 버퍼(메모리)에 저장된다.
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		
		os.flush();															// 버퍼의 내용을 콘솔에 출력
		// os.close();
		
		// 2. n-byte[] 단위로 출력
		byte[] byteArray1 = "Hello!".getBytes();
		
		os.write(byteArray1);
		os.write('\n');														// \r\n 에서 \r 생략
		os.flush();
		
		// 3. n-byte[] 단위로 출력
		byte[] byteArray2 = "Btter the last smile than fitst lauther".getBytes();
		
		os.write(byteArray2, 7, 8);
		os.write('\n');														// \r\n 에서 \r 생략
		os.flush();
		
		os.close();
	}

}
