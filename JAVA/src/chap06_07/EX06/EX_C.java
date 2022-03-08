package chap06_07.EX06;

import chap06_07.EX05.C;

public class EX_C {

	public static void main(String[] args) {
		// 다른 패키지의 클래스에 접근, public만 접근, 나머지 setter와 getter 이용
		C c = new C();
		
		c.maxSpeed = 200;
		c.setModel("펠리셰이드");
		c.setColor("화이트");

		c.print();	
	}

}
