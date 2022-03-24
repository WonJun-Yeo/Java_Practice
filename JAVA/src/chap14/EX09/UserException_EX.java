package chap14.EX09;

class seasonException extends Exception {
	public seasonException() {
		super();												
	}
	
	public seasonException(String message) {	
		super(message);
	}
}

class weekException extends Exception {
	public weekException() {
		super();												
	}
	
	public weekException(String message) {	
		super(message);
	}
}

class scoreKorException extends Exception {
	public scoreKorException() {
		super();												
	}
	
	public scoreKorException(String message) {	
		super(message);
	}
}

class scoreEngException extends Exception {
	public scoreEngException() {
		super();												
	}
	
	public scoreEngException(String message) {	
		super(message);
	}
}

class userIDException extends Exception {
	public userIDException() {
		super();												
	}
	
	public userIDException(String message) {	
		super(message);
	}
}


class A {
	String season;								// 봄, 여름, 가을, 겨울 이외의 값은 예외 발생
	String week;								// 월, 화, 수, 목, 금, 토, 일 이외의 값은 예외 발생
	int scoreKor;								// 0~100 이외의 값은 예외 발생
	int scoreEng;								// 0~100 이외의 값은 예외 발생
	String userID;								// 12~20자 이외의 길이 값은 예외 발생
	
	public void checkSeason (String season) throws seasonException {
		if (season.equals("봄") || season.equals("여름") || season.equals("가을") || season.equals("겨울")) {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.season = season;
			System.out.println("계절 : " + this.season);
		} else {
			throw new seasonException("예외발생 : 계절을 입력해 주세요.");
		}
	}
	
	public void checkWeek (String week) throws weekException {
		if (week.equals("월") || week.equals("화") || week.equals("수") || week.equals("목") || week.equals("금") || week.equals("토") || week.equals("일")) {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.week = week;
			System.out.println("요일 : " + this.week);
		} else {
			throw new weekException("예외발생 : 요일을 입력해 주세요.");
		}
	}
	
	public void checkScoreKor (int scoreKor) throws scoreKorException {
		if (scoreKor >= 0 && scoreKor <=100) {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.scoreKor = scoreKor;
			System.out.println("국어점수 : " + this.scoreKor);
		} else {
			throw new scoreKorException("예외발생 : 0~100 값을 입력해 주세요.");
		}
	}
	
	public void checkScoreEng (int scoreEng) throws scoreEngException {
		if (scoreEng >= 0 && scoreEng <=100) {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.scoreEng = scoreEng;
			System.out.println("영어점수 : " + this.scoreEng);
		} else {
			throw new scoreEngException("예외발생 : 0~100 값을 입력해 주세요.");
		}
	}
	
	
	public void checkUserID (String userID) throws userIDException {
		if (userID.length() < 12 || userID.length() > 20) {
			throw new userIDException("예외발생 : 12~20자로 작성해 주세요");
		} else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.userID = userID;
			System.out.println("유저아이디 : " + this.userID);
			
		}
	}
	
	
	
}

public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.checkSeason("일");
		} catch	(seasonException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
			
		try {
			a.checkWeek("화");
		} catch	(weekException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
		
		try {
			a.checkScoreKor(100);
		} catch	(scoreKorException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
		
		try {
			a.checkScoreEng(120);
		} catch	(scoreEngException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
		
		try {
			a.checkUserID("ashdlas");
		} catch	(userIDException e) {
			System.out.println(e.getMessage());
		}

	}

}
