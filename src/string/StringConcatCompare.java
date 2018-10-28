package string;

import java.util.ArrayList;

/**
 * @author dandelion
 *	字符串拼接五种方式
 *	1。普通方式 
 *	2.使用concat方法，效率略高
 *	3.stringbuffer,效率高
 *	4.stringbuilder效率最高
 *	5.针对ArrayList的方法  StringUtil.join方法
 */
public class StringConcatCompare {
	long start = 0;
	long end = 0;

	public StringConcatCompare() {

	}
	//	尽量不适用
	public void normalAdd() {
		start = System.currentTimeMillis();
		String s = null;
		for (int i = 0; i < 50000; i++) {
			s += i;
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	//	尽量不使用
	public void byConcat() {
		start = System.currentTimeMillis();
		String s2 = "";
		for (int i = 0; i < 50000; i++) {
			s2 = s2.concat(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public void byStringBuilder() {
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 50000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public void byStringBuffer() {
		start = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 50000; i++) {
			buffer.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	
	// 针对ArrayList的方法
	// StringUtils 非jdk中的类，完整包名为 org.apache.commons.lang3.StringUtils
	public void byArrayListJoin() {
		/*start = System.currentTimeMillis();
		ArrayList list = new ArrayList();
		for(int i = 0; i < 50000; i++) {
			list.add(i);
		}
		StringUtils。join(list,"");
		
		end = System.currentTimeMillis();
		System.out.println(end - start);
		*/
	}
	
	
	public static void main(String[] args) {
		StringConcatCompare s = new StringConcatCompare();
		s.normalAdd();
		s.byConcat();
		s.byStringBuilder();
		s.byStringBuffer();
	}
}
