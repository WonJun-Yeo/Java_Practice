package chap19.EX03;

import java.io.UnsupportedEncodingException;

/* UTF16
 * 한글, 영문 모두 2byte <고정길이>
 * 제일 앞에 2byte BOM 식별코드가 추가된다.
 * 
 * UTF8
 * 한글 3byte, 영문 1byte <가변길이>
 * 
 */

public class UTF16_VS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// 영문
		
		byte[] b1 = "abc".getBytes("UTF-16");
		byte[] b2 = "abc".getBytes("UTF-8");

		System.out.println(b1.length);				// BOM : 2byte, "abc" : 6byte
		System.out.println(b2.length);
		
		
		for (byte b : b1) {
			System.out.printf("%02X", b);			// 16진수로 출력
			System.out.print(" ");
		}
		System.out.println();
		
		for (byte b : b2) {
			System.out.printf("%02X", b);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		
		System.out.println("================================");
		
		// 한글
		
		byte[] b3 = "가나다".getBytes("UTF-16");
		byte[] b4 = "가나다".getBytes("UTF-8");
		
		System.out.println(b3.length);				// BOM : 2byte, "가나다" : 6byte
		System.out.println(b4.length);				// 한글 : 3byte로 처리
		
		for (byte b : b3) {
			System.out.printf("%02X", b);
			System.out.print(" ");
		}
		System.out.println();
		
		for (byte b : b4) {
			System.out.printf("%02X", b);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
		
		
		
		
		
		
		
		
		
	}

}
