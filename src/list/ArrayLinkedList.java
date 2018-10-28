package list;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * @author dandelion
 *
 * 1、第一次向ArrayList和LinkList插入相同数据量时，前者快
 * 2、往后插入，后者快
 * 3、删除相同的数据量时，前者快。
 */
public class ArrayLinkedList {

	public ArrayLinkedList() {

	}

	public void doIt() {
		long start = System.currentTimeMillis();
		ArrayList<Object> list = new ArrayList<Object>();
		Object obj = new Object();
		for (int i = 0; i < 5000000; i++) {
			list.add(obj);
		}
		long end = System.currentTimeMillis();
		System.out.println("init arraylist time: " + (end - start));

		start = System.currentTimeMillis();
		LinkedList<Object> linkList = new LinkedList<Object>();
		Object obj1 = new Object();
		for (int i = 0; i < 5000000; i++) {
			linkList.add(obj1);
		}
		end = System.currentTimeMillis();
		System.out.println("init linkedlist time : " + (end - start));

		start = System.currentTimeMillis();
		Object obj2 = new Object();
		for (int i = 0; i < 10000; i++) {
			list.add(obj2);
		}
		end = System.currentTimeMillis();
		System.out.println("newadd arraylist time : " + (end - start));
		
		
		start = System.currentTimeMillis();
		Object obj3 = new Object();
		for (int i = 0; i < 10000; i++) {
			linkList.add(obj3);
		}
		end = System.currentTimeMillis();
		System.out.println("newadd linkedlist time : " + (end - start));
		
		start = System.currentTimeMillis();
		list.remove(0);
		end = System.currentTimeMillis();
		System.out.println("remove arraylist元素所用时间 : " + (end - start));
		
		start = System.currentTimeMillis();
		linkList.remove(250000);
		end = System.currentTimeMillis();
		System.out.println("remove linklist元素所用时间 : " + (end - start));
	}

}
