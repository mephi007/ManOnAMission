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

	// Depth-First Traversing

	// In-Order Traversing(Left, Root, Right)
	public void InOrder(Node n) {
		if (n != null) {
			InOrder(n.getLeft());
			System.out.println(n.getData());
			InOrder(n.getRight());
		}
	}

	//Pre-Order Traversing(Root, Left, Right)
	public void PreOrder(Node n) {
		if(n !=null) {
			System.out.println(n.getData());
			PreOrder(n.getLeft());
			PreOrder(n.getRight());
		}
	}
	
	//Post-Order Traversing(Left, Right, Root)
	public void PostOrder(Node n) {
		if(n != null) {
			PostOrder(n.getLeft());
			PostOrder(n.getRight());
			System.out.println(n.getData());
		}
	}
	

}
