package chap06_07.EX02;
public class Example_car {

	public static void main(String[] args) {
		// Car Class를 객체화
		
		Car sonata = new Car();
		Car k5 = new Car();
		Car sm5 = new Car();
		Car xdrive = new Car();
		Car GLA = new Car();
		
		// 각 변수의 값을 할당하고 출력 (메모리를 직접 사용, setter를 이용해서 값을 할당)
		
		// 1. 메모리 직접 사용
		
		sonata.company = "Hyundai";
		sonata.model = "sonata";
		sonata.color = "white";
		sonata.maxSpeed = 150;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===============");
		
		k5.company = "Kia";
		k5.model = "k5";
		k5.color = "black";
		k5.maxSpeed = 170;
		
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.color);
		System.out.println(k5.maxSpeed);
		
		System.out.println("===============");
		
		sm5.company = "renaultsamsungm";
		sm5.model = "sm5";
		sm5.color = "silver";
		sm5.maxSpeed = 160;
		
		System.out.println(sm5.company);
		System.out.println(sm5.model);
		System.out.println(sm5.color);
		System.out.println(sm5.maxSpeed);
		
		System.out.println("===============");
		
		xdrive.company = "BMW";
		xdrive.model = "520d";
		xdrive.color = "hotpink";
		xdrive.maxSpeed = 200;
		
		System.out.println(xdrive.company);
		System.out.println(xdrive.model);
		System.out.println(xdrive.color);
		System.out.println(xdrive.maxSpeed);
		
		System.out.println("===============");
		
		GLA.company = "mercedes-benz";
		GLA.model = "GLA";
		GLA.color = "grey";
		GLA.maxSpeed = 195;
		
		System.out.println(GLA.company);
		System.out.println(GLA.model);
		System.out.println(GLA.color);
		System.out.println(GLA.maxSpeed);
		
		System.out.println("===============");
		
		// 2. setter를 이용
		sonata.setCompany("Hyundai");
		sonata.setMedel("sonata");
		sonata.setColor("white");
		sonata.setMaxSpeed(150);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getMedel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		System.out.println("===============");
		
		k5.setCompany("Kia");
		k5.setMedel("k5");
		k5.setColor("black");
		k5.setMaxSpeed(170);
		
		System.out.println(k5.getCompany());
		System.out.println(k5.getMedel());
		System.out.println(k5.getColor());
		System.out.println(k5.getMaxSpeed());
		
		
		System.out.println("===============");
		
		
		sm5.setCompany("renaultsamsungm");
		sm5.setMedel("sm5");
		sm5.setColor("silver");
		sm5.setMaxSpeed(160);
		
		System.out.println(sm5.getCompany());
		System.out.println(sm5.getMedel());
		System.out.println(sm5.getColor());
		System.out.println(sm5.getMaxSpeed());
		
		System.out.println("===============");
		
		
		xdrive.setCompany("BMW");
		xdrive.setMedel("520d");
		xdrive.setColor("hotpink");
		xdrive.setMaxSpeed(200);
		
		System.out.println(xdrive.getCompany());
		System.out.println(xdrive.getMedel());
		System.out.println(xdrive.getColor());
		System.out.println(xdrive.getMaxSpeed());
		
		System.out.println("===============");
		
		
		GLA.setCompany("mercedes-benz");
		GLA.setMedel("GLA");
		GLA.setColor("grey");
		GLA.setMaxSpeed(195);
		
		System.out.println(GLA.getCompany());
		System.out.println(GLA.getMedel());
		System.out.println(GLA.getColor());
		System.out.println(GLA.getMaxSpeed());
		
		System.out.println("===============");
		
		
		
	}

}
