package chap10.EX05;

/* 부모의 스태틱 필드는 오버라이딩되지 않는다
 *  static 키워드가 붙으면 메모리 클래스 영역내에 값이 저장되기 때문에, 클래스명으로 호출할 수 있다.
*/

class AAA {
	static int m = 3;
}

class BBB extends AAA {
	static int m = 4;
}

class CCC extends AAA {
	static int m = 5;
}







public class OverlapStaticField {

	public static void main(String[] args) {
		// 1. 객체 생성없이 클래스명으로 호출			(권장사항)
		
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		System.out.println(CCC.m);
		
		System.out.println("===================");
		
		// 2. 객체 생성 후 호출
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		CCC ccc = new CCC();
		
		AAA aab = new BBB();
		AAA aac = new CCC();
		
		System.out.println(aaa.m);
		System.out.println(bbb.m);
		System.out.println(ccc.m);
		
		System.out.println();
		
		System.out.println(aab.m);
		System.out.println(aac.m);
		
		
	}

}
