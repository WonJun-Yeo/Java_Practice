package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

/* System.in : Console에서 인풋을 받는 자바에서 제공해주는 객체 
 * 		Windows : console에서 enter : \r\n (\r 생략가능)
 * 		MAC : console에서 enter : \n
 * System.out : Console로 출력을 하는 객체, OutputStream
 * 
 */


public class ConsoleInputObject_01 {

	public static void main(String[] args) throws IOException {
		// 1. Console에서 인풋 받기위한 객체 생성
		InputStream is1 = System.in;
		
		System.out.println("영문을 입력하세요. >>>");
		
		int data;
		
		while((data = is1.read()) != '\r') {				// 1byte씩 읽엇 int data 변수에 할당
			System.out.println("읽은 데이터 : " + (char)data + "남은 바이트 수 : " + is1.available());
		}
		
		System.out.println(data);							// byte 13 : \r
		System.out.println(is1.read());						// byte 10 : \n
		
		is1.close();
	}

}
