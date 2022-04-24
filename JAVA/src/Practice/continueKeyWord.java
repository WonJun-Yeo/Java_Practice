package Practice;

public class continueKeyWord {

	public static void main(String[] args) {
		// 이중 for문 내 안쪽for문 안에 if문과 함께 continue가 사용된 예
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		// continue + Label 구문을 이용해 이중 for문 내에서 여러개의 반복문 뛰어넘기
		POS1:
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					continue POS1;
				}
				System.out.println(i + ", " + j);
			}
		}
		 
		
		
		
	}

}
