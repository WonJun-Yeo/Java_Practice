package kosmo_ywj;
public class Print {

	public static void main(String[] args) {
		System.out.println("화면풀력");	//자바의 한라인 주석
		/* 주석 : 프로그램에서 해석되지 않는 코드. 프로그램에대한 설명
		 * 자바의
		 *여러라인
		 *주석
		 */
		System.out.println("화면" + "출력"); // "+" 문자열일때 연결연산자
		System.out.println(3.8); // 정수, 실수를 출력할 때 ""를 붙히지 않는다.
		System.out.println(3 + 5); // "+" 정수나 실수 일 때 덧셈연산자
		System.out.println("3" + "5"); // "정수, 실수" 는 문자열 취급
		System.out.println("화면 " + 3); // 문자열과 정수, 실수는 연결연산자
		System.out.println("화면 " + 3 + 5); // 앞에서부터 차례로 더하게 되는데 문자열과 정수의 결과로 문자열이된다.
		System.out.println(3 + 5 + " 화면"); // 앞서에부터 자례로 더하여 덧셈연산자로 먼저작용한 뒤, 정수와 문자열은 연결연산자로
		}
}
