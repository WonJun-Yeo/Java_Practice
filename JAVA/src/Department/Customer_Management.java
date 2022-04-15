package Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/* ��ȭ�� ������ ���α׷� (��Ӱ� ������)
 * 
 * �� ���
 * 		Silver : ���ʽ�����Ʈ(1%����), ���η�(X)
 * 		Gold : ���ʽ�����Ʈ(2%), ���η�(5%)
 * 		VIP : ���ʽ�����Ʈ(5%), ���η�(10%), ��翡����Ʈ�� ����
 * 
 */

class Customer {						// �Ϲݰ�(Silver)
	int customerID;						// �� ID
	String customerName;				// �� �̸�
	String customerGrade;				// �� ��� ("Silver", "Gold", "VIP") �⺻�ε�
	double bonusPoint;					// ���ʽ� ����Ʈ ��
	double bonusRatio;					// ���ʽ� ����Ʈ ������ (Silver : 0.01, Gold : 0.02. VIP : 0.05) �⺻�ε�
	
	// �����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε�
	
	Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	public double calcPrice(int price) {
		// �⺻�� ��ǰ�� ������ �޾Ƽ� bonusPoint�� ���� �� ���� ���� ���� �ڵ�
		bonusPoint = (double)(bonusPoint + (double)(price * bonusRatio));
		return price;		// ���ε� ������ return
	}
	
	@Override
	public String toString() {
		return customerID + "\t" + customerName + "\t" + customerGrade + "\t" + 0 + "\t" + 	bonusRatio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			if (customerID == ((Customer) obj).customerID) {
				return true;
			}
		}
		return false;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(customerID);
	}
}



class GoldCustomer extends Customer {
	double saleRatio;					// ��ǰ���η� Gold : 0.05. VIP : 0.1) �����ڿ��� �⺻�ε�
	
	GoldCustomer (int customerID, String customerName) {
		super(customerID, customerName);
		this.saleRatio = 0.05;
		customerGrade = "Gold";
		bonusRatio = 0.02;
	}
	
	@Override
	public double calcPrice(int price) {
		bonusPoint = bonusPoint + (double) (double)(price * bonusRatio);
		return (double)(bonusPoint + (price * bonusRatio));
	}
	
	@Override
	public String toString() {
		return customerID + "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio + "\t" + 	bonusRatio;
	}
	
}



class VIPCustomer extends Customer {
	private int agentID;				// ������, setter, �ʵ�(X)
	double saleRatio;					// ��ǰ���η� Gold : 0.05. VIP : 0.1) �����ڿ��� �⺻�ε�
	
	VIPCustomer (int customerID, String customerName) {
		super(customerID, customerName);
		this.saleRatio = 0.1;
		this.agentID = customerID + 001;
		customerGrade = "VIP";
		bonusRatio = 0.05;
	}
	
	@Override
	public double calcPrice(int price) {
		bonusPoint = (double)(bonusPoint + (double)(price * bonusRatio));
		return (double) (price - (price * saleRatio));
	}
	
	@Override
	public String toString() {
		return customerID + "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio + "\t" + 	bonusRatio + "\t" +	"\t" + agentID;
	}
	
}


public class Customer_Management {

	public static void main(String[] args) {
		Set<Customer> customerList = new HashSet<>();
		// �����̵� �ߺ����� �ʵ���
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======================================================================");
			System.out.println("1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  6. ����");
			System.out.println("======================================================================");
			
			int selectNum = sc.nextInt();
			
			if(selectNum == 1) {
				System.out.println("==�Ϲݰ� ��� �Դϴ�.==");
				System.out.println("���̵� �Է����ּ���");
				int customerID = sc.nextInt();
				System.out.println("�̸��� �Է����ּ���");
				String customerName = sc.next();
				
				Customer customer = new Customer(customerID, customerName);
				customerList.add(customer);
				
				System.out.println("���������� ��ϵǾ����ϴ�.");
			} else if (selectNum == 2) {
				System.out.println("==VIP�� ��� �Դϴ�.==");
				System.out.println("���̵� �Է����ּ���");
				int customerID = sc.nextInt();
				System.out.println("�̸��� �Է����ּ���");
				String customerName = sc.next();
				
				Customer customer = new VIPCustomer(customerID, customerName);
				customerList.add(customer);
				System.out.println("���������� ��ϵǾ����ϴ�.");
			} else if (selectNum == 3) {
				System.out.println("==Gold�� ��� �Դϴ�.==");
				System.out.println("���̵� �Է����ּ���");
				int customerID = sc.nextInt();
				System.out.println("�̸��� �Է����ּ���");
				String customerName = sc.next();
				
				Customer customer = new GoldCustomer(customerID, customerName);
				customerList.add(customer);
				System.out.println("���������� ��ϵǾ����ϴ�.");
			} else if (selectNum == 4) {
				System.out.println("==�� ���� ����Դϴ�==");
				System.out.println("��ID" + "\t" + "���̸�" + "\t" + "�����" + "\t" + "���η�" + "\t" + 	"���ʽ�����Ʈ����" + "\t" + "������ƮID<VIP��>");
				
				for (Customer k : customerList) {
					System.out.println(k);
				}
			} else if (selectNum == 5) {
				System.out.println("==�����̵� �Է����ּ���==");
				int customerID = sc.nextInt();
				System.out.println("==��ǰ������ ������ �ּ��� ==");
				int price = sc.nextInt();
				
				Iterator<Customer> iter = customerList.iterator();
				while (iter.hasNext()) {
					Customer employee = iter.next();
					if(customerID == employee.getCustomerID()) {
						System.out.println(employee.customerName + " ����, " + price + "�� �����ϼ̽��ϴ�.");
						System.out.println(employee.customerName + " ������ ����� " + employee.customerGrade +  "�̰� ������ ����� ������ " + employee.calcPrice(price) + "�� �̸� ���� ����Ʈ�� " + employee.bonusPoint + " �Դϴ�.");
					}
				}
			} else if (selectNum == 6) {
				break;
			} else {
				System.out.println("1~5 ������ ���� �Է����ּ���");
			}
			
			
		}
		sc.close();
		
	}

}
