package chap19.EX04;

/*
 * �빮�� A ~ Z �ƽ�Ű �ڵ� ���
 * A, 65
 * B, 66
 * ...
 * Z, 90
 * 
 * �ҹ��� a ~ z �ƽ�Ű �ڵ� ���
 * a, 97
 * ...
 * z, 122
 */



public class Character_EX2 {

	public static void main(String[] args) {
		// �빮�� 
		int[] upper = new int[26];
		for (int i = 65; i < 91; i++) {
			upper[i-65] = i;
			System.out.println(((char)upper[i-65]) + ", " + upper[i-65]);
		}
		
		System.out.println("============================");
		
		// �ҹ���
		int[] lower = new int [26];
		for (int i = 97; i <123; i++) {
			lower[i-97] = i;
			System.out.println(((char)lower[i-97]) + ", " + lower[i-97]);
		}

	}

}
