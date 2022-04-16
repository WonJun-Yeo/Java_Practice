package Practice;

public class forControlStatement {

	public static void main(String[] args) {
		// 기본적인 for문
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");				// 0 1 2 3 4 5 6 7 8 9
		}
		
		// 초기식과 증감식이 여러개인 for 문
		for (int i = 0, j = 0; (i + j) < 10; i++,j++) {
			System.out.print(i + j + " ");			// 0 2 4 6 8 
		}
		
		// 무한루프 for문과 break 탈출
		for (int i = 0; ; i++) {
			System.out.print(i + " ");				// 0 1 2 3 4 5 6 7 8 9 10 11
			if (i > 10) {
				break;
			}
		}
		
	}

}
