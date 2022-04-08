package chap19.EX01;

import java.io.File;									// 파일과 폴더를 다루는 객체
import java.io.IOException;

/* 주의** : 이클립스에서 파일 생성시, c:\에 생성할 때 권한 문제로 인한 예외가 발생될 수 있다. (IOException)
 * 		1. 이클립스를 관리자권한으로 실행
 * 		2. 폴더 내부에 파일 생성
 * 
 * File 객체 내의 폴더 식별자를 적용할 경우
 * 		c:\abc\abc.txt
 * 1. Windows
 * 		String path = "C\\abc\\abc.txt"
 * 		\은 특수문자 이며 "" 안에서 \를 처리하기 위해서는 특수문자를 처리하는 \를 앞에 붙여줘야하므로 결국 2번 써야한다.
 * 		** windows 10 이상의 경우 MAC과 같이 사용할 수 있다.
 * 2. MAC
 * 		String path = "C:/abc/abc.txt"
 * 
 * 3. 호환을 위해서 공통적으로 사용할 수 있는 코드
 * 		String path = "C:" + File.separator + "abc" + File.separator + "abc.txt"
 */


public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		// 1. File 객체를 사용해서 폴더 생성.
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) {										// 해당 경로에 파일이 존재하지 않는 경우
			tempDir.mkdir();										// 폴더 생성 명령어
		}
		
		System.out.println(tempDir.exists());						// 헤당 경로에 파일이 존재하면 true, 존재하지 않으면 false
		System.out.println();
		
		// 2. File 객체를 사용해서 파일 생성
		File newFile = new File("C:/temp001/newfile.txt");
		if(!newFile.exists()) {										// 해당 경로에 파일이 존재하지 않는 경우
			newFile.createNewFile();								// 파일 생성 명령어, 예외처리가 필요 (여러가지문제로 파일을 생성할 수 없는 경우 IOException)
		}
		
		System.out.println(newFile.exists());						// 헤당 경로에 파일이 존재하면 true, 존재하지 않으면 false
		System.out.println();
		
		// 3. 파일 구분자
		File newFile2 = new File("C:\\temp001\\newfile01.txt");												// window
		File newFile3 = new File("C:/temp001/newfile02.txt");												// MAC + window10이상
		File newFile4 = new File("C:" + File.separator + "temp001" + File.separator + "newfile03.txt");		// 모든 OS
		
		if(!newFile2.exists()) {									// 해당 경로에 파일이 존재하지 않는 경우
			newFile2.createNewFile();								// 파일 생성 명령어, 예외처리가 필요 (여러가지문제로 파일을 생성할 수 없는 경우 IOException)
		}
		
		if(!newFile3.exists()) {									// 해당 경로에 파일이 존재하지 않는 경우
			newFile3.createNewFile();								// 파일 생성 명령어, 예외처리가 필요 (여러가지문제로 파일을 생성할 수 없는 경우 IOException)
		}
		
		if(!newFile4.exists()) {									// 해당 경로에 파일이 존재하지 않는 경우
			newFile4.createNewFile();								// 파일 생성 명령어, 예외처리가 필요 (여러가지문제로 파일을 생성할 수 없는 경우 IOException)
		}
		
		System.out.println(newFile2.exists());						// 헤당 경로에 파일이 존재하면 true, 존재하지 않으면 false
		System.out.println();
		
		System.out.println(newFile3.exists());						// 헤당 경로에 파일이 존재하면 true, 존재하지 않으면 false
		System.out.println();
		
		System.out.println(newFile4.exists());						// 헤당 경로에 파일이 존재하면 true, 존재하지 않으면 false
		System.out.println();
		
		
		// 4. 절대 경로로 처리 : 다른 시스템으로 이동된 경우, 그 시스템에 맞도록 세팅이 필요하다.
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile.getAbsolutePath());				// File 객체에 저장된 파일의 절대경로를 출력
		
		
		// 5. 상대 경로로 처리 **권장 : 현재 나의 작업 폴더위치를 알아야 한다.
		System.out.println(System.getProperty("user.dir"));			// 현재 작업 폴더 위치 출력 (D:\YWJ)
		
		File newFile6 = new File("newfile06.txt");					// 상대경로로 출력
		if(!newFile6.exists()) {									// 해당 경로에 파일이 존재하지 않는 경우
			newFile6.createNewFile();								// 파일 생성 명령어, 예외처리가 필요 (여러가지문제로 파일을 생성할 수 없는 경우 IOException)
		}
		
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
		
		
	}

}
