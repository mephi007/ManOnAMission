
public class stackLL {

	stackNode top;

	public stackLL() {
		top = null;
	}

	// empty or not
	public boolean isEmpty() {
		boolean flag = false;
		if (top == null) {
			System.out.println("the stack is empty");
			flag = true;
		}
		return flag;
	}

	// push
	public void push(int x) {
		stackNode n = new stackNode();
		n.setData(x);
		n.setNext(top);
		top = n;
	}
	
	//peek
	public int peek()
	{
		return top.getData();
	}

}
