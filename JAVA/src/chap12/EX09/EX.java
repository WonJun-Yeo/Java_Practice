package chap12.EX09;

public class EX {

	public static void main(String[] args) {
		//1. SamsungPhone Ÿ������ ��ü ����
		SamsungPhone s1 = new SamsungPhone();
		
		s1.printLogo();								// �������̽����� ��Ӊ� ������ default �޼ҵ�
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("=================");
		
		// 2. PhoneInterface ��ĳ�����Ͽ� ��ü ����
		PhoneInterface s2 = new SamsungPhone();
		
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		// s2.flash();								// SamsungPhone�� �޼ҵ�
		
		SamsungPhone ss = (SamsungPhone) s2;		// �ٿ�ĳ����
		ss.flash();
		
		
		int num = 15;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(num--);
		
		
		
	}

}
