package chap18.EX07;

interface A {
	int abc (String str);
}


public class RefOfInstanceMethodType_02_2 {

	public static void main(String[] args) {
		// �ν��Ͻ� �޼ҵ� ���� : �����޼ҵ� ����
		
		// 1. �͸��̳�Ŭ���� Ȱ��
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		
		// 2. ���ٽ� Ȱ��
		A a2 = (String str) -> {return str.length();};
		
		// 3. �ν��Ͻ� �޼ҵ� ����
		
		A a3 = String::length;							// String: ��ü��, length : �޼ҵ��
		
		System.out.println(a1.abc("�ȳ�."));
		System.out.println(a2.abc("�ȳ��ϼ���."));
		System.out.println(a3.abc("�ȳ��ϼ��� �ݰ����ϴ�."));
		
		
		
		
		

	}

}
