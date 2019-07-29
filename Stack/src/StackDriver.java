
public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		stackArr stck = new stackArr(5);
		stck.isEmpty();
		stck.viewStack();
		System.out.println("-----------pushing 1 into stack---------");
		stck.push(1);
		stck.viewStack();
		System.out.println("-----------pushing 2 into stack---------");
		stck.push(2);
		stck.viewStack();
		System.out.println("-----------pushing 3 into stack---------");
		stck.push(3);
		stck.viewStack();
		System.out.println("-----------pushing 4 into stack---------");
		stck.push(4);
		stck.viewStack();
		System.out.println("-----------pushing 5 into stack---------");
		stck.push(5);
		//stck.viewStack();
		
	}

}
