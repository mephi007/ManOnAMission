public class DoubleLinkedList {
	Node start;
	
	public DoubleLinkedList()
	{
		this.start = null;
	}
	
	//to check if the list if empty
	public boolean isEmpty() {
		if(start == null)
		{
			System.out.println("list is empty");
			return true;
		}
		return false;
	}
	
	//method to check the size of the list
	public int Size()
	{
		int count = 0;
		if(start == null)
			count =0;
		else {
			count = 1;
			Node t = start;
			while(t.getNext() != null)
			{
				t = t.getNext();
				count++;
			}
		}
		return count;
	}
	
	//method to view the element of the list
	public void viewList(){
		if(isEmpty())
		{
			System.out.println("list is empty");
		}
		else {
			Node t = start;
			for(int i=1; i<=Size(); i++)
			{
				System.out.println(t.getData());
				t = t.getNext();
			}
		}
	
	}
	
	//method to insert node at first
	public void insertAtFirst(int data)
	{
		Node n = new Node();
		n.setData(data);
		n.setNext(null);
		n.setPrev(null);
	   //case 1 when list is empty
		if(start == null)
		{
			start =n;
		}
		//case 2 when list is not empty
		else {
			start.setPrev(n);
			n.setNext(start);
			start = n;
		}
			
	}

}
