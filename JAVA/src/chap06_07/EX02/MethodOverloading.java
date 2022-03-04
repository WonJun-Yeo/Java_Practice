package chap06_07.EX02;

class B {
	static String name = "¿¡½ºÆÄ";					// static Å°°¡ ÇÒ´çµÇ¸é °´Ã¼ »ı¼º¾øÀÌ È£­Œ
	
	static void print() {
		System.out.println("staticÀÌ ºÙÀº ¸Ş¼ÒµåÀÔ´Ï´Ù.");
	}
}

//¸Ş¼Òµå ¿À¹ö¶óÀÌµù : »ó¼Ó¿¡¼­ ºÎ¸ğ Å¬·¡½ºÀÇ ¸Ş¼Òµå¸¦ ÀçÁ¤ÀÇÇØ¼­ »ç¿ë
//¸Ş¼Òµå ¿À¹ö·Îµù : ÇÏ³ªÀÇ ¸Ş¼Òµå¿¡ ¸Å°³º¯¼öÅ¸ÀÔ, °¹¼ö¿¡ µû¶ó È£­Œ (Java)

public class MethodOverloading {

	public static void main(String[] args) {
		// static : °´Ã¼ »ı¼º ¾øÀÌ ¹Ù·Î È£ÃâÇØ¼­ »ç¿ë°¡´ÉÇÏµµ·Ï ÇÏ´Â Å°¿öµå, °´Ã¼ÀÌ¸§ÀÌ ¾Æ´Ï¶ó Å¬·¡½º¸íÀ¸·Î È£ÃâÇØ¼­ »ç¿ë°¡´É
		
		System.out.println(B.name);		// °´Ã¼¸íÀÌ ¾Æ´Ñ Å¬·¡½º¸íÀ¸·Î È£Ãâ 
		B.print();
		
		print1();						// static Å°¿öµå°¡ µé¾î°¡ ÀÖ°í µ¿ÀÏÇÑ Å¬·¡½º¿¡ »ı¼ºµÈ ¸Ş¼Òµå´Â ¹Ù·Î È£ÃâÀÌ °¡´ÉÇÏ´Ù.
		print1(1);						// ¸Å°³º¯¼ö°¡ 1°³ÀÌ°í Á¤¼öÅ¸ÀÔÀÇ ¸Ş¼Òµå¸¦ È£Ãâ
		print1(1.1);					// ¸Å°³º¯¼ö°¡ 1°³ÀÌ°í ½Ç¼öÅ¸ÀÔÀÇ ¸Ş¼Òµå¸¦ È£Ãâ
		print1(1, 2);					// ¸Å°³º¯¼ö°¡ 2°³ÀÌ°í Á¤¼öÅ¸ÀÔÀÇ ¸Ş¼Òµå¸¦ È£Ãâ
		
		System.out.println();		
	}
	
	
	
	// ¸Ş¼Òµå ¿À¹ö¶óÀÌµù : ¸Ş½ºµå¸íÀº µ¿ÀÏ, ¸Å°³º¯¼öÅ¸ÀÔ & ¸Å°³º¯¼ö °ª & ¸Å°³º¯¼ö °¹¼ö¿¡ µû¶ó È£­Œ
	// ¸Å°³º¯¼öÀÇ µ¥ÀÌÅÍ Å¸ÀÔ°ú ¸Å°³º¯¼ö °¹¼ö°¡ °°À¸¸é ¿À·ù
	//JVMÀÌ µ¿ÀÏÇÑ ¸Ş¼Òµå¸íÀÇ µ¥ÀÌÅÍÅ¸ÀÔÀÌ³ª °¹¼ö¿¡ µû¶ó¼­ ÇØ´ç ¸Ş¼Òµå¸¦ ÀÛµ¿
	
	
	public static void print1() {		// °´Ã¼¸íÀÌ ¾Æ´Ñ Å¬·¡½º¸íÀ¸·Î È£Ãâ
		System.out.println("µ¥ÀÌÅÍ°¡ ¾ø½À´Ï´Ù.");
	}
	
	public static void print1(int a) {
		System.out.println("Á¤¼ö : " + a);
	}

	public static void print1(double a) {
		System.out.println("double : " + a);
	}
	
	public static void print1(int a, int b) {
		System.out.println("a : " + a + ", b : " + b);
	}
	
	
}
