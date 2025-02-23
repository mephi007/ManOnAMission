
public class CircularList {
	
	private Node start;
	
	public CircularList()
	{
		this.start = null;
	}
	
	//check if list is empty
	public boolean isEmpty()
	{
		boolean flag = false;
		if(this.start == null) {
			System.out.println("list is empty");
			flag = true;
			}
		return flag;			
	}
	
	//method to find the size of the list
	public int Size()
	{
		int n =0;
		if(start == null)
			n = 0;
		else {
			Node t = start;
			do {
				n++;
				t = t.getNext();
			}while(t != start);
		}
		
		return n;
	}
	
	//method to view the nodes of the list
	public void viewList()
	{
		Node t = start;
		if(start == null)
		{
			System.out.println(" list is empty ");
		}
		else
		{
			do {
				System.out.println(t.getData());
				t = t.getNext();
			}while( t != start);
		}
	}
	
	//method to insert node in the beginning
	public void insertAtFirst(int data) {
		Node n = new Node();
		n.setData(data);
		if(start == null)
		{
			start = n;
			start.setNext(n);
		}
		else {
			Node t = start;
			while( t.getNext() != start)
			{
				t = t.getNext();
			}
			Node temp = start;
			n.setNext(temp);
			start = n;
			t.setNext(n);
		}
	}
	
	//method to insert at ending
	public void insertAtLast(int data)
	{
		Node n = new Node();
		n.setData(data);
		if(start == null)
		{
			start = n;
			start.setNext(n);
		}
		else if(Size() == 1)
		{
			Node temp = start;
			temp.setNext(n);
			n.setNext(temp);
		}
		else {
			Node t = start;
			while(t.getNext() != start)
			{
				t =t.getNext();
			}
			t.setNext(n);
			n.setNext(start);
		}
	}
	
	//method to insert at pos
	public void insertAtPosAfter(int pos, int data)
	{
		if(start == null || pos == Size())
			insertAtLast(data);
		else if(pos > Size())
			System.out.println("positin given is larger than the list");
		else {
			Node n = new Node();
			n.setData(data);
			Node t = start;
			for(int i=1; i<pos; i++)
			{
				t = t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
		}
	}
	
	//delete at beginning
	public void deleteAtBeg()
	{
		if(start == null)
		{
			System.out.println("List is already empty");
		}
		else if(Size() == 1)
		{
			start = null;
		}
		else {
			Node temp = start.getNext();
			Node t = start;
			while(t.getNext() != start)
				t = t.getNext();
			t.setNext(temp);
			start = temp;
		}
	}
	
	//delete at the last
	public void deleteAtLast()
	{
		if(start == null)
			System.out.println("List is already empty");
		else if(Size() == 1)
			start = null;
		else {
			Node t = start;
			Node prev = null;
			while(t.getNext() != start)
			{
				prev = t;
				t = t.getNext();
			}
			prev.setNext(t.getNext());
		}
	}
	
	//delete at the given position
	public void deleteAtPos(int pos)
	{
		if(start == null)
			System.out.println("List is already empty");
		else if(Size() == 1 && pos == 1)
		{
			start = null;
		}
		else if(pos > Size())
			System.out.println("the given position is greater than last");
		else if(pos == 1)
			deleteAtBeg();
		else if(pos == Size())
			deleteAtLast();
		else {
			Node t = start;
			Node prev = null;
			for(int i=1; i<pos; i++)
			{
				prev = t;
				t=t.getNext();
			}
			prev.setNext(t.getNext());
		}
	}
	
	//delete list
	public void deleteList()
	{
		if(start == null)
			System.out.println("List is already empty");
		else 
			start = null;
	}

}
