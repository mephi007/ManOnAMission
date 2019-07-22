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
	
//	//method to insert node at first
//	public void insertAtFirst(int data)

}
