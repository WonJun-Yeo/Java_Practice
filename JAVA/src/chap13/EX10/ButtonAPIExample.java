package chap13.EX10;

class Button {
    /* OnClickListener : 객체타입, ocl : 참조 변수
     * ocl 기본 값으로 null이 들어가 있음
     */
   OnClickListener ocl;
   
   // setter를 통해서 OnClickListener 의 참조변수 ocl에 객체 주소를 할당
   void setOnClickListener(OnClickListener ocl) {
      this.ocl = ocl;
   }
   
   // 이너인터페이스만 존재하고 구현한 자식클래스가 없다.
   // 호출하는 곳에서 onClick() 메소드를 오버라이딩(재정의)해서 호출해야 한다.
   interface OnClickListener {							// static 키워드 생략, Button.OnClickListener : 인터페이스 접근
      void onClick();									// 추상메소드
   }
   
   void click() {										// 실행했을 때, ocl.onClick() 메소드를 호출
      ocl.onClick();									// ocl : 참조변수, null, 활성화 시키기 위해 setOnClickListener에 매개변수를 받아야한다.
      System.out.println(ocl);
   }
}


public class ButtonAPIExample {

	public static void main(String[] args) {
		// 개발자1이 클릭 시, 음악재생
		Button bt1 = new Button();						// Button 클래스 객체 생성
		
		// setOnClickListener 매개변수로 자식클래스 객체생성 대신 익명객체를 생성 후, 할당
		bt1.setOnClickListener(new Button.OnClickListener() {					// OnClickListener 타입의 객체를 생성하여 참조변수를 할당
			@Override
			public void onClick() {
				System.out.println("개발자1, 음악재생");
			}
		});
		
		bt1.click();
		
		System.out.println("=========================================");
		
		// 개발자2가 클릭 시, 네이버 접속
		Button bt2 = new Button();
		
		bt2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자2, 네이버 접속");
			}
		});
		
		bt2.click();
		
	}
	
}
