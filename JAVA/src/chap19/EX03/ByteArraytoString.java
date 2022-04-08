package chap19.EX03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1. String getBytes() : String을 Byte 배열로 분해 저장
		
		byte[] array1 = "안녕".getBytes();								// charset을 지정안함
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset());
		byte[] array3 = "베리".getBytes(Charset.forName("MS949"));		// 실행예외가 발생 예외처리 해주어야함
		byte[] array4 = "마취".getBytes("UTF-8");							// 일반예외가 발생 예외처리 해주어야함
		
		
		// 2. 각 인코딩의 바이트 수 출력
		System.out.println(array1.length);								// MS949 : 한글 2byte, 영문 1byte
		System.out.println(array2.length);								// MS949 : 한글 2byte, 영문 1byte
		System.out.println(array3.length);								// MS949 : 한글 2byte, 영문 1byte
		System.out.println(array4.length);								// UTF-8 : 한글 3byte, 영문 1byte
		
		System.out.println("========================================");
		
		// 3. new String() : byte 배열을 String으로 변환
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));		// 가져올대 인코딩 타입이 일치 해야한다.
		String str4 = new String(array4, Charset.forName("UTF-8"));		// 가져올대 인코딩 타입이 일치 해야한다.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("========================================");
		
		// 4. 한글이 깨어지는 경우 : 내보내는 인코딩 탕비과 가져오는 인코딩 타입이 불일치
		
		String str5 = new String(array1, Charset.forName("UTF-8"));
		String str6 = new String(array2, Charset.forName("UTF-16"));
		String str7 = new String(array3, Charset.forName("UTF-8"));		
		String str8 = new String(array4, Charset.forName("MS949"));		
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
		
		
		
		
	}

}
