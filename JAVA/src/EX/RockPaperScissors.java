package EX;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		// ���� ���� �� ����
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		while (true) {		
			int n = (int)(Math.random()*3);
			
			System.out.println("���� ���� ��!");
			String user = sc.next();
			
			if (user.equals("�׸�")) {
				System.out.println("������ ���� �մϴ�.");
				break;
			} else {
				if (str[n].equals("����")) {
					if (user.equals("����")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " �����ϴ�.");
					} else if (user.equals("����")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " ��ǻ�Ͱ� �̰���ϴ�.");
					} else if (user.equals("��")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " ����ڰ� �̰���ϴ�.");
					}
				} else if (str[n].equals("����")) {
					if (user.equals("����")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " ����ڰ� �̰���ϴ�.");
					} else if (user.equals("����")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " �����ϴ�.");
					} else if (user.equals("��")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " ��ǻ�Ͱ� �̰���ϴ�.");
					}
				} else if (str[n].equals("��")) {
					if (user.equals("����")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " ��ǻ�Ͱ� �̰���ϴ�.");
					} else if (user.equals("����")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " ����ڰ� �̰���ϴ�.");
					} else if (user.equals("��")) {
						System.out.println("����� = " + user + ", " + "��ǻ�ʹ� = " + str[n] + " �����ϴ�.");
					}
				}
			}
			
		}
		sc.close();
	}
}
