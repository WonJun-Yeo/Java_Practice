package Practice;

public class bitOperator {

	public static void main(String[] args) {
		// 10���� 3�� 10�� AND ����
		System.out.println(3 & 10);
		/*
		 * 		00000011		3
		 * 	&	00001010		10
		 * -------------
		 * 		00000010		2
		 */

		
		// 10���� 3�� 10�� OR ����
		System.out.println(3 | 10);
		/*
		 * 		00000011		3
		 * 	|	00001010		10
		 * -------------
		 * 		00001011		11
		 */
		
		// 10���� 3�� 10�� OR ����
		System.out.println(3 ^ 10);
		/*
		 * 		00000011		3
		 * 	^	00001010		10
		 * -------------
		 * 		00001001		9
		 */
		
		// 10���� 3�� NOT ����
		System.out.println(~3);
		/*
		 * ~	00000011		3
		 * -------------
		 * 		11111100		-4
		 */
		
		
		
	}

}
