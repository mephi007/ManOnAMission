
public class stackDL {
	
	stackDLNode top;
	static int size;
	
	public stackDL() {
		top = null;
		size=0;
	}
	
	//empty 
	public boolean isEmpty()
	{
		boolean flag = false;
		if(top == null)
		{
			System.out.println("stack is empty");
			flag = true;
		}
		
		return flag;
	}
	
	//push
	public void push(int x)
	{
		stackDLNode n = new stackDLNode();
		n.setData(x);
		if(isEmpty()) {
			top = n;
		}
		else {
		stackDLNode temp = top;
		top = n;
		n.setNext(temp);
		temp.setPrev(n);
		}
		size++;
	}
	
	//size
	public int Size()
	{
		return size;
	}
	
	//peek
	public void peek()
	{
		if(isEmpty());
		else
		System.out.println(top.getData());
	}
	
	//pop
	public void pop()
	{
		if(size == 1)
		{
			top = null;
		}
		else {
			top = top.getNext();
			top.setPrev(null);
		}
		size--;
	}

}
