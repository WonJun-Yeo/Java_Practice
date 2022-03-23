package chap14.EX02;

/*	실행예외 (Unchecked Exception, Runtime Exception) : 컴파일 단계에서는 예외가 발생되지 않고, 실행할 때 예외 발생
 * 
 */

class AA {}
class BB extends AA {}

public class UncheckedException {

	public static void main(String[] args) {
		// ArithmeticException : 0으로 어떤 수를 나누면 예외 발생
		// System.out.println(10 / 0);
		
		// ClassCastException : 클래스의 타입을 변환할 때 불가능한 타입으로 변환 시 예외 발생
		AA aa = new AA();
		// BB bb = (BB) aa;
		
		// ArrayIndexOutOfBoundsException : 배열에서 존재하지 않는 index 번호를 출력할 때 예외 발생
		int[] array = {1, 2, 3};
		// System.out.println(array[3]);
		
		// NumberFormatException : 문자형 숫자를 정수타입으로 변환할 수 없을 때 예외 발생
		// int num = Integer.parseInt("10!");					// 문자열 10을 정수로 변환
		// System.out.println(num);
		
		// NullPointerException : 객체가 생성되지 않아 null값일 때 호출하는 경우 예외 발생
		String str = null;
		System.out.println(str.charAt(2));
		
		
		
		
	}

}
