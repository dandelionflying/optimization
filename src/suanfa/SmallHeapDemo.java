package suanfa;

public class SmallHeapDemo {
	final static int MAX_LEN = 100;
	private int queue[] = new int[MAX_LEN];
	private int size;

	public void add(int e) {
		if (size >= MAX_LEN) {
			System.out.println("over flow");
			return;
		}
		int s = size++;
		shiftup(s, e);
	}

	public int size() {
		return size;
	}

	private void shiftup(int s, int e) {
		while (s > 0) {
			int parent = (s - 1) / 2;
			if (queue[parent] < e) {
				break;
			}
			queue[s] = e;
			s = parent;
		}
		queue[s] = e;
	}

	public int poll() {
		if (size <= 0) {
			return -1;
		}
		int ret = queue[0];
		int s = --size;
		shiftdown(0, queue[s]);
		queue[s] = 0;
		return ret;
	}

	private void shiftdown(int i, int e) {
		int half = size / 2;
		while (i < half) {
			int child = 2 * i + 1;
			int right = child + 1;
			if (right < size && queue[child] > queue[right]) {
				child = right;
			}
			if (e < queue[child]) {
				break;
			}
			queue[i] = queue[child];
			i = child;
		}
	}
	
	public static void main(String[] args) {
		SmallHeapDemo hs = new SmallHeapDemo();
		hs.add(4);
		hs.add(3);
		hs.add(7);
		hs.add(2);
		int size = hs.size();
		for (int i = 0; i < size; i++) {
			System.out.println(hs.poll());
		}
	}
}
