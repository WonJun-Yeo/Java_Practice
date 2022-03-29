package chap16.EX02;

/* Object�� ��� Ŭ������ �θ��̴�.
 * ��� Ŭ������ Object Ÿ������ ��ü�� ���� �� �� �ִ�.
 * Object�� ���� : ��� ��ü�� ���� �� �ִ�.
 * Object�� ���� : �Ź� �ٿ� ĳ���� ��, ����ؾ� �Ѵ�.
 * 				 ���� Ÿ�� ü�� : ClassCastException�� �߻��� �� �ִ�.
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

// Object �� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
class Goods {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {							// ��ü�� ��ǲ������ �ְԵǸ� Object Ÿ������ ��ĳ���� �ȴ�.
		this.object = object;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		// 1. Apple ���� ��, ���
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���1", 1000));
		System.out.println((Apple) goods1.getObject());
		
		// 2. Pencil ���� ��, ���
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("����1", 2000));
		System.out.println((Pencil) goods2.getObject());
		
		// 3. �߸��� ĳ������ �� �� �ִ�. (���� Ÿ�� üũ) : Object�� ������
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���2", 3000));
		// System.out.println((Pencil) goods3.getObject());			// ������ �ܰ谡 �ƴ�, ���� �� �����߻� (ClassCastException)
		
	}

}
