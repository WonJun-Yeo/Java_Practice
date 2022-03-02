package chap04;
public class Break_EX04 {
	public static void main(String[] args) {
		// 1. 단일 loop가 적용된 곳에서 break 탈출
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;		// 최초 break를 만나면 반복문을 멈추고 해당 구문을 빠져나온다.
		}
		System.out.println("==================");
		
		// 2. for문 내의 if문 조건에 break 탈출 
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");				
		}
		System.out.println();
		System.out.println("==================");
		
		// 3. 다중 loop가 적용된 곳에서 break 탈출 (하나의 반복문만 탈출)
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break;						// 안의 for문에서만 빠져나온다.
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("==================");
		
		// 4. 다중 loop가 적용된 곳에서 break 탈출 (라벨이름을 추가해 한꺼번에 탈출)
		
		
POS1:	for (int i = 0; i < 5; i++) {		// 라벨이름을 붙여서 
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break POS1;			// 라벨이름이 붙은 곳까지 빠져나간다.
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("==================");
				
			
		// 5. 다중 loop가 적용된 곳에서 break 탈출 (변수의 조건을 false로 만들어서 탈출)
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					i = 100;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
