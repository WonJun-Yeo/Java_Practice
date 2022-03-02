package chap04;
public class Quiz_04 {
	public static void main(String[] args) {
		// 1 ~ 19단 홀수단만 출력
		for (int i = 1; i < 20; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j) );
				}
			} else {
				continue;
			}
			System.out.println("=====================");
		}
	}
}
