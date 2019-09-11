package leetCodeResursion;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
public class AddNumberLinkedList {
	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode l3 = new ListNode(0);
	        int carry =0;
	        ListNode cur = l3;
	        while(l1 != null || l2 != null){
	            // to take of extra length
	            int x = (l1 != null) ? l1.val:0;
	            int y = (l2 != null) ? l2.val:0;
	            int sum = carry + x + y;
	            carry = sum/10;
	            cur = new ListNode(sum%10);
	            cur = cur.next;
	            if (l1 != null) l1 = l1.next;
	            if (l2 != null) l2 = l2.next;            
	        }
	        if(carry > 0){
	            cur.next = new ListNode(carry);
	        }
	        return l3;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(0);
		ListNode p = l1;
		System.out.println(l1.next);
		p.next = new ListNode(2);
		p.next = new ListNode(4);
		p.next = new ListNode(3);
		ListNode l2 = new ListNode(0);
		ListNode q = l2;
		l2.next = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next = new ListNode(4);
		
		while(l1 != null) {
			System.out.println(l1.val);
			l1 = l1.next;
		}
		
		while(l2 != null) {
			System.out.println(l2.val);
			l2 = l2.next;
		}
//		ListNode res =addTwoNumbers(l1, l2);
//		while(res != null) {
//			System.out.println(res.val);
//		}
		
	}

}

