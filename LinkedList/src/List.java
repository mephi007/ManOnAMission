import java.util.HashSet;
import java.util.LinkedList;

public class List {

	//private int size;
	private Node start;

	// constructor
	public List() {
		//this.size = 0;
		this.start = null;
	}

	// to check if the list is empty or not
	public boolean isEmpty() {
		if (this.start == null) {
			return true;
		}
		return false;
	}

	// to get the size of the list
//	public int listSize() {
//		return size;
//	}

	// to view all the elements of the list
	public void viewList() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node t = start;
			for (int i = 1; i <= Size(); i++) {
				System.out.println(t.getData() + " ");
				t = t.getNext();
			}
		}
	}
	
	public void viewList(List list) {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node t = start;
			for (int i = 1; i <= Size(); i++) {
				System.out.println(t.getData() + " ");
				t = t.getNext();
			}
		}
	}
	

	// Insertions

	// Insertion at First
	public void insertAtFirst(int val) {
		Node n = new Node(); // new node object created
		n.setData(val); // inserting the new value in the node object
		n.setNext(start); // setting the next of new node object as start
		start = n; // setting the start as the ref of the new node object
		//size++; // incrementing the size

	}

	// Insertion at the end
	public void insertAtLast(int val) {
		Node n, t;
		n = new Node(); // new node object created
		n.setData(val); // inserting the new value in the node object
		n.setNext(null); // setting the next of the new node object as null as it will be last node
		// check if the list is empty
		if (isEmpty()) {
			start = n;
		} else {
			t = start; // taking the ref of the first node to do operation in loop
			while (t.getNext() != null) // loop till the second last node, (!=null) check as the last node next will
										// have next and have to stop there.
			{
				t = t.getNext(); // storing the ref of the last node
			}
			t.setNext(n); // storing the next of the last node
			//size++; // incrementing the list
		}
	}

	// Insertion at the position
	public void insertAtPos(int val, int pos) {
		if (pos == 1) // inserting at beginning
			insertAtFirst(val);
		else if (pos == Size() + 1) // inserting at the end
			insertAtLast(val);
		else if (pos > 0 && pos <= Size()) // given postiton is between beginning and the last
		{
			Node n, t;
			n = new Node(); // new node object created
			n.setData(val); // setting the value into new node object
			t = start; // temp ref
			for (int i = 1; i < pos - 1; i++) // loop till the second to the postion
			{
				t = t.getNext(); // storing ref of the node which the second to the position
			}
			n.setNext(t.getNext()); // setting the ref of the position into the new node object
			t.setNext(n); // setting the ref of
			//size++; // incrementing the size
		}
	}
	
	//Deletion
	
	//Deletion at First
	public void deleteAtFirst()
	{
		if(isEmpty())			//checking if the list is already empty or not
		{
			System.out.println("List is already empty");
		}
		else {
			start = start.getNext();		//setting the ref of the second node to the start
			//size--;					//decrementing the size;
		}
	}
	
	//Deletion at end
	public void deleteAtEnd()
	{
		if(Size() > 1)		//checking the size of the list
		{
			Node t = start;
			for(int i=1; i<Size()-1;i++)
			{
				t = t.getNext();
			}
			t.setNext(null);
			//size--;
		}
		else if(Size() == 1)  //if the size is 1
		{
			start = null;
			//size--;
		}
		else
		{
			System.out.println("List is already empty");
		}
	}
	
	//Deletion at given position
	public void deleteAtPos(int pos)
	{
		if(start==null)
		{
			System.out.println("List is already empty");
		}
		else if (pos == 1) // inserting at beginning
			deleteAtFirst();
		else if (pos == Size() + 1) // inserting at the end
			deleteAtEnd();
		else 
		{
			Node t = start;
			for(int i =1; i<pos-1; i++)
			{
				t = t.getNext();
			}
			Node t1 = t.getNext();
			t.setNext(t1.getNext());
			//size--;
		}
	}
	
	//delete whole linked list
	public void deleteList()
	{
		if(start == null)
		{
			System.out.println("list is already empty");
		}
		else
		{
			start = null;
			System.out.println("list has been deleted");
		}
	}
	
	//count size of the linked list
	public int Size()
	{
		int s = 1;
		if(start == null )
		{
			return 0;
		}
		else
		{
			Node t;
			t = start;
			while(t.getNext() != null)
			{
				t = t.getNext();
				s++;
			}
			return s;
		}
	}
	
	// Search
	public boolean Search(int val) {

		Node t = start;
		while (t.getNext() != null) {
			if (val == t.getData()) {
				return true;
			}

			t = t.getNext();
		}
		return false;
	}
	
	//Get Nth data in the linked List
	public int getNth(int pos)
	{
		Node t = start;
		for(int i =1; i<pos; i++)
		{
			t = t.getNext();
		}
		return t.getData();
	}
	
	//Nth data from the end in the linked list
	public int getNthfromLast(int pos)
	{
		pos = Size() - pos;
		Node t = start;
		for(int i=1; i<=pos; i++)
		{
			t= t.getNext();
		}
		return t.getData();
	}
	
	//to get the middleNode
	public Node getMiddleNode()
	{
		Node slow, fast;
		slow = fast = start;
		while(fast.getNext() != null)
		{
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		return slow;
	}
	
	//to count occurence of the given value
	public int countOccur(int val)
	{
		Node t = start;
		int count=0;
		while(t != null)
		{
			if(t.getData() == val)
			{
				count++;
			}
			t=t.getNext();
		}
		
		return count;
	}
	
	//to detect if looping there in linked list or not
	public boolean detectLoop()
	{
		HashSet<Node> s = new HashSet<>();
		Node t = start;
		while(t.getNext() != null)
		{
			if(s.contains(t.getNext()))
			{
				return true;
			}
			s.add(t.getNext());
			t = t.getNext();
		}
		return false;
	}
	
	//create loop in a linked list
	public void createLoop(int pos)
	{
		if(pos > Size())
		{
			System.out.println("List is smaller than position");
		}
		else {
			Node tPos = start;
			for(int i =1; i<pos-1; i++)
			{
				tPos = tPos.getNext();
			}
			Node tLast = tPos.getNext();
			while(tLast.getNext() != null)
			{
				tLast = tLast.getNext();
			}
			
			tLast.setNext(tPos.getNext());
		}
	}
	
	//to detect loop, Floyd's Cycle-Finding Algorithm
	public boolean FlCycFinding()
	{
		Node slow, fast;
		slow = fast = start;
		while(fast.getNext() != null)
		{
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if(slow == fast)
			{
				//detectandcountLoop(slow.getNext());
				return true;
			}
				
		}
		return false;
	}
	
	//count elements in the loop
	public boolean detectandcountLoop()
	{
		
		Node slow, fast;
		slow = fast = start;
		while(fast.getNext() != null)
		{
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if(slow == fast)
			{
				int count =1;
				Node temp = slow;
				while(temp.getNext() != slow)
				{
					count++;
					temp = temp.getNext();
				}
				System.out.println(count);
				return true;
			}
				
		}
		return false;
	}
	
	//delete the duplicates in a sorted linked list
	public void deleteduplicatesSorted()
	{
		Node curr, nxt;
		curr =start;
		nxt = start.getNext();
		while(nxt != null)
		{
			
			if(curr.getData() == nxt.getData())
			{
				Node temp = nxt.getNext();
				nxt = nxt.getNext();
				curr.setNext(temp);
			}
			else {
				curr = curr.getNext();
				nxt = nxt.getNext();
			}
		}
	}
	
	//delete the duplicates in a unsorted linked list
	public void deleteduplicatesUnSorted()
	{
		HashSet<Integer> s = new HashSet<>();
		Node t ,pt;
		t = start;
		pt = null;
		while(t != null)
		{
			if(s.contains(t.getData()))
			{
				pt.setNext(t.getNext());
				t = pt;
			}
			else {
				s.add(t.getData());
				pt =t;
				
			}
			t = t.getNext();
		}
	}
	
	//swap Node
	public void SwapNode(int x, int y)
	{
		Node p = start;
		Node prev = null;
		while(p!=null && p.getData() != x)
		{
			prev = p;
			p=p.getNext();
		}
		Node px = p;
		Node prevX = prev;
		 
		p = start;
		prev = null;
		
		while(p != null && p.getData() != y)
		{
			prev = p;
			p = p.getNext();
		}
		Node py = p;
		Node prevY = prev;
		
		Node temp = py.getNext();
		py.setNext(px.getNext());
		px.setNext(temp);
		if(prevX == null)
		{
			start = py;
			prevY.setNext(px);
		}
		if(prevY == null)
		{
			px = start;
			prevX.setNext(prevY);
		}
		if(prevX != null && prevY != null)
		{
			prevX.setNext(py);
			prevY.setNext(px);
		}
	}
	
	//Move last element to Front
	public void moveLastToFront()
	{
		Node t = start;
		Node prev = null;
		while(t.getNext() != null)
		{
			prev = t;
			t = t.getNext();
		}
		prev.setNext(null);
		t.setNext(start);
		start = t;
	}
	
	//pairiwse sawp
	public void pairWiseSwap()
	{	
		Node q,temp;
		Node p = start;
		Node new_start = start.getNext();
		while(true)
		{
			q = p.getNext();
			temp = q.getNext();
			q.setNext(p);
			if(temp == null || temp.getNext() == null)
			{
				p.setNext(null);
				break;
			}
			p.setNext(temp.getNext());
			p =temp;
			
		}
		start = new_start;
		
	}
	
	
	
	public void IntersectList(List list1,List list2)
	{
		Node p = list1.start;
		Node q = list2.start;
		int count =1;
		while(p != null && q != null)
		{
			if(p.getData() == q.getData())
			{
				insertAtPos(p.getData(), count);
				count++;
				p = p.getNext();
				q = q.getNext();
			}
			else if(p.getData() < q.getData())
			{
				p = p.getNext();
			}
			else q = q.getNext();
		}
	}
	
}
