package chap04;
public class Continue_EX05 {
	public static void main(String[] args) {
		
		// 1. ���� loop���� continue
		
		for (int i = 0; i < 10; i++) {
			continue;
			// System.out.println("��� ���� ����"); 		// continue�� ���� ���� ������ ���๮�� ����ϸ� ������ �߻�
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			continue;
		}
		System.out.println();
		System.out.println("===================");
		
		// 2. ������ ����ؼ� continue ó��
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
			
		}
		System.out.println();
		System.out.println("===================");
		
		// 3. ������ ����ؼ� break ó��
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		// 4. ���� loop������ continue ���
		 for (int i = 0; i < 5; i++) {
	         for (int j = 0; j < 5; j++) {
	            if (j == 3) {
	               continue;
	            }
	            System.out.println(i + ", " + j);
	         } 
	     }
		 System.out.println("====================");
		 
		// 5. ���� loop������ break ���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
			    if (j == 3) {
			        break;
			    }
			    System.out.println(i + ", " + j);
			} 
		}
		System.out.println("====================");
		
		// 6. continue���� �� ���
		
POS2:	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j ==3) {
					continue POS2;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("====================");

		// 7. break���� �� ���
POS3:	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j ==3) {
					break POS3;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
