package chap06_07.EX06;

/* 	��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� : 3����
 * 1. �ʵ忡 ���� ���� �ο��ϴ� ���
 * 2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� (��Ʈ���� �ȴ�. �޸𸮿� ���ϴ� ���� �Ҵ簡��) : ��ü�� ���� ��, �ʵ忡 ���� �Ҵ�
 * 3. ������(constructor)�� ���ؼ� ��ü�� �ʵ� ���� �Ҵ��ϴ� ��� (��Ʈ���� �ȴ�. �޸𸮿� ���ϴ� ���� �Ҵ簡��) : ��ü�� ������ ��, �ʱⰪ���� �ʵ忡 ���� �Ҵ�
 */


// 1. �ʵ忡 ���� ���� �ο��ϴ� ���
class Aa {
	String name;
	int age;
	String mail;
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

// 2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ��ϴ� ���

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

// 3. ������(constructor)�� ���ؼ� ��ü�� �ʵ� ���� �Ҵ��ϴ� ���

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
		// 1. �ʵ忡 ���� ���� �ο��ϴ� ���
		
		Aa aa = new Aa();
		
		aa.name = "������";
		aa.age = 30;
		aa.mail = "rbgh004@gmail.com";
		
		aa.print();
		System.out.println("==================");
		
		// 2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ��ϴ� ���
		
		Bb bb = new Bb();
		
		bb.setName("������");
		bb.setAge(30);
		bb.setMail("rbgh004@gamil.com");
		
		bb.print();
		System.out.println("==================");
		
		// 3. ������(constructor)�� ���ؼ� ��ü�� �ʵ� ���� �Ҵ��ϴ� ���
		
		Cc cc = new Cc("������", 30, "rbgh004@gmail.com");
		
		cc.print();
		
	}

}
