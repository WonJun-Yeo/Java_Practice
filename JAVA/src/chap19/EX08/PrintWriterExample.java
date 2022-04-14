package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* PrintWriter
 * auto flush 처리를 하지만 활성화 시키주어야 한다.
 * 		1. close() 처리를 하면 자동으로 flush()가 활성화 된다.
 * 			try with source 구문을 사용하면 auto close가 되기 떄문에 auto flush가 된다.
 * 		2. PrintWriter(System.out, true)
 */


public class PrintWriterExample {

	public static void main(String[] args) {
		// 파일 객체 생성
		File pw1= new File("JAVA\\src\\chap19\\EX08\\pw1.txt");
		File pw2= new File("JAVA\\src\\chap19\\EX08\\pw2.txt");
		File pw3= new File("JAVA\\src\\chap19\\EX08\\pw3.txt");
		
		// 1. PrintWriter (File file)
		try (PrintWriter pw = new PrintWriter(pw1);){
			pw.println("PrintWriter 예제 #1");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요.");
			pw.print("반갑습니다.");
			pw.print('\n');
			pw.printf("%d, %s", 7, "안녕 ").printf("%s %f","감사", 3.7);
		} catch (Exception e) {}
		
		// 2. PrintWriter (OutputStream os)
		try (PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));){
			pw.println("PrintWriter 예제 #1");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요.");
			pw.print("반갑습니다.");
			pw.print('\n');
			pw.printf("%d, %s", 7, "안녕 ").printf("%s %f","감사", 3.7);
		} catch (Exception e) {}
		
		// 3. PrintWriter(System.out, true)
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("PrintWriter 예제 #1");
		pw.println(13);
		pw.println(5.8);
		pw.print("안녕하세요.");
		pw.print("반갑습니다.");
		pw.print('\n');
		pw.printf("%d, %s", 7, "안녕 ").printf("%s %f","감사", 3.7);
		
	}

}
