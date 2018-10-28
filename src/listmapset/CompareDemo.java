package listmapset;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareDemo {

	public ArrayList<String> initArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 50000; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}
	
	public void traverseAlist(ArrayList<String> list) {
		
	}

	public LinkedList<String> initLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < 50000; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}

	public static void main(String[] args) {
		CompareDemo compare = new CompareDemo();
		
		long start = System.currentTimeMillis();
		compare.initArrayList();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		start = System.currentTimeMillis();
		compare.initLinkedList();
		end = System.currentTimeMillis();
		System.out.println(end - start);

	}
}
