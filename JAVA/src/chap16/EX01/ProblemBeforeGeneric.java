package chap16.EX01;

/* Generic�� �Ͽ����� �ʰ� ��ü�� ���� Ŭ������ ���� ���
 * ��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�.
 * ���ο� ������ �����, �Ź� �� ������ ���� Ŭ������ ����� �־���Ѵ�.
 * ����, �Ź� ��ü�� ������ ������ �� ��ü�� ���� Ŭ������ ������־���ϴ� ���ŷο��� �ִ�.
 * �ڵ尡 ����������.
 */


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
}

// 1. Apple�� ���� Ŭ����
class Goods1 {														// ��ǰ�� ����� ���� Ŭ����
	private Apple apple = new Apple("���", 1000);

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

// 2. Pencil�� ���� Ŭ����
class Goods2 {
	private Pencil pencil = new Pencil("����", 2000);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}

public class ProblemBeforeGeneric {

	public static void main(String[] args) {
		// 1. Goods1 Ŭ������ Apple ������ ����Ǿ� �ִ�.
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple("���2", 2000));
		System.out.println(goods1.getApple());
		
		
		// 2. Goods2 Ŭ������ Pencil ������ ����Ǿ� �ִ�.
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("����2", 3000));
		System.out.println(goods2.getPencil());

	}

}
