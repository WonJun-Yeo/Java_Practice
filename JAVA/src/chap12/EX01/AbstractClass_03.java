package chap12.EX01;
/*�߻�޼ҵ带 �� �� �̻� ������ �߻� Ŭ����
 * �ڽ� Ŭ�������� �ݵ�� �������� �޼ҵ带 �������̵�(������)�ϴ� ���� ������� �� �ִ�.
 * �߻�Ŭ������ ��üȭ �� �� ����.
 */

abstract class D {												
	abstract void print();										// �����ΰ� ���� �߻�޼ҵ�
}


class E extends D {												// �߻�Ŭ������ �ڽ�Ŭ������ �ݵ�� �޼ҵ带 �������̵� �Ͽ��� �Ѵ�.
	@Override
	void print() {
		System.out.println("EŬ������ print()�޼ҵ�");
	}
}


public class AbstractClass_03 {

	public static void main(String[] args) {
		// 1. ��üȭ �ؼ� ��� (��ü 3�� ���� ��, print() �޼ҵ� ���)
		
		D d1 = new E();
		D d2 = new E();
		D d3 = new E();
		
		d1.print();
		d2.print();
		d3.print();
		
		System.out.println("===========================================");
		
		// 2. �͸� Ŭ������ ���� �ؼ� ��� (print()�޼ҵ� 3�� ���)
		
		D d4 = new D() {
			void print() {
				System.out.println("�͸�Ŭ������ pinrt() �޼ҵ� ��� 1");
			}
		};
		
		D d5 = new D() {
			void print() {
				System.out.println("�͸�Ŭ������ pinrt() �޼ҵ� ��� 2");
			}
		};
		
		D d6 = new D() {
			void print() {
				System.out.println("�͸�Ŭ������ pinrt() �޼ҵ� ��� 3");
			}
		};
		
		d4.print();
		d5.print();
		d6.print();

	}

}
