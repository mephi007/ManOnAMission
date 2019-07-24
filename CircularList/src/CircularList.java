
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

}
