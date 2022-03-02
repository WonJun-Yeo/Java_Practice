package EX;
public class Random {
	public static void main(String[] args) {
		// 랜덤 정수 배열 생성 및 평균 출력
		
		int[] array = new int[10];
		
		// 랜덤 정수 배열 생성
		for (int j = 0; j < 10; j++) {
			array[j] = (int)(Math.random()*10+1);		// 1부터 10까지의 랜덤한 값을 생성, *10은 10개, +1은 원래 0부터 시작이나 1씩 더해서 1부터 시작하는 효과를 준다.
		}
		
		// 랜덤 정수 배열 출력
		
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// 랜덤 정수 배열 평균 출력
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("평균은 " + sum / array.length);
	}
}
