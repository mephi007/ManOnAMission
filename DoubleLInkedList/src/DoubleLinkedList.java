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

}
