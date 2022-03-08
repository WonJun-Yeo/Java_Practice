package chap06_07.EX05;

public class EX_C {

	public static void main(String[] args) {
		// 같은 패키지 내의 클래스 접근
		C c = new C();
		c.model = "펠리셰이드";
		c.color = "화이트";
		c.maxSpeed = 200;
		
		c.print();
	}

}
