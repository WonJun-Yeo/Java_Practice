package Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/* 백화점 고객관리 프로그램 (상속과 다형성)
 * 
 * 고객 등급
 * 		Silver : 보너스포인트(1%적립), 할인률(X)
 * 		Gold : 보너스포인트(2%), 할인률(5%)
 * 		VIP : 보너스포인트(5%), 할인률(10%), 담당에이전트가 존재
 * 
 */

class Customer {						// 일반고객(Silver)
	int customerID;						// 고객 ID
	String customerName;				// 고객 이름
	String customerGrade;				// 고객 등급 ("Silver", "Gold", "VIP") 기본로드
	double bonusPoint;					// 보너스 포인트 값
	double bonusRatio;					// 보너스 포인트 적립률 (Silver : 0.01, Gold : 0.02. VIP : 0.05) 기본로드
	
	// 생성자에서 기본으로 2개의 필드의 값은 로드
	
	Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	public double calcPrice(int price) {
		// 기본의 물품의 가격을 받아서 bonusPoint를 적립 후 할인 가격 리턴 코드
		bonusPoint = (double)(bonusPoint + (double)(price * bonusRatio));
		return price;		// 할인된 가격을 return
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
	double saleRatio;					// 물품할인률 Gold : 0.05. VIP : 0.1) 생성자에서 기본로드
	
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
	private int agentID;				// 생성자, setter, 필드(X)
	double saleRatio;					// 물품할인률 Gold : 0.05. VIP : 0.1) 생성자에서 기본로드
	
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
		// 고객아이디 중복되지 않도록
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======================================================================");
			System.out.println("1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  6. 종료");
			System.out.println("======================================================================");
			
			int selectNum = sc.nextInt();
			
			if(selectNum == 1) {
				System.out.println("==일반고객 등록 입니다.==");
				System.out.println("아이디를 입력해주세요");
				int customerID = sc.nextInt();
				System.out.println("이름을 입력해주세요");
				String customerName = sc.next();
				
				Customer customer = new Customer(customerID, customerName);
				customerList.add(customer);
				
				System.out.println("정상적으로 등록되었습니다.");
			} else if (selectNum == 2) {
				System.out.println("==VIP고객 등록 입니다.==");
				System.out.println("아이디를 입력해주세요");
				int customerID = sc.nextInt();
				System.out.println("이름을 입력해주세요");
				String customerName = sc.next();
				
				Customer customer = new VIPCustomer(customerID, customerName);
				customerList.add(customer);
				System.out.println("정상적으로 등록되었습니다.");
			} else if (selectNum == 3) {
				System.out.println("==Gold고객 등록 입니다.==");
				System.out.println("아이디를 입력해주세요");
				int customerID = sc.nextInt();
				System.out.println("이름을 입력해주세요");
				String customerName = sc.next();
				
				Customer customer = new GoldCustomer(customerID, customerName);
				customerList.add(customer);
				System.out.println("정상적으로 등록되었습니다.");
			} else if (selectNum == 4) {
				System.out.println("==고객 정보 출력입니다==");
				System.out.println("고객ID" + "\t" + "고객이름" + "\t" + "고객등급" + "\t" + "할인률" + "\t" + 	"보너스포인트비율" + "\t" + "에이젼트ID<VIP고객>");
				
				for (Customer k : customerList) {
					System.out.println(k);
				}
			} else if (selectNum == 5) {
				System.out.println("==고객아이디를 입력해주세요==");
				int customerID = sc.nextInt();
				System.out.println("==물품가격을 지불해 주세요 ==");
				int price = sc.nextInt();
				
				Iterator<Customer> iter = customerList.iterator();
				while (iter.hasNext()) {
					Customer employee = iter.next();
					if(customerID == employee.getCustomerID()) {
						System.out.println(employee.customerName + " 고객님, " + price + "원 지불하셨습니다.");
						System.out.println(employee.customerName + " 고객님의 등급은 " + employee.customerGrade +  "이고 할인이 적용된 가격은 " + employee.calcPrice(price) + "원 이며 현재 포인트는 " + employee.bonusPoint + " 입니다.");
					}
				}
			} else if (selectNum == 6) {
				break;
			} else {
				System.out.println("1~5 사이의 값을 입력해주세요");
			}
			
			
		}
		sc.close();
		
	}

}
