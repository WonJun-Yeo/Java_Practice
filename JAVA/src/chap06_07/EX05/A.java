package chap06_07.EX05;

/*	접근 제어자 : public, protected, default, private
 * 접근제어자는 객체지향언어의 특징인 캡슐화를 뜻한다.
 * 캡슐화 : 데이터를 외부로부터 보호하는 역할
 * 클래스명, 필드명, 메소드명, 생성자명 앞에 접근 제어자가 할당되어 있어야 한다.
 * 클래스명 앞에는 public 과 default 만 할당할 수 있다.
 * 
 */

public class A {
	int m = 3;						// 필드의 기본 접근 제어자는 default : 생략되어 있다. 같은 패키지 내에서만 접근가능
	private int n = 4;				// private 접근 제어자는 외부 클래스에서의 접근을 막는다.
	public int k = 5;				// public 접근제어자는 다른 패키지의 클래스에서도 접근이 가능하다.
	
	void print() {					// 접근제어자 default 생략 : 같은 패키지내의 클래스에서만 사용가능
		System.out.println("import success");
	}
	
	public void print2() {
		System.out.println("외부 패키지의 다른 클래스에서 접근가능");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
