package chap16.EX05;

class Apple {
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {										// ��ü ��ü�� ��±����� ���� ��, toString() �޼ҵ尡 ����
		return "�̸� : " + name + ", ���� : " + price;
	}
	
	public void abc() {};
}

class Pencil {
	String name;
	int price;
	
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {										// ��ü ��ü�� ��±����� ���� ��, toString() �޼ҵ尡 ����
		return "�̸� : " + name + ", ���� : " + price;
	}
	
	public void bcd() {};
}

// Generic�� ����ؼ� ��ü�� ���� ��, �� ȣ��

class Goods<T> {													// Generic Ŭ����
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}


public class Object_Generic {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<Apple>();					// goods1 �� Goods ������ Ÿ���̴�.
		goods1.set(new Apple("���1", 2000));
		System.out.println(goods1.get());							// goods1.get()�� Apple ������ Ÿ���� ��ü�� �����´�.
		goods1.get().abc();											// Generic������ �ٿ� ĳ������ �ʿ����.
		
		
		Goods<Pencil> goods2 = new Goods();
		goods2.set(new Pencil("����1", 3000));
		System.out.println(goods2.get());							// goods2.get()�� Pencil ������ Ÿ���� ��ü�� �����´�.
	}

}
