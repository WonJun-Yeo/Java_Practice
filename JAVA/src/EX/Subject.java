package EX;
import java.util.Scanner;
public class Subject {
	public static void main(String[] args) {
		// ���� ���� ���
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		
POS1:	while (true) {
			System.out.println("������� �Է��� �ּ���.");
			String name = sc.next();
			if (name.equals("�׸�")) {
				System.out.println("����");
				break;
			} else {
				for (int i = 0; i < course.length; i++) {
					if (course[i].equals(name)) {
						System.out.println(course[i] + " �� ������ " + score[i]);
						continue POS1;
					}
				}
				System.out.println("���� �����Դϴ�.");
			}
		}
	sc.close();
	}		
}

