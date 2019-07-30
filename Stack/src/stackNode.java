
public class stackNode {
	
	private stackNode next;
	private int data;
		
	public stackNode()
	{
		next = null;
		data =0;
	}
	
	public stackNode(stackNode n, int x)
	{
		next = n;
		data =x;
	}

	public stackNode getNext() {
		return next;
	}

	public void setNext(stackNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
