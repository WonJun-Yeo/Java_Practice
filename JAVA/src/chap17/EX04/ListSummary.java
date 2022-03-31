package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		// 1. ArrayList
		
		List<String> arrayList = new ArrayList();
		arrayList.add("어");	arrayList.add("레");	arrayList.add("이");	arrayList.add("list");
		System.out.println(arrayList);
		
		// 2. Vector
		
		List<String> vector = new Vector();
		vector.add("벡");vector.add("터");vector.add("리스");vector.add("트");
		System.out.println(vector);
		
		// 3. LinkedList
		
		List<String> linkedlist = new LinkedList();
		linkedlist.add("링");linkedlist.add("크");linkedlist.add("드");linkedlist.add("list");
		System.out.println(linkedlist);
	}

}
