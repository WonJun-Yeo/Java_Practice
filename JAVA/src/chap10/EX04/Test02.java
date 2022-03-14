package chap10.EX04;


class Animal3 {							// 부모 클래스, 모든 클래스는 Object 클래스를 상속한다. extends Object가 생략되어 있다. 자바의 최상위에 있는 클래스가 Object 클래스
	String name;
	int age;
	
	void cry() {
		System.out.println("동물은 웁니다.");
	}

	@Override
	public String toString() {			// 기본설정은 객체의 주소르 출력. [패키지명.클래스명@객체메모리의 해쉬코드]
		// TODO Auto-generated method stub
		return "이름은 : " + name + ", 나이는 : " + age + "입니다.";
	}
	
}


class Tiger3 extends Animal3 {
	
	Tiger3 (){}							// 기본생성자 : 초기값을 할당하지 않고 초기화(default 값이 할당된다.), 다른 생성자가 존재할 경우 명시해주어야한다.
	
	Tiger3 (String a, int b) {			// 생성자 : 객체를 생성 시, 메모리의 초기값을 할당할 때 사용
		super.name = a;					// super 키워드는 부모클래스(super class)를 뜻한다. this 키워드는 자신의 객체를 뜻한다.
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();					// super 키워드는 부모클래스(super class)를 뜻한다. this 키워드는 자신의 객체를 뜻한다.
		
		System.out.println("호랑이는 어픙하고 웁니다.");
	}
}

class Cat3 extends Animal3 {
	
	Cat3 (){}							// 기본생성자 : 초기값을 할당하지 않고 초기화(default 값이 할당된다.), 다른 생성자가 존재할 경우 명시해주어야한다.
	
	Cat3 (String a, int b) {			// 생성자 : 객체를 생성 시, 메모리의 초기값을 할당할 때 사용
		super.name = a;					// super 키워드는 부모클래스(super class)를 뜻한다. this 키워드는 자신의 객체를 뜻한다.
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();
		
		System.out.println("고영이는 야옹하고 웁니다.");
	}
}

class Dog3 extends Animal3 {
	
	Dog3 (){}							// 기본생성자 : 초기값을 할당하지 않고 초기화(default 값이 할당된다.), 다른 생성자가 존재할 경우 명시해주어야한다.
	
	Dog3 (String a, int b) {			// 생성자 : 객체를 생성 시, 메모리의 초기값을 할당할 때 사용
		super.name = a;					// super 키워드는 부모클래스(super class)를 뜻한다. this 키워드는 자신의 객체를 뜻한다.
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();
		
		System.out.println("강아지는 멍멍하고 웁니다.");
	}
}




public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal3 a3 = new Animal3();		// 객체 생성
		
		/*	객체자체를 출력할 경우
		 * Object 클래스의 toString()메소드가 호출된다. a3.toString()
		 * Object.toString() : 기본 설정은 객체의 주소를 출력
		 */
		System.out.println(a3);	
		System.out.println(a3.toString());
		
		System.out.println("=====================================");
		
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry();				// 부모의 cry() 메소드를 호출 할 경우 오버라이딩된 Tiger3의 cry()를 호출
		c3.cry();				// 부모의 cry() 메소드를 호출 할 경우 오버라이딩된 Cat3의 cry()를 호출
		d3.cry();				// 부모의 cry() 메소드를 호출 할 경우 오버라이딩된 Dog3의 cry()를 호출

		System.out.println("=====================================");
		
		Animal3[] arr = {t3, c3, d3};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("=====================================");
		
		for (Animal3 k : arr) {
			k.cry();
		}
		
		System.out.println("=====================================");
		
		Animal3 tt3 = new Tiger3("호랑이", 5);
		Animal3 cc3 = new Cat3("고양이", 3);
		Animal3 dd3 = new Dog3("강아지", 10);
		
		System.out.println(tt3);					// 객체 자체를 출력 시, Object 클래스의 toString()메소드가 호출된다. Object.toString() : 기본 설정은 객체의 주소를 출력
		System.out.println(cc3);					// 객체 자체를 출력 시, Object 클래스의 toString()메소드가 호출된다. Object.toString() : 기본 설정은 객체의 주소를 출력
		System.out.println(dd3);					// 객체 자체를 출력 시, Object 클래스의 toString()메소드가 호출된다. Object.toString() : 기본 설정은 객체의 주소를 출력
		
		System.out.println("=====================================");
		
		Animal3[] arr2 = {tt3,cc3,dd3};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("=====================================");
		
		for (Animal3 k : arr2) {
			System.out.println(k);
		}
		
	}

}
