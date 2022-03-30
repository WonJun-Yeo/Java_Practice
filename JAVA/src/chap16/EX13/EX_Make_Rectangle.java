package chap16.EX13;

// �� ���� ��ǥ ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���. (Generic �޼ҵ� ���)

class Point <T, V> {										// ������ ��ǥ�� ��� Ŭ����
	T x;													// ������ x ��ǥ
	V y;													// ������ y ��ǥ
	
	
	Point(T x, V y) {										// setter ���, x, y ���� �Ҵ��ϴ� ������
		this.x = x;
		this.y = y;
	}


	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
}

class GenericMethod {
	
	public static <T, V> double makeRectangle (Point <T, V> p1, Point <T, V> p2) {
		
		double width = (double)p1.getX() - (double)p2.getX();
		double height = (double)p1.getY() - (double)p2.getY();
		
		return width * height ;								// ���� * ���� = ����
	}
}



public class EX_Make_Rectangle {

	public static void main(String[] args) {
		Point <Double, Double> p1 = new Point <Double, Double>(5.0, 30.0);
		Point <Double, Double> p2 = new Point <Double, Double>(10.0, 50.0);
		
		
		double rect = GenericMethod.<Double, Double> makeRectangle(p1, p2);
		
		System.out.println("�� ���� ���� : " + Math.abs(rect) + " �Դϴ�.");
		
	}
}
