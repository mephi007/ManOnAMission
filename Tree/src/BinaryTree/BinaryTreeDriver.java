package BinaryTree;

public class BinaryTreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation bt = new Operation();
		
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		System.out.println(bt.root.getData());
		System.out.println("-----------In Order Traversing---------------");
		bt.InOrder(bt.root);
		System.out.println("-----------Pre Order Traversing---------------");
		bt.PreOrder(bt.root);
		System.out.println("-----------Post Order Traversing---------------");
		bt.PostOrder(bt.root);

	}

}
