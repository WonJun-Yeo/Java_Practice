package chap16.EX06.EX1;

// GenericPrinter 에 사용될 객체

public class Plastic extends Material {								// 추상클래스를 상속
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}
}
