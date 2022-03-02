package EX;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		// 가위 바위 보 게임
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		while (true) {		
			int n = (int)(Math.random()*3);
			
			System.out.println("가위 바위 보!");
			String user = sc.next();
			
			if (user.equals("그만")) {
				System.out.println("게임을 종료 합니다.");
				break;
			} else {
				if (str[n].equals("바위")) {
					if (user.equals("바위")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 비겼습니다.");
					} else if (user.equals("가위")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 컴퓨터가 이겼습니다.");
					} else if (user.equals("보")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 사용자가 이겼습니다.");
					}
				} else if (str[n].equals("가위")) {
					if (user.equals("바위")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 사용자가 이겼습니다.");
					} else if (user.equals("가위")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 비겼습니다.");
					} else if (user.equals("보")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 컴퓨터가 이겼습니다.");
					}
				} else if (str[n].equals("보")) {
					if (user.equals("바위")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 컴퓨터가 이겼습니다.");
					} else if (user.equals("가위")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 사용자가 이겼습니다.");
					} else if (user.equals("보")) {
						System.out.println("사용자 = " + user + ", " + "컴퓨터는 = " + str[n] + " 비겼습니다.");
					}
				}
			}
			
		}
		sc.close();
	}
}
