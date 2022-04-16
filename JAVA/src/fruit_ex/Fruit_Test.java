package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/* 상속을 다루는 문제
 * 생성자에서 super() 사용
 */

class Fruit {
	String fruitName;							// 과일의 이름
	String color;								// 과일의 색
	int large;									// 과일의 크기
	
	Fruit (String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}

	@Override
	public String toString() {					// 과일의 정보를 출력하는 메소드
		return "과일의 이름 : " + "<" + fruitName + ">" + "이고, " + "색깔 : " + "<" + color + ">" + "이고, " + "크기 : " + "<" + large + ">" + "입니다.";
	}
}

class Apple extends Fruit {						// 객체 생성 시, 타입지정을 Fruit으로
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
			System.out.println("선택 >>");
			System.out.println("===============================");
			System.out.println("1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보출력 | 5. 종료");
			System.out.println("===============================");
			int selNum = sc.nextInt();
			
			if (selNum == 1) {
				System.out.println("과일명을 입력해주세요.");
				String fruitName = sc.next();
				System.out.println("색깔을 입력해주세요.");
				String color = sc.next();
				System.out.println("크기을 입력해주세요.");
				int large = sc.nextInt();
				
				Fruit fruit = new Apple(fruitName, color, large);
				fruitList.add(fruit);
				
				System.out.println("정상적으로 입력되었습니다.");
			} else if (selNum == 2) {
				System.out.println("과일명을 입력해주세요.");
				String fruitName = sc.next();
				System.out.println("색깔을 입력해주세요.");
				String color = sc.next();
				System.out.println("크기을 입력해주세요.");
				int large = sc.nextInt();
				
				Fruit fruit = new Orange(fruitName, color, large);
				fruitList.add(fruit);
				
				System.out.println("정상적으로 입력되었습니다.");
			} else if (selNum == 3) {
				System.out.println("과일명을 입력해주세요.");
				String fruitName = sc.next();
				System.out.println("색깔을 입력해주세요.");
				String color = sc.next();
				System.out.println("크기을 입력해주세요.");
				int large = sc.nextInt();
				
				Fruit fruit = new Banana(fruitName, color, large);
				fruitList.add(fruit);
				
				System.out.println("정상적으로 입력되었습니다.");
			} else if (selNum == 4) {
				for(Fruit i : fruitList) {
					System.out.println(i);
				}
			} else if (selNum == 5) {
				break;
			} else {
				System.out.println("1~3 사이의 번호를 입력해 주세요");
			}
		}
		
		sc.close();
		
	}
}
