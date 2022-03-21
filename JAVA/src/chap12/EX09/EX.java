package chap12.EX09;

public class EX {

	public static void main(String[] args) {
		//1. SamsungPhone 타입으로 객체 생성
		SamsungPhone s1 = new SamsungPhone();
		
		s1.printLogo();								// 인터페이스에서 상속됭 내려온 default 메소드
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("=================");
		
		// 2. PhoneInterface 업캐스팅하여 객체 생성
		PhoneInterface s2 = new SamsungPhone();
		
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		// s2.flash();								// SamsungPhone의 메소드
		
		SamsungPhone ss = (SamsungPhone) s2;		// 다운캐스팅
		ss.flash();
		
		
		int num = 15;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(num--);
		
		
		
	}

}
