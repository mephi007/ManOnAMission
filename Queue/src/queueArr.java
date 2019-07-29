public class queueArr {

	private int front, rear, size;
	private int[] arr;

	public queueArr(int s) {
		// TODO Auto-generated constructor stub
		this.size = s;
		arr = new int[size];
		front = rear = 0;
	}

	// underFlow Condition i.e whether the queue is empty or not
	public boolean isEmpty() {
		boolean flag = false;
		if (front == 0 && rear == 0) {
			System.out.println("Queue is empty");
			flag = true;
		}
		return flag;
	}
}
