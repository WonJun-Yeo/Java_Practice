package EX;
public class Sum {
	public static void main(String[] args) {
		// 1 ~ 100 까지 합 프로그램

		int sum = 0;
		
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		/* while문으로 작성
		 * int sum = 0;
		 * int num = 1;
		 * 
		 * while (num <= 100) {
		 * 	sum += num;
		 * 	num++
		 * }
		 * 
		 * System.out.println(sum);
		 */
		
	}
}
