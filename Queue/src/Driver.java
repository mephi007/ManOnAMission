
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queueArr que = new queueArr(5);
		que.isEmpty();
		if(que.overflow());
		else {
			System.out.println("Queue have space left");
		}

	}

}
