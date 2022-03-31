package chap16.EX08;

// Generic 클래스를 생성해서, 타입제한 (Apple, Strawberry, Banana), Pencil 타입 제한


abstract class Fruit {								// 추상클래스
	public abstract void print();					// 추상메소드
}

class Apple extends Fruit {
	String name;
	int price;
	
	Apple(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "이고 가격은 " + price + "원입니다.";
	}
	
	@Override
	public void print() {
	}
}

class Strawberry extends Fruit {
	String name;
	int price;
	
	Strawberry(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "이고 가격은 " + price + "원입니다.";
	}
	
	@Override
	public void print() {
	}
}

class Banana extends Fruit {
	String name;
	int price;
	
	Banana(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "이고 가격은 " + price + "원입니다.";
	}
	
	@Override
	public void print() {
	}
}

class Pencil {
	String name;
	int price;
	
	Pencil(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "이고 가격은 " + price + "원입니다.";
	}
}

// Generic 클래스
// DTO(Data Transfer Object)또는 VO(Value Object) : 데이터를 받아서 전송하는 중간자 역할을 함
// DTO : getter, setter 모두 있음, VO : getter 만 있음
class List <T extends Fruit> {							
	private T fruit;

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public String toString() {
		return fruit.toString();
	}
	
	public void print() {
		fruit.print();
	}
}




public class EX_RestricGenericType {
	public static void main(String[] args) {
		List<Apple> apple = new List();
		apple.setFruit(new Apple("사과", 2000));
		System.out.println(apple.getFruit());
		
		System.out.println("========================");
		
		List<Strawberry> strawberry = new List();
		strawberry.setFruit(new Strawberry("딸기", 5000));
		System.out.println(strawberry.getFruit());
		
		System.out.println("========================");
		
		List<Banana> banana = new List();
		banana.setFruit(new Banana("바나나", 4000));
		System.out.println(banana.getFruit());
		
		
		/*
		List<Pencil> pencil = new List();
		pencil.setFruit(new Pencil("사과", 2000));
		System.out.println(pencil.getFruit());
		*/
		
		
		
		
	}
	
}
