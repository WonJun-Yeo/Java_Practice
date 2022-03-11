package chap10.EX04;

/*	메소드 오버라이딩과 접근 제한자와의 관계
 * 자식의 클래스에서 부모의 메소드를 재정의 할 경우, 접근제한자는 부모의 접근제한자보다 범위가 같거나 넓어야 한다.
 * public > protected > default > private
 */

class Aaa {
	protected void abc() {
		
	}
}

class B1 extends Aaa {
	@Override
	public void abc() {}
}

class B2 extends Aaa {
	@Override
	protected void abc() {}
}

class B3 extends Aaa {
	//@Override
	//void abc() {}										// 오류발생 : 부모 클래스의 메소드 접근지정자가 자식 클래스의 오버라이드할 메소드의 접근지정자보다 범위가 넓으면 오류가 발생한다.
}

class B4 extends Aaa {
	//@Override
	//private void abc() {}								// 오류발생 : 부모 클래스의 메소드 접근지정자가 자식 클래스의 오버라이드할 메소드의 접근지정자보다 범위가 넓으면 오류가 발생한다.
}


public class MethodOverriding_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
