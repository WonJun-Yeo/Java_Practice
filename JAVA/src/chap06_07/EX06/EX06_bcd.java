package chap06_07.EX06;

import chap06_07.EX05.External_Abc;

public class EX06_bcd {				// 부모클래스

	// 필드
		public int a = 10;
		protected int b = 20;
		int c = 30;
		private int d = 40;
		
		// 메소드
		public void print1() {
			System.out.println("다른 패키지에서 접근가능");
		}
		
		protected void print2() {
			System.out.println("상속구현 시, 다른 패키지에서 접근가능");
		}
		
		void print3() {
			System.out.println("같은 패키지에서 접근가능");
		}
		
		private void print4() {
			System.out.println("같은 클래스 내부에서만 접근가능");
		}
		
		// 생성자
		
		//EX06_bcd(){}					// 기본생성자 : 필드의 초기값을 부여해서 객체를 생성, 생략가능

}
