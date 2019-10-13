package leetCodeEasy;

// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }



public class SolutionMergeSortedList {
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        
	        if(l1 == null & l2 == null)
	            return null;
	        
	        if(l1 == null)
	            return l2;
	        
	        if(l2 == null)
	            return l1;

	        ListNode result = new ListNode(0);
	        ListNode prev = result;
	        
	        while(l1 != null && l2 != null){
	            if(l1.val <= l2.val){
	                prev.next = l1;
	                l1 = l1.next;
	            }
	            else if(l1.val >= l2.val){
	                prev.next = l2;
	                l2 = l2.next;
	            }
	          prev = prev.next;
	        }
	        if (l1 != null) {
	            prev.next = l1;
	        }
	        if (l2 != null) {
	            prev.next = l2;
	        }
	        return result.next;
	        
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
