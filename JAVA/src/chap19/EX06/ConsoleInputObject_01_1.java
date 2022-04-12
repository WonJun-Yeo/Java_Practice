package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_01_1 {

	public static void main(String[] args) throws IOException {
		// 1. Console에서 인풋 받기위한 객체 생성
		InputStream is1 = System.in;
		
		System.out.println("영문을 입력하세요. >>>");
		
		int data;
		
		while((data = is1.read()) != '\n') {				// \r 까지 돌아감
			System.out.print((char)data);
		}
		
		System.out.println(data);							// byte 13 : \r
		System.out.println(is1.read());						// byte 10 : \n
		


	}

}
