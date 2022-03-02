package EX;
public class Triangle {
	public static void main(String[] args) {
		// 상각형 출력
		String s = "*";
		for (int i = 0; i < 4; i++) {
			System.out.print(s);
			s = "*" + s;
			System.out.println();
		}
		
		
		/* 2중 for문으로 작성
		 * 
		 * int lineCount;		// 다음 라인으로 개행하는 변수
		 * int starCount;		// 별을 출력하는 변수
		 * 
		 * for (lineCount = 0; lineCount < 4; lineCount++) {
		 * 		for (starCount = 0; starCount <= lineCount; starCount++) {
		 * 			System.out.print(*);
		 * 		{
		 * 		System.out.println();
		 * }
		*/
	}
}
