package chap04;
public class Switch_EX02 {
	public static void main(String[] args) {
		
		// 1. Switch문에서 Break를 처리하지 않았을 때 : 해당 case로 이동 후, 하위의 모든 case를 실행한다. if문처럼 빠져나오지 않는다.
		int value1 = 2;
		
		switch (value1) {
		case 1:
			System.out.println("A 학점");
		case 2:
			System.out.println("B 학점");
		case 3:
			System.out.println("C 학점");
		default :
			System.out.println("F 학점");
		}
		System.out.println("=====================");
		
		// 2. Switch문에서 Break를 처리했을 때 : 
		int value2 = 3;
		
		switch (value2) {
		case 1:
			System.out.println("A 학점");
			break;
		case 2:
			System.out.println("B 학점");
			break;
		case 3:
			System.out.println("C 학점");
			break;
		default :
			System.out.println("F 학점");			// 마지막은 break 생략 가능
		}
		System.out.println("=====================");
		
		// 3. if문으로 변환
		value2 = 1;
		
		if (value2 == 1) {
			System.out.println("A 학점");
		} else if (value2 == 2) {
			System.out.println("B 학점");
		} else if (value2 == 3) {
			System.out.println("C 학점");
		} else {
			System.out.println("F 학점");
		}
		System.out.println("=====================");
		
		/*
		 * 4. Switch문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail을 출력 (점수 : 1~10)
		 */
		int value3 = 8;
		
		switch (value3) {
			case 10:
			case 9:
			case 8:
			case 7:
				System.out.println("pass");
				break;
			default :
				System.out.println("fail");
			
		}
		
		
		
		
	}
}
