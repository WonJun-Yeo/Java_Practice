package chap06_07.EX06;

/* 	객체의 필드에 값을 할당하는 방식 : 3가지
 * 1. 필드에 직접 값을 부여하는 방식
 * 2. setter를 통해서 객체의 필드에 값을 할당하는 방식 (컨트롤이 된다. 메모리에 원하는 값만 할당가능) : 객체를 생성 후, 필드에 값을 할당
 * 3. 생성자(constructor)를 통해서 객체의 필드 값을 할당하는 방식 (컨트롤이 된다. 메모리에 원하는 값만 할당가능) : 객체를 생성할 때, 초기값으로 필드에 값을 할당
 */


// 1. 필드에 직접 값을 부여하는 방식
class Aa {
	String name;
	int age;
	String mail;
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

// 2. setter를 통해서 객체의 필드에 값을 할당하는 방식

class Bb {
	String name;
	int age;
	String mail;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAge() {
		return age;
	}

	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

// 3. 생성자(constructor)를 통해서 객체의 필드 값을 할당하는 방식

class Cc {
	String name;
	int age;
	String mail;
	
	Cc (String a, int b, String c) {
		name = a;
		age = b;
		mail = c;
	};
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {
		// 1. 필드에 직접 값을 부여하는 방식
		
		Aa aa = new Aa();
		
		aa.name = "여원준";
		aa.age = 30;
		aa.mail = "rbgh004@gmail.com";
		
		aa.print();
		System.out.println("==================");
		
		// 2. setter를 통해서 객체의 필드에 값을 할당하는 방식
		
		Bb bb = new Bb();
		
		bb.setName("여원준");
		bb.setAge(30);
		bb.setMail("rbgh004@gamil.com");
		
		bb.print();
		System.out.println("==================");
		
		// 3. 생성자(constructor)를 통해서 객체의 필드 값을 할당하는 방식
		
		Cc cc = new Cc("여원준", 30, "rbgh004@gmail.com");
		
		cc.print();
		
	}

}
