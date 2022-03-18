package chap12.EX09;

public class SamsungPhone implements PhoneInterface {
	
	// 인터페이스에서 정의한 메소드를 오버라이딩(구현)
	@Override
	public void sendCall() {
		System.out.println("굿모닝 빠빠빠빠빰 빠빠빠빠");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받으세요");
		
	}
	
	// SamsungPhone 만의 메소드(기능) 추가
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
	
}
