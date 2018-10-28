package jvm;

/**
 * @author dandelion 
 * intern()方法会从字符串常量池中查询当前字符串是否存在，若不存在就会将当前字符串放图常量池中
 */
public class StringIntern {
	public static void main(String[] args) {
		String s1 = new String("111111");
		//s = s.intern();
		s1.intern();
		String s2 = "111111";
		System.out.println(s1 == s2);// false,不是应该true？
		
		String s3 = new String("1") + new String("1");
//		s3.intern();
		String s4 = "11";
		System.out.println(s3.intern() == s4);

	}
}
