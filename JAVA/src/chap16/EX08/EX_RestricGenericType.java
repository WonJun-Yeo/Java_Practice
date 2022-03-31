package chap16.EX08;

// Generic Ŭ������ �����ؼ�, Ÿ������ (Apple, Strawberry, Banana), Pencil Ÿ�� ����


abstract class Fruit {								// �߻�Ŭ����
	public abstract void print();					// �߻�޼ҵ�
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
		return name + "�̰� ������ " + price + "���Դϴ�.";
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
		return name + "�̰� ������ " + price + "���Դϴ�.";
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
		return name + "�̰� ������ " + price + "���Դϴ�.";
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
		return name + "�̰� ������ " + price + "���Դϴ�.";
	}
}

// Generic Ŭ����
// DTO(Data Transfer Object)�Ǵ� VO(Value Object) : �����͸� �޾Ƽ� �����ϴ� �߰��� ������ ��
// DTO : getter, setter ��� ����, VO : getter �� ����
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
		apple.setFruit(new Apple("���", 2000));
		System.out.println(apple.getFruit());
		
		System.out.println("========================");
		
		List<Strawberry> strawberry = new List();
		strawberry.setFruit(new Strawberry("����", 5000));
		System.out.println(strawberry.getFruit());
		
		System.out.println("========================");
		
		List<Banana> banana = new List();
		banana.setFruit(new Banana("�ٳ���", 4000));
		System.out.println(banana.getFruit());
		
		
		/*
		List<Pencil> pencil = new List();
		pencil.setFruit(new Pencil("���", 2000));
		System.out.println(pencil.getFruit());
		*/
		
		
		
		
	}
	
}
