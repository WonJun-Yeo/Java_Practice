package EX;
import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		// 금액 입력시 지폐 및 동전 갯수 출력
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int result = 0;
		
		System.out.println("금액을 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			if (i == 0) {
				result = numb / unit[i];
				System.out.println(unit[i] + " 원 짜리 : " + result + " 개");
			} else {
				result = numb % unit[i - 1] / unit[i];
				System.out.println(unit[i] + " 원 짜리 : " + result + " 개");
			}
		}
		
		/* 다른 방법
		 * 
		 * for (int i = 0; i < unit.length; i++) {
		 * 		System.out.print("%d 원 짜리 : %d 개 \n", unit[i], numb/unit[i]);
		 * 		money = money - (money/unit[i]) * unit[i];
		 * }
		 * 
		 */
		
		
		
		sc.close();
	}
}