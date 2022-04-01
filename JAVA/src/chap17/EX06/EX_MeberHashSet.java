package chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {														// DTO(Data Transfer Object), VO(Value Object) : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberID;
	private String memberName;
	
	public Member (int memberID, String memberName) {				// 생성자를 통해서 필드의 값할당
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// 필드 getter, setter
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
		return memberName + "회원님의 ID는 " + memberID + "입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			if(this.memberID == ((Member)obj).memberID) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(memberID);
	}
	
}

class MemberHashSet {												// 객체화 시, arrayList 객체가 생성된다.
	private Set<Member> hashSet;
	
	public MemberHashSet() {										// 기본 생성자
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member m) {								// Member 타입의 객체를 받아 맨마지막 방에 값을 추가하는 메서드
		hashSet.add(m);
	}
	
	
	public boolean removeMember(int memberId) {						// arrayList에 저장된 memberID 검색한 뒤 해당 객체를 삭제
		Iterator<Member> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			if(iterator.next().getMemberID() == memberId) {
				iterator.remove();
				System.out.println("ID " + memberId + " 사용자의 정보가 삭제되었습니다.");
			}
		}
		
		return true;
	}
	
	public void showAllMember() {									// arrayList에 저장된 모든 사용자 정보를 출력하는 메소드
		System.out.println("모든 사용자들의 정보입니다.");
		// iterator 사용하서
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
		
		// 각 객체 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee2 = new Member(1001, "이지원");
		
		// 생성된 객체를 arratList에 저장
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		// 모든 사용자 정보 출력
		memberHashSet.showAllMember();
		
		System.out.println("=================================");
		
		// 특정 ID를 가진 사용자 제거
		memberHashSet.removeMember(1002);

		System.out.println("=================================");
		
		// 모든 사용자 정보 출력
		memberHashSet.showAllMember();
	}
}
