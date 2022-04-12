package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_02 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;									// System.in 은 한페이지에서 한 번만 만들 수 있다.
		System.out.println("영문을 입력하세요 >>");
		
		
		// 1. 1byte 단위 읽기
		int data;
		while ((data = is.read()) != '\r') {						// 첫번째 read : 콘솔에서는 -1을 사용하지 않고, \r로 처리
			System.out.print((char)data);
		}
		is.read();													// \n을 끄집어 내어줘야 한다.
		
		System.out.println();
		System.out.println();
		System.out.println("==================================");
		
		// 2. n-byte 단위 읽기 (byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);							// 두번째 read
		
		for (int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println("\t count1 = " + count1);
		}
		
		System.out.println("==================================");
		
		int count2;
		
		count2 = is.read(byteArray1);								// 세번째 read, 배열 내부에 /r과 /n이 배열 내부에 들어간다.
		System.out.println(new String (byteArray1, 0, count2));
		
//		while ((count2 = is.read(byteArray1)) != '\r') {
//			System.out.println(new String (byteArray1));
//		}
		// is.read(); \n을 버퍼에서 그집어 내줘야한다.
		// 다만, 배열내부에 \r\n이 들어가고 메모리에 없기 때문에 버퍼에서 배지 않아야 한다. 
		
		System.out.println("==================================");
		
		// 3. n-byte 단위 읽기 (byte[]의 offset부터 length 개의 byte 데이터 읽기)
		
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray2, offset, length);
		
		for (int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		is.close();													// 제일 마지막에 처리, 중간에 처리 할 경우 다시 호출이 돌아간다.

	}

}
