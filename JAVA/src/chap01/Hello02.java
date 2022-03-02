package chap01;
public class Hello02 {
	// 메소드 선언 (메소드 : 객체지향언어에서 함수(인풋갑을 넣어서 프로그램에 따라 결과를 출력시)를 메소드라고 호칭한다.)
	
	public static int sum (int n, int m) {
		return n+m;
	}
	
	
	
	public static void main(String[] args) {
		int i = 20;		// i 변수는 정수만 넣을 수 있고, 초기값으로 20을 할당해서 넣음
		int s;			// s 변수는 정수만 넣을 수 있고, 초기값은 비워둠
		char a;			// a 변수는 한 글자만 넣을 수 있다. (아스키값), 캐릭터값에 변수를 할당할 때는 ''(작은 따옴표)를 이용한다.
		String b;
		
		b = "오늘의 날씨는 맑습니다.";
		
		s = sum (i, 10); // sum() 메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
	}
}
