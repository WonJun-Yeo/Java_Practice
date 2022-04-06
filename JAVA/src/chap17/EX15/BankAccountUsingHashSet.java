package chap17.EX15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


class Account{       //계좌 정보를 저장하는 객체. 중요한 필드, private (캡슐화),   
					//DTO, VO <== 각계층으로 필드의 값을 저장하고 전달  
					// 객체명 필드접근(x), 생성자(0), getter(0), setter(0)
	private String ano ; 	//계좌 번호
	private String owner;   //계좌 주 , 이름
	private int balance; 	// 통장 금액, 
	
	Account(String ano, String owner, int balance){   //객체 생성시 필드의 값을 받아서 필드에 로드 
		this.ano = ano ; 
		this.owner = owner; 
		this.balance = balance; 	
	}
	//getter, setter 

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "계좌번호 : " + ano + ", 이름 : " + owner + ", 잔고 : " + balance;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Account) {
			if (this.ano.equals(((Account)obj).ano)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ano);
	}
	
		
}

public class BankAccountUsingHashSet {
	/*컬렉션(HashSet<E>)를 사용해서 Account 객체 등록 
	 * 배열은 방크기가 고정이지만, 컬렉션은 방의 크기가 동적으로 변한다.
	 * 계좌번호 중복 저장을 막는다.
	 */
	private static Set<Account> aSet = new HashSet<Account>();
		// add() <== 컬렉션 방에 값 입력, remove() <== 컬렉션 방에 값 삭제, size() <== 컬렉션 갯수
	
	private static Scanner scanner = new Scanner(System.in); 
	
	private static void createAccount() {
		//코드 작성 : 1. 계좌 생성.  스캐너로 1.계좌번호, 2. 이름, 3. 초기통장 금액
		//배열 객체에 저장. 
		System.out.println("----------");
		System.out.println("1. 계좌 생성");
		System.out.println("----------");
		System.out.println("계좌 번호를 입력 하세요 >>");
		String ano = scanner.next();    //계좌 번호를 인풋 받아서 ano 변수에 할당. <메소드 내에서만 사용하는 지역 변수>  
		System.out.println("이름을 입력 하세요>>");
		String owner = scanner.next(); 
		System.out.println("계좌 개설시 초기 금액을 입력 하세요 >>");
		int balance = scanner.nextInt(); 
		
		//각 필드의 정보를 사용자로 부터 할당 받아서 객체를 생성후 객체에 필드의 값을 저장. 
		Account newAccount = new Account(ano, owner, balance);    //생성자를 통해서 객체에 필드값적용후 객체 생성. 
		 
		aSet.add(newAccount); 
		System.out.println("계좌가 성공적으로 생성되었습니다. ");
		
	}
	
	private static void accountList() {
		//코드 작성 :2. 계좌 목록 출력 :  배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액 을 출력 
		//배열의 각 방을 순회 하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력. 
		System.out.println("------------");
		System.out.println("2. 계좌목록출력");
		System.out.println("------------");
		
		//배열의 각방의 null아닌 경우 , 객체의 필드의 값을 출력. 
		
		Iterator<Account> iterator = aSet.iterator();
		
		while (iterator.hasNext()) {
			Account ir = iterator.next();
			if (ir != null) {
				System.out.println(ir);
			}
		}
	}
	
	
	private static void deposit() {
		//코드 작성 : 3. 예금 <== 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금금액 : 해당 계좌에 저장. 
		//1. 사용자로 부터 입금할 계좌를 받아야 한다. 
		//2. 사용자로 받은 계좌 번호를 배열에 저장된 객체내의 계좌 번호를 확인후 해당 계좌에 입금. 
		
		System.out.println("----------");
		System.out.println("3.예금하기");
		System.out.println("----------");
		System.out.println("예금할 계좌 번호를 입력하세요 >>");
		String ano = scanner.next(); 
		System.out.println("예금할 금액을 입력 하세요 >>");
		int money = scanner.nextInt(); 
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다. 
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다. 
		Account account = findAccount(ano);      //findAccount(계좌번호)
		
		if (account == null) {
			System.out.println("결과 : 해당 계좌가 존재하지 않습니다.  ");
			return;    //메소드를 종료. 
		}
		account.setBalance(account.getBalance() + money );   //settor 를 사용해서 기존의 금액 + 추가 입금 
		System.out.println("결과 : 예금이 성공적으로 입금 되었습니다. ");
		
	}
	
	private static void withdraw() {
		//코드 작성 : 4. 출금 <== 계좌 번호를 인풋 받아 해당 계좌를 객체에서 찾아서 출금.
		
		
		System.out.println("----------");
		System.out.println("4.출금하기");
		System.out.println("----------");
		System.out.println("출금할 계좌 번호를 입력하세요 >>");
		String ano = scanner.next(); 
		System.out.println("출금할 금액을 입력 하세요 >>");
		int money = scanner.nextInt(); 
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다. 
		Account account = findAccount(ano);      //findAccount(계좌번호)
		
		if (account == null) {
			System.out.println("결과 : 해당 계좌가 존재하지 않습니다.  ");
			return;    //메소드를 종료. 
		}
		account.setBalance(account.getBalance() - money );   //settor 를 사용해서 기존의 금액 - 추가 입금 
		System.out.println("결과 : 예금이 성공적으로 출금 되었습니다. ");
		System.out.println("남은 금액 : " + account.getBalance());
		
		
		
	}
	
	//배열에서 Account 객체 내의 ano[계좌번호] 와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌. 
	//예금, 출금할때 공통코드 , 여러 메소드에서 중복 사용 될때 별도의 메소드를 생성해서 중복코드를 간단하게 만들어 준다. 
	private static Account findAccount(String ano) {
		Account account = null ; 
		//코드 작성 
		
		Iterator<Account> iterator = aSet.iterator();
		
		while (iterator.hasNext()) {
			Account ir = iterator.next();
			String str = ir.getAno();
			if(str.equals(ano)) {
				account = ir;
				return account;
			}
		}
		
		return account; 
	}
	

	public static void main(String[] args) {
		boolean run = true; 
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>>");
			int selectNO = scanner.nextInt(); 
			
			if (selectNO == 1) {
				createAccount() ; 	//메소드 호출 , 객체 생성 없이 메소드명으로 호출(static) , 
			}else if (selectNO == 2) {
				accountList(); 
			}else if (selectNO == 3) {
				deposit(); 
			}else if (selectNO == 4) {
				withdraw(); 
			}else if (selectNO == 5) {
				run = false; 
				//break; 
			}
			
		}
		scanner.close(); 
		System.out.println("프로그램 종료");
		
	}

}
