package chap16.EX05;


//Object�� ����ؼ� 5���� ��ü�� �����ϰ� ���

class Student {
	String name;
	String id;
	int pass;
	
	Student(String name, String id, int pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", id : " + id + ", pass : " + pass;
	}
}

class Professor {
	String name;
	int year;
	String email;
	
	Professor(String name, int year, String email) {
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", year : " + year + ", email : " + email;
	}
	
}

class Tiger {
	String name;
	String run;
	
	Tiger (String name, String run) {
		this.name = name;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", run : " + run;
	}
}

class Banana {
	String name;
	String color;
	int price;
	
	Banana (String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", color : " + color + ", price : " + price;
	}
}

//Generic�� ����ؼ� ��ü�� ���� ��, �� ȣ��

class Goods2<T> {													// Generic Ŭ����
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}


public class EX_ObjectGeneric {

	public static void main(String[] args) {
		Goods2<Student> goods1 = new Goods2();
		goods1.set(new Student("ȫ�浿", "001", 123132));
		System.out.println(goods1.get());
		
		System.out.println("==========================================");
		
		Goods2<Professor> goods2 = new Goods2();
		goods2.set(new Professor("�Ż��Ӵ�", 12, "�Ż��Ӵ�@���̹�.com"));
		System.out.println(goods2.get());
		
		System.out.println("==========================================");
		
		Goods2<Tiger> goods3 = new Goods2();
		goods3.set(new Tiger("ȣ����", "ȣ���̴� ������ �޸��ϴ�."));
		System.out.println(goods3.get());
		
		System.out.println("==========================================");
		
		Goods<Banana> goods4 = new Goods();
		goods4.set(new Banana("�ٳ���", "�����", 2000));
		System.out.println(goods4.get());
	}

}
