package EX;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("운동이름 구성원수를 공백을 이용해서 입력하세요.");
			System.out.println("EX) 탁구 2 야구 9 축구 11 농구 6 씨름 2");
			
			String str;							// 전체 String 값을 인풋 받는 변수
			int memberCount = 0;
			int sum = 0;						// 운동 구성원의 총합
			double avg = 0.0;					// 운동 구성원의 평균 : (double) 전체 구성원의 합 / 종목 수
			String[] arr;						// 공백을 기준으로 잘라서 배열에 저장하는 변수
			int b = 0;							// 각 종목의 구성원을 담는 변수
			
			
			
			str = sc.nextLine();			// sc.next() : 공백 전까지 String으로 담는다. sc.nextLine() : 엔터까지 String으로 담는다.
			
			if(str.equals("그만")) {			// str은 참조 자료형이므로 str.equals()로 사용해야 한다!
				break;
			}
			
			
			arr = str.split(" ");			// 공백을 기준으로 잘라서 배열에 저장
			
			
			for (int i = 0; i < arr.length; i++){			// 배열의 index 0번부터 마지막까지의 수만큼 반복
				if(i % 2 != 0) {							// i : 배열의 index 번호이고 숫자만 가지고 온다.
					b = Integer.parseInt(arr[i]);
					sum += b;								//int타입으로 변환된 멤버수를 다 더한다.
					memberCount++;							// 종목 수를 세기 위함
				}
			}
			avg = (double) sum / memberCount;				// 평균
			
			System.out.println(str);
			System.out.println("구성원의 총 합계 : " + sum);
			System.out.println("구성원의 평균 : " + avg);
			System.out.println();			
		} while(true);
		
		
		
		
		
		sc.close();
	}

}
