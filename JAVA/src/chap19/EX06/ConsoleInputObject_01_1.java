package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_01_1 {

	public static void main(String[] args) throws IOException {
		// 1. Console���� ��ǲ �ޱ����� ��ü ����
		InputStream is1 = System.in;
		
		System.out.println("������ �Է��ϼ���. >>>");
		
		int data;
		
		while((data = is1.read()) != '\n') {				// \r ���� ���ư�
			System.out.print((char)data);
		}
		
		System.out.println(data);							// byte 13 : \r
		System.out.println(is1.read());						// byte 10 : \n
		


	}

}
