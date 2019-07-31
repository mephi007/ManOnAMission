
public class stackDLDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackDL s = new stackDL();
		s.isEmpty();
		s.push(1);
		s.peek();
		s.pop();
		s.push(2);
		s.peek();
		s.push(3);
		s.peek();
		System.out.println(s.Size());
		s.pop();
		s.peek();
		System.out.println(s.Size());
	}

}
