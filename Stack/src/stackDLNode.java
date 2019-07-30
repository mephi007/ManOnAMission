
public class stackDLNode {
	private stackDLNode next;
	private stackDLNode prev;
	private int data;
	
	public stackDLNode()
	{
		next = null;
		prev = null;
		data=0;
	}

	public stackDLNode getNext() {
		return next;
	}

	public void setNext(stackDLNode next) {
		this.next = next;
	}

	public stackDLNode getPrev() {
		return prev;
	}

	public void setPrev(stackDLNode prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
