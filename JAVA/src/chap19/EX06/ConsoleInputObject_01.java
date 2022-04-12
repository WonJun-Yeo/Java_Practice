package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

/* System.in : Console���� ��ǲ�� �޴� �ڹٿ��� �������ִ� ��ü 
 * 		Windows : console���� enter : \r\n (\r ��������)
 * 		MAC : console���� enter : \n
 * System.out : Console�� ����� �ϴ� ��ü, OutputStream
 * 
 */


public class ConsoleInputObject_01 {

	public static void main(String[] args) throws IOException {
		// 1. Console���� ��ǲ �ޱ����� ��ü ����
		InputStream is1 = System.in;
		
		System.out.println("������ �Է��ϼ���. >>>");
		
		int data;
		
		while((data = is1.read()) != '\r') {				// 1byte�� �о� int data ������ �Ҵ�
			System.out.println("���� ������ : " + (char)data + "���� ����Ʈ �� : " + is1.available());
		}
		
		System.out.println(data);							// byte 13 : \r
		System.out.println(is1.read());						// byte 10 : \n
		
		is1.close();
	}

}
