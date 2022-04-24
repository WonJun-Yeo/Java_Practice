package Practice;

public class breakKeyWord {

	public static void main(String[] args) {
		// 이중 for문 내에서 break를 통한 안쪽 for문 탈출
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		
		// 바깥쪽 for문 조건식 false로 만들어 한 번에 이중 for문 탈출
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					i = 4;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		out:
		// break + Label 문법으로 한 번에 이중 for문 탈출
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					break out;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		
	}
}
