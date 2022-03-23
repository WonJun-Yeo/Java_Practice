package chap13.EX10;

class Button {
    /* OnClickListener : ��üŸ��, ocl : ���� ����
     * ocl �⺻ ������ null�� �� ����
     */
   OnClickListener ocl;
   
   // setter�� ���ؼ� OnClickListener �� �������� ocl�� ��ü �ּҸ� �Ҵ�
   void setOnClickListener(OnClickListener ocl) {
      this.ocl = ocl;
   }
   
   // �̳��������̽��� �����ϰ� ������ �ڽ�Ŭ������ ����.
   // ȣ���ϴ� ������ onClick() �޼ҵ带 �������̵�(������)�ؼ� ȣ���ؾ� �Ѵ�.
   interface OnClickListener {							// static Ű���� ����, Button.OnClickListener : �������̽� ����
      void onClick();									// �߻�޼ҵ�
   }
   
   void click() {										// �������� ��, ocl.onClick() �޼ҵ带 ȣ��
      ocl.onClick();									// ocl : ��������, null, Ȱ��ȭ ��Ű�� ���� setOnClickListener�� �Ű������� �޾ƾ��Ѵ�.
      System.out.println(ocl);
   }
}


public class ButtonAPIExample {

	public static void main(String[] args) {
		// ������1�� Ŭ�� ��, �������
		Button bt1 = new Button();						// Button Ŭ���� ��ü ����
		
		// setOnClickListener �Ű������� �ڽ�Ŭ���� ��ü���� ��� �͸�ü�� ���� ��, �Ҵ�
		bt1.setOnClickListener(new Button.OnClickListener() {					// OnClickListener Ÿ���� ��ü�� �����Ͽ� ���������� �Ҵ�
			@Override
			public void onClick() {
				System.out.println("������1, �������");
			}
		});
		
		bt1.click();
		
		System.out.println("=========================================");
		
		// ������2�� Ŭ�� ��, ���̹� ����
		Button bt2 = new Button();
		
		bt2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������2, ���̹� ����");
			}
		});
		
		bt2.click();
		
	}
	
}
