package chap11.EX06;

abstract class Animal {
	String name;
	int age;
	
	abstract void cry();
	abstract void run();
}

class Cat extends Animal {
	
	Cat (String name, int age) {
		super.name = name;
		super.age = age;
	}
	

	@Override
	void cry() {
		System.out.println("고양이는 야용하고 웁니다.");
	}

	@Override
	void run() {
		System.out.println("고양이는 호다닥 뜁니다.");
		
	}
	
}

class Tiger extends Animal {
	Tiger (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println("호랑이는 어흥하고 웁니다.");
		
	}

	@Override
	void run() {
		System.out.println("호랑이는 성큼성큼 뜁니다.");
		
	}
	
}

class Eagle extends Animal {
	Eagle (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println("독수리는 끼야하고 웁니다.");
		
	}

	@Override
	void run() {
		System.out.println("독수리 푸닥푸닥 납니다.");
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
