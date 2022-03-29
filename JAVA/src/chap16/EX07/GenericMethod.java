package chap16.EX07;

/*Generic Method
 * Generic Ŭ���� : Ŭ������ ������ �� Ÿ�Ժ����� ����, ��ü�� ���� �� T�� ������ Ÿ���� ����
 * 
 * Generic �޼ҵ� : �Ϲ� Ŭ���� ���ο��� ���
 */

class Genricmethod {											// �Ϲ�Ŭ����
	public <T> T method1 (T t) {								// generic �޼ҵ�, Ÿ�� 1�� �Ű����� 1��
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {					// generic �޼ҵ�, Ÿ�� 1�� �Ű����� 2��
		return t1.equals(t2);									// �⺻�ڷ����� ���, �� ���� ���Ͽ� true or false�� ���� ** wrapper Ŭ������ �����ڷ���(Integer, Double)�� String�� ���������� equals()�޼ҵ尡 ���ٶ��̵� �Ǿ� �־� ���� ���Ͽ� true or false ���� 
	}															// �����ڷ����� ���, �� ��ü�� �ּҰ��� ���Ͽ� true or false�� ���� **String�� ��� equals() �޼ҵ尡 �������̵� �Ǿ� �־� ���� ���Ͽ� true or false ����
	
	public <K, V> void method3 (K k, V v) {						// generic �޼ҵ�, Ÿ�� 2�� �Ű����� 2��
		System.out.println(k + " : " + v);
	}
	
	public <K, V> void method4 () {
		System.out.println("������ Ÿ�� ������ �Ұ����� ����Դϴ�.");
	}
	
}


public class GenericMethod {

	public static void main(String[] args) {
		// 1. �Ϲ� Ŭ���� ��ü ���� ��, generic �޼ҵ� ȣ��
		Genricmethod gm = new Genricmethod();
		String str1 = gm.<String>method1("�ȳ�");
		String str2 = gm.method1("�ȳ�");									// �Ű������� ���� �� ������Ÿ���� Ȯ���� �� �ִ� ���, <>�� ������ �� �ִ�.
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println();
		
		Integer i1 = gm.<Integer>method1(100);
		Integer i2 = gm.method1(200);									// �Ű������� ���� �� ������Ÿ���� Ȯ���� �� �ִ� ���, <>�� ������ �� �ִ�.
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println();
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.method1(false);									// �Ű������� ���� �� ������Ÿ���� Ȯ���� �� �ִ� ���, <>�� ������ �� �ִ�.
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println();
		
		Boolean d1 = gm.<Double>method2(2.55, 2.55);
		Boolean d2 = gm.method2(2.55, 2.45);							// �Ű������� ���� �� ������Ÿ���� Ȯ���� �� �ִ� ���, <>�� ������ �� �ִ�.
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println();
		
		gm.<String, Integer>method3("����", 90);
		gm.method3("����", 80);											// �Ű������� ���� �� ������Ÿ���� Ȯ���� �� �ִ� ���, <>�� ������ �� �ִ�.
		gm.<Integer, String>method3(500, "���� ���� �Դϴ�.");
		gm.method3("������ ã�� �� �����ϴ�. ", 402);							// �Ű������� ���� �� ������Ÿ���� Ȯ���� �� �ִ� ���, <>�� ������ �� �ִ�.
		
		System.out.println();
		
		// ������Ÿ���� ������ �� ���� ���
		//gm.method4();													// �Ű������� ���� ��� ������ Ÿ���� �����ؼ� �ȵȴ�.
		
		
		
		
		
		
	}

}
