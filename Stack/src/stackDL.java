
public class stackDL {

	stackDLNode top;
	stackDLNode mid;
	static int size;

	public stackDL() {
		top = null;
		mid = null;
		size = 0;
	}

	// empty
	public boolean isEmpty() {
		boolean flag = false;
		if (top == null) {
			System.out.println("stack is empty");
			flag = true;
		}

		return flag;
	}

	// push
	public void push(int x) {
		stackDLNode n = new stackDLNode();
		n.setData(x);
		if (isEmpty()) {
			top = n;
		} else {
			stackDLNode temp = top;
			top = n;
			n.setNext(temp);
			temp.setPrev(n);
		}
		size++;
		if (size == 1) {
			mid = n;
		} else {
			if (size % 2 == 0) {
				mid = mid.getPrev();
			}
		}
	}

	// size
	public int Size() {
		return size;
	}

	// peek
	public void peek() {
		if (isEmpty())
			;
		else
			System.out.println(top.getData());
	}

	// pop
	public void pop() {
		if (size == 1) {
			top = null;
		} else {
			top = top.getNext();
			top.setPrev(null);
		}
		size--;
	}

	// FindMiddle
	public stackDLNode middle() {
		if (top == null) {
			System.out.println("stack is already empty");
			return null;
		} else {
			return mid;
		}
	}

	// delete middle
	public void deleteMid() {
		if (size == 1 || size == 2) {
			top = null;
			size--;
		} else if (size == 0)
			return;
		else {
			stackDLNode temp = mid.getPrev();
			temp.setNext(mid.getNext());
			mid.getNext().setNext(temp);
			size--;
		}
	}

}
