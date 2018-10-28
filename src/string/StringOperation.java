package string;

public class StringOperation {
	
	public static void main(String[] args) {
		
		String miao = new String("xiao,miao");
		String haha = "haha";
		
		System.out.println(miao.substring(5, 9));
		
		System.out.println(miao.endsWith("o"));
		
		System.out.println(miao.substring(0));
		
		System.out.println(miao.charAt(5));
		
		System.out.println(miao.codePointAt(2));// asciiֵ
		
		System.out.println(miao.codePointBefore(3));
		
		System.out.println(miao.codePointCount(2, 4));
		
//		System.out.println(haha.compareTo(""));
		String s = "xiao";
		String ss = "xiao";
		String sss = "xiaomiao";
		String s1 = "miao";
		String s2 = new String("xiao");
		String s3 = new String("xi") + new String("ao");
		String s4 = "xi" + "ao";
		String s5 = "xi" + new String("ao");
		String s6 = s + "miao";
		String s7 = "xiao" + "miao";
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(sss.hashCode());
		
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
		System.out.println("xiaomiao".hashCode());
		System.out.println(s6=="xiaomiao");
		System.out.println(s7=="xiaomiao");
	}
}
