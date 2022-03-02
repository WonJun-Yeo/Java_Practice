package EX;
public class Max {
	public static void main(String[] args) {
		// 주어진 배열의 항목에서 최대닶 구하기
		
		int max = 0;
		int[] array = {4,5,1,2,3};
		for (int k : array) {
			if (max < k) {
				max = k;
			}
		}
		System.out.println("max : " + max);
	}
}
