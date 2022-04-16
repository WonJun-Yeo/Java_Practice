package Practice;

public class ifControlStatement {

	public static void main(String[] args) {
		// if 단일 구문
		boolean b = true;
		
		if (b) {
			System.out.println("출력");
		}
		
		// if-else 구문
		boolean c = false;
		
		if (c) {
			System.out.println("출력되지 않음");
		} else {
			System.out.println("출력");
		}
		
		// if-else if-else 구문
		boolean a = true;
		boolean d = false;
		boolean e = true;
		
		if (d) {
			System.out.println("출려되지 않음");
		} else if(a) {
			System.out.println("출력");
		} else if(e) {
			System.out.println("출력되지 않음");
		} else {
			System.out.println("출력되지 않음");
		}
		
	}

}
