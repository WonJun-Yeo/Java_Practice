package chap06_07.EX06;

import chap06_07.EX05.C;

public class EX_C {

	public static void main(String[] args) {
		// �ٸ� ��Ű���� Ŭ������ ����, public�� ����, ������ setter�� getter �̿�
		C c = new C();
		
		c.maxSpeed = 200;
		c.setModel("�縮���̵�");
		c.setColor("ȭ��Ʈ");

		c.print();	
	}

}
