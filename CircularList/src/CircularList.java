
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
			n=1;
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

}
