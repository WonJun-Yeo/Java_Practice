package chap03;
public class OperatorEx02 {
	public static void main(String[] args) {
		// 크기 비교 ( <, >, ,<=, >=)		=====> true, false
		System.out.println(5 < 2);
		System.out.println(-5 < 5);
		System.out.println(5 <= 5);
		System.out.println("============================");
		
		// 등가 비교 { ==(같다) , !=(같지 않다)}		====> true, false
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println("==============================");
		
		// 참조 자료형 등가 비교 (객체의 메모리의 번지를 비교)
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1 == str2);	// 텍스트가 같냐를 비교하는 것이 아니라, 객체의 메모리의 번지를 비교하기 떄문에 false
		
		
	}
	
}
