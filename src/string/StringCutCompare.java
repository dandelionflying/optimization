package string;

import java.util.StringTokenizer;

public class StringCutCompare {

	private StringBuffer sb = new StringBuffer();

	public StringCutCompare() {
		for (int i = 0; i < 10000; i++) {
			sb.append(i);
			sb.append(',');
		}
	}

	public void cutBySplit() {
		String orgStr = sb.toString();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			orgStr.split(",");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public void cutByStringTokenizer() {
		String orgStr2 = sb.toString();
		long start = System.currentTimeMillis();
		StringTokenizer st = new StringTokenizer(orgStr2, ",");
		for (int i = 0; i < 10000; i++) {
			st.nextToken();
		}
		// st = new StringTokenizer(",");
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public void cutBysubString() {
		String temp = sb.toString();
		long start = System.currentTimeMillis();
		String splitStr = null;
		while (true) {
			int j = temp.indexOf(",");
			if (j < 0)
				break;
			splitStr = temp.substring(0, j);
			temp = temp.substring(j + 1);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public void cutBysubString2() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 30; i++) {
			buffer.append(i);
			buffer.append(',');
		}

		String splitStr = null;
		String temp = buffer.toString();
		System.out.println(temp);
		while (true) {
			int j = temp.indexOf(",");
			if (j < 0)
				break;
			splitStr = temp.substring(0, j);
			temp = temp.substring(j + 1);
			System.out.println("splitStr:\t" + splitStr + "\ttemp:\t" + temp);
		}

	}

	public static void main(String[] args) {
		StringCutCompare stringCut = new StringCutCompare();
		stringCut.cutBySplit();
		stringCut.cutByStringTokenizer();
		stringCut.cutBysubString();
//		stringCut.cutBysubString2();
	}
}
