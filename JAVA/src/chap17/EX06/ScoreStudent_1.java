package chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;

/* 1. 학생 수 : 임의의 값을 입력했을 때, arrayList의 capacity 크기 지정
 * 2. capacity로 지정한 만큼 for문 돌려서 5번 점수 값 입력 받아 arr에 저장
 * 3. arr에 저장된 점수 값들 출력
 * 4. arr에 저장된 점수 값들의 최고점수, 평균점수 출력
 * 5. 프로그램 종료
 */




class Student{
	int score; 
	
	Student(int score){
		this.score = score;
	}
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();

        boolean run = true;
        int studentNum = 0;
        Scanner scanner = new Scanner(System.in);
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");

                studentNum = scanner.nextInt();

                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            	for (int i = 0; i < studentNum; i++) {
            		System.out.println((i+1) + "번 학생의 점수를 입력하세요 : ");
            		
            		int score = scanner.nextInt();
            		
            		Student student = new Student(score);
            		
            		arr.add(student);
            		System.out.println((i+1) + "번 학생의 점수는 " + student.score + "입니다.");
            	}
            	System.out.println("모든학생들의 점수를 입력하였습니다.");
            } else if(selectNo == 3) {
            	System.out.println("모든 학생들의 점수입니다.");
            	for (int i = 0; i < arr.size(); i++) {
            		System.out.println(arr.get(i).score);
            	}
             
            } else if(selectNo == 4) {
            	//코드작성
            	int maxScore = 0;
            	int sum = 0;
            	
            	for (int i = 0; i < arr.size(); i++) {
            		if (arr.get(i).score > maxScore) {
            			maxScore = arr.get(i).score;
            		}
            	}
            	
            	for (int i = 0; i < arr.size(); i++) {
            		sum += arr.get(i).score;
            	}
            	System.out.println("최고점수 : " + maxScore);
            	System.out.println("평균점수 : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	run = false;
            } else {
            	System.out.println("1 ~ 5 사이값을 입력해주세요");
            }
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
