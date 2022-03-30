package chap16.EX06.EX1;

public class Pinter_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPinter = new GenericPrinter();
		powderPinter.setMaterial(new Powder());
		
		Powder powder = powderPinter.getMaterial();
		
		System.out.println(powderPinter);
		System.out.println(powder);
		powder.doPrinting();
		
		System.out.println("========================================");
		
		GenericPrinter<Plastic> plasticPinter = new GenericPrinter();
		plasticPinter.setMaterial(new Plastic());
		
		Plastic plastic = plasticPinter.getMaterial();
		
		System.out.println(plasticPinter);
		System.out.println(plastic);
		plastic.doPrinting();

		System.out.println("========================================");
		
		/* Water는 Material의 자식 클래스가 아니므로 타입에 저장할 수 없다.
		  
		GenericPrinter<Water> waterPinter = new GenericPrinter();
		waterPinter.setMaterial(new Water());
		
		Water water = waterPinter.getMaterial();
		
		System.out.println(waterPinter);
		System.out.println(water);
		water.doPrinting();
		
		 */
		
	}

}
