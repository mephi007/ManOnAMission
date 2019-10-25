package leetCodeEasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


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
		
		public List<List<Integer>> bottomUpTraversal() {
			Stack<TreeNode> st = new Stack<>();
	        Queue<TreeNode> q = new LinkedList<>();
	        
	        q.add(root);
	        q.add(null);
	        
	        while(!q.isEmpty()){
	            TreeNode temp = q.poll();
	            
	            if(temp == null){
	                if(!q.isEmpty()){
	                    q.add(null);
	                    st.push(null);
	                }
	            }else{
	                st.push(temp);
	                if(temp.right != null)
	                    q.add(temp.right);
	                if(temp.left != null)
	                    q.add(temp.left);
	            }
	        }
	        
	        List<Integer> sublist = new ArrayList<>();
	        List<List<Integer>> res = new ArrayList<>();
	        int i =0;
	        while(!st.empty()){
	            TreeNode temp = st.pop();
	            if(temp == null){
	                res.add(sublist);
	                sublist.remove(i++);
	            }
	            else{
	                sublist.add(temp.val);
	            }
	        }
	        
	        return res;
		}
		
		class Res{
	        public int val;
	        Res(){
	            val = Integer.MIN_VALUE;
	        }
	    }
	    public int maxPathSum(TreeNode root) {
	        if(root == null) return 0;
	        Res res = new Res();
	        helper(root, res);
	        return res.val;
	    }
	    
	    private int helper(TreeNode root, Res res){
	        if(root == null) return 0;
	        
	        int l = helper(root.left, res);
	        int r = helper(root.right, res);
	        
	        int curr = Math.max(Math.max(l,r)+root.val, root.val);
	        int max = Math.max(curr, l+r+root.val);
	        
	        res.val = Math.max(res.val, max);
	        
	        return curr;
	    }
	}
	public class SolutionLevelOrderTraversal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree obj = new Tree();
		//[2147483647,2147483647,2147483647]

		obj.insert(3);
		obj.insert(9);
		obj.insert(20);
		obj.insert(15);
		obj.insert(7);
		obj.LevelOrder();
		System.out.println(obj.levelOrder());
		System.out.println(obj.AvgLevelOrder());
		System.out.println("---------------");
		System.out.println(obj.bottomUpTraversal());
		System.out.println("---------------------------");
		System.out.println(obj.maxPathSum(obj.root));
	}
	

}
