package chap10.EX04;

// 메소드 오버라이딩

class Animal {
	void cry() {
	}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("누구쎼용?");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야이찌발럼아!!!");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("(형 왜그래;;)");
	}
}

public class MethodOverriding_01 {

	public static void main(String[] args) {
		// 1. 각각의 타입으로 객체 선언 및 생성
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();								// Animal 클래스의 cry() 메소드 호출
		bb.cry();								// Bird 클래스의 cry() 메소드 호출
		cc.cry();								// Cat 클래스의 cry() 메소드 호출
		dd.cry();								// Dog 클래스의 cry() 메소드 호출
		
		System.out.println("=================");
		
		// 2. Animal 타입으로 선언 및 생성
		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();								// Animal 클래스의 cry() 메소드 호출, 하지만 Bird 클래스에서 cry() 메소드가 오버라이딩되었기 떄문에 Bird 클래스의 cry()로 연결되어 Bird 클래스의 cry()가 출력된다. (동적바인딩)
		ac.cry();								// Animal 클래스의 cry() 메소드 호출, 하지만 Cat 클래스에서 cry() 메소드가 오버라이딩되었기 떄문에 Cat 클래스의 cry()로 연결되어 Bird 클래스의 cry()가 출력된다. (동적바인딩)
		ad.cry();								// Animal 클래스의 cry() 메소드 호출, 하지만 Dog 클래스에서 cry() 메소드가 오버라이딩되었기 떄문에 Dog 클래스의 cry()로 연결되어 Bird 클래스의 cry()가 출력된다. (동적바인딩)
		
		System.out.println("=================");
		
		// 3. 객체를 배열로 관리
		Animal[] animal = {ab, ac, ad};
		//객체타입[] 배열이름 = {객체, 객체, 객체};
		
		for (Animal k : animal) {
			k.cry();
			System.out.println(k);
		}
		System.out.println();
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
			System.out.println(animal[i]);
		}
		
	}

}
