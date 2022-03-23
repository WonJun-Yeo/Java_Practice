package chap14.EX02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*	Checked Exception (�Ϲݿ���) : ������ �ܰ迡�� ���ܰ� �߻�
 * ������(����)�ϱ� ��, ����ó���� ���־�� �Ѵ�.
 */
/*	unChecked Exception, Runtime Exception (���࿹��) : ����ÿ� ���ܰ� �߻��� �� �ִ�.
 * ����ó���� �ʼ��� �ƴ����� ����ó���� ���� (ó���� ���� �ʰ� ���ܹ߻� ��, ���α׷��� �����.)
 */

class A {
	   B b;										// �ʱⰪ���� null �Ҵ�
	   
	   A() {} 									// �⺻ ������
	   A (B b) {
		   this.b = b;
	   }
	   
	   interface B {   							//�������̽� ����
		   void cry();
	   }
	   
	   void abc() {
		   System.out.println(b);
	       b.cry();
	   }
}




public class CheckedException {

	public static void main(String[] args) {
		// 1. �Ϲ� ���� (Checked Exception) : ������ �ܰ迡�� ����ó���� �ʿ�
		
			// InterruptedException : ������ �߰��� �����Ⱑ �߻��� �� ���� �߻�
			// Thread.sleep(1000);
			
			// ClassNotFoundException : Ŭ������ ã�� ���� �� ���� �߻�
			// Class cls = Class.forName("java.lang.Object");
			
			// IOEception : ��Ʈ��ũ���� ��(����)�� �о���� ���C �� ���� �߻�
			InputStreamReader in = new InputStreamReader(System.in);										// System.in �� �ܼ��� ����
			// in.read();
			
			// FileNotFoundException : ������ ã�� ���� �� ���� �߻�
			// FileInputStream fis = new FileInputStream("text.txt");
		
		
		// 2. ���࿹�� (unChecked Exception) : ������ �ܰ谡 �ƴ� ����ÿ� �߻��Ǵ� ���� 
		
			// NullPointerException : ��ü�� Null �� ���¿��� ��ü�� �ʵ峪 �޼ҵ带 ȣ���� �� ���� �߻�
			A a1 = new A();
			// a1.abc();
		
		
		

	}

}
