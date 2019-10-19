package leetCodeEasy;

import java.awt.List;

class Node{
	int data;
	Node next;
	public Node(int x) {
		data = x;
		next = null;
	}
}

class operation{
	Node start;
	
	public void push(int x) {
		Node n = new Node(x);
		n.next = start;
		start = n;
	}
	
	public boolean isEmpty() {
		if (this.start == null) {
			return true;
		}
		return false;
	}
	
	public void viewList() {
		Node t= start;
		while(t != null) {
			System.out.println(t.data);
			t = t.next;
		}
	}
	public Node removeDup() {
		Node curr = start;
		while(curr != null) {
			Node temp = curr;
			while(temp != null && temp.data ==curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
		return start;
	}
}

public class RemoveDupFromList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation list = new operation();
//		list.push(3);
//		list.push(3);
		list.push(2);
		list.push(1);
		list.push(1);
		list.viewList();
		list.removeDup();
		System.out.println("---------remove duplicate---------");
		list.viewList();
	}

}
