package chap06_07.EX03;

class Car {
	String company;			// �ʵ� (�ν��Ͻ��ʵ�), �ʵ��� �ʵ��� ���� Heap �޸𸮿� ����
	String model;			// �ν��Ͻ� : ��üȭ�� ������ ��� ������ �ʵ�
	String color;			
	double maxSpeed;
	
	
	Car (String a, String b, String c, double d) {
		this.company = a;							// this Ű����� ��ü�� �ʵ� ������ ����, ���������� ��ü�������� ������ �� ����ϴ� ���� �Ǵ�.
		this.model = b;
		this.color = c;
		this.maxSpeed = d;
	}
	
	void work() {									// �޼ҵ�(�ν��Ͻ� �޼ҵ�) : �޼ҵ��� �޼ҵ� �����͸� Heap ������ ����
		System.out.println("ȸ��� : " + company);	// �޼ҵ��� ��ü ������ Ŭ���� ������ �޼ҵ� ������ ����
		System.out.println("�𵨸� : " + model);
		System.out.println("���� : " + color);
		System.out.println("�ְ�ӵ� : " + maxSpeed);
	}
	
	
}


public class Q1 {

	public static void main(String[] args) {
		// �����ڸ� ���ؼ� �⺻ ���� �Ҵ��� �޸𸮿� ������ work()�޼ҵ带 ����ؼ� ���
		
		Car car = new Car("����", "�ҳ�Ÿ", "ȭ��Ʈ", 180.5);
		
		car.work();
	}

}
