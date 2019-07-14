import java.util.LinkedList;

public class List {
	
	private int size;
	private Node start;
	
	//constructor
	public List()
	{
		this.size = 0;
		this.start = null;
	}
	
	public boolean isEmpty()
	{
		if(this.start == null)
		{
			return true;
		}
		return false;
	}
	

}
