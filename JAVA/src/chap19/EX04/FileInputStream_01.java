package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_01 {

	public static void main(String[] args) throws IOException {
		// 현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
		// 1. 입력 파일 생성 
			// 절대경로
			File inFile1 = new File("D:\\YWJ\\JAVA\\src\\chap19\\files\\FileInputStream01.txt");
			
			// 상대경로 : 현재 작업 디렉토리릴 기준으로 설정
			File inFile2 = new File("JAVA\\src\\chap19\\files\\FileInputStream01.txt");
			
		// 2. InputStream 객체 생성 후, 파일 내용 출력
			// InputStream은 추상클래스 이므로, 직접 객체 생성이 불가능하다. 타입지정은 가능
			// InputStream을 구현한 클래스가 FileInputStream 클래스이다.
		InputStream is = new FileInputStream(inFile2);
		
		System.out.println("=================================");
		
		// 파일의 내용을 출력
		
		//MS949 : 영어 1byte, 한글 2byte
		//EUC : 영어 1byte, 한글 2byte
		//UTF-8 : 영어 1byte, 한글 3byte
		//UTF-16 : 영어 2byte, 한글 2byte, 맨앞에 BOM 2byte
		
		
		
		// ** stream 값은 읽으면 메모리에서 삭제 된다. 새로이 읽기 위해서는 새로 생성해야한다.
		// read() 한 바이트를 읽어들임, 리턴타입이 int 이므로 char로 캐스팅	
		System.out.print((char)is.read());								
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		System.out.print((char)is.read());		
		
		System.out.println();
		System.out.println("=================================");
		
		// while 문을 이용에 한 번에 출력
		int data;
		InputStream is1 = new FileInputStream(inFile2);
		// read() : 한 바이트를 읽어서 값이 존재할 경우 양수를 리턴, 읽은 데이터가 존재하지 않을 경우 -1을 리턴
		
		while((data = is1.read()) != -1) {
			System.out.print((char) data);
		}
		
		System.out.println();
		System.out.println("=================================");
		
		InputStream is2 = new FileInputStream(inFile2);
		while((data = is2.read()) != -1) {
			System.out.println("읽은 데이터 : " + (char) data + ", 남은 바이트 수 : " + is2.available());		// available() : 남은 바이트 수를 출력
		}
		
		
	}

}
