package EX;
public class SamyukguGame {
	public static void main(String[] args) {
		// 369 ∞‘¿”
		
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == 0) {
					if (j % 3 == 0) {
						System.out.println(j + " π⁄ºˆ ¬¶");
					}
				} else {
					if (i % 3 == 0 && j % 3 == 0) {
						System.out.println((i * 10) + j + "π⁄ºˆ ¬¶¬¶");
					} else if (i % 3 != 0 && j % 3 == 0) {
						System.out.println((i * 10) + j + "π⁄ºˆ ¬¶");
					} else if (i % 3 == 0 && j % 3 != 0) {
						System.out.println((i * 10) + j + "π⁄ºˆ ¬¶");
					}
				}
			}
		}
	}
}
