package chap19.EX08;

import java.io.OutputStreamWriter;

/* Reader/Writer : 추상클래스
 * 		char 단위 처리
 * 		문자, 이미지, MP3 등 모든 파일 처리 가능
 * 
 * FileReader/FileWriter : 추상클래스를 구현한 클래스
 * 		defaultChatset 만 사용가능
 * 
 * InputStreamReader/OutputStreamWriter
 * 		Charset을 지정할 수 있다.
 * 
 * System.in/System.out
 * 		console에 입,출력
 * 		byte 단위 입,출력
 * 		한 번 close 되면 재사용이 안된다.
 * 		try with resource 처리를 하면 자동 close 처리되므로 주의해야 한다.
 */

public class OutputStreamWriter_02 {

	public static void main(String[] args) {
		// console 출력 (defaultCharset : MS949 => MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter1 예제 파일입니다.\n".toCharArray());					// String을 char[] 배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다.");										// String
			osw.write('\n');																// char
			osw.write("Good Bye!!!\n\n");
			osw.flush();																	// 버퍼(메모리)에 저장된 것을 console에 출력
		} catch (Exception e) {}

		System.out.println("====================================================");
		
		
		// console 출력 (defaultCharset : MS949 => UTF-8)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter1 예제 파일입니다.\n".toCharArray());					// String을 char[] 배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다.");										// String
			osw.write('\n');																// char
			osw.write("Good Bye!!!\n\n");
			osw.flush();																	// 버퍼(메모리)에 저장된 것을 console에 출력
		} catch (Exception e) {}
	}

}
