package chap06_07.EX01;


class Aaa {
	String name;							// �ʵ��, Ŭ����������� ����� ����, ��üȭ(�ν��Ͻ���) ���Ѿ� ��� ����
	int age;								// Heep ������ �������� ���� �ʱ�ȭ(default �� �Ҵ�)
	String email;							// �������� : null, int : 0, double: 0.0, boolean : false
	double weight;
	boolean man;
	
	
	
	public String getName() {				// �޼ҵ��, String : ����Ÿ��, getName() : �޼ҵ��(�Ű�����)
		return name;						// return : �ʵ尪�� ��ȯ���ش�. ��ȯŸ���� void�� �ƴ� ��� ��� �־���Ѵ�.
	}
	public void setName(String name) {
		this.name = name;					// this : ����Ŭ����, name : �����̸�(�ʵ��̸�), ��ǲ�Ǵ� ���� & �޴º����̸� & �޷θ��̸��� ��� ������ ��� ������־�� �Ѵ�.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}


public class CreateObject_02 {
	public static void main(String[] args) {
		// aaa ��ü ����, ���� ��Ű������ Aaa Ŭ������ �����ϱ� ������ import���� �ʰ� ����� �����ϴ�.
		Aaa aaa = new Aaa();				
		
		// �ʵ��� ���� ���
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		System.out.println("===============");
		
		// �ʵ��� ���� �����Ҵ� ��, ���
		// ���Ȼ� �޸𸮿� ���� ���� �Ҵ��ϴ� ���� ������� �ʴ´�.
		aaa.name = "����";
		aaa.age = 23;
		aaa.weight = 43;
		aaa.email = "aaa@aaa.com";
		aaa.man = false;
		
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		System.out.println("===============");
		
		// setter�� �̿��� �ʵ� ���� �Ҵ� ��, getter�� �̿��� ���
		// ���Ȼ� �ʵ尪�� ���� �Ҵ����� ���� ��� ����Ѵ�.
		// �޸𸮿� ���� ���� �� ������ �� �ִ�. (������������)
		
		aaa.setName("�ں���");
		aaa.setAge(33);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(false);
		aaa.setWeight(43);
		
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeight());
		
		// �ϳ��� Ŭ�������� �������� ��ü�� ����
		
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
	}
}
