package chap11.EX06;

abstract class Animal {										// 추상클래스 : 추상메소드를 하나 이상으로 포함하고 있다면 필수적으로 추상클래스가 되어야한다.
	String name;
	int age;
	
	abstract void cry();									// 추상메소드 : 구현부가 없는 메소드
	abstract void run();									// 추상메소드 : 구현부가 없는 메소드
}

class Cat extends Animal {
	
	Cat (String name, int age) {
		super.name = name;
		super.age = age;
	}
	

	@Override
	void cry() {
		System.out.println(name + "는 야용하고 웁니다.");
	}

	@Override
	void run() {
		System.out.println(name + "의 나이는 " + age + "입니다.");
		
	}
	
}

class Tiger extends Animal {
	Tiger (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println(name + "는 어흥하고 웁니다.");
		
	}

	@Override
	void run() {
		System.out.println(name + "의 나이는 " + age + "입니다.");
		
	}
	
}

class Eagle extends Animal {
	Eagle (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println(name + "는 끼야하고 웁니다.");
		
	}

	@Override
	void run() {
		System.out.println(name + "의 나이는 " + age + "입니다.");
	}
	
}





public class AbstractModifier_04 {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Eagle("독수리", 15);
		
		
		// 1. Animal 배열 객체에 저장
		
		Animal[] arr = {a1, a2, a3};
		
		
		// 2. For문을 사용하여 객체를 출력 (이름과 나이 출력, cry & run method)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
			arr[i].run();
		}
		
		System.out.println("=================");
		
		
		// 3. Enhanced For문 사용하여 객체를 출력
		
		for (Animal k : arr) {
			k.cry();
			k.run();
		}
		
	}

}
