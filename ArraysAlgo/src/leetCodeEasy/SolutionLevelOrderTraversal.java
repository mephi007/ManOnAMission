package leetCodeEasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	class Tree{
		TreeNode root;
		public void insert(int value) {
			if(root == null)
				root = new TreeNode(value); 
			else {
				Queue<TreeNode> q = new LinkedList<>();
				q.add(root);
				while(!q.isEmpty()) {
					TreeNode temp = q.poll();
					if(temp.left == null) {
						temp.left = new TreeNode(value);
						break;
					}
					else q.add(temp.left);
					if(temp.right == null) {
						temp.right = new TreeNode(value);
						break;
					}else q.add(temp.right);
				}
			}
		}
		
		public void LevelOrder() {
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()) {
				TreeNode temp = q.poll();
				System.out.println(temp.val);
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
			}
		}
		
		public List<List<Integer>> levelOrder() {

	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        if(root == null) return res;
	        Queue<TreeNode> q = new LinkedList<>();
	        q.add(root);
	        while(!q.isEmpty()){
	        	List<Integer> array = new ArrayList<>();
	            int size = q.size();
	            for(int i=0; i<size; i++) {
	            	TreeNode temp = q.poll();
	            	if(temp.left != null) q.add(temp.left);
	            	if(temp.right != null) q.add(temp.right);
	            	array.add(temp.val);
	            }
	            res.add(array);
	        }
	        return res;
	    }
		
		public List<Double> AvgLevelOrder() {
        List<Double> res = new ArrayList<Double>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
        	List<Integer> array = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++) {
            	TreeNode temp = q.poll();
            	if(temp.left != null) q.add(temp.left);
            	if(temp.right != null) q.add(temp.right);
            	array.add(temp.val);
            }

            long sum = 0;
            for(int i : array) {
            	sum += i;
            }
            double avg = (double) sum/array.size();
            res.add(avg);
        }
        return res;
    }
	}
	public class SolutionLevelOrderTraversal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree obj = new Tree();
		//[2147483647,2147483647,2147483647]

		obj.insert(2147483647);
		obj.insert(2147483647);
		obj.insert(2147483647);
//		obj.insert(15);
//		obj.insert(7);
		obj.LevelOrder();
		System.out.println(obj.levelOrder());
		System.out.println("---------------");
		System.out.println(obj.AvgLevelOrder());
	}

}
