package chap16.EX06.EX1;

//GenericPrinter 에 사용될 객체

public class Water {
	public void doPrinting() {
		System.out.println("물 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 물 입니다.";
	}
	
}
