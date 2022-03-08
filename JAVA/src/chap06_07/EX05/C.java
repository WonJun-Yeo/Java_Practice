package chap06_07.EX05;

public class C {								// 다른 패키지에서 import 가능
	// 필드에 부여 되는 접근 제어자

	private String company = "현대"; 				// private 잡근제어자, 회사명
	String model;								// default 접근제어자, 모델
	protected String color;						// protected 접근제어자, 색상
	public int maxSpeed;						// public 접근제어자, 최고 속도

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("company : " + company + ", model : " + model + ", color : " + color + ", maxSpeed : " + maxSpeed);
	}
}
