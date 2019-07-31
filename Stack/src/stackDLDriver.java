
public class stackDLDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackDL s = new stackDL();
		s.isEmpty();
		System.out.println("----------pushing----------");
		s.push(1);
		s.peek();
		s.push(2);
		s.peek();
		s.push(3);
		s.peek();
		System.out.println("Size of the stack \n" +s.Size());
		System.out.println("Middle node of the stack \n"+ s.middle().getData());
		System.out.println("----deleting middle node----");
		s.deleteMid();
		System.out.println("Size of the stack \n" +s.Size());
		

	}

}
