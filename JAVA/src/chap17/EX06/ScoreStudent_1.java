package chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;

/* 1. �л� �� : ������ ���� �Է����� ��, arrayList�� capacity ũ�� ����
 * 2. capacity�� ������ ��ŭ for�� ������ 5�� ���� �� �Է� �޾� arr�� ����
 * 3. arr�� ����� ���� ���� ���
 * 4. arr�� ����� ���� ������ �ְ�����, ������� ���
 * 5. ���α׷� ����
 */




class Student{
	int score; 																				// �ʵ尪�Ҵ� �� : 1.��ü ������ �����Ҵ�, 2. private ������������ ���, ������ or getter&setter
	
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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");

                studentNum = scanner.nextInt();

                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            	if(studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է����ּ���.");
            	} else {
            		for (int i = 0; i < studentNum; i++) {
                		System.out.println((i+1) + "�� �л��� ������ �Է��ϼ��� : ");
                		
                		int score = scanner.nextInt();
                		
                		Student student = new Student(score);
                		
                		arr.add(student);
                		System.out.println((i+1) + "�� �л��� ������ " + student.score + "�Դϴ�.");
                	}
                	System.out.println("����л����� ������ �Է��Ͽ����ϴ�.");
            	}
            } else if(selectNo == 3) {
            	if(studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է����ּ���.");
            	} else {
            		System.out.println("��� �л����� �����Դϴ�.");
                	for (int i = 0; i < arr.size(); i++) {
                		System.out.println(arr.get(i).score);
                	}
            	}
            } else if(selectNo == 4) {
            	
            	if(studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է����ּ���.");
            	} else {
            		//�ڵ��ۼ�
                	int maxScore = 0;
                	int sum = 0;
                	// �ִ밪
                	for (int i = 0; i < arr.size(); i++) {
                		if (arr.get(i).score > maxScore) {
                			maxScore = arr.get(i).score;
                		}
                	}
                	// �հ�
                	for (int i = 0; i < arr.size(); i++) {
                		sum += arr.get(i).score;
                	}
                	System.out.println("�ְ����� : " + maxScore);
                	System.out.println("������� : " + (float) sum / studentNum);
            	}
         
            } else if(selectNo == 5) {
            	run = false;																			// while�� ������ run�� false�� ���Ҵ��� while �� ����������
            } else {
            	System.out.println("1 ~ 5 ���̰��� �Է����ּ���");
            }
        }
        scanner.close();
        System.out.println ("���α׷� ����");
	}
}
