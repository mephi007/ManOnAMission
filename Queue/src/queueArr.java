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
	
	//overflow
	public boolean overFlow() {
		boolean flag = false;
		if(rear == size -1)
		{
			System.out.println("Queue is full, OverFlow");
			flag = true;
		}
		return flag;
	}
	
	//Enqueue element 
	public void push(int data)
	{
		if(overFlow()) {
			System.out.println("Sorry, cannot push element into stack");
		}
		else {
			rear = rear+1;
			arr[rear] = data;
		}
	}
	
	// to view all the element of the stack
	public void viewQueue() {
		if (isEmpty());
		else {
			for (int i = rear; i > 0; i--) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//pop element from the queue
	public void dequeue()
	{
		if(isEmpty());
		else {
			for(int i=1; i<=rear; i++)
			{
				arr[i-1] = arr[i];
			}
			rear--;
		}
	}
	
	
}
