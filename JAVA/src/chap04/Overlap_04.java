package chap04;
public class Overlap_04 {
	public static void main(String[] args) {
		// 1. if문 내의 if문
		
		int value1 = 6;
		int value2 = 3;
		
		if (value1 > 5) {
			if (value2 < 2) {
				System.out.println("실행 1");
			} else {
				System.out.println("실행 2");
			}
		} else {
			System.out.println("실행 3");
		}
		System.out.println("============================");
		
		// 2. switch 내의 for문
		
		int value3 = 1;
		
		switch (value3) {
		case 1 :
			for (int k = 10; k > 0; k--) {
				System.out.print(k + " ");
			}
			break;
		case 2 :
			for (int k = 0; k < 10; k++) {
				System.out.print(k + " ");
			}
			break;
		}
		System.out.println("==================");
		
		// 3. for문 내의 for문
		
		for (int i = 0; i < 3; i++) {
			for  (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.println(i + " = " + j);
				} else {
					System.out.println(i + ", " + j);
				}
			}
		}
	}
}
