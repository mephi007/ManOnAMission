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
		System.out.println("-----------Level Order Traversing---------------");
		bt.LevelOrder();
		System.out.println("--------------------------------------");
		Operation bt1 = new Operation();
		bt1.insert(5);
		bt1.insert(8);
		bt1.insert(9);
		bt1.LevelOrder();
		System.out.println("---------right most node-----------");
		System.out.println(bt.rightMost(bt.root).getData());
		System.out.println("----------delete root-----------");
		bt.deleteNode(5);
		bt.LevelOrder();
		System.out.println("---------Printing leaf of the Tree------------");
		bt.printLeaf(bt.root);
		System.out.println("---------------");
		bt1.printLeaf(bt1.root);
		System.out.println("-----printing leaf--------");
		bt.printKDist(bt.root, 1);
//		System.out.println("-------continous tree or not----------");
//		bt.contTree();
		System.out.println("----------Iterative InOrder------------");
		bt.IterativeInOrder();
		System.out.println("----------Iterative PreOrder------------");
		bt.IterativePreOrder();
		System.out.println("----------Iterative PostOrder------------");
		bt.IterativePostOrder();
	}

}
