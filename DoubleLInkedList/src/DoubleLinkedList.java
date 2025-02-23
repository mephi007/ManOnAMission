import java.util.HashSet;

public class DoubleLinkedList {
	Node start;

	public DoubleLinkedList() {
		this.start = null;
	}

	// to check if the list if empty
	public boolean isEmpty() {
		if (start == null) {
			System.out.println("list is empty");
			return true;
		}
		return false;
	}

	// method to check the size of the list
	public int Size() {
		int count = 0;
		if (start == null)
			count = 0;
		else {
			count = 1;
			Node t = start;
			while (t.getNext() != null) {
				t = t.getNext();
				count++;
			}
		}
		return count;
	}

	// method to view the element of the list
	public void viewList() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node t = start;
			for (int i = 1; i <= Size(); i++) {
				System.out.println(t.getData());
				t = t.getNext();
			}
		}

	}

	// method to insert node at first
	public void insertAtFirst(int data) {
		Node n = new Node();
		n.setData(data);
		n.setNext(null);
		n.setPrev(null);
		// case 1 when list is empty
		if (start == null) {
			start = n;
		}
		// case 2 when list is not empty
		else {
			start.setPrev(n);
			n.setNext(start);
			start = n;
		}
	}

	// method to insert node at Last
	public void insertAtLast(int data) {
		Node n, t;
		n = new Node();
		n.setData(data);
		n.setNext(null);
		if (isEmpty()) {
			start = n;
			n.setPrev(null);
		} else {
			t = start;
			while (t.getNext() != null) {
				t = t.getNext();
			}
			t.setNext(n);
			n.setPrev(t);
		}

	}

	// method to insert node at after the given position
	public void insertAtposAfter(int data, int pos) {
		if (Size() == 0) {
			System.out.println("list is already empty, inserting at first");
			insertAtFirst(data);
		} else if (pos > Size()) {
			System.out.println("given postion is greater than the size");
		} else if (pos == Size()) {
			insertAtLast(data);
		} else {
			Node n, t;
			n = new Node();
			n.setData(data);
			t = start;
			for (int i = 1; i < pos; i++) {
				t = t.getNext();
			}
			n.setNext(t.getNext());
			n.setPrev(t);
			t.setNext(n);
		}
	}

	// method to insert node at after the given position
	public void insertAtposBefore(int data, int pos) {
		if (Size() == 0) {
			System.out.println("list is already empty, inserting at first");
			insertAtFirst(data);
		} else if (pos > Size()) {
			System.out.println("given postion is greater than the size");
		} else if (pos == Size()) {
			insertAtLast(data);
		} else {
			Node n, t;
			n = new Node();
			n.setData(data);
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
			}
			n.setNext(t.getNext());
			n.setPrev(t);
			t.setNext(n);
		}
	}
	
	//method to delete node at first
	public void deleteAtFirst()
	{
		if(Size() == 0)
		{
			System.out.println("list is already empty");
		}
		else if(Size() == 1)
		{
			start = null;
		}
		else {
			Node t = start.getNext();
			start = t;
		}
	}
	
	//method to delete node at last
	public void deleteAtLast()
	{
		if(Size() == 0)
		{
			System.out.println("list is already empty");
		}
		else if(Size() == 1)
		{
			start = null;
		}
		else {
			Node t = start;
			for(int i=1; i< Size()-1; i++)
			{
				t = t.getNext();
			}
			t.setNext(null);
		}
	}
	
	//method to delete node at given position
	public void deleteAtPos(int pos)
	{
		if(Size() == 0)
		{
			System.out.println("list is already empty");
		}
		else if(pos < 1)
		{
			System.out.println("invalid position");
		}
		else if(Size() == 1)
		{
			start = null;
		}
		else if(pos == Size())
		{
			deleteAtLast();
		}
		else if(pos == 1)
		{
			deleteAtFirst();
		}
		else
		{
			Node t = start;
			for(int i=1; i< pos-1; i++)
			{
				t = t.getNext();
			}
			Node beyond = t.getNext().getNext();
			t.setNext(beyond);
			beyond.setPrev(t);
		}
	}
	
	//method to reverse the list
	public void reverse()
	{
		Node t = start, temp = null;
		while(t != null)
		{
			temp = t.getPrev();
			t.setPrev(t.getNext());
			t.setNext(temp);
			t = t.getPrev();
		}
		if(temp != null)
			start = temp.getPrev();

	}
	
	//delete list
	public void deleteList()
	{
		if(start == null)
		{
			System.out.println("already empty");
		}
		else {
			start = null;
			System.out.println("deleted list");
		}
	}
	
	//sum pair
	public void sumPair(int sum)
	{
		Node first, second;
		first = start;
		second = start;
		while( second.getNext() != null)
			second = second.getNext();
		
		while(second != first)
		{
			int add = first.getData() + second.getData();
			if(add == sum)
			{
				System.out.println("sum found at "+first.getData()+"  "+second.getData());
				first = first.getNext();
				second = second.getPrev();
			}
			else if(add < sum)
			{
				first = first.getNext();
			}
			else second = second.getPrev();
				
		}
	}
	
	//insert in a sorted position in a sorted list
	public void insertSort(int data)
	{
		Node t,n;
		t = start;
		n = new Node();
		n.setData(data);
		while(t.getNext() != null)
		{
		if(data > t.getData() && data < t.getNext().getData())
		{
			Node temp = t.getNext();
			t.setNext(n);
			n.setPrev(t);
			n.setNext(temp);
			temp.setPrev(n);
			break;			
		}
		t = t.getNext();
		}
	}
	
	//swap kth node from beginning and from the last
	public void swapKthNode(int k)
	{
		if(Size() < k)
		{
			return;
		}
		if(2*k-1 == Size())
			return;
		Node x = start;
		Node x_prev = null;
		for(int i = 1; i<k; i++)
		{
			x_prev = x;
			x = x.getNext();
		}
		Node y = start;
		Node y_prev = null;
		for(int i =1; i<Size()-k+1; i++)
		{
			y_prev = y;
			y = y.getNext();
		}
		if(x_prev != null)
			x_prev.setNext(y);
		if(y_prev != null)
			y_prev.setNext(x);
		
		Node temp = x.getNext();
		x.setNext(y.getNext());
		y.setNext(temp);
		
		if(k==1) start = y;
		if(k == Size()) start = x;
		
	}
	
	//remove duplicate from list
	public void removeDuplicate()
	{
		Node t = start;
		while(t.getNext() != null)
		{
			if(t.getData() == t.getNext().getData())
			{
				Node temp = t.getNext();
				deleteNode(temp);
				
			}
			else t = t.getNext();
		}
	}

	private void deleteNode(Node del) {
		if(start == null || del == null)
			return;
		if(start == del)
			start = del.getNext();
		if(del.getNext() != null)
			del.getNext().setPrev(del.getPrev());
		if(del.getPrev() != null)
			del.getPrev().setNext(del.getNext());
	}
	
	//delete all Occurance of a given key
	public void deleteAllOccur(int x)
	{
		Node t = start;
		while(t != null)
		{
			if(t.getData() == x)
			{
				if(t.getPrev() == null)
				{
					start = t.getNext();
					t.getNext().setPrev(null);
				}
				if(t.getNext() == null)
				{	
					t.getPrev().setNext(null);
				}
				if(t.getPrev() != null && t.getNext() != null)
				{
					Node temp = t.getPrev();
					t.getNext().setPrev(temp);
					temp.setNext(t.getNext());
				}
				
			}
			 t = t.getNext();
		}
	}
	
	//remove duplicate from an unsorted dll
	public void removeDupUnSorted()
	{
		Node t = start;
		HashSet<Integer> s = new HashSet<>();
		while(t != null)
		{
			if(s.contains(t.getData()))
			{
				if(t.getPrev() == null)
				{
					start = t.getNext();
					t.getNext().setPrev(null);
				}
				if(t.getNext() == null)
				{
					t.getPrev().setNext(null);
				}
				if(t.getPrev() != null && t.getNext() != null)
				{
					Node temp = t.getPrev();
					t.getNext().setPrev(temp);
					temp.setNext(t.getNext());
				}
			}
			else s.add(t.getData());
			
			t = t.getNext();
		}
	}
	
	//rotate dll by N nodes
	public void rotateByN(int n)
	{
		Node t=start, temp = start;
		for(int i=1; i<n; i++)
		{
			t = t.getNext();
		}
		start = t.getNext();
		t.getNext().setPrev(null);
		t.setNext(null);
		t = start;
		while(t.getNext() != null)
		{
			t = t.getNext();
		}
		t.setNext(temp);
		temp.setPrev(t);
	}
	
}
