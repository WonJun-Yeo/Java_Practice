package chap16.EX13;

// 두 점의 좌표 값을 사용해서 넓이를 구하는 프로그램을 작성하세요. (Generic 메소드 사용)

class Point <T, V> {										// 한점의 좌표를 담는 클래스
	T x;													// 한점의 x 좌표
	V y;													// 한점의 y 좌표
	
	
	Point(T x, V y) {										// setter 대신, x, y 값을 할당하는 생성자
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
		
		return width * height ;								// 가로 * 세로 = 넓이
	}
}



public class EX_Make_Rectangle {

	public static void main(String[] args) {
		Point <Double, Double> p1 = new Point <Double, Double>(5.0, 30.0);
		Point <Double, Double> p2 = new Point <Double, Double>(10.0, 50.0);
		
		
		double rect = GenericMethod.<Double, Double> makeRectangle(p1, p2);
		
		System.out.println("두 점의 넓이 : " + Math.abs(rect) + " 입니다.");
		
	}
}
