package EX;
public class Array {
	public static void main(String[] args) {
		// 배열을 이용한 1 ~ 10까지 합을 출력
		
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int k : scores) {
			sum += k;
		}
		System.out.println(sum);
	}
}
