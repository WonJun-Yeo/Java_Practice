package chap17.EX13;

import java.util.Scanner;

class Account {											// DTO(Data Transfer Object), VO (Value Object) : �� �������� �ʵ��� ���� �����ϰ� ����
	private String ano;									// ���¹�ȣ
	private String owner;								// ���¸���, �̸�
	private int balance;								// �ܱ�
	
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
	
	// �迭�� ����ؼ� Account ��ü ����
	private static Account[] accountArray = new Account[100];					// �迭�� ��ü ����
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int arrayIndexNum = 0;
	
	private static void createAccount() {
		// ���� ���� �ڵ��ۼ� (��ĳ�ʷ� ���¹�ȣ, ���¸���, �ܱ��� �Է¹޾� AccountŸ�� ��ü ���� �� accountArray�� ����)
		System.out.println("���� ��ȣ�� �Է����ּ���");
		String inputAno = sc.next();
		
		System.out.println("�̸��� �Է����ּ���");
		String inputOwner =sc.next();
		
		System.out.println("�ܱ��� �Է����ּ���");
		int inputBalance = sc.nextInt();
		
		Account account = new Account(inputAno, inputOwner, inputBalance);
		
		accountArray[arrayIndexNum] = account;
		arrayIndexNum++;
		
		System.out.println("���¹�ȣ : " + inputAno + ", �̸� : " + inputOwner + ", �ܱ� : " + inputBalance + "�� �ԷµǾ� ���°� �����Ǿ����ϴ�.");
		
	}
	
	private static void accountList() {
		// �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		System.out.println("��ϵ� ��� ���� �����Դϴ�.");
		for (int i = 0; i < arrayIndexNum; i++) {
			System.out.println("���¹�ȣ : " + accountArray[i].getAno() + ", �̸� : " + accountArray[i].getOwner() + ", �ܱ� : " + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		// ���� ��ȣ�� �Աݱݾ��� ��ǲ�޾� �ش� ��ü�� ã�� �ݾ��� ���ϱ�
		System.out.println("�Ա��� ���¹�ȣ�� �Է����ּ���");
		String inputAno = sc.next();
		
		System.out.println("�Ա��� �ݾ׸� �Է����ּ���");
		int inputBalance = sc.nextInt();
		
		
		if (findAccount(inputAno).getAno().equals(inputAno)) {
			findAccount(inputAno).setBalance(findAccount(inputAno).getBalance() + inputBalance);
			System.out.println("���¹�ȣ " + findAccount(inputAno).getAno() + "�� " + inputBalance + "���� ���� �ԱݵǾ�, �ܾ��� " + findAccount(inputAno).getBalance() + "�� �Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
	}
	
	private static void withdraw() {
		// ���� ��ȣ�� ��ݱݾ��� ����޾� �ش� ��ü�� ã�� �ݾ��� ����
		System.out.println("����� ���¹�ȣ�� �Է����ּ���");
		String inputAno = sc.next();
		
		System.out.println("����� �ݾ׸� �Է����ּ���");
		int inputBalance = sc.nextInt();
		
		if (findAccount(inputAno).getAno().equals(inputAno)) {
			findAccount(inputAno).setBalance(findAccount(inputAno).getBalance() - inputBalance);
			System.out.println("���¹�ȣ " + findAccount(inputAno).getAno() + "�� " + inputBalance + "���� ���� ��ݵǾ�, �ܾ��� " + findAccount(inputAno).getBalance() + "�� �Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
		
	}
	
	
	private static Account findAccount(String ano) {
		// �迭���� Account ��ü ���� ano(���¹�ȣ)�� ������ ���¸� ã��, ã�� ��ü�� ��ȯ
		// ����, ����Ҷ� �����ڵ�, ���� �޼ҵ忡�� �ߺ� ��� �ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�.
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
			System.out.println("1. ���� ���� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("---------------------------------------------------------------");
			System.out.println("����>>");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				createAccount(); // ��ü �������� �ٷ� �޼ҵ�ȣ�� (static key + ���� ��ü���� ����)
			} else if (selectNo == 2) {
				 accountList(); // ���¸���Ʈ�޼ҵ�ȣ��
			} else if (selectNo == 3) {
				deposit();		// �Աݸ޼ҵ� ȣ��
			} else if  (selectNo == 4) {
				withdraw();		// ��ݸ޼ҵ� ȣ��
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("1-5 ������ ���� �Է��� �ּ���");
			}
			
		}
		System.out.println("���α׷� ����");
		sc.close();
	}
	
}
