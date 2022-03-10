package chap10.EX01;


// 업캐스팅과 다운캐스팅은 반드시 상속이 적용되어 있어야한다.



// 아우터 클래스
class Tiger extends Animal {
	int tiger;
	
	void tigerEat() {
		System.out.println("호랑이는 육식성입니다.");
	}
}

class Dog extends Animal {
	int dog;
	void dogEat() {
		System.out.println("강아지는 잡식성입니다.");
	}
}

class Dog_sub extends Dog {
	int dog_sub;
	
	void dog_sub() {
		System.out.println("Dog의 자식 클래스입니다.");
	}
}

class Panda extends Animal {
	int panda;
	void pandaEat() {
		System.out.println("판다는 초식성입니다.");
	}
}


public class Animal {
	
	String name;				// 동물 이름
	int age;					// 동물 나이
	String color;				// 동물 색깔
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
	public static void main(String[] args) {
		
		/*	업캐스팅 : 자식타입의 데이터 타입에서 부모 데이터 타입으로 변환, 부모타입의 필드와 메소드만 접근 가능
		 * 업캐스팅은 강제 타입변환 없이 자동으로 업캐스팅 된다.
		 * 업캐스팅은 다형성으로 처리하기 때문에 효율적으로 프로그래밍을 처리할 수 있다.
		 * 다형성 : 오버라이딩(상속)을 이용해 상속에서 하나의 메소드로 여러 정보를 처리할 수 있다.
		 */
		
		
		// Animal <- Dog <- Dog_sub
		
		
		// 1. Animal 클래스 객체화
		Animal a1 = new Animal();				// 자신의 필드와 메소드만 접근
		
		// 2. Dog 클래스를 Dog 타입으로 객체화
		Dog d1 = new Dog();						// Animal과 Dog의 필드와 메소드에 접근
		
		// 3. Dog 클래스를 Animal 타입으로 업캐스팅
		Animal a2 = new Dog();					// Animal, Dog타입의 데이터를 모두 내포하고 있지만, Animal 클래스의 필드와 메소드에만 접근
		
		// 4. Dog_sub 클래스를 Animal 타입으로 업캐스팅
		Animal a3 = new Dog_sub();				// Animal, Dog, Dog_sub 타입의 데이터를 모두 내포하고 있지만, Animal 클래스의 필드와 메소드에만 접근
		
		a3.name = "치와와";	// Animal 클래스의 필드
		//a3.dog			// 접근불가
		
		// 5. Dog_sub 클래스를 Dog 타입으로 업캐스팅
		Dog d2 = new Dog_sub();					// Animal, Dog, Dog_sub 타입의 데이터를 모두 내포하고 있지만, Animal, Dog 클래스의 필드와 메소드에만 접근
		
		d2.name = "셰퍼트";	// Animal 클래스의 필드
		d2.dog = 3;			// Dog 클래스의 필드
		//d2.dog_sub		// 접근불가
		
		// 6. Dog_sub 클래스를 Dog_sub 타입으로 객체화
		Dog_sub ds1 = new Dog_sub();			// Animal, Dog, Dog_sub 타입의 데이터를 모두 내포하고 모든 필드와 메소드에 접근
		
		ds1.name = "진돗개";	// Animal 클래스의 필드
		ds1.age = 4;		// Animal 클래스의 필드
		ds1.dog = 4;		// Dog 클래스의 필드
		ds1.dog_sub = 4;	// Dog_sub 클래스의 필드
		
		
		
		/*	다운캐스팅 : 부모 데이터 타입을 자식 데이터 타입으로 변환
		 * 다운 캐스팅은 강제로 타입을 변환해주어야 한다.
		 * ds1은 Dog_sub의 데이터 타입을 가지고 있다. (Animal, Dog, Dog_sub 클래스의 모든 필드, 메소드에 접근가능)
		 */
		
		Dog ds1_c1 = ds1;		// Dog_sub 데이터 타입에서 Dog 데이터 타입으로 업캐스팅 (Animal, Dog 클래스의 필드와 메소드 접근가능)
			Dog ds2_c1 = (Dog) ds1;		// 업캐스팅은 (Dog) 라는 데이터타입을 생략할 수 있으며, 자동으로 맞는 타입으로 변환이 된다.
		Animal ds1_c2 = ds1;	// Dog_sub 데이터 타입에서 Animal 데이터 타입으로 업케스팅 (Animal 클래스의 필드와 메소드 접근가능)
		
		
		
		// a3 는 Animal, Dog, Dot_sub 중 Animal 타입에만 접근할 수 있도록 업캐스팅이 되어 있다.
		
		Dog a3_down1 = (Dog) a3;		// Animal 데이터 타입에서 Dog 데이터 타입으로 다운캐스팅 (Animal, Dog 클래스의 필드와 메소드 접근가능)
		a3_down1.dog = 4;
		
		Dog_sub a3_down2 = (Dog_sub) a3;	// Animal 데이터 타입에서 Dog_sub 데이터 타입으로 다운캐스팅 (Animal, Dog, Dog_sub 클래스의 필드와 메소드 접근가능)
		a3_down2.dog_sub = 3;
		
		
		
		
	}
}
