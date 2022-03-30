package chap16.EX03;

/* Object는 모든 객체를 저장할 수 있지만, 다운캐스팅이 필요하고 캐스팅 후, 출력 시에 ClassCastException이 발생할 수 있다(약한 타입 체크).
 * 이를 해결하기 위해 Generic 클래스를 사용한다.
 * Generic 클래스에서 다양한 데이터 타입을 처리할 수 있다.
 * 컴파일 단계에서 오류를 체크한다. (강한 오류 체크)
 * 
 * Generic 타입 변수 : T (Type), K (Key), V (Value), N(Number), E(Element)
 * A - Z 까지 임의로 넣을 수 있다.
 * Generic 타입 변수에는 기본타입의 데이터가 들어 갈 수 없다.
 * 
 * wrapper 클래스 : 기본 타입을 객체화 시켜 놓은 클래스
 * int (기본타입) : Integer (객체), boolean : Boolean, char : Charter, double : Double, float : Float, byte : Byte, short : Short, long : Long
 * 
 */

class MyClass<T> {
	private T t;
	
	public T get() {					// getter : 필드의 값 반환
		return t;
	}
	
	public void set(T t) {				// setter : 필드의 값 할당
		this.t = t;
	}
}



public class SingleGenericArgument {

	public static void main(String[] args) {
		// Generic 클래스 객체 생성 String 타입
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		System.out.println("==============================");
		
		// Generic 클래스 객체 생성 Integer 타입
		MyClass<Integer> mc2 = new MyClass<Integer>();								// **wrapper 클래스를 할당하여야 한다.
		mc2.set(123);
		System.out.println(mc2.get());
		
		System.out.println("==============================");
		
		// Generic 클래스 객체 생성 Double 타입
		MyClass<Double> mc3 = new MyClass();										// 생성자의 자료형은 생략가능하다.
		mc3.set(33.33);
		System.out.println(mc3.get());
		
		System.out.println("==============================");
		
		// 강한 타입 체크
		MyClass<Boolean> mc4 = new MyClass<Boolean>();								// 생성자의 자료형은 생략가능하다.
		mc4.set(true);
		//mc4.set("안녕");															// 강한 타입 체크로 컴파일 단계에서 오류 발생
		System.out.println(mc4.get());
	}

}
