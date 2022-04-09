package Practice;

public class outputStatement {

	public static void main(String[] args) {
		// Println()
		System.out.println("화면 출력");									// 화면 출력
		System.out.println("화면" + "출력");								// 화면출력
		System.out.println(3.8);										// 3.8
		System.out.println(3 + 5);										// 8
		System.out.println(3 + 5 + "화면");								// 8화면
		System.out.println("화면" + 3);									// 화면3
		System.out.println("화면" + 3 + 5);								// 화면35
		System.out.println(5 + "화면" + 3);								// 5화면3
		
		// Print()
		System.out.print("화면");
		System.out.print("출력");
		System.out.print(3);
		System.out.print(5);
		
		// Printf()
		System.out.printf("%d\n", 30);									// 30
		System.out.printf("%o\n", 30);									// 36
		System.out.printf("%x\n", 30);									// 1e
		System.out.printf("%s\n", "출력");								// 출력
		System.out.printf("%f\n", 5.8);									// 5.800000
		System.out.printf("%4.2f\n", 5.8);								// 5.80 출력
		System.out.printf("%d 와 %4.2f\n", 3, 5.8);						// 4와 5.80
		
	}

}
