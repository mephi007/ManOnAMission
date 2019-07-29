
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
	
	//to check whether the stack is empty or not
	public boolean isEmpty()
	{
		boolean flag = false;
		if(top == 0)
		{
			System.out.println("Stack is empty");
			flag = true;
		}
		
		return flag;
	}
	
	//to view all the element of the stack
	public void viewStack()
	{
		if(isEmpty());
		else {
			for(int i= top; i>0; i--)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	//to check whether the stack is OverFlow/full
	public boolean overFlow()
	{
		boolean flag = false;
		if(top == size-1)
		{
			System.out.println("Stack OverFlow");
			flag = true;
		}
		return flag;
	}
	
	//to push/insert element into the stack
	public void push(int data)
	{
		if(overFlow()) {
			System.out.println("Sorry, cannot push element into stack");
		}
		else {
			top = top+1;
			arr[top] = data;
		}
	}
	
	
	
	

}
