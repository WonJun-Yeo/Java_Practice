package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* 콘솔 인풋시 한글 처리
 * 1byte씩 읽으면 한글을 처리할 수 없다.
 * 따라서 배열로 읽어야 한글 처리가 가능하다.
 * 
 * InputStream System.in
 * 
 * 
 */

public class ConsoleInputObject_03 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;										// System.in : 페이지 내에서 한 번만 선언할 수 있다.
		System.out.println("한글을 입력하세요 >>");
		
		
		// 2. n-byte씩 읽어 처리 (byte[] 배열의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);								// \r과 \n이 포함된 갯수
		
		String str1 = new String(byteArray1, 0, count1, Charset.forName("MS949"));
		System.out.println(str1);
		System.out.println("배열 방의 r과 n을 포함한 총 갯수 : " + count1);
		
		System.out.println("========================");
		
		// 3. n-byte 단위 읽기 (length 만큼 읽어와서 byte[] 배열 offset[index] 위치에 저장)
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length);
		
		String str2 = new String(byteArray2, 0, offset + length, Charset.defaultCharset());
		System.out.println(str2);
	}

}
