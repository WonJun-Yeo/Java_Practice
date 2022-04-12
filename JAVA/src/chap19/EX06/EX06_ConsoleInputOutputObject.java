package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 1. console에서 한글을 인풋받은 값을 defaultCharset으로 input.txt에 저장
 * 		배열 100byte 이하
 * 		System.in : 콘솔에서 인풋받기
 * 		FileOutputStream : 인풋 받은 값을 파일에 저장
 * 2. input.txt 파일에서 값을 읽어 console에 출력
 * 		FileInputStream : 저장된 파일의 내용을 읽어온다.
 * 		System.out : 콘솔에 출력
 * 3. Exception Throws로 처리
 */

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		// console에서 한글을 인풋받은 값을 defaultCharset으로 input.txt에 저장
		
		InputStream is = System.in;
		
		System.out.println("한글을 입력하세요. >>>");
		
		byte[] inArray = new byte[100];
		is.read(inArray);
		
		File outFile = new File("JAVA/src/chap19/EX06/input.txt");
		OutputStream oFile = new FileOutputStream(outFile);
		oFile.write(inArray);
		
		oFile.flush();
		oFile.close();
		
		// input.txt 파일에서 값을 읽어 console에 출력
		
		File inFile = new File("JAVA/src/chap19/EX06/input.txt");
		InputStream iFile = new FileInputStream(inFile);
		
		OutputStream os = System.out;
		
		byte[] byteArray =  new byte[100];
		
		iFile.read(byteArray);
		
		os.write(byteArray);
		
		os.flush();
		os.close();
		
		iFile.close();

	}
}