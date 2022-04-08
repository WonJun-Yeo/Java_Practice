package chap19.EX02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		// 1. c:\에 작업 폴더 생성
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {
			tempDir.mkdir();
		}
		
		// 2. 파일 객체 생성 (C:/Windows)
		File file = new File("C:\\Windows");
		
		
		// 3. 파일 메소드 사용
		System.out.println("절대 경로 출력 : " + file.getAbsolutePath());
		System.out.println("폴더 여부 : " + file.isDirectory());
		System.out.println("파일 여부 : " + file.isFile());
		System.out.println("파일/폴더 이름출력 : " + file.getName());
		System.out.println("부모 폴더를 출력 : " + file.getParent());
		
		// 출력문안에 작성할 경우 폴더 생성을 시도하고 생성된경우 : true, 폴더가 이미 있어 실패한 경우 : false
		File newFile1 = new File("C:/temp/abc");
		System.out.println(newFile1.mkdir());				
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:/temp/bcd/cde");		// 하위폴더 한 번에 생성
		System.out.println(newFile2.mkdir());				// mkdir()은 하위폴더까지 한 번에 생성할 수 없다.
		System.out.println(newFile2.mkdirs());				// mkdirs()은 하위폴더까지 한 번에 생성할 수 있다.
		
		File newFile3 = new File("C:/temp/def/hij/klm");	// 하위폴더 한 번에 생성
		System.out.println(newFile3.mkdirs());				// mkdirs()은 하위폴더까지 한 번에 생성할 수 있다.
		
		
		// 4. File 객체를 사용해서 하위 폴더의 정보 추출
		File[] fname = file.listFiles();					// file : "C:\windows" 하위의 모든 폴더나, 파일의 이름을 File 배열에 저장
		
		for (File k : fname) {
			System.out.println((k.isDirectory() ? "폴더 : " : "파일 : ") + k.getName());
		}
		
		
		
		
		
		
	}

}
