package chap06_07.EX05;

import chap06_07.EX06.EX06_bcd;

// import chap06_07.EX06.Abc;				// Abc class에 접근제한자가 default이므로 외부 패키지에서 import가 불가능하다.


public class External_Abc extends EX06_bcd {			// EX06_bcd 클래스가 부모가 되고, External_Abc 클래스가 자식이 된다.

	public static void main(String[] args) {
		
		// Abc abc2 = new Abc();
		
		
		/* 다른 패키지에서 호출
		 * 1. import
		 * 2. 객체 생성
		 * 3. 접근지정자 확인(public, protected_상속관계_
		 */
		EX06_bcd bcd1 = new EX06_bcd();
		External_Abc ext = new External_Abc();
		
		// 필드
		
		bcd1.a = 1000;							// public : 다른 패키지에서 접근가능
		//bcd1.b = 2000;						// protected : 상속관계인 경우에만 다른 패키지에서 접근가능
		//bcd.c = 3000;							// default
		//bcd1.d = 4000;						// private
		
		// 자식클래스에서 다른 패키지의 부모클래스의 protected 필드에 접근
		
		ext.b = 2000;
		
		
		// 메소드
		
		bcd1.print1();							// public
		//bcd1.print2();						// protected
		//bcd1.print3();						// default
		//bcd1.print4();						// private
	}

}
