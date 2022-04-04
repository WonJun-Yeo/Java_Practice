package chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* Set은 중복된 값을 저장할 수 없다.
 * 특정 객체를 생성 후, 그 객체를 Set에 저장할 경우, equals(), hashCode() 메소드가 재정의되어 있지 않은 경우, 중복되어 저장된다.
 * 객체의 특정 필드의 값이 같을 때 중복을 식별하는 필드를 생성해 equals(), hashCode() 메소드가 재정의
 * Wrapper 클래스는 equals(), hashCode() 메소드가 재정의 되어 있다.
 *		Wrapper 클래스 : Integer, String Double, Float, Character, Byte, Short, Long, Boolean
 */


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
	public boolean equals(Object obj) {								// 값이 같을 경우, true를 반환하게 재정의 (원래는 주소값비교)
		if(obj instanceof Member) {
			if(this.memberID == ((Member)obj).memberID) {
				return true;
			} else {
				return false;										// memberID가 같지 않을때
			}
		}
		return false;												// obj가 Member를 포함하지 않았을 때
	}
	
	@Override
	public int hashCode() {											// memberID가 동일할 때 동일한 hashCode를 할당하도록 재정의
		return Objects.hashCode(memberID);							// memberID를 기준으로 hashCode를 할당, memberID가 같으면 같은 hashCode가 할당된다.
		//return Objects.hashCode(memberID, memberName);			// memberID와 memberName을 기준으로 두 개 모두 같으면 같은 hashCode가 할당된다.
		// return memberID;											// hashCode를 memberID로 할당해서 memberID가 같을 경우, 같은 hashCode를 갖게 하는 방법
		// return this.memberID;									// hashCode를 this.memberID로 할당해서 memberID가 같을 경우, 같은 hashCode를 갖게 하는 방법
	}
	
}

class MemberHashSet {												// 객체화 시, arrayList 객체가 생성된다.
	private Set<Member> hashSet;									// Set 선언 : Member타입만 들어올 수 있다. private 접근제어자가 있으므로, 생서자 or getter&setter로 값핧당
	
	public MemberHashSet() {										// 기본 생성자
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member m) {								// Member 타입의 객체를 받아 맨마지막 방에 값을 추가하는 메서드
		hashSet.add(m);
	}
	
	
	public boolean removeMember(int memberId) {						// arrayList에 저장된 memberID 검색한 뒤 해당 객체를 삭제
		Iterator<Member> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {								// iterator에 값이 존재할 때, true
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
