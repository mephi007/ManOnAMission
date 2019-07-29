
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queueArr que = new queueArr(5);
		que.isEmpty();
		if(que.overFlow());
		else {
			System.out.println("Queue have space left");
		}
		System.out.println("---------pushing 1-------------");
		que.push(1);
		que.viewQueue();
		System.out.println("---------pushing 2-------------");
		que.push(2);
		que.viewQueue();
		System.out.println("---------pushing 3-------------");
		que.push(3);
		que.viewQueue();
		System.out.println("---------pushing 4-------------");
		que.push(4);
		que.viewQueue();
		System.out.println("---------pushing 5-------------");
		que.push(5);
		que.viewQueue();
		System.out.println("-------Dequeue----------------");
		que.dequeue();
		que.viewQueue();
		System.out.println("-------Dequeue----------------");
		que.dequeue();
		que.viewQueue();
		System.out.println("-------Dequeue----------------");
		que.dequeue();
		que.viewQueue();
		System.out.println("-------Dequeue----------------");
		que.dequeue();
		que.viewQueue();

	}

}
