package chap01;
public class EX01_ConsoleOut02 {
	public static void main(String[] args) {
		// "출력포멧",인자, 인자,
		System.out.printf("나의 나이는 %d 입니다.\n", 30); // %d 는 정수 값을 인자로 받을때 사용 (10진수)
		System.out.printf("%o\n", 10); //%o 는 8진수를 인자값으로 받을 때 사용
		System.out.printf("%x\n", 30); //%x 는 16진수를 인자값으로 받을 때 사용
		System.out.printf("%s\n", "출력"); // %s 는 문자열을 인자값으로 받을 때 사용
		System.out.printf("%f\n", 5.800000); // %f 는 실수값을 인자값으로 받을 때 사용
		System.out.printf("%4.2f\n", 5.8); // %4.2f 는 전체 4자리, 소수점 이하 2가리를 인풋 받을 때 사용
		System.out.printf("%d 와 4.2f", 10, 5.8); // 소숫점을 기준으로 표시될 갯수를 뜻하지만, 정수자리는 사실상 의미없음
	}
}
