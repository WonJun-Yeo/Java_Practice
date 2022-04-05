package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է� ��, �̸��� ������������ ����ϵ��� �����϶�. treeSet�� name �÷��� �������� ����
// 1. Comparable <E> �������̽��� compareTo() �޼ҵ� ������ : ���� ��ü ���� �ʿ�
// 2. Comparator <E> �������̽��� compare() ���� : ���� ��ü �������� ����



class Abc {
	String name;											// �̸�, ���� �÷� (��-��)
															// ������, �̼���, ȫ�浿
	int age;												// ����
	
	Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
	
}

class Abc_T implements Comparable<Abc_T> {
	
	String name;											// �̸�, ���� �÷� (��-��)
	// ������, �̼���, ȫ�浿
	int age;												// ����

	Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Abc_T o) {
		
		if(this.name.compareTo(o.name) < 0) {
			return -1;
		} else if (this.name == o.name) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
	
}


public class EX_treeSetMethod_03 {

	public static void main(String[] args) {
		
		TreeSet<Abc_T> treeSet1 = new TreeSet<Abc_T>();	
		
		Abc_T abc_t1 = new Abc_T("�̼���", 50);
		Abc_T abc_t2 = new Abc_T("ȫ�浿", 20);
		Abc_T abc_t3 = new Abc_T("������", 40);
		
		
		treeSet1.add(abc_t1);
		treeSet1.add(abc_t2);
		treeSet1.add(abc_t3);
		
		System.out.println(treeSet1);
		
		System.out.println("================================");
		
		TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				if(o1.name.compareTo(o2.name) < 0) {
					return -1;
				} else if (o1.name == o2.name) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		Abc abc1 = new Abc("�̼���", 50);
		Abc abc2 = new Abc("ȫ�浿", 20);
		Abc abc3 = new Abc("������", 40);
		
		
		treeSet2.add(abc1);
		treeSet2.add(abc2);
		treeSet2.add(abc3);
		
		System.out.println(treeSet2);
	}

}
