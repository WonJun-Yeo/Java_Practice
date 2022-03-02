package EX;
import java.util.Scanner;
public class Subject {
	public static void main(String[] args) {
		// 과목별 점수 출력
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		
POS1:	while (true) {
			System.out.println("과목명을 입력해 주세요.");
			String name = sc.next();
			if (name.equals("그만")) {
				System.out.println("종료");
				break;
			} else {
				for (int i = 0; i < course.length; i++) {
					if (course[i].equals(name)) {
						System.out.println(course[i] + " 의 점수는 " + score[i]);
						continue POS1;
					}
				}
				System.out.println("없는 과목입니다.");
			}
		}
	sc.close();
	}		
}

