package chap16.EX07;

/* 	Generic 메소드 내부에서 사용 가능한 메소드
 * Object 클래스의 메소드만 사용이 가능하다.
 */

class A {
	public <T> void method (T t) {
		//System.out.println(t.length());								// length() 메소드는 String 클래스의 메소드
		System.out.println(t.equals("안녕"));								// equals() 메소든는 Object 클래스의 메소드
	}
}


public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String> method ("안녕");

	}

}
