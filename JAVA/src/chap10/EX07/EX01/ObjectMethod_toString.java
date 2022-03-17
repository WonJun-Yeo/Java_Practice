package chap10.EX07.EX01;

/*	Object 클래스의 toString() 메소드
 * 객체를 출력할 때, Object 클래스의 toString() 메소드가 호출된다.
 * toString() : 패키지명.클래스명@해쉬코드 가 출력된다.
 * 해쉬코드 : 객체가 가르키고 있는 heap메모리의 번지를 해쉬코드(16진수)로 암호화한것
 * toString() 메소드는 일반적으로 재정의하여 사용된다. (ex. 필드값, 메소드 호출로 재정의)
 */

class A {
	int m = 3;
	int n = 4;
}

class B {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a 변수의 값 : " + a + "b 변수의 값 : " + b;
	}
}


public class ObjectMethod_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a);								// .toString() 이 생략된것
		System.out.println(a.toString());
		System.out.printf("%x\n", a.hashCode());			// %x : 16진수  hashCode() 메소드는 해쉬코드를 출력하는 Object 클래스의 메소드
		System.out.println(a.hashCode());					// println은 10진수로 변환되어 반환
		
		System.out.println();
		
		B b = new B();
		System.out.println(b);								// toString() 메소드를 재정의해여 객체의 필드 정보를 출력
		
		
		
		
		
	}

}
