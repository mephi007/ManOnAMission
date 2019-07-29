
public class stackArr {
	
	private int top;
	private int size;
	private  int arr[];
	
	public stackArr(int s) {
		// TODO Auto-generated constructor stub
		this.size = s;
		 arr = new int[this.size];
		 top = 0;
	}
	
	public boolean isEmpty()
	{
		boolean flag = false;
		if(top <= 0)
		{
			System.out.println("Stack is empty");
			flag = true;
		}
		
		return flag;
	}

}
