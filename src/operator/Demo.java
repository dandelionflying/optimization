package operator;

public class Demo {
	public static void main(String[] args) {
		int a = 32;
//		int a1 = ++a + a++ + a++;//100
		int a2 = ++a + ++a + a++;
		System.out.println(a2);//101
		int i = -8;
		System.out.println(~i);//7
		/*
		 * 原码		0000 1000
		 * 反码		0000 1000
		 * 补码		0000 1000
		 * 	按位取反	1111 0111（~）
		 * 转为原码：	
		 * 补码取反	1111 1000
		 * 末位加一	1111 1001
		 * 
		 * 原码		1111 1000
		 * 反码		1111 0111
		 * 补码		1111 1000
		 * 	按位取反	0000 0111
		 * 	转为原码：
		 * 		正数原反补一样
		 * */
	}
}
