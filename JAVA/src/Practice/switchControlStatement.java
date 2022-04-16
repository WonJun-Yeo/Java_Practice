package Practice;

public class switchControlStatement {

	public static void main(String[] args) {
		// switch 제어문
		int a = 2;
		switch (a) {
		case 1:
			System.out.println("출력이 되지 않는다.");
		case 2:
			System.out.println("출력");
		case 3:
			System.out.println("출력");
		case 4:
			System.out.println("출력");
			break;
		case 5:
			System.out.println("출력이 되지 않는다.");
		default:
			System.out.println("출력이 되지 않는다.");
		}

	}

}
