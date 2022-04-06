package chap17.EX13;

import java.util.Scanner;

class Account {											// DTO(Data Transfer Object), VO (Value Object) : 각 계층으로 필드의 값을 저장하고 전달
	private String ano;									// 계좌번호
	private String owner;								// 계좌명의, 이름
	private int balance;								// 잔금
	
	Account (String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

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
	
	
	
}

public class BankAccountUsingArray {
	
	// 배열을 사용해서 Account 객체 생성
	private static Account[] accountArray = new Account[100];					// 배열에 객체 저장
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int arrayIndexNum = 0;
	
	private static void createAccount() {
		// 계좌 생성 코드작성 (스캐너로 계좌번호, 계좌명의, 잔금을 입력받아 Account타입 객체 생성 후 accountArray에 저장)
		System.out.println("계좌 번호를 입력해주세요");
		String inputAno = sc.next();
		
		System.out.println("이름을 입력해주세요");
		String inputOwner =sc.next();
		
		System.out.println("잔금을 입력해주세요");
		int inputBalance = sc.nextInt();
		
		Account account = new Account(inputAno, inputOwner, inputBalance);
		
		accountArray[arrayIndexNum] = account;
		arrayIndexNum++;
		
		System.out.println("계좌번호 : " + inputAno + ", 이름 : " + inputOwner + ", 잔금 : " + inputBalance + "이 입력되어 계좌가 생성되었습니다.");
		
	}
	
	private static void accountList() {
		// 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
		System.out.println("등록된 모든 계좌 정보입니다.");
		for (int i = 0; i < arrayIndexNum; i++) {
			System.out.println("계좌번호 : " + accountArray[i].getAno() + ", 이름 : " + accountArray[i].getOwner() + ", 잔금 : " + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		// 계좌 번호와 입금금액을 인풋받아 해당 객체를 찾아 금액을 더하기
		System.out.println("입금할 계좌번호를 입력해주세요");
		String inputAno = sc.next();
		
		System.out.println("입금할 금액를 입력해주세요");
		int inputBalance = sc.nextInt();
		
		
		if (findAccount(inputAno).getAno().equals(inputAno)) {
			findAccount(inputAno).setBalance(findAccount(inputAno).getBalance() + inputBalance);
			System.out.println("계좌번호 " + findAccount(inputAno).getAno() + "에 " + inputBalance + "원이 정상 입금되어, 잔액은 " + findAccount(inputAno).getBalance() + "원 입니다.");
		} else {
			System.out.println("입력하신 계좌번호가 존재하지 않습니다.");
		}
	}
	
	private static void withdraw() {
		// 계좌 번호와 출금금액을 인춧받아 해당 객체를 찾아 금액을 빼기
		System.out.println("출금할 계좌번호를 입력해주세요");
		String inputAno = sc.next();
		
		System.out.println("출금할 금액를 입력해주세요");
		int inputBalance = sc.nextInt();
		
		if (findAccount(inputAno).getAno().equals(inputAno)) {
			findAccount(inputAno).setBalance(findAccount(inputAno).getBalance() - inputBalance);
			System.out.println("계좌번호 " + findAccount(inputAno).getAno() + "에 " + inputBalance + "원이 정상 출금되어, 잔액은 " + findAccount(inputAno).getBalance() + "원 입니다.");
		} else {
			System.out.println("입력하신 계좌번호가 존재하지 않습니다.");
		}
		
	}
	
	
	private static Account findAccount(String ano) {
		// 배열에서 Account 객체 내의 ano(계좌번호)와 동일한 계좌를 찾아, 찾은 객체를 반환
		// 예금, 출금할때 공통코드, 여러 메소드에서 중복 사용 될때 별도의 메소드를 생성해서 중복코드를 간단하게 만들어 준다.
		Account account = null;
		
		for (int i = 0; i < arrayIndexNum; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
			}
		}
		
		return account;
	}
	
	
	public static void main(String[] args) {
		boolean run = true;
		
		
		
		while (run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("선택>>");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				createAccount(); // 객체 생성없이 바로 메소드호출 (static key + 본인 객체내에 존재)
			} else if (selectNo == 2) {
				 accountList(); // 계좌리스트메소드호출
			} else if (selectNo == 3) {
				deposit();		// 입금메소드 호출
			} else if  (selectNo == 4) {
				withdraw();		// 출금메소드 호출
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("1-5 사이의 값을 입력해 주세요");
			}
			
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	
}
