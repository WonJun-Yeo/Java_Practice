package chap14.EX08;

/*	Exception을 상속받는 사용자 예외
 * 1. Checked Exception
 * 		1-1. 점수가 음수인 경우 예외
 * 		1-2. 점수가 100점을 초과하는 경우 예외
 * 
 * 
 */

class MinusException extends Exception {						// 음수가 들어올 경우, 강제로 예외 발생
	public MinusException() {
		super();												// 부모(Exception)의 기본 생성자 호출
	}
	
	public MinusException(String message) {						// 예외 메세지 출력, e.getMessage();
		super(message);
	}
}

class OverException extends Exception {							// 100이상의 값이 들어올 경우, 강제로 예외 발생
	public OverException() {
		super();												// 부모(Exception)의 기본 생성자 호출
	}
	
	public OverException(String message) {						// 예외 메세지 출력, e.getMessage();
		super(message);
	}
}


class AAA {
	
	int score;
	
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외발생 : 음수는 넣을 수 없습니다.");
		} else if (score > 100) {
			throw new OverException("예외발생 : 100점이 넘는 점수는 넣을 수 없습니다.");
		} else {
			System.out.println("정삼적으로 잘 입력되었습니다.");
			this.score = score;
			System.out.println("점수 : " + this.score);
		}
	}
}





public class UserException {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		
		// 음수
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("==============================");
		
		
		// 100초과
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("==============================");
		
		// 정상 범위
		try {
			aaa.checkScore(80);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
