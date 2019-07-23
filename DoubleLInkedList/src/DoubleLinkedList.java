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
		Node curr = start;
		Node next;
		next = null;
		while( curr  != null)
		{
			next = curr.getNext();
			curr.setNext(curr.getPrev());
			curr.setPrev(next);
			curr = curr.getNext();
		}
		if(next != null)
			start = next.getPrev();

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
}
