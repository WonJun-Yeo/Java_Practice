package chap19.EX01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() 메소드의 유용한 정보들
		
		System.out.println(System.getProperty("user.dir"));						// 현재 작업 디렉토리를 출력
		
		System.out.println(System.getProperty("java.version"));					// java 버전
		
		System.out.println(System.getProperty("java.vendor"));					// IDE 판매자
		
		System.out.println(System.getProperty("java.vendor.url"));				// URL
		
		System.out.println(System.getProperty("java.home"));					// java 설치 폴더
		
		System.out.println(System.getProperty("java.class.version"));
		
		System.out.println(System.getProperty("java.class.path"));				// bin 폴더 경로
		
		System.out.println(System.getProperty("user.name"));					// 사용자 정보
		
		System.out.println(System.getProperty("user.home"));					// 홈 폴더
		
		System.out.println(System.getProperty("os.name"));						// os 정보
		
		System.out.println(System.getProperty("os.arch"));						// os 아키텍쳐
		
		System.out.println(System.getProperty("os.version"));					// os 버전
		
		System.out.println(System.getProperty("file.separator"));				// 폴더 구분자
			
		System.out.println(System.getProperty("path.separator"));				// 패스 구분자
		
		System.out.println(System.getProperty("line.separator"));				// 라인 구분자
	}

}
