package chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* Set�� �ߺ��� ���� ������ �� ����.
 * Ư�� ��ü�� ���� ��, �� ��ü�� Set�� ������ ���, equals(), hashCode() �޼ҵ尡 �����ǵǾ� ���� ���� ���, �ߺ��Ǿ� ����ȴ�.
 * ��ü�� Ư�� �ʵ��� ���� ���� �� �ߺ��� �ĺ��ϴ� �ʵ带 ������ equals(), hashCode() �޼ҵ尡 ������
 * Wrapper Ŭ������ equals(), hashCode() �޼ҵ尡 ������ �Ǿ� �ִ�.
 *		Wrapper Ŭ���� : Integer, String Double, Float, Character, Byte, Short, Long, Boolean
 */


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
	
	@Override
	public boolean equals(Object obj) {								// ���� ���� ���, true�� ��ȯ�ϰ� ������ (������ �ּҰ���)
		if(obj instanceof Member) {
			if(this.memberID == ((Member)obj).memberID) {
				return true;
			} else {
				return false;										// memberID�� ���� ������
			}
		}
		return false;												// obj�� Member�� �������� �ʾ��� ��
	}
	
	@Override
	public int hashCode() {											// memberID�� ������ �� ������ hashCode�� �Ҵ��ϵ��� ������
		return Objects.hashCode(memberID);							// memberID�� �������� hashCode�� �Ҵ�, memberID�� ������ ���� hashCode�� �Ҵ�ȴ�.
		//return Objects.hashCode(memberID, memberName);			// memberID�� memberName�� �������� �� �� ��� ������ ���� hashCode�� �Ҵ�ȴ�.
		// return memberID;											// hashCode�� memberID�� �Ҵ��ؼ� memberID�� ���� ���, ���� hashCode�� ���� �ϴ� ���
		// return this.memberID;									// hashCode�� this.memberID�� �Ҵ��ؼ� memberID�� ���� ���, ���� hashCode�� ���� �ϴ� ���
	}
	
}

class MemberHashSet {												// ��üȭ ��, arrayList ��ü�� �����ȴ�.
	private Set<Member> hashSet;									// Set ���� : MemberŸ�Ը� ���� �� �ִ�. private ���������ڰ� �����Ƿ�, ������ or getter&setter�� ���C��
	
	public MemberHashSet() {										// �⺻ ������
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member m) {								// Member Ÿ���� ��ü�� �޾� �Ǹ����� �濡 ���� �߰��ϴ� �޼���
		hashSet.add(m);
	}
	
	
	public boolean removeMember(int memberId) {						// arrayList�� ����� memberID �˻��� �� �ش� ��ü�� ����
		Iterator<Member> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {								// iterator�� ���� ������ ��, true
			if(iterator.next().getMemberID() == memberId) {
				iterator.remove();
				System.out.println("ID " + memberId + " ������� ������ �����Ǿ����ϴ�.");
			}
		}
		
		return true;
	}
	
	public void showAllMember() {									// arrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
		System.out.println("��� ����ڵ��� �����Դϴ�.");
		// iterator ����ϼ�
		Iterator<Member> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void showSize() {
		hashSet.size();
	}
	
}


public class EX_MeberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		// �� ��ü ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee2 = new Member(1001, "������");
		
		// ������ ��ü�� arratList�� ����
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		// ��� ����� ���� ���
		memberHashSet.showAllMember();
		
		System.out.println("=================================");
		
		// Ư�� ID�� ���� ����� ����
		memberHashSet.removeMember(1002);

		System.out.println("=================================");
		
		// ��� ����� ���� ���
		memberHashSet.showAllMember();
	}
}
