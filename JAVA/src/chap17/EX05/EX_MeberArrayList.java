package chap17.EX05;

import java.util.ArrayList;

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
}

class MemberArrayList {												// 객체화 시, arrayList 객체가 생성된다.
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {										// 기본 생성자
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member m) {								// Member 타입의 객체를 받아 맨마지막 방에 값을 추가하는 메서드
		arrayList.add(m);
	}
	
	public void addMember2(int a, Member member) {					// 매개변수 2개를 받아서 특정 index에 값을 추가(삽입)
		arrayList.add(a, member);
		System.out.println("index " + a + "방에 " + member.getMemberName() + "님이 추가되었습니다.");
		System.out.println(member.getMemberName() + "님의 회원 ID는 " + member.getMemberID() + "입니다.");
	}
	
	public boolean removeMember(int memberId) {						// arrayList에 저장된 memberID 검색한 뒤 해당 객체를 삭제
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getMemberID() == memberId) {
				arrayList.remove(i);
				System.out.println("회원번호 " + memberId + "님이 삭제되었습니다.");
			}
		}
		
		return true;
	}
	
	public void showAllMember() {									// arrayList에 저장된 모든 사용자 정보를 출력하는 메소드
		System.out.println("모든 사용자들의 정보입니다.");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
	
}


public class EX_MeberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 각 객체 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		// 생성된 객체를 arratList에 저장
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 특정 index 방에 사용자 추가
		memberArrayList.addMember2(3, memberHong);
		
		System.out.println("=================================");
		
		// 모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
		System.out.println("=================================");
		
		// 특정 ID를 가진 사용자 제거
		memberArrayList.removeMember(1003);

		System.out.println("=================================");
		
		// 모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
	}
	

}
