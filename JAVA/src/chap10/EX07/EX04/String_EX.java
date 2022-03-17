package chap10.EX07.EX04;

// String만의 고유의 특징 : 객체를 출력하면 toString() 메소드로 주소가 반환되야 하지만, 값이 반환되도록 재정의가 되어있다.

class A {
	String name;
	A (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class String_EX {

	public static void main(String[] args) {
		
		String s0 = new String("안녕");
		String s1 = "안녕";			// String은 참조 변수
		
		System.out.println(s0);	
		System.out.println(s1);
		
		
		A a = new A("안녕");
		System.out.println(a);
		
		
	}

}
