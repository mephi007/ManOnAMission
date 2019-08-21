package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

	// Pre-Order Traversing(Root, Left, Right)
	public void PreOrder(Node n) {
		if (n != null) {
			System.out.println(n.getData());
			PreOrder(n.getLeft());
			PreOrder(n.getRight());
		}
	}

	// Post-Order Traversing(Left, Right, Root)
	public void PostOrder(Node n) {
		if (n != null) {
			PostOrder(n.getLeft());
			PostOrder(n.getRight());
			System.out.println(n.getData());
		}
	}

	// Breadth-First Traversal
	public void LevelOrder() {
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.remove();
			System.out.println(n.getData());
			if (n.getLeft() != null) {
				q.add(n.getLeft());
			}
				if (n.getRight() != null) {
					q.add(n.getRight());
				}
			}
		}
	

	// LevelOrder Traversal Insertion
	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
		} else {
			Queue<Node> que = new LinkedList<Node>();
			que.add(root);

			while (!que.isEmpty()) {
				Node temp = que.remove();
				if (temp.getLeft() == null) {
					temp.setLeft(new Node(value));
					break;
				} else
					que.add(temp.getLeft());
				if (temp.getRight() == null) {
					temp.setRight(new Node(value));
					break;
				} else
					que.add(temp.getRight());
			}
		}
	}

	// find the rightMost Node
	public Node rightMost(Node r) {
		Queue<Node> que = new LinkedList<Node>();
		que.add(r);
		while (!que.isEmpty()) {
			Node temp = que.remove();
			if (temp.getRight().getRight() == null) {
//				temp.setRight(null);
				return temp;
			} else
				que.add(temp.getRight());
		}
		return null;
	}

	// delete node
	public void deleteNode(int val) {
		Queue<Node> que = new LinkedList<Node>();
		Node temp = null;
		Node left = null;
		Node right = null;
		Node replacingNode = rightMost(this.root);

		if (root == null)
			return;

		if (root.getData() == val) {
			left = root.getLeft();
			right = root.getRight();
			replacingNode.getRight().setLeft(left);
			replacingNode.getRight().setRight(right);
			this.root = replacingNode.getRight();
			replacingNode.setRight(null);
		}
		else que.add(root);
		
		while(!que.isEmpty())
		{
			temp = que.remove();
			if(temp.getLeft() != null) {
				if(temp.getLeft().getData() == val) {
					left = temp.getLeft().getLeft();
					right = temp.getLeft().getRight();
					replacingNode.getRight().setLeft(left);
					replacingNode.getRight().setRight(right);
					temp.setLeft(replacingNode.getRight());
					replacingNode.setRight(null);
					break;
				}
			}else que.add(temp.getLeft());
			if(temp.getRight() != null) {
				if(temp.getRight().getData() == val) {
					left = temp.getRight().getLeft();
					if(temp.getRight().getRight().getData() != replacingNode.getRight().getData()) {
						right = temp.getRight().getRight();
					}
					replacingNode.getRight().setLeft(left);
					replacingNode.getRight().setRight(right);
					temp.setRight(replacingNode.getRight());
					replacingNode.setRight(null);
					break;
				}
			}else que.add(temp.getRight());
			
			delLeaf(temp, val);
			
		}
	}
	
	private Node delLeaf(Node cur, int value) {
		if(cur == null)
			return null;
		
		cur.setLeft(delLeaf(cur.getLeft(), value));
		cur.setRight(delLeaf(cur.getRight(), value));
		
		if(cur.getLeft() == null && cur.getRight() == null && cur.getData() == value)
			return null;
		
		return cur;
	}
	
	public void printLeaf(Node cur) {
		if(cur == null)
			return;
		
		printLeaf(cur.getLeft());
		printLeaf(cur.getRight());
		
		if(cur.getLeft() == null && cur.getRight() == null)
			System.out.println(cur.getData());
		
	}
	
	public void printKDist(Node n, int k) {
		if(n == null) {
			return;
		}
		if(k == 0) {
			System.out.println(n.getData());
			return;
		}
		else {
			printKDist(n.getLeft(), k-1);
			printKDist(n.getRight(), k-1);
		}
	}
	
	public void contTree() {
		if(contTree(root) == 1) {
			System.out.println("NO");
		}
		else System.out.println("YES");
	}
	
	private int contTree(Node cur) {
		if(cur == null) {
			return cur.getData();
		}
		
		if(Math.abs(cur.getData() - contTree(cur.getLeft())) != 1) {
			return 0;
		}
		
		if(Math.abs(cur.getData() - contTree(cur.getRight())) != 1) {
			return 0;
		}
		
		return 1;
	}
	
	public void IterativeInOrder() {
		Node p = root;
		Stack<Node> st = new Stack<Node>();
		while(true) {
			while(p!=null) {
				st.push(p);
				p = p.getLeft();
			}
			if(st.isEmpty())
				break;
			
			p = st.pop();
			System.out.println(p.getData());
			p = p.getRight();
		}
	}
	
	public void IterativePreOrder() {
		Node p = root;
		Stack<Node> st = new Stack<Node>();
		while(true) {
			while(p != null) {
				System.out.println(p.getData());
				st.push(p);
				p = p.getLeft();
			}
			if(st.isEmpty())
				break;
			
			p = st.pop();
			p = p.getRight();
		}
	}

	

}
