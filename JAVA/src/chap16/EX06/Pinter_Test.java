package chap16.EX06;

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
		
		GenericPrinter<Water> waterPinter = new GenericPrinter();
		waterPinter.setMaterial(new Water());
		
		Water water = waterPinter.getMaterial();
		
		System.out.println(waterPinter);
		System.out.println(water);
		water.doPrinting();
	}

}
