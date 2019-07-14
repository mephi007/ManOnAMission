import java.util.LinkedList;

public class List {

	private int size;
	private Node start;

	// constructor
	public List() {
		this.size = 0;
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
	public int listSize() {
		return size;
	}

	// to view all the elements of the list
	public void viewList() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node t = start;
			for (int i = 1; i <= size; i++) {
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
		size++; // incrementing the size

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
			size++; // incrementing the list
		}
	}

	// Insertion at the position
	public void insertAtPos(int val, int pos) {
		if (pos == 1) // inserting at beginning
			insertAtFirst(val);
		else if (pos == size + 1) // inserting at the end
			insertAtLast(val);
		else if (pos > 0 && pos <= size) // given postiton is between beginning and the last
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
			size++; // incrementing the size
		}
	}

}
