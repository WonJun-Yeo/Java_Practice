package EX;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("��̸� ���������� ������ �̿��ؼ� �Է��ϼ���.");
			System.out.println("EX) Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");
			
			String str;							// ��ü String ���� ��ǲ �޴� ����
			int memberCount = 0;
			int sum = 0;						// � �������� ����
			double avg = 0.0;					// � �������� ��� : (double) ��ü �������� �� / ���� ��
			String[] arr;						// ������ �������� �߶� �迭�� �����ϴ� ����
			int b = 0;							// �� ������ �������� ��� ����
			
			
			
			str = sc.nextLine();			// sc.next() : ���� ������ String���� ��´�. sc.nextLine() : ���ͱ��� String���� ��´�.
			
			if(str.equals("�׸�")) {			// str�� ���� �ڷ����̹Ƿ� str.equals()�� ����ؾ� �Ѵ�!
				break;
			}
			
			
			arr = str.split(" ");			// ������ �������� �߶� �迭�� ����
			
			
			for (int i = 0; i < arr.length; i++){			// �迭�� index 0������ ������������ ����ŭ �ݺ�
				if(i % 2 != 0) {							// i : �迭�� index ��ȣ�̰� ���ڸ� ������ �´�.
					b = Integer.parseInt(arr[i]);
					sum += b;								//intŸ������ ��ȯ�� ������� �� ���Ѵ�.
					memberCount++;							// ���� ���� ���� ����
				}
			}
			avg = (double) sum / memberCount;				// ���
			
			System.out.println(str);
			System.out.println("�������� �� �հ� : " + sum);
			System.out.println("�������� ��� : " + avg);
			System.out.println();			
		} while(true);
		
		
		
		
		
		sc.close();
	}

}
