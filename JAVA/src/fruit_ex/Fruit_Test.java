package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/* ����� �ٷ�� ����
 * �����ڿ��� super() ���
 */

class Fruit {
	String fruitName;							// ������ �̸�
	String color;								// ������ ��
	int large;									// ������ ũ��
	
	Fruit (String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}

	@Override
	public String toString() {					// ������ ������ ����ϴ� �޼ҵ�
		return "������ �̸� : " + "<" + fruitName + ">" + "�̰�, " + "���� : " + "<" + color + ">" + "�̰�, " + "ũ�� : " + "<" + large + ">" + "�Դϴ�.";
	}
}

class Apple extends Fruit {						// ��ü ���� ��, Ÿ�������� Fruit����
	Apple (String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}

class Orange extends Fruit {
	Orange (String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}

class Banana extends Fruit {
	Banana (String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}


public class Fruit_Test {
	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		boolean engin = true;
		
		while (engin) {
			System.out.println("���� >>");
			System.out.println("===============================");
			System.out.println("1. ��� | 2. ������ | 3. �ٳ��� | 4. ������� | 5. ����");
			System.out.println("===============================");
			int selNum = sc.nextInt();
			
			if (selNum == 1) {
				System.out.println("���ϸ��� �Է����ּ���.");
				String fruitName = sc.next();
				System.out.println("������ �Է����ּ���.");
				String color = sc.next();
				System.out.println("ũ���� �Է����ּ���.");
				int large = sc.nextInt();
				
				Fruit fruit = new Apple(fruitName, color, large);
				fruitList.add(fruit);
				
				System.out.println("���������� �ԷµǾ����ϴ�.");
			} else if (selNum == 2) {
				System.out.println("���ϸ��� �Է����ּ���.");
				String fruitName = sc.next();
				System.out.println("������ �Է����ּ���.");
				String color = sc.next();
				System.out.println("ũ���� �Է����ּ���.");
				int large = sc.nextInt();
				
				Fruit fruit = new Orange(fruitName, color, large);
				fruitList.add(fruit);
				
				System.out.println("���������� �ԷµǾ����ϴ�.");
			} else if (selNum == 3) {
				System.out.println("���ϸ��� �Է����ּ���.");
				String fruitName = sc.next();
				System.out.println("������ �Է����ּ���.");
				String color = sc.next();
				System.out.println("ũ���� �Է����ּ���.");
				int large = sc.nextInt();
				
				Fruit fruit = new Banana(fruitName, color, large);
				fruitList.add(fruit);
				
				System.out.println("���������� �ԷµǾ����ϴ�.");
			} else if (selNum == 4) {
				for(Fruit i : fruitList) {
					System.out.println(i);
				}
			} else if (selNum == 5) {
				break;
			} else {
				System.out.println("1~3 ������ ��ȣ�� �Է��� �ּ���");
			}
		}
		
		sc.close();
		
	}
}
