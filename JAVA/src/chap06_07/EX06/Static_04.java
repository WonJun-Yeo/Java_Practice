package chap06_07.EX06;

class Cde {
	String name;						// �ν��Ͻ� �ʵ� : static �� �����ʾ� ��üȭ�� �ؾ� ȣ�Ⱑ��
	int age;
	
	static String email;				// ���� �ʵ�(����ƽ �ʵ�) : static�� �پ� ��ü �������� Ŭ���������� ȣ�Ⱑ��, ��ü ������ ��뵵 ����
	static int num;						// �����ʵ�� ��üȭ�Ǵ��� heap������ ���� �ִ°��� �ƴ϶� Ŭ���������� ���� �ΰ�, ��ü�� heap �޸𸮿��� �ּҰ��� ������.
}






public class Static_04 {

	public static void main(String[] args) {
		
		Cde cde1 = new Cde();
		
		// �ν��Ͻ� �ʵ�
		cde1.name = "Ȧ�浿";
		cde1.age = 30;
		
		// ����ƽ �ʵ� : ��ü�� �����ϰ� ����� ���� �ְ�, ��ü�������� Ŭ���������� ����� �� ������ static�� ��ü�������� �ʰ� ����ϴ� ���� �����Ѵ�.
		
		cde1.email = "aaa@aaa.com";
		cde1.num = 01012341234;
		
		// static�� ��� ��ü���� �����Ѵ�.
		Cde.email = "aaa@aaa.com";
		Cde.num = 01012341234;
		
		
		// �ν��Ͻ� �ʵ� : Heap ������ ����ǰ�, �� ��ü���� �������� �ʴ� ������ ���� ������.
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		
		cde2.name = "������";
		cde2.age = 50;
		
		cde3.name = "ŷ����";
		cde3.age = 60;
		
		cde4.name = "�Ż��Ӵ�";
		cde4.age = 40;
		
		
		System.out.println(cde2.name);
		System.out.println(cde2.age);
		System.out.println();
		System.out.println(cde3.name);
		System.out.println(cde3.age);
		System.out.println();
		System.out.println(cde4.name);
		System.out.println(cde4.age);
		System.out.println("====================");
		
		// ����ƽ �ʵ� : Ŭ���� ������ ���� ����ǰ�, ��� ��ü���� �����Ѵ�.
		
		cde2.email = "kkk@kkk.com";
		cde2.num = 55;
		
		System.out.println(cde2.email);
		System.out.println(cde2.num);
		System.out.println();
		
		System.out.println(cde3.email);
		System.out.println(cde3.num);
		System.out.println();
		
		System.out.println(cde4.email);
		System.out.println(cde4.num);
		
	}

}
