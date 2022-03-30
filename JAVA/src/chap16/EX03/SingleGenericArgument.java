package chap16.EX03;

/* Object�� ��� ��ü�� ������ �� ������, �ٿ�ĳ������ �ʿ��ϰ� ĳ���� ��, ��� �ÿ� ClassCastException�� �߻��� �� �ִ�(���� Ÿ�� üũ).
 * �̸� �ذ��ϱ� ���� Generic Ŭ������ ����Ѵ�.
 * Generic Ŭ�������� �پ��� ������ Ÿ���� ó���� �� �ִ�.
 * ������ �ܰ迡�� ������ üũ�Ѵ�. (���� ���� üũ)
 * 
 * Generic Ÿ�� ���� : T (Type), K (Key), V (Value), N(Number), E(Element)
 * A - Z ���� ���Ƿ� ���� �� �ִ�.
 * Generic Ÿ�� �������� �⺻Ÿ���� �����Ͱ� ��� �� �� ����.
 * 
 * wrapper Ŭ���� : �⺻ Ÿ���� ��üȭ ���� ���� Ŭ����
 * int (�⺻Ÿ��) : Integer (��ü), boolean : Boolean, char : Charter, double : Double, float : Float, byte : Byte, short : Short, long : Long
 * 
 */

class MyClass<T> {
	private T t;
	
	public T get() {					// getter : �ʵ��� �� ��ȯ
		return t;
	}
	
	public void set(T t) {				// setter : �ʵ��� �� �Ҵ�
		this.t = t;
	}
}



public class SingleGenericArgument {

	public static void main(String[] args) {
		// Generic Ŭ���� ��ü ���� String Ÿ��
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		System.out.println("==============================");
		
		// Generic Ŭ���� ��ü ���� Integer Ÿ��
		MyClass<Integer> mc2 = new MyClass<Integer>();								// **wrapper Ŭ������ �Ҵ��Ͽ��� �Ѵ�.
		mc2.set(123);
		System.out.println(mc2.get());
		
		System.out.println("==============================");
		
		// Generic Ŭ���� ��ü ���� Double Ÿ��
		MyClass<Double> mc3 = new MyClass();										// �������� �ڷ����� ���������ϴ�.
		mc3.set(33.33);
		System.out.println(mc3.get());
		
		System.out.println("==============================");
		
		// ���� Ÿ�� üũ
		MyClass<Boolean> mc4 = new MyClass<Boolean>();								// �������� �ڷ����� ���������ϴ�.
		mc4.set(true);
		//mc4.set("�ȳ�");															// ���� Ÿ�� üũ�� ������ �ܰ迡�� ���� �߻�
		System.out.println(mc4.get());
	}

}
