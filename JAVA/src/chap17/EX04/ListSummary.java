package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		// 1. ArrayList
		
		List<String> arrayList = new ArrayList();
		arrayList.add("��");	arrayList.add("��");	arrayList.add("��");	arrayList.add("list");
		System.out.println(arrayList);
		
		// 2. Vector
		
		List<String> vector = new Vector();
		vector.add("��");vector.add("��");vector.add("����");vector.add("Ʈ");
		System.out.println(vector);
		
		// 3. LinkedList
		
		List<String> linkedlist = new LinkedList();
		linkedlist.add("��");linkedlist.add("ũ");linkedlist.add("��");linkedlist.add("list");
		System.out.println(linkedlist);
	}

}
