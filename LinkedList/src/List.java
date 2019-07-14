import java.util.LinkedList;

public class List {

	private int size;
	private Node start;

	// constructor
	public List() {
		this.size = 0;
		this.start = null;
	}

	public boolean isEmpty() {
		if (this.start == null) {
			return true;
		}
		return false;
	}

	public int listSize() {
		return size;
	}

	public void viewList() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node t = start;
			for (int i = 1; i <= size; i++) {
				System.out.println(t.getData() + " ");
				t = t.getNext();
			}
		}
	}

}
