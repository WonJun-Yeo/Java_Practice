package chap06_07.EX06;

import chap06_07.EX05.External_Abc;

public class EX06_bcd {				// �θ�Ŭ����

	// �ʵ�
		public int a = 10;
		protected int b = 20;
		int c = 30;
		private int d = 40;
		
		// �޼ҵ�
		public void print1() {
			System.out.println("�ٸ� ��Ű������ ���ٰ���");
		}
		
		protected void print2() {
			System.out.println("��ӱ��� ��, �ٸ� ��Ű������ ���ٰ���");
		}
		
		void print3() {
			System.out.println("���� ��Ű������ ���ٰ���");
		}
		
		private void print4() {
			System.out.println("���� Ŭ���� ���ο����� ���ٰ���");
		}
		
		// ������
		
		//EX06_bcd(){}					// �⺻������ : �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����, ��������

}
