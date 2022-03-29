package chap16.EX07;

/*Generic Method
 * Generic 클래스 : 클래스를 선언할 때 타입변수를 선언, 객체를 생성 시 T에 저용할 타입을 지정
 * 
 * Generic 메소드 : 일반 클래스 내부에서 사용
 */

class Genricmethod {											// 일반클래스
	public <T> T method1 (T t) {								// generic 메소드, 타입 1개 매개변수 1개
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {					// generic 메소드, 타입 1개 매개변수 2개
		return t1.equals(t2);									// 기본자료형일 경우, 두 값을 비교하여 true or false를 리턴 ** wrapper 클래스의 참조자료형(Integer, Double)은 String과 마찬가지로 equals()메소드가 오바라이딩 되어 있어 값을 비교하여 true or false 리턴 
	}															// 참조자료형일 경우, 두 객체의 주소값을 비교하여 true or false를 리턴 **String의 경우 equals() 메소드가 오버라이딩 되어 있어 값을 비교하여 true or false 리턴
	
	public <K, V> void method3 (K k, V v) {						// generic 메소드, 타입 2개 매개변수 2개
		System.out.println(k + " : " + v);
	}
	
	public <K, V> void method4 () {
		System.out.println("데이터 타입 생략이 불가능한 경우입니다.");
	}
	
}


public class GenericMethod {

	public static void main(String[] args) {
		// 1. 일반 클래스 객체 생성 후, generic 메소드 호출
		Genricmethod gm = new Genricmethod();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");									// 매개변수를 넣을 때 데이터타입을 확인할 수 있는 경우, <>를 생략할 수 있다.
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println();
		
		Integer i1 = gm.<Integer>method1(100);
		Integer i2 = gm.method1(200);									// 매개변수를 넣을 때 데이터타입을 확인할 수 있는 경우, <>를 생략할 수 있다.
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println();
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.method1(false);									// 매개변수를 넣을 때 데이터타입을 확인할 수 있는 경우, <>를 생략할 수 있다.
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println();
		
		Boolean d1 = gm.<Double>method2(2.55, 2.55);
		Boolean d2 = gm.method2(2.55, 2.45);							// 매개변수를 넣을 때 데이터타입을 확인할 수 있는 경우, <>를 생략할 수 있다.
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println();
		
		gm.<String, Integer>method3("국어", 90);
		gm.method3("영어", 80);											// 매개변수를 넣을 때 데이터타입을 확인할 수 있는 경우, <>를 생략할 수 있다.
		gm.<Integer, String>method3(500, "서버 에러 입니다.");
		gm.method3("파일을 찾을 수 없습니다. ", 402);							// 매개변수를 넣을 때 데이터타입을 확인할 수 있는 경우, <>를 생략할 수 있다.
		
		System.out.println();
		
		// 데이터타입을 생략할 수 없는 경우
		//gm.method4();													// 매개변수가 없는 경우 데이터 타입을 생략해서 안된다.
		
		
		
		
		
		
	}

}
