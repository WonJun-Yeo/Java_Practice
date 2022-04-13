package chap19.EX07;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamExample_02 {

	public static void main(String[] args) {
		
		// 파일 객체 생성
		File outFile1 = new File("JAVA\\src\\chap19\\EX07\\printstream3.txt");
		
		//
		try (PrintStream ps = new PrintStream(outFile1)){
			ps.println(9.8);												// 출력 후, 라인개행
			ps.print(3 + "안녕" + 12345 + "\n");								// 출력 후, 라인개행X
			ps.printf("%d 이 호출되었습니다. \n",7);								// %d : int 값을 호출
			ps.printf("%s %f 이 호출되었습니다.","안녕",5.8);						// %s : String, %f : double 값을 호출		
		} catch (Exception e) {
		}
		
		//
		try(InputStream is = new FileInputStream(outFile1);) {
			int count;
			byte[] byteArray1 =  new byte[100];
			count = is.read(byteArray1);
			
			System.out.println(new String(byteArray1, 0, count, Charset.forName("UTF-8")));
			
		} catch(Exception e) {
			
		}
	}
}
