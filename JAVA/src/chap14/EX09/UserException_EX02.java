package chap14.EX09;


class MyAllException extends Exception {									// 일반예외 (checked exception)
	public MyAllException() {
		super();												
	}
	
	public MyAllException(String message) {	
		super(message);
	}
}


class AA {
	// private를 붙여줘야하는 이유 : 안붙였을 경우 객체를 만들어서 값을 할당할 수 있기 때문, 캡슐화
	// 생성자, setter를 통해 필드값을 초기화 : 제어 후, 필드값을 할당할 수 있다.
	private String season;								// 봄, 여름, 가을, 겨울 이외의 값은 예외 발생
	private String week;								// 월, 화, 수, 목, 금, 토, 일 이외의 값은 예외 발생
	private int scoreKor;								// 0~100 이외의 값은 예외 발생
	private int scoreEng;								// 0~100 이외의 값은 예외 발생
	private String userID;								// 12~20자 이외의 길이 값은 예외 발생
	
	void studentInfo (String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if (season != "봄" && season != "여름" && season != "가을" && season != "겨울") {
			throw new MyAllException ("봄, 여름, 가을, 겨울 만 입력해주세요");
		} else if (week != "월" && week != "화" && week != "수" && week != "목" && week != "금" && week != "토" && week != "일") {
			throw new MyAllException ("월, 화, 수, 목, 금, 토, 일 만 입력해주세요");
		} else if (scoreKor < 0 || scoreKor > 100) {
			throw new MyAllException ("0~100 값만 입력");
		} else if (scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException ("0~100 값만 입력");
		} else if (userID.length() < 12 || userID.length() > 20) {
			throw new MyAllException ("12자 이상 20자 사이의 문자");
		} else {
			System.out.println("정상적으로 값이 입력되었습니다.");
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		
		System.out.println(season + ", " + week + ", " + scoreKor + ", " + scoreEng + ", " + userID);
		
	}
	
	
	
	
	
	
	
}

public class UserException_EX02 {

	public static void main(String[] args) {
		AA aa = new AA();
		
		// 정상적 값 입력
		try {
			aa.studentInfo("봄", "월", 80, 90, "ㅁㄴㅇㅂㅈㄷㅁㄴㅇㅂㅈㄷ");
		} catch (MyAllException e) {
			// e.printStackTrace();													// 메소드가 void 이기때문에 반환타입이 없다. 출력할 때, 출력문안에 넣지 않는다.
			System.out.println(e.getMessage());										// 메소드가 반환타입이 String이기 때문에 출려구문 필요
		}
		
		System.out.println("===========================================");
		
		// 예외발생
		try {
			aa.studentInfo("꿈", "야", 80, 90, "ㅁㄴㅇㅂㅈㄷㅁㄴㅇㅂㅈㄷ");
		} catch (MyAllException e) {
			// e.printStackTrace();													// 메소드가 void 이기때문에 반환타입이 없다. 출력할 때, 출력문안에 넣지 않는다.
			System.out.println(e.getMessage());										// 메소드가 반환타입이 String이기 때문에 출려구문 필요
		}

	}

}
