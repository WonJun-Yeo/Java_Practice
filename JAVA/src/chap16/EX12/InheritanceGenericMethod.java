package chap16.EX12;

/* Generic �޼ҵ��� ���
 * 
 */

class Parent {																// �Ϲ�Ŭ����
	// Number Ŭ���� : Boolean, Character�� ������ Wrapper Ÿ���� Ŭ������ �� �� �ִ�.
	<T extends Number> void print(T t) {									// Generic �޼ҵ�
		System.out.println(t);
	}
}

class Child extends Parent {												// Generic �޼ҵ� ����� �Ϲ� ��Ӱ� ���� ����� �� �ִ�.
	
}



public class InheritanceGenericMethod {

	public static void main(String[] args) {
		// 1. �θ�Ŭ������ Generic �޼ҵ� ���
		
		Parent p = new Parent();
		p.<Integer>print(100);
		p.print(300);														// �Ű������� Ÿ���� �� �� �ִ� ���, ������Ÿ�� ���� ����
		p.<Double>print(0.5);
		p.print(1.5);
		p.<Long>print(100000L);
		p.print(105000L);
		p.<Float>print(100000F);
		p.print(1011000F);
		//p.<Byte>print(1);
		// p.<String>print("�ȳ�");											// String�� Number Ŭ������ �ƴϴ�.
		
		System.out.println("=========================");
		
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(5.5);
		c.<Long>print(150000L);
		c.<Float>print(102000F);
		
		
		
		
		
	}

}
