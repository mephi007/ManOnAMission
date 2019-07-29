
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

	}

}
