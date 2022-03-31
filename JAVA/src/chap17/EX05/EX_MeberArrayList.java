package chap17.EX05;

import java.util.ArrayList;

class Member {														// DTO(Data Transfer Object), VO(Value Object) : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberID;
	private String memberName;
	
	public Member (int memberID, String memberName) {				// �����ڸ� ���ؼ� �ʵ��� ���Ҵ�
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// �ʵ� getter, setter
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public String toString() {
		return memberName + "ȸ������ ID�� " + memberID + "�Դϴ�.";
	}
}

class MemberArrayList {												// ��üȭ ��, arrayList ��ü�� �����ȴ�.
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {										// �⺻ ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member m) {								// Member Ÿ���� ��ü�� �޾� �Ǹ����� �濡 ���� �߰��ϴ� �޼���
		arrayList.add(m);
	}
	
	public void addMember2(int a, Member member) {					// �Ű����� 2���� �޾Ƽ� Ư�� index�� ���� �߰�(����)
		arrayList.add(a, member);
		System.out.println("index " + a + "�濡 " + member.getMemberName() + "���� �߰��Ǿ����ϴ�.");
		System.out.println(member.getMemberName() + "���� ȸ�� ID�� " + member.getMemberID() + "�Դϴ�.");
	}
	
	public boolean removeMember(int memberId) {						// arrayList�� ����� memberID �˻��� �� �ش� ��ü�� ����
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getMemberID() == memberId) {
				arrayList.remove(i);
				System.out.println("ȸ����ȣ " + memberId + "���� �����Ǿ����ϴ�.");
			}
		}
		
		return true;
	}
	
	public void showAllMember() {									// arrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
		System.out.println("��� ����ڵ��� �����Դϴ�.");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
	
}


public class EX_MeberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// �� ��ü ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		// ������ ��ü�� arratList�� ����
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// Ư�� index �濡 ����� �߰�
		memberArrayList.addMember2(3, memberHong);
		
		System.out.println("=================================");
		
		// ��� ����� ���� ���
		memberArrayList.showAllMember();
		
		System.out.println("=================================");
		
		// Ư�� ID�� ���� ����� ����
		memberArrayList.removeMember(1003);

		System.out.println("=================================");
		
		// ��� ����� ���� ���
		memberArrayList.showAllMember();
		
	}
	

}
