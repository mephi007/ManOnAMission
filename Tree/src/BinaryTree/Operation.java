package BinaryTree;

public class Operation {
	Node root;

	private Node addRec(Node cur, int value) {
		if (cur == null) {
			return new Node(value);
		}
		if (value < cur.getData())
			cur.setLeft(addRec(cur.getLeft(), value));
		else if (value > cur.getData())
			cur.setRight(addRec(cur.getRight(), value));
		else
			return cur;

		return cur;
	}

	public void add(int value) {
		root = addRec(root, value);
	}

}
