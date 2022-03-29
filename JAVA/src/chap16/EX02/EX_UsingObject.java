package chap16.EX02;

// Object를 사용해서 5개의 객체를 저장하고 출력

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
		return "이름 : " + name + ", id : " + id + ", pass : " + pass;
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
		return "이름 : " + name + ", year : " + year + ", email : " + email;
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
		return "이름 : " + name + ", run : " + run;
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
		return "이름 : " + name + ", color : " + color + ", price : " + price;
	}
}

class All {
	Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

public class EX_UsingObject {

	public static void main(String[] args) {
		All all1 = new All();
		all1.setObject(new Student("홍길동", "001", 123132));
		System.out.println((Student)all1.getObject());

		System.out.println("======================================");
		
		All all2 = new All();
		all2.setObject(new Professor("신사임당", 12, "신사임당@네이버.com"));
		System.out.println((Professor)all2.getObject());
		
		System.out.println("======================================");
		
		All all3 = new All();
		all3.setObject(new Tiger("호랑이", "호랑이는 빠르게 달립니다."));
		System.out.println((Tiger)all3.getObject());
		
		System.out.println("======================================");
		
		All all4 = new All();
		all4.setObject(new Banana("바나나", "노란색", 2000));
		System.out.println((Banana)all4.getObject());
	}

}
