package chap19.EX04;

/* ASCII 코드
 * 1byte = 8bit
 * 제일 앞 비트는 부호비트
 * 1~32 비트까지는 출력을 할 수 없는 특수한 코드가 들어가있다. ex) null(1), 헤더의 시작, 경고(7), 개행(LF, 10), del(삭제, 127)
 * 
 * 실제 출력가능한 비틑 = 33 ~ 126 비트
 * 영문, 숫자, 특수문자 등
 */

/* 출력
 * ======================================
 * ASCII	(탭두번)	문자	(탭두번)	ASCII	(탭두번)	문자
 * 33				!	3		34				&		
 * 35				#			36				$
 * ...
 * 								126
 */



public class Ascii_Code_Print {

	public static void main(String[] args) {
		
		System.out.println("출력");
		System.out.println("==================================================");
		System.out.println("ASCII" + "\t\t" + "문자" + "\t\t" + "ASCII" + "\t\t" + "문자");
		
		int[] array = new int[94];
		for (int i = 33; i < 127; i++) {
			array[i-33] = i;
		}
		
		for (int i = 0; i < 94; i += 2) {
			System.out.println(array[i] + "\t\t" + (char)array[i] + "\t\t" + array[i+1] + "\t\t" + (char)array[i+1]);
		}
		
	}

}
