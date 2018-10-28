import java.util.Vector;

public class CloneDemo implements Cloneable {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Vector getV() {
		return v;
	}

	public void setV(Vector v) {
		this.v = v;
	}

	private String str;
	private Vector v;

	public CloneDemo() {
			System.out.println("¹¹Ôìº¯Êý");
	}

	public CloneDemo newInstance() {
		try {
			return (CloneDemo) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		CloneDemo c1 = new CloneDemo();
		System.out.println(System.currentTimeMillis() - start);

		Vector v = new Vector();
		c1.setId(1);
		c1.setStr("...");
		c1.setV(v);

		start = System.currentTimeMillis();
		CloneDemo c2 = c1.newInstance();
		System.out.println(System.currentTimeMillis() - start);

		c2.setId(2);
		c2.setStr("aa");
		c2.getV().add("sas");

		System.out.println("c1==c2?/t" + (c1 == c2));
		System.out.println("c1.getV()==c2.getV()\t" + (c1.getV() == c2.getV()));
		System.out.println(c1.getId() + c1.getStr());
		System.out.println(c2.getId() + c2.getStr());
	}
}
