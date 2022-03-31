package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		/* 1. List ���� Ŭ������ �����ڸ� ����Ͽ� ��ü ����
		 List�� �������̽��̹Ƿ� new Ű �ڿ� �� �� ����. ArrayList, vector, LinkedList
		 capacity : �޸��� �� ũ�⸦ �Ҵ�, �⺻���� 10
		 size : �濡 ����� ���� ����
		*/ 
		
		List<Integer> aList1 = new ArrayList<>();					// capacity : 10
		List<Integer> aList2 = new ArrayList<>(30);					// capacity : 30
		
		
		List<Integer> aList3 = new Vector<>();						// capacity : 10
		List<Integer> aList4 = new Vector<>(30);					// capacity : 30
		
		List<Integer> aList5 = new LinkedList();					
		// List<Integer> aList6 = new LinkedList(30);				// LinkedList �� capacity �Ҵ��� �Ұ����ϴ�. 
		
		
		// 2. Arrays Ŭ������ ���� �޼ҵ带 �̿��ϴ� ��� : ������ ũ�⸦ �ٲ� �� ����, ���� ������ ���� ������ �� �̿� (EX. ����, ����, 24�ð�)
		
		List<Integer> aList7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24);
		List<String> aList8 = Arrays.asList("�k","ȭ", "��", "��","��","��", "��");
		
		aList7.set(1, 7);											// set(index��ȣ, ��) : �⺻�� ���� ����
		// aList7.add(5);											// add(��)�� ������ index�� ���� �߰��ϴ� ������, ũ�Ⱑ ������ List������ �� �� ����.
		
		System.out.println(aList7);
		
		aList8.set(0, "��");											// set(index��ȣ, ��) : �⺻�� ���� ����
		// aList8.add("��");											// add(��)�� ������ index�� ���� �߰��ϴ� ������, ũ�Ⱑ ������ List������ �� �� ����.
		
		System.out.println(aList8);
		
		
		
	}

}
