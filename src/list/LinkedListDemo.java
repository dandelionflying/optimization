package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author dandelion
 * 
 *         不要用get方法遍历linkedlist中的元素 用迭代器取代
 */
public class LinkedListDemo {
	public LinkedListDemo() {

	}

	public void doIt() {
		int size = 100000;
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < size; i++) {
			list.add("emmm");
		}
		long startTime = System.currentTimeMillis();
		long time = startTime;
		for (int i = 0; i < size; i++) {
			list.get(i);
			/*if (i % 10000 == 0) {
				System.out.println(System.currentTimeMillis() - startTime);
				startTime = System.currentTimeMillis();
			}*/

		}
		System.out.println(System.currentTimeMillis() - time);
	}

	public void doIt2() {
		int size = 100000;
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < size; i++) {
			list.add("emmm");
		}
		long startTime = System.currentTimeMillis();
		long time = startTime;
		int i = 0;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			iterator.next();
			/*if (i % 10000 == 0) {
				System.out.println(System.currentTimeMillis() - startTime);
				startTime = System.currentTimeMillis();
			}*/
			i++;
		}
		System.out.println(System.currentTimeMillis() - time);
	}

	public void doIt3() {
		int size = 100000;
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < size; i++) {
			list.add("emmm");
		}
		long startTime = System.currentTimeMillis();
		list.forEach(name -> {
		});// lambda表达式匿名内部类
		System.out.println(System.currentTimeMillis() - startTime);

	}
}
