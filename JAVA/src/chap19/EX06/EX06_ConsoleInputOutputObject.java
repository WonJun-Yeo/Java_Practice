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
		
		InputStream is = System.in;								// new로 생성하지 않고 연결만 설정, 콘솔에서 인풋값을 받는다. 
		
		System.out.println("한글을 입력하세요. >>>");
		
		byte[] inArray = new byte[500];
		int count1 = is.read(inArray);							// count1 배열에 값이 들어온 갯수가 저장
		// int data = is.read();	: 한글을 처리하지 못한다. data에는 1byte read한 값의 아스키코드 저장
		
		File outFile = new File("JAVA/src/chap19/EX06/input.txt");
		OutputStream oFile = new FileOutputStream(outFile);		// 기본적으로 덮어쓰기, true를 넣으면 이어쓰기
		oFile.write(inArray);
		
		oFile.flush();
		oFile.close();
		
		// input.txt 파일에서 값을 읽어 console에 출력
		
		System.out.println();
		System.out.println("파일에서 읽운 내용을 콘솔에 출력합니다. >>>");
		
		File inFile = new File("JAVA/src/chap19/EX06/input.txt");
		InputStream iFile = new FileInputStream(inFile);
		
		byte[] byteArray =  new byte[500];
		
		iFile.read(byteArray);
		
		OutputStream os = System.out;
		
		os.write(byteArray);
		
		os.flush();
		os.close();
	}
}