package chap03;
public class OperatorEx06 {
	public static void main(String[] args) {
		/*
		 * 논리 쉬프트를 이용해서 각 비트의 위치 값을 알아내기
		 */
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1); // 0 : 0번째 비트값
		System.out.println(flags >>> 1 & 1); // 1 : 1번째 비트값
		System.out.println(flags >>> 2 & 1); // 2 : 2번째 비트값
		System.out.println(flags >>> 3 & 1); // 3 : 3번째 비트값
		System.out.println(flags >>> 4 & 1); // 4 : 4번째 비트값
		System.out.println(flags >>> 5 & 1); // 5 : 5번째 비트값
		System.out.println(flags >>> 6 & 1); // 6 : 6번째 비트값
		System.out.println(flags >>> 7 & 1); // 7 : 7번째 비트값
		System.out.println(flags >>> 8 & 1); // 8 : 8번째 비트값
	}
}
