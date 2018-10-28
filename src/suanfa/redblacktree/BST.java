package suanfa.redblacktree;

public class BST<Key extends Comparable<Key>, Value> {
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	private Node root;

	private class Node {
		Key key;
		Value val;
		Node left, right;
		boolean color;

		Node(Key key, Value val, boolean color) {
			this.key = key;
			this.val = val;
			this.color = color;
		}
	}

	public Value get(Key key) {
		Node x = root;
		while (x != null) {
			int cmp = key.compareTo(x.key);
			if (cmp == 0)
				return x.val;
			else if (cmp < 0)
				x = x.left;
			else if (cmp > 0)
				x = x.right;
		}
		return null;
	}

	public Key min() {
		Node x = root;
		while (x != null)
			x = x.left;
		if (x == null)
			return null;
		else
			return x.key;
	}

	public void put(Key key, Value val) {
	}

	private boolean isRed(Node x) {
		if (x == null)
			return false;
		return (x.color == RED);
	}

	// ×óÐý
	private Node rotateLeft(Node h) {
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = x.left.color;
		x.left.color = RED;
		return x;
	}

	// ÓÒÐý

	private Node rotateRight(Node h) {
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = x.right.color;
		x.right.color = RED;
		return x;
	}

}
