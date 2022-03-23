package chap14.EX05;

/*	���� ������ ��ü���� AutoCloseable ���
 * try (with Resource)
 * try(��ü����) {} catch () {} finally {} : finally�� ���������ϸ�, �ڵ����� close �ȴ�.
 * 1. ��ü�� AutoCloseable �������̽��� close() �޼ҵ带 �������̵� �ؾ��Ѵ�.
 * 		java.lang.AutoCloseable : java.lang�� �ִ� class�� import���� �ʾƵ� �ȴ�.
 * 		java.lang.Object : ��� Ŭ������ �ֻ��� �θ�, java.lang�� �����Ƿ� ���� import���� �ʾƵ� �ȴ�.
 * 
 * 	����ó����� 2����
 * 1. try/catch�� ����ؼ� ����ó�� : �ڽ��� ���� ���ܸ� ó��
 * 2. throws �� ���ؼ� ���ܸ� ó�� : ���ܸ� �ڽ��� ó���ϴ� ���̾ƴ�, ȣ���ϴ� ������ ���ܸ� ó�� (�޼ҵ� ���� ����)
 * 		** [s�� ������ ����] throw : ���ܸ� ������ �߻�
 */

class A implements AutoCloseable {
	String resource;												// default ������ null �� �Ҵ�
	
	A (String resource) {											// ��ü ���� ��, resource�� �� ���Ҵ�
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {							// close() �޼ҵ尡 �ڵ����� ȣ��ȴ�.
		// AutoCloseable �������̽��� close() �޼ҵ带 �������̵�
		System.out.println(resource);
		if (resource != null) {
			resource = null;
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			System.out.println(resource);
		}
	}
}






public class TryWithResource_02 {

	public static void main(String[] args) {
		// 1. �ڵ� ���ҽ� ����
		try(A a1 = new A ("Ư�� ����");) {
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}																// finally�� �����Ǿ�������, �ڵ����� ��ü�� close() �޼ҵ带 ȣ���Ѵ�.
		
		
		System.out.println("====================================");
		
		// 2. ���� ���ҽ� ����
		
		A a2 = null;
		
		try {
			a2 = new A("������ �ʱⰪ �Ҵ�");
		} catch(Exception e) {
			
		} finally {
			if (a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
