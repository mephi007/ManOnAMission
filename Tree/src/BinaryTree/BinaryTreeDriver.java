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
		
		System.out.println("-------continous tree or not----------");
		System.out.println(bt.contTree(bt.root));
		Operation bt2 = new Operation();
		bt2.add(3);
		bt2.add(2);
		bt2.add(4);
		bt2.add(1);
		bt2.add(3);
		bt2.add(5);
		System.out.println("-----------Level Order Traversing---------------");
		bt2.LevelOrder();
		System.out.println("-------continous tree or not----------");
		System.out.println(bt2.contTree(bt2.root));
		
		Operation bt3 = new Operation();
		bt3.insert(1);
		bt3.insert(2);
		bt3.insert(3);
		bt3.insert(4);
		bt3.insert(5);
		System.out.println("-----------tree before mirror----------");
		bt3.InOrder(bt3.root);
		bt3.mirror(bt3.root);
		System.out.println("-----------tree after mirror----------");
		bt3.InOrder(bt3.root);
		
		Operation bt4 = new Operation();
		bt4.add(10);
		bt4.add(7);
		bt4.add(15);
		bt4.add(5);
		bt4.add(11);
		System.out.println("------------------------");
		bt3.InOrder(bt4.root);
		System.out.println("is it foldable::::" + bt4.isFoldable(bt4.root));
	}

}
